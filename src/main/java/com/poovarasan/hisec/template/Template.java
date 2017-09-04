package com.poovarasan.hisec.template;

import com.mitchellbosecke.pebble.extension.*;
import com.mitchellbosecke.pebble.operator.BinaryOperator;
import com.mitchellbosecke.pebble.operator.UnaryOperator;
import com.mitchellbosecke.pebble.tokenParser.TokenParser;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class Template extends AbstractExtension {

    @Override
    public List<TokenParser> getTokenParsers() {
        return super.getTokenParsers();
    }

    @Override
    public List<BinaryOperator> getBinaryOperators() {
        return super.getBinaryOperators();
    }

    @Override
    public List<UnaryOperator> getUnaryOperators() {
        return super.getUnaryOperators();
    }

    @Override
    public Map<String, Filter> getFilters() {
        return super.getFilters();
    }

    @Override
    public Map<String, Test> getTests() {
        return super.getTests();
    }

    @Override
    public Map<String, Function> getFunctions() {
        return super.getFunctions();
    }

    @Override
    public Map<String, Object> getGlobalVariables() {
        return super.getGlobalVariables();
    }

    @Override
    public List<NodeVisitorFactory> getNodeVisitors() {
        return super.getNodeVisitors();
    }
}
