package com.dp.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    /**
     * 被代理的实例
     */
    private Object object;

    public GamePlayerIH(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(this.object, args);
        System.out.println("after");
        return result;
    }
}
