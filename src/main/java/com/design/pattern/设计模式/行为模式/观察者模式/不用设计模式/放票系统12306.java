package com.design.pattern.设计模式.行为模式.观察者模式.不用设计模式;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:11 PM
 * @Description:
 */
@Data
public class 放票系统12306 {

    private Student student;

    private Worker worker;

    private Tiket tiket;

    public void 放票(Tiket tiket){
        tiket.有票了();
        // 假设有很多不同人群的买票折扣不同，这里就需要很多的调用
        // 不如换成 接口调用
        student.抢票(tiket);
        worker.抢票(tiket);
    }


}
