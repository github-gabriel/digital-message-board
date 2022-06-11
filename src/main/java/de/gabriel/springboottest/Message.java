package de.gabriel.springboottest;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String msg;

    String dateTime;

    public Message() {
    }

    public Message(String msg, String dateTime) {
        this.msg = msg;
        this.dateTime = dateTime;
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
