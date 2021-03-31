package me.gnoyes.msgproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerService {
    @Autowired
    MessageProducer messageProducer;

    public void sendMessage(MessageDto msg) {
        messageProducer.send(msg);
    }
}
