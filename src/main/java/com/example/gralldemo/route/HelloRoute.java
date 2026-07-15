package com.example.gralldemo.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() {

        from("direct:hello")
                .setBody(constant("Hello from Camel Route1"));
    }
}
