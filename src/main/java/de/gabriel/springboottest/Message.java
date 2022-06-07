package de.gabriel.springboottest;

import javax.persistence.*;

@Entity(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String msg;

    public Message() {
    }

    public Message(String msg) {
        this.msg = msg;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
