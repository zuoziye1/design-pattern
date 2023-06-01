package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它;

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
        student.抢票(tiket);
        worker.抢票(tiket);
    }


}
