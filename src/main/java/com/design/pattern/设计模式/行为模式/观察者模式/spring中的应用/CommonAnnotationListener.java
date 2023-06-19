package com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

/**
 * @Author: innocence
 * @Date: 2023/6/19 5:22 PM
 * @Description:
 */
@Component
public class CommonAnnotationListener {

    /**
     * 可以指定处理事件的先后顺序
     * @param myApplicationEvent
     */
    @Order(1)
    @EventListener(classes = MyApplicationEvent.class)
    public void test1(MyApplicationEvent myApplicationEvent){
        System.out.println("11111111");
        System.out.println(myApplicationEvent.getMyEventDTO());
    }

    @Order(2)
    @EventListener(classes = MyApplicationEvent.class)
    public void test2(MyApplicationEvent myApplicationEvent){
        System.out.println("222222222");
        System.out.println(myApplicationEvent.getMyEventDTO());
    }

}
