package com.itheima.d1_exception;
//自定义编译时异常

/*
 * 1.继承自Exciption
 * 2.重写构造器
 * */
public class ItheimaAgeIllegalException extends Exception {
    public ItheimaAgeIllegalException() {
    }

    public ItheimaAgeIllegalException(String message) {
        super(message);
    }
}
