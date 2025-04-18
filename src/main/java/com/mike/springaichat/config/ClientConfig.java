package com.mike.springaichat.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    private final ChatClient.Builder chatBuilder;

    public ClientConfig(ChatClient.Builder chatClientBuilder) {
        this.chatBuilder = chatClientBuilder;
    }

    @Bean
    public ChatClient openAiChatClient() {
        return chatBuilder.build();
    }
}
