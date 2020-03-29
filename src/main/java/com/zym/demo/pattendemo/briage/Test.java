package com.zym.demo.pattendemo.briage;

/**\
 * 桥接模式
 * 需求：要开发一个文件转换工具，需要转换xml,pdf,sql文件，并且支持mysql和oracel数据库
 * 思路：采用桥接模式，两个变化维度，一个是转换文件的算法，第二个是需要支持不同的数据库
 * @AUTHER zhuyumeng
 * @Since 2020年3月22日21:05:19
 */
public class Test {

    public static void main(String[] args) {
        String fileType ="sql";
        String dataBase = "oracle";
        try {
            DataCovert covert = (DataCovert)Class.forName(DataBaseTypeParser.getNameByValue(dataBase)).newInstance();
            FileCovertor fileCovertor = (FileCovertor)Class.forName(FileTypeParser.getNameByValue(fileType)).newInstance();
            covert.setFileCovertor(fileCovertor);
            covert.covert();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
