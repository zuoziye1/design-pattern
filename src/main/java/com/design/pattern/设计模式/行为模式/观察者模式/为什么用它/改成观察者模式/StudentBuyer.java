package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成观察者模式;

import com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.Tiket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:05 PM
 * @Description:
 */
@Data
public class StudentBuyer extends Buyer{

    @Override
    public void 抢票(){
        System.out.println("以学生价收费");
        tt.decrementCount();
    }
}
