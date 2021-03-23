package me.gnoyes.msgproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Source.class)
public class MsgProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgProducerApplication.class, args);
    }
}
