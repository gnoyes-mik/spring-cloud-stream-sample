package me.gnoyes.msgconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Sink.class)
public class MsgConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(MsgConsumer1Application.class, args);
    }

}
