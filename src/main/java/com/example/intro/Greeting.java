package com.example.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    public class Greeting {

        @Value("${country}")
        String country;

        @GetMapping("/getEnglishGreeting")
        public String getEnglishGreetings(){
            return "Good Morning";
        };

        @GetMapping("/getGhanaGreeting")
        public String getGhanianGreetings(){
            return "Ina";
        };

        @GetMapping("/getHausaGreeting")
        public String getHausaGreetings(){
            return country;
        };

        @GetMapping("/getAllGreeting")
        public List<String> getAllGreetings(){
            return List.of("Good morning", "Ina Kuana", "E Kaaro", "Ndewo");
        };

    }


