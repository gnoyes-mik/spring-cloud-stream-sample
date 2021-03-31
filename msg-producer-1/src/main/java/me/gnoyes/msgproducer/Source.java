package me.gnoyes.msgproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {

    // Binding명
    String OUTPUT = "output-channel";

    // 어노테이션을 통한 Binding 속성 설정
    @Output(Source.OUTPUT)
    // Output의 경우 MessageChannel
    MessageChannel publish();
}
