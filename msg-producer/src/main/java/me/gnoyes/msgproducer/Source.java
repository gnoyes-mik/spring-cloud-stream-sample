package me.gnoyes.msgproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {

    String OUTPUT = "output-channel";

    @Output(Source.OUTPUT)
    MessageChannel publish();
}
