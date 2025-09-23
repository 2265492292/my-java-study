package com.itheima.d12_extends_override;

public class Tiger extends Animal{
    //方法重写，名称和参数列表必须与父类重写的方法一样
    @Override //重写的校验注解：安全 可读性好
    //子类重写父类方法时，必须与被重写方法的返回值一样，或者范围更小
    //私有方法、静态方法不能被重写，重写会报错（因为他们都属于类持有）
    public void run(){
        System.out.println("老虎跑的快");
    }
}
