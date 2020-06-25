package com.zym.demo.pattendemo.factory;

/**
 * 工厂方法的客户端
 * 需求：根据文件的结尾类型来判断用哪种解析器来获取文件的数据
 * 思路：维护一个枚举值类，根据枚举值里面的类型来判断使用哪种工厂方法来创建文件解析器
 * <p>
 * * @Author zhuyumeng
 * * @Since 2020年3月15日20:01:39
 */
public class Test {

    public static void main(String[] args) {
        try {
            String fileName = "xxx.excel";
            String fileType = fileName.split("\\.")[1];
            String parseFactoryType = TypeParser.getNameByValue(fileType);
            Parsefactory parsefactory = (Parsefactory) Class.forName(parseFactoryType).newInstance();
            Parser parser = parsefactory.createParser();
            parser.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
