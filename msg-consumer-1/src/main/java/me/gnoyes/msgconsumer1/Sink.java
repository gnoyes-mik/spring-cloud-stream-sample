package me.gnoyes.msgconsumer1;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
    String INPUT_EVENT_1 = "event-1";
    String INPUT_EVENT_2 = "event-2";

    @Input(Sink.INPUT_EVENT_1)
    SubscribableChannel subscribeEvent1();

    @Input(Sink.INPUT_EVENT_2)
    SubscribableChannel subscribeEvent2();
}
