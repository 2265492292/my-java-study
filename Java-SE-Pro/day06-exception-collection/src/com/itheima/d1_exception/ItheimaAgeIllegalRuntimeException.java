package com.itheima.d1_exception;
//自定义运行时异常

/*
* 1.继承自RuntimeExciption
* 2.重写构造器
* */
public class ItheimaAgeIllegalRuntimeException extends RuntimeException {
    public ItheimaAgeIllegalRuntimeException() {
    }
    public ItheimaAgeIllegalRuntimeException(String message) {
        super(message);
    }
}
