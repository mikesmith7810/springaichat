package com.mike.springaichat.service;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService implements AIService {

    private final OpenAiChatModel openAiChatModel;

    public OpenAIService(@Qualifier("openAiChatModel") OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @Override
    public String getAIResponseFrom(String userMessage) {
        var prompt = new Prompt(new UserMessage(userMessage));
        return openAiChatModel.call(prompt).getResult().getOutput().getText();
    }
}
