package me.dailycode.spring.legacy.service;

import me.dailycode.spring.legacy.dto.SampleDTO;

public interface SampleService {
    String getCurrentTimeString(String param);

    SampleDTO getSampleData();
}
