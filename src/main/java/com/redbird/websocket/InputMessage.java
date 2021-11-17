package com.redbird.websocket;

public class InputMessage {

    private String text;

    private String sender;

    public InputMessage() {

    }

    public InputMessage(String text, String sender) {
        this.text = text;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
