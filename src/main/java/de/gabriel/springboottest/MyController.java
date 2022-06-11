package de.gabriel.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class MyController {

    @Autowired
    MessageRepository messageRepository;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    @GetMapping("/")
    public String showMessages(Model model){
        model.addAttribute("messages", messageRepository.findAll());
        return "index.html";
    }

    @GetMapping("/new_message")
    public String create_message(Model model){
        Message message = new Message();
        model.addAttribute("message", message);
        return "post_message.html";
    }

    @GetMapping("/delete_messages")
    public String delete_messages(){
        messageRepository.deleteAll();
        return "redirect:/";
    }

    @PostMapping("/save_message")
    public String save_message(@ModelAttribute("msg") String msg){
        Date date = new Date();
        System.out.println(formatter.format(date));
        Message message = new Message(msg, formatter.format(date));
        messageRepository.save(message);
        return "redirect:/";
    }

}
