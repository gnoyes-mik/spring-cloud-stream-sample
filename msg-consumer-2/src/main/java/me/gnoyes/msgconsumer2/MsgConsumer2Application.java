package me.gnoyes.msgconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Sink.class)
public class MsgConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(MsgConsumer2Application.class, args);
    }

}
