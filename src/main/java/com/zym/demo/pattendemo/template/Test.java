package com.zym.demo.pattendemo.template;

/**
 * 模板模式
 * 需求：
 * 要开发一套客户信息管理系统，可以按照关键字查询，可以按照用户自定义参数查询，用户自定义参数包括用户姓名，用户编码，用户单位
 * 思路：用模板模式和桥接模式来实现该需求
 * uml图：https://www.processon.com/view/link/5e9474830791293bf96c59cf
 *
 * @Author zhuyumeng
 * @Since 2020年4月13日22:32:27
 */
public class Test {

    public static void main(String[] args) {
        //关键字查询
        KeyWordsQuery keyWordsQuery = new KeyWordsQuery();
        keyWordsQuery.handle("43544");

        DefinedQuery definedQuery = new DefinedQuery();
        UserName userName = new UserName();
        definedQuery.setDefined(userName);
        //用户名查询
        definedQuery.handle("324333");
    }

}
