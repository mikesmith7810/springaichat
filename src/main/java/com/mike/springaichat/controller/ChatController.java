package com.mike.springaichat.controller;

import com.mike.springaichat.model.ChatResponse;
import com.mike.springaichat.service.JokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final JokeService jokeService;

    public ChatController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/chat")
    public ChatResponse chat(@RequestParam(value = "name") String name) {
        return new ChatResponse("Hello " + name + "!");
    }

    @GetMapping("/joke")
    public ChatResponse joke(@RequestParam(value = "prompt") String prompt) {
        return new ChatResponse(jokeService.getJoke(prompt));
    }
}
