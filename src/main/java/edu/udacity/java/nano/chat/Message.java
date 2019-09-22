package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {
    public String username;
    public String msg;
    public String actions;

    public Message(){

    }

    public  Message(String username, String msg, String actions) {
        this.username = username;
        this.msg = msg;
        this.actions = actions;
    }

    public Message(String username, String msg) {
        this.username = username;
        this.msg = msg;
    }
}
