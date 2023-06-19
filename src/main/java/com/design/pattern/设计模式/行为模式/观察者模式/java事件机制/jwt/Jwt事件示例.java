package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制.jwt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/19 3:10 PM
 * @Description:
 */
public class Jwt事件示例 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Mechanism Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Red");

        // 增加监听器
        button1.addActionListener(new ActionListener() {
            // 传递事件 ActionEvent
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(255, 193, 193));
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("Green");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(193, 255, 193));
            }
        });
        panel.add(button2);

        JButton button3 = new JButton("Blue");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(175, 238, 238));
            }
        });
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
