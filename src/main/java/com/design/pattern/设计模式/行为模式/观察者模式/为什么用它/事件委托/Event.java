package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.事件委托;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * 事件
 * @Author: 姚飞虎
 * @Date: 2023/6/15 4:23 PM
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    /**
     * 响应该事件的目标对象
     */
    private Object target;

    /**
     * 响应事件时，目标对象要调用的方法
     */
    private String methodName;

    private Object[] params;

    @SneakyThrows
    public void invoke(){
        Method method;
        Class[] paramTypes = this.getParamTypes();
        if(paramTypes == null || paramTypes.length == 0){
            method = target.getClass().getMethod(methodName);
        }else {
            method = target.getClass().getMethod(methodName, paramTypes);
        }
        method.invoke(target,params);
    }

    private Class[] getParamTypes(){
        if(params == null){
            return null;
        }

        int size = params.length;
        if( size > 0){
            Class[] result = new Class[size];
            for (int i = 0; i < size; i++) {
                result[i] = params[i].getClass();
            }
            return result;
        }

        return null;
    }

}
