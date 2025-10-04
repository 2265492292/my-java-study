package com.itheima.d3_method_reference;

public class Test4 {
    public static void main(String[] args) {
        //目标：掌握构造器引用
        /*Create c1=new Create() {
            @Override
            public Car createCar(String name) {
                return new Car(name);
            }
        };*/
        //如果某个lamda表达式里只是在创建对象，并且前后参数情况一致，就可以使用构造器引用
//        Create c1 = name -> new Car(name);
        Create c1 = Car::new;

        Car car = c1.createCar("布加迪威龙");
//        Car car =new Car("布加迪威龙");
        System.out.println(car);
    }
}

@FunctionalInterface//函数式接口
interface Create {
    Car createCar(String name);
}

class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
