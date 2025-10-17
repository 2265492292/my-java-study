package com.itheima.d2_xml;

import java.io.PrintStream;

public class Dom4JTest3 {
    public static void main(String[] args) throws Exception {
        //目标：写一个xml数据出去
        StringBuilder sb=new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<user>\r\n");
        sb.append("\t<name>").append("张三").append("</name>\r\n");
        sb.append("\t<age>").append("12").append("</age>\r\n");
        sb.append("\t<sex>").append("男").append("</sex>\r\n");
        sb.append("</user>\r\n");

        PrintStream ps =new PrintStream("day11-special-file-log-code/src/com/itheima/d2_xml/user.xml");
        ps.println(sb.toString());
        ps.close();
    }
}
