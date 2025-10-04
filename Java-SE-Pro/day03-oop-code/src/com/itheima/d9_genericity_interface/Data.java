package com.itheima.d9_genericity_interface;
//泛型接口
public interface Data<T> {
    void add(T t);
    void delete(T t);
    void updata(T t);
    T getById(int id);
}
