package com.zym.demo.Java8.lambda;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 练习lambda的写法
 * 语法为()->{},其中() 为描述参数列表，{}用来描述方法体，->为lambda运算符，读作 goes to
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        //创建线程
        new Thread(() -> System.out.println(8888));

        //遍历集合
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        Collections.addAll(integerList, 1, 3, 4, 5, 6, 7, 8);
        integerList.forEach(e -> {
            e = e + 2;
        });
        integerList.forEach(System.out::println);
        //删除集合某个元素
        integerList.removeIf(e -> e < 3);

        //函数式编程
        List<String> nameList = Arrays.asList("423", "4554", "5464", "5484", "5454", "5454");
        filter(nameList, (str) -> str.toString().indexOf("5") != -1);
        //strams式，自定义filter
        nameList.stream()
                .filter((str) -> str.indexOf("2") != -1)
                .forEach(System.out::println);

        //获取所有大于5000的数，并且都加50，最后打印
        nameList.stream()
                .filter((str) -> Integer.parseInt(str) <= 5000)
                .map((str) -> Integer.toString(Integer.parseInt(str) + 50))
                .forEach(System.out::println);
        //求和
        int total = nameList.stream()
                .map(str -> Integer.parseInt(str))
                .reduce((sum, sigle) -> sum + (sigle)).get();
        System.out.println(total);

        //获取大于5000的集合
        List<String> resList = nameList.stream()
                .filter((str) -> Integer.parseInt(str) > 5000)
                .collect(Collectors.toList());
        //去重
        nameList.stream()
                .distinct()
                .forEach(System.out::println);

        //获取最大值最小值
        IntSummaryStatistics staticSattus = nameList.stream()
                .distinct()
                .map(str -> Integer.parseInt(str))
                .mapToInt((a) -> a)
                .summaryStatistics();
        System.out.println(staticSattus.getMax() + "," + staticSattus.getSum());


    }

    public static void filter(List names, Predicate predicate) {
        names.stream().filter((name) -> (predicate.test(name)))
                .forEach(System.out::println);
    }
}
