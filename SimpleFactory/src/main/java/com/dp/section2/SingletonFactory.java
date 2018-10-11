package com.dp.section2;

import java.lang.reflect.Constructor;

/**
 * 单例工厂
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class<?> singletonClazz = Class.forName(Singleton.class.getName());
            Constructor<?> declaredConstructor = singletonClazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            singleton = (Singleton) declaredConstructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
