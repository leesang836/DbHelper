package com.wangtao.dbhelper.reflection.invoker;

import java.lang.reflect.InvocationTargetException;

/**
 * @author wangtao
 * Create at 2018/12/26 10:43
 */
public interface Invoker {

    /**
     * 统一执行方法(method.invoke(), field.get(), field.set())
     * @param target 目标对象
     * @param args 参数
     * @return 执行结果
     */
    Object invoke(Object target, Object[] args) throws InvocationTargetException, IllegalAccessException;
}
