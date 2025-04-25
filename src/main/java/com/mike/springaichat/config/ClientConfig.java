package com.mike.springaichat.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    //    @Bean
    //    public ChatClient openAiChatClient() {
    //        return new OpenAiChatClient(apiKey);
    //    }
}
