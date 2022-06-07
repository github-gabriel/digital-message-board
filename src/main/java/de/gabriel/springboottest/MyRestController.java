package de.gabriel.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    MessageRepository messageRepository;

    @PostMapping("/springboottest/{msg}")
    public String returnMessage(@PathVariable String msg) {
        Message message = new Message(msg);
        messageRepository.save(message);
        return msg;
    }

    @GetMapping("/springboottest")
    public List<Message> showMessages(){
        return messageRepository.findAll();
    }

}
