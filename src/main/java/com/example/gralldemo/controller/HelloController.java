package com.example.gralldemo.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ProducerTemplate producerTemplate;

    public HelloController(ProducerTemplate producerTemplate) {
        this.producerTemplate = producerTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        return producerTemplate.requestBody("direct:hello", null, String.class);
    }
}