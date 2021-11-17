package com.redbird.websocket;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "messages")
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String sender;
    private String time;

    public Message() {

    }

    public Message(String text, String sender, String date) {
        this.text = text;
        this.sender = sender;
        this.time = date;
    }

}
