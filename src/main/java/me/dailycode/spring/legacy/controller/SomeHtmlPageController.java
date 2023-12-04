package me.dailycode.spring.legacy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"주제: json 데이터 반환"})
@Controller
public class SomeHtmlPageController {

    @ApiOperation(value = "hello world page 반환 메소드")
    @GetMapping("/hello-world-page")
    public String getHelloWorldPage() {
        return "helloWorld";
    }
}
