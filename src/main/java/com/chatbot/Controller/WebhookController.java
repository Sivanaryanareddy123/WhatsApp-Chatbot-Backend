package com.chatbot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chatbot.Model.MessageRequest;
import com.chatbot.Service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        // Log incoming message
        System.out.println("Received message: " + request.getMessage());

        // Get reply
        return chatService.getReply(request.getMessage());
    }
}
