package com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/19 5:00 PM
 * @Description:
 */
@Getter
@Setter
public class MyApplicationEvent extends ApplicationEvent {

    /**
     * 可以定义任何该事件想要传递的数据
     */
    private MyEventDTO myEventDTO;


    public MyApplicationEvent(Object source,MyEventDTO myEventDTO) {
        // super 要放在第一行
        super(source);
        this.myEventDTO = myEventDTO;
    }

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
