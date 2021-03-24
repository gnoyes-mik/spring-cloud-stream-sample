package me.gnoyes.msgproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducerController {

    @Autowired
    MessageProducerService messageProducerService;

    @PostMapping("/")
    public void sendMessage(@RequestBody MessageDto msg) {
        messageProducerService.sendMessage(msg);
    }

}
