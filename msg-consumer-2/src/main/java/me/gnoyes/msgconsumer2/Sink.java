package me.gnoyes.msgconsumer2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
    String INPUT = "input-channel";

    @Input(Sink.INPUT)
    SubscribableChannel subscribe();
}
