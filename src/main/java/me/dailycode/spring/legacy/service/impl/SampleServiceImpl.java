package me.dailycode.spring.legacy.service.impl;

import lombok.RequiredArgsConstructor;
import me.dailycode.spring.legacy.dao.SampleDAO;
import me.dailycode.spring.legacy.dto.SampleDTO;
import me.dailycode.spring.legacy.service.SampleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SampleServiceImpl implements SampleService {

    private final SampleDAO dao;

    @Override
    public String getCurrentTimeString(String param) {
        return dao.getCurrentTimeString("test-sending-param");
    }

    @Override
    public SampleDTO getSampleData() {
        return dao.getSampleRecord();
    }
}
