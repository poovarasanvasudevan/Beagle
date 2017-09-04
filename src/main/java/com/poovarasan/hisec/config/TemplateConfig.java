package com.poovarasan.hisec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.ServletContext;

@Configuration
@EnableWebMvc
public class TemplateConfig extends WebMvcConfigurerAdapter {

}
