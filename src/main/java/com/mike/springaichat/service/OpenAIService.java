package com.mike.springaichat.service;

import org.springframework.stereotype.Service;

@Service
public class OpenAIService implements AIService {

    //    private final ChatClient chatClient;
    //
    //    public OpenAIService(ChatClient chatClient) {
    //        this.chatClient = chatClient;
    //    }

    @Override
    public String getAIResponseFrom(String prompt) {
        return "Hi";
        //        return chatClient.prompt(prompt).call().content();
    }
}
