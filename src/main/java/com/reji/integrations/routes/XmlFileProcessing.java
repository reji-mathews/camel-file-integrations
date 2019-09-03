package com.reji.integrations.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class XmlFileProcessing extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:samples/input?noop=true")
                .log("Picked up file : ${headers.CamelFileName}")
                .log("Splitting files into individual book")
                .split(xpath("/catalog/book"))
                .log("Data after splitting : ${body}")
                .to("xslt:xslttemplates/book_transformation.xslt")
                .log("After transformation : ${body}")
                .setHeader("CamelFileName",xpath("//bookname/text()",String.class))
                .setHeader("CamelFileName",simple("${headers.CamelFileName}.xml"))
                .to("file:samples/output")
                .end();
    }
}
