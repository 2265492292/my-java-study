package com.itheima.d5_proxy2;
/**
 * 用户业务接口
 */
public interface UserService {
    //登录功能
    void login(String loginName, String passWord) throws Exception;
    //删除用户
    void deleteUser() throws Exception;
    //查询用户
    String[] selectUser() throws Exception;
}
