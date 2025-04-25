package com.mike.springaichat.controller;

import com.mike.springaichat.model.ChatResponse;
import com.mike.springaichat.service.OllamaService;
import com.mike.springaichat.service.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final OpenAIService openAIService;
    private final OllamaService ollamaService;

    public ChatController(OpenAIService openAIService, OllamaService ollamaService) {
        this.openAIService = openAIService;
        this.ollamaService = ollamaService;
    }

    @GetMapping("/chatwithollama")
    public ChatResponse ollama(@RequestParam(value = "prompt") String prompt) {
        return new ChatResponse(ollamaService.getAIResponseFrom(prompt));
    }

    @GetMapping("chatwithopenai")
    public ChatResponse openai(@RequestParam(value = "prompt") String prompt) {
        return new ChatResponse(openAIService.getAIResponseFrom(prompt));
    }
}
