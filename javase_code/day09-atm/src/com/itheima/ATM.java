package com.itheima;

//基本类型与包装类的区别：
//        double 是Java中的基本数据类型，用于存储64位浮点数
//        Double 是 double 的包装类，是一个对象类型
//        内存存储差异：
//        double 直接存储数值，在栈内存中分配空间，访问速度快
//        Double 作为对象存储在堆内存中，栈中只存储引用地址
//        默认值不同：
//        double 的默认值是 0.0
//        Double 的默认值是 null，可以表示"没有值"的状态
//        使用场景：
//        在 transMoney() 方法中，使用 double transMoney = sc.nextDouble(); 更为合适，因为:
//        Scanner.nextDouble() 返回基本类型 double
//        不需要 null 值检查
//        性能更好，无需装箱/拆箱操作

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//ATM系统，账户操作对象，负责账户数据的业务处理

public class ATM {
    //1.定义一个集合容器存储全部的账户对象
    private ArrayList<Account> allAccounts = new ArrayList<>();
    //2.准备一个扫描器
    private Scanner sc = new Scanner(System.in);
    //定义一个账户类型变量记住当前登录成功账户
    private Account loginAccount;//nill

    //3.展示一个欢迎界面
    public void start() {
        while (true) {
            System.out.println("===========欢迎来到黑马银行ATM系统===========");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请您输入操作命令:");
            String command = sc.next();
            switch (command) {
                case "1":
                    //登录
                    login();
                    break;
                case "2":
                    //开户
                    registerAccount();
                    break;
                default:
                    System.out.println("您输入的命令有误，请重新输入！");
            }
        }
    }

