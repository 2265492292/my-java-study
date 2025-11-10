package com.itheima.d5_proxy2;

/**
 * 用户业务接口
 */
public class UserServiceImpl implements UserService {

    @Override
    public void login(String loginName, String passWord) throws Exception {
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUser() throws Exception {
        System.out.println("成功删除10000个用户！");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUser() throws Exception {

        System.out.println("查询出了3个用户");
        String[] names = {"张三", "李四", "王五"};
        Thread.sleep(500);
        return names;
    }


}
