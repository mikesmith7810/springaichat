package com.mike.springaichat.service;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OllamaService implements AIService {

    private final OllamaChatModel ollamaChatModel;

    public OllamaService(@Qualifier("ollamaChatModel") OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    @Override
    public String getAIResponseFrom(String userMessage) {

        var prompt = new Prompt(new UserMessage(userMessage));
        return ollamaChatModel.call(prompt).getResult().getOutput().getText();
    }
}
