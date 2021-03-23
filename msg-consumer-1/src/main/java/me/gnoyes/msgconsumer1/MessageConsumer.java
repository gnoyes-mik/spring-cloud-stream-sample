package me.gnoyes.msgconsumer1;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @StreamListener(Sink.INPUT)
    public void receive(Message<?> msg) {
        System.out.println("I'm consumer in GROUP 1, here's msg : " + msg.getPayload());
    }
}
