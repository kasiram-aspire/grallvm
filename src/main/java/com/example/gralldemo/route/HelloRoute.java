package com.example.gralldemo.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() {

        restConfiguration()
                .component("platform-http");

        rest("/hello")
                .get()
                .produces("text/plain")
                .to("direct:hello");

        from("direct:hello")
                .setBody(constant("Hello from Camel"));
    }
}