package org.redhat.fusesource;

import org.apache.camel.builder.RouteBuilder;

public class CamelR extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:sampleTimer?period=1m&repeatCount=3")
                .log("Hello World From Java DSL");
    }
}
