package com.rpc_amqp_example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Server {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Tut6Server.class);
    }
}
