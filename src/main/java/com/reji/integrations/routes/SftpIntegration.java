package com.reji.integrations.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SftpIntegration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("seda:A")
                .log("Test route")
                .end();
    }
}
