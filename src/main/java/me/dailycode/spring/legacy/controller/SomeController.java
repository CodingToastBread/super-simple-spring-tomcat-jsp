package me.dailycode.spring.legacy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.dailycode.spring.legacy.dto.SampleDTO;
import me.dailycode.spring.legacy.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(tags = {"주제: html 데이터 반환"})
@Slf4j
@RestController
@RequiredArgsConstructor
public class SomeController {

    private final SampleService service;

    @ApiOperation(value = "hello world json 반환 메소드")
    @GetMapping("/hello-world-json")
    public Map<String, Object> getDefaultInfo() {
        log.info("giving default Value");
        String currentTimeStamp = service.getCurrentTimeString("param");
        SampleDTO sampleData  = service.getSampleData();
        return Map.of(
                "hello", "world",
                "currentTimeStamp", currentTimeStamp,
                "sampleData", sampleData
        );
    }
}
