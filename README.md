# Spring AI Chat

### Overview

This mini project is a playground to see how Spring AI works.

There are two models implemented -

- OpenAI - you will need an apiKey and possibly credits to use this.
- Ollama - this can be downloaded and you can run a free Llama model locally.

You will need to define the `spring.ai.openai.api-key` property which can be done via an environment variable

```shell
SPRING_AI_OPENAI_API_KEY=
```

### Run the project

```shell
./gradlew bootRun
```

### Endpoints

```shell
http://localhost:8080/chatwithollama?prompt=what is one plus three

http://localhost:8080/chatwithopenai?prompt=what is four plus three
```

