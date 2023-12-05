package me.dailycode.spring.legacy.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.dailycode.spring.legacy.dto.SampleDTO;
import me.dailycode.spring.legacy.service.SampleService;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SomeController {

    private final SampleService service;
    private final MessageSource messageSource;

    @GetMapping("/hello-world-json")
    public Map<String, Object> getDefaultInfo() {
        log.info("giving default Value");
        String currentTimeStamp = service.getCurrentTimeString("param");
        SampleDTO sampleData  = service.getSampleData();
        String message = messageSource.getMessage("search.keyword", new Object[]{}, LocaleContextHolder.getLocale());
        return Map.of(
                "hello", "world",
                "currentTimeStamp", currentTimeStamp,
                "sampleData", sampleData,
                "messageSourceMsg", message
        );
    }
}
