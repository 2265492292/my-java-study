package com.itheima.d9_extends_modifier;
//modifier--修饰符
public class Fu {
    //1、private：私有，只能在本类中访问
    private void privateMethod()
    {
        System.out.println("private");
    }
    //2、缺省：默认，只能在本包中(本类 + 同一个包下的其他类)访问
    void Method(){
        System.out.println("缺省");
    }
    //3、protected：受保护的，子类权限，只能在本类，同一个包下的类，子孙类中访问
    protected void protectedMethod()
    {
        System.out.println("protected");
    }
    //4、public ：公共权限，任何地方都可以访问
    public void publicMethod(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu f =new Fu();
        f.privateMethod();
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }
}
