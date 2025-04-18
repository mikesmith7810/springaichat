package com.mike.springaichat.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChatClient chatClient;

    public JokeService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String getJoke() {
        return chatClient.prompt("Give me a pirate joke").call().content();
    }
}
