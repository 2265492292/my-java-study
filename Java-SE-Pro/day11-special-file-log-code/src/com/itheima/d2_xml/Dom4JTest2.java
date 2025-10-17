package com.itheima.d2_xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Dom4JTest2 {
    public static void main(String[] args) throws Exception {
        //目标：解析XML文件，使用Dom4j框架
        //1.创建一个SaxReader解析器对象
        SAXReader saxReader = new SAXReader();

        //2.把xml文件读成一个Document文档对象
        Document document = saxReader.read("day11-special-file-log-code/src/com/itheima/d2_xml/Contact.xml");

        //3.文档对象中包含了XML的全部数据，提供了方法获取数据
        Element rootElement = document.getRootElement();

        //4.准备一个联系人集合存储联系人对象
        List<Contact> contacts = new ArrayList<>();

        //5.提取全部一级联系人对象
        List<Element> sonEles = rootElement.elements("contact");

        //6.遍历子元素对象
        for (Element sonEle : sonEles) {
            //7.每个子元素是一个联系人对象，创建联系人对象，封装数据
            Contact contact = new Contact();
            //注入数据
            contact.setId(Integer.valueOf(sonEle.attributeValue("id")));
            contact.setName(sonEle.elementTextTrim("name"));
            contact.setGender(sonEle.elementTextTrim("gender").charAt(0));
            contact.setEmail(sonEle.elementTextTrim("email"));
            //8.存入到集合中去
            contacts.add(contact);
        }
        System.out.println(contacts);
    }
}
