package me.dailycode.spring.legacy.dao;

import me.dailycode.spring.legacy.dto.SampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SampleDAO {

    String getCurrentTimeString(@Param("param") String param);

    SampleDTO getSampleRecord();
}
