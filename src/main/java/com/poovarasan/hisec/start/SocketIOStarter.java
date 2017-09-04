package com.poovarasan.hisec.start;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.protocol.JacksonJsonSupport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SocketIOStarter implements ApplicationRunner {

    private SocketIOServer server;

    @Value("${app.socketio.port}")
    Integer port;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(port);
        config.setJsonSupport(new JacksonJsonSupport());
        config.setWorkerThreads(100);
        config.setPingInterval(60);
        config.setPingTimeout(60);
        config.setWebsocketCompression(true);
        config.setMaxFramePayloadLength(1024 * 1024);
        config.setMaxHttpContentLength(1024 * 1024);

        server = new SocketIOServer(config);

        server.addEventListener("msg", byte[].class, (client, data, ackRequest) -> client.sendEvent("msg", data));

        server.start();
        System.out.println("APP:Socket IO Server Started");
    }

    @PreDestroy
    public void preDestroy() {
        server.stop();
        System.out.println("APP:Socket IO Server Stopped");
    }
}
