package com.reji.integrations.camelfileintegrations.routes;

import org.apache.camel.builder.RouteBuilder;

public class SftpIntegration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("seda:A")
                .log("Test route")
                .end();
    }
}
