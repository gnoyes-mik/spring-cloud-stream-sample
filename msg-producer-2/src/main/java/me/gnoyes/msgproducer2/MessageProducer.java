package me.gnoyes.msgproducer2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MessageProducer {
    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    Source source;

    @SendTo(Source.OUTPUT)
    public <T> void send(T msg) {
        logger.info("sending message ... msg is " + msg);
        source.publish().send(MessageBuilder.withPayload(msg).build());
    }
}
