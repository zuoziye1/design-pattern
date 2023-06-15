package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.事件委托;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/15 8:58 PM
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class 散户 extends Delegator{

    private String name;
}
