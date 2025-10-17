package com.itheima.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4JTest1 {
    public static void main(String[] args) throws Exception {
        //目标：解析XML文件，使用Dom4j框架
        //1.创建一个SaxReader解析器对象
        SAXReader saxReader =new SAXReader();

        //2.把xml文件读成一个Document文档对象
        Document document = saxReader.read("day11-special-file-log-code/src/com/itheima/d2_xml/Contact.xml");

        //3.文档对象中包含了XML的全部数据，提供了方法获取数据
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        //4.提取子元素对象
//        List<Element> sonElements = rootElement.elements();
        List<Element> sonElements = rootElement.elements("contact");
        for (Element sonElement : sonElements) {
            System.out.println(sonElement.getName());
        }

        //指定获取单个子元素对象
        Element userEle = rootElement.element("user");
        System.out.println(userEle.elementText("name"));

        Element contactEle = rootElement.element("contact");//默认拿第一个contact
        System.out.println(contactEle.elementText("name"));

        //5.提取子元素的属性对象
        Attribute idAttr = contactEle.attribute("id");
        System.out.println(idAttr.getName());
        System.out.println(idAttr.getValue());

        //直接拿属性值
        System.out.println(contactEle.attributeValue("id"));

        //6.文本值
        //通过父元素拿到子元素文本值
        System.out.println(contactEle.elementText("name"));
        System.out.println(contactEle.elementTextTrim("name"));//去掉前后空格

        //先拿到元素对象，再提取其文本值
        Element emailEle = contactEle.element("email");
        System.out.println(emailEle.getText());
        System.out.println(emailEle.getTextTrim());//去掉前后空格
    }
}
