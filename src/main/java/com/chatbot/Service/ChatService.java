package com.chatbot.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {
        if (message == null) return "Invalid message";

        message = message.toLowerCase();

        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I don't understand";
        }
    }
}

