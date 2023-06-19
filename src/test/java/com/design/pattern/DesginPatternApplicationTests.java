package com.design.pattern;

import com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用.MyApplicationEvent;
import com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用.MyEventDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootTest
class DesginPatternApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        String test = "test";
        MyApplicationEvent myApplicationEvent = new MyApplicationEvent(test);
        myApplicationEvent.setMyEventDTO(MyEventDTO.builder()
                .id(1000L)
                .localDateTime(LocalDateTime.now())
                .build());
        applicationContext.publishEvent(myApplicationEvent);
    }

}
