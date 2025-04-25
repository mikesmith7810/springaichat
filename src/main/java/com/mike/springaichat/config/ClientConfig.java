package com.mike.springaichat.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    ChatModel openAiChatModel;
    ChatModel ollamaChatModel;

    public ClientConfig(
            @Qualifier("openAiChatModel") ChatModel openAiChatModel,
            @Qualifier("ollamaChatModel") ChatModel ollamaChatModel) {
        this.openAiChatModel = openAiChatModel;
        this.ollamaChatModel = ollamaChatModel;
    }

    @Value("${spring.ai.openai.api-key}")
    private String openAiAPIKey;

    @Value("${spring.ai.ollama.base-url}")
    private String ollamaBaseUrl;

    @Bean
    @Qualifier("openAIChatClient")
    public ChatClient openAiChatClient() {
        ChatClient.Builder builder = ChatClient.builder(openAiChatModel);
        return builder.build();
    }

    @Bean
    @Qualifier("ollamaChatClient")
    public ChatClient ollamaChatClient() {
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        return builder.build();
    }
}