    private void login() {
        while (true) {
            System.out.println("===========用户登录===========");
            if (allAccounts.size() == 0) {
                System.out.println("当前系统中无账户，请先开户");
                return;
            }
            System.out.println("请输入您的卡号");
            String cardId = sc.next();
            //根据卡号查询账户对象，查询到了说明卡号对了
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("您输入的卡号不存在，请重新输入");
                continue;//卫语言代码
            }
            //2.卡号正确，开始认证密码
            System.out.println("请输入您的密码");
            String password = sc.next();
            if (!acc.getPassword().equals(password)) {
                //密码错误
                System.out.println("您输入的密码错误，请重新确认账户!");
                continue;
            }
            //3.登录成功
            loginAccount = acc;//把登录成功的账户对象交给成员变量loginAccount
            System.out.println("恭喜您" + acc.getUserInfo() + "登录成功，您的卡号是：" + acc.getCardId());
            //展示登录后的操作界面
            showUserCommand();
            return;
        }
    }

    //用户登录后的界面
    private void showUserCommand() {
        while (true) {
            System.out.println("===========黑马银行===========");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.注销");
            System.out.println("7.退出");
            System.out.println("请输入命令：");
            String command = sc.next();
            switch (command) {
                case "1":
                    //查询:展示当前账户信息
                    showMyAccountInfo();
                    break;
                case "2":
                    //存款
                    saveMoney();
                    break;
                case "3":
                    //取款
                    drawMoney();
                    break;
                case "4":
                    //转账
                    transMoney();
                    break;
                case "5":
                    //修改密码
                    changePassword();
                    return;
                case "6":
                    //注销
                    delAccount();
                    return;
                case "7":
                    //退出
                    System.out.println("退出成功！");
                    return;//干掉方法
                default:
                    System.out.println("您输入的命令有误，请重新输入！");
            }
        }
    }

    private void delAccount() {
        while (true) {
            System.out.println("===========密码修改===========");
            System.out.println("您确认要销户？y/n");
            String confirmStr = sc.next();
            switch (confirmStr) {
                case "y":
                    if (loginAccount.getMoney() < 0) {
                        System.out.println("当前账户还有余额，无法销户");
                        return;
                    }
                    System.out.println("销户成功，请重新登录");
                    allAccounts.remove(loginAccount);
                    return;
                case "n":
                    System.out.println("取消成功！");
                    return;
                default:
                    break;
            }
        }
    }

    private void changePassword() {
        System.out.println("===========密码修改===========");
        System.out.println("请输入当前密码");
        String pwd = sc.next();
        if (!loginAccount.getPassword().equals(pwd)) {
            System.out.println("当前密码输入错误");
            return;
        }
        System.out.println("请输入新的密码");
        String newpwd = sc.next();
        System.out.println("请再次输入以确认新密码");
        String confirmpwd = sc.next();
        if (!newpwd.equals(confirmpwd)) {
            System.out.println("新密码有误，请重新输入！");
            return;
        }
        System.out.println("密码修改成功，请您重新登录");
    }

    private void transMoney() {
        System.out.println("===========用户转账===========");
        if (allAccounts.size() < 2) {
            System.out.println("当前系统中账户不足2个，无法转账！");
            return;
        }
        if (loginAccount.getMoney() == 0) {
            System.out.println("当前账户余额为0，无法转账！");
            return;
        }
        while (true) {
            System.out.println("请输入转账的账户卡号：");
            String cardId = sc.next();
            for (int i = 0; i < allAccounts.size(); i++) {
                Account targetAcc = allAccounts.get(i);//acc=转账账户
                if (targetAcc.getCardId().equals(cardId)) {
                    String targetUserName = targetAcc.getUserName();
                    System.out.println("您将要转账的户主为：*" + targetUserName.substring(1));
                    System.out.println("请您输入户主姓氏确认：");
                    String confirmName = sc.next();
                    if (!targetUserName.startsWith(confirmName)) {
                        System.out.println("姓氏有误，请重新确认");
                        break;
                    }
                    System.out.println("请输入转账金额");
                    double transMoney = sc.nextDouble();
                    System.out.println("转账成功！");
                    loginAccount.setMoney(loginAccount.getMoney() - transMoney);
                    targetAcc.setMoney(targetAcc.getMoney() + transMoney);
                    return;
                }
            }
            System.out.println("您输入的卡号有误，请重新确认");
        }
    }

    private void drawMoney() {
        System.out.println("===========用户取款===========");
        System.out.println("请输入取款金额");
        double money = sc.nextDouble();
        if (loginAccount.getMoney() < 100) {
            System.out.println("余额不足100元，无法取款！");
            return;
        } else if (money > loginAccount.getLimit()) {
            System.out.println("超出限额，无法取款！");
        } else if (money > loginAccount.getMoney()) {
            System.out.println("余额不足，无法取款！");
        } else {
            loginAccount.setMoney(loginAccount.getMoney() - money);
            System.out.println("取款成功！");
        }
    }

    private void saveMoney() {
        System.out.println("===========用户存款===========");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        loginAccount.setMoney(loginAccount.getMoney() + money);
        System.out.println("存款成功！");
    }


    private void showMyAccountInfo() {
        System.out.println("=========您的账户信息如下=========");
        System.out.println("卡号：" + loginAccount.getCardId());
        System.out.println("姓名：" + loginAccount.getUserName());
        System.out.println("余额：" + loginAccount.getMoney());
        System.out.println("限额：" + loginAccount.getLimit());
        System.out.println("=============================");
    }

    ///    用户开户

    private void registerAccount() {
        System.out.println("===========用户开户===========");
        //1.创建账户对象
        Account acc = new Account();
        //2.输入数据注入给账户对象封装
        System.out.println("请输入账户名称:");
        String userName = sc.next();
        acc.setUserName(userName);


        while (true) {
            System.out.println("请输入您的性别:");
            String sex = sc.next();
            if ("男".equals(sex) || "女".equals(sex)) {
                acc.setSex(sex.charAt(0));
                break;
            } else {
                System.out.println("性别必须是男或者女，请重新输入！");
            }
        }
        while (true) {
            System.out.println("请输入账户密码:");
            String passWord = sc.next();
            System.out.println("请确认密码:");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                acc.setPassword(passWord);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入！");
            }
        }
        //每次限额
        while (true) {
            System.out.println("请您输入每次提现额度：");
            double limitMoney = sc.nextDouble();
            if (limitMoney >= 1000) {
                acc.setLimit(limitMoney);
                break;
            } else {
                System.out.println("每次提现额度不能低于1000元，请重新输入！");
            }
        }
        //为账户生成一个8位数字卡号，且要求与其他账户不重复,(独立功能)
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);//0-9
            }
            //判断这个卡号是否已经存在,存在则重新生成,不存在则保存
            Account otherAcc = getAccountByCardId(cardId);
            if (otherAcc == null) {
                //这个卡号不存在，可以作为新卡号
                acc.setCardId(cardId);
                break;
            }
        }
        //3.将账户对象保存到集合中
        allAccounts.add(acc);
        System.out.println("恭喜您，开户成功，您的卡号是:" + acc.getCardId() + "，请妥善保管");
    }

    //根据卡号查询账户对象返回
    public Account getAccountByCardId(String cardId) {
        for (int i = 0; i < allAccounts.size(); i++) {
            Account acc = allAccounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
