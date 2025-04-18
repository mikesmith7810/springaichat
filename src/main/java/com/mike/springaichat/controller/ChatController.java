/* (C)2025 */
package com.mike.springaichat.controller;

import com.mike.springaichat.model.ChatResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    public ChatController() {}

    @GetMapping("/chat")
    public ChatResponse greeting(@RequestParam(value = "name") String name) {
        return new ChatResponse("Hello " + name + "!");
    }
}
