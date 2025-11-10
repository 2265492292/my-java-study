package com.itheima.d1_junit;


import org.junit.*;

/**
 * 测试类
 * */
public class StringUtilTest {
    @Before//修饰实例方法，每个测试方法执行之前执行一次
    //JDK 5 之后，改用 @BeforeEach
    public void before() {
        System.out.println("===测试开始===");
    }

    @After//修饰实例方法，每个测试方法执行之后执行一次
    //JDK 5 之后，改用 @AfterEach
    public void after() {
        System.out.println("===测试结束===");
    }

    @BeforeClass//修饰静态方法，测试类加载时执行一次
    //JDK 5 之后，改用 @BeforeAll
    public static void beforeClass() {
        System.out.println("===测试类开始===");
    }

    @AfterClass//修饰静态方法，测试类加载时执行一次
    //JDK 5 之后，改用 @AfterAll
    public static void afterClass() {
        System.out.println("===测试类结束===");
    }
    @Test
    public void testPrintNumbers() {
        StringUtil.printNumber(null);
        StringUtil.printNumber("");
        StringUtil.printNumber("admin");
    }
    @Test
    public void testGetMaxIndex() {
//        System.out.println(StringUtil.getMaxIndex(null));
//        System.out.println(StringUtil.getMaxIndex(""));
//        System.out.println(StringUtil.getMaxIndex("admin"));

        //断言：判断结果是否满足期望
        int i1 =  StringUtil.getMaxIndex(null);
        Assert.assertEquals("null测试失败",-1, i1);

        int i2 =  StringUtil.getMaxIndex("");
        Assert.assertEquals("空字符串测试失败",-1, i2);

        int i3 =  StringUtil.getMaxIndex("admin");
        Assert.assertEquals("admin测试失败",4, i3);

        System.out.println("测试通过");
    }
}
