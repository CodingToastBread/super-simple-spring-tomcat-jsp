package me.dailycode.spring.legacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomeHtmlPageController {

    @GetMapping("/hello-world-page")
    public String getHelloWorldPage() {
        return "helloWorld";
    }
}
