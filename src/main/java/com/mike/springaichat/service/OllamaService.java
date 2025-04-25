package com.mike.springaichat.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OllamaService implements AIService {

    private final ChatClient chatClient;

    public OllamaService(@Qualifier("ollamaChatClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String getAIResponseFrom(String userMessage) {
        return chatClient.prompt().user(userMessage).call().content();
    }
}
