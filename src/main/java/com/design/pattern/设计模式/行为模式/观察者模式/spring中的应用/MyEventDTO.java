package com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 我的事件想要传递的Dto
 * @Author: innocence
 * @Date: 2023/6/19 5:13 PM
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyEventDTO {

    private Long id;

    private LocalDateTime localDateTime;
}
