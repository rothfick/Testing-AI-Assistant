package com.rothfick.testingaiassistant;

import py4j.GatewayServer;

public class AIAssistant {

    public String generateText(String prompt) {
        // Tutaj powinna być logika komunikacji z Pythonem
        // Możesz wykonać zewnętrzny skrypt Python, aby wywołać funkcję generate_text()
        return "Generated text for: " + prompt;
    }

    public static void main(String[] args) {
        AIAssistant app = new AIAssistant();
        GatewayServer gatewayServer = new GatewayServer(app);
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}