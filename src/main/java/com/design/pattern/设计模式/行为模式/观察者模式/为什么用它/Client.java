package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/17 7:03 PM
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();
        Tiket tiket = new Tiket();

        放票系统12306 放票系统12306 = new 放票系统12306();
        放票系统12306.setStudent(student);
        放票系统12306.setWorker(worker);
        放票系统12306.setTiket(tiket);

        tiket.setCount(100);
        放票系统12306.放票(tiket);

    }
}
