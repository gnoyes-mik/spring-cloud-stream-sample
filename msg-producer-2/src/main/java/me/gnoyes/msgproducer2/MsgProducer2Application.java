package me.gnoyes.msgproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Source.class)
public class MsgProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(MsgProducer2Application.class, args);
    }

}
