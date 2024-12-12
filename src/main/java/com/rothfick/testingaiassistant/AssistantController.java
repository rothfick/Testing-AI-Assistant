package com.rothfick.testingaiassistant;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assistant")
public class AssistantController {

    private final AIAssistant aiAssistant;

    public AssistantController() {
        this.aiAssistant = new AIAssistant(); // Używamy Twojej istniejącej klasy AIAssistant
    }

    @PostMapping("/generate-text")
    public String generateText(@RequestBody String prompt) {
        return aiAssistant.generateText(prompt);
    }
}
