package com.rothfick.testingaiassistant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    private final AIAssistant aiAssistant;

    public ViewController() {
        this.aiAssistant = new AIAssistant();
    }

    @PostMapping("/generate")
    public String generateText(@RequestParam String prompt, Model model) {
        String response = aiAssistant.generateText(prompt);
        model.addAttribute("response", response);
        return "index";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
