package me.gnoyes.msgconsumer1;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @StreamListener(Sink.INPUT_EVENT_1)
    public void receiveEvent1(Message<?> msg) {
        System.out.println("I'm consumer in GROUP 1. msg : " + msg.getPayload());
    }

    @StreamListener(Sink.INPUT_EVENT_2)
    public void receiveEvent2(Message<?> msg) {
        System.out.println("I'm consumer in GROUP 1. msg : " + msg.getPayload());
    }
}
