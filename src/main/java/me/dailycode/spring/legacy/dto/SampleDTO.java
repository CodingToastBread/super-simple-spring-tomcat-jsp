package me.dailycode.spring.legacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("sampleDTO")
@Getter
@Setter
@ToString
public class SampleDTO {
    String id;
    String name;
    String workingArea;
}
