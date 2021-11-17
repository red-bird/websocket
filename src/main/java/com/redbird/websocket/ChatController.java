package com.redbird.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    private final MessageRepository messageRepository;

    @Autowired
    public ChatController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @MessageMapping("/webs")
    @SendTo("/topic/messages")
    public Message message(InputMessage msg) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return saveMessage(new Message(msg.getText(), msg.getSender(), time));
    }

    private Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

}
