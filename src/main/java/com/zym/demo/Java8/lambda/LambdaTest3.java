package com.zym.demo.Java8.lambda;

import com.zym.demo.Java8.lambda.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

/**
 * 主要联系一下stream的用法
 */
public class LambdaTest3 {

    public static void main(String [] args){

        List<Person> persons = new ArrayList<Person>();
        ///生成6个person对象
        Stream.iterate(0,x -> x+2)
                .limit(6)
                .forEach(x->{
                    Person person = new Person("name"+x+111,x,"id"+x+111,false);
                    Person person2 = new Person("name"+x+1,x,"id"+x+1,true);
                    persons.add(person);
                    persons.add(person2);
                });
        //打印persons里面的name
        persons.stream().forEach(p->System.out.println(p.getName()));

        //求所有的age的和
        Integer totalage = persons.stream()
                .map(Person::getAge)
                .reduce((sum,p)->sum+p)
                .get();
        System.out.println(totalage);

        //将所有的名字收集成list
        List<String> names = persons.stream()
                .map(Person::getName)
                .collect(toList());
        //转成id:name的map
       Map<String,String> isName = persons.stream()
                .collect(Collectors.toMap(Person::getId,Person::getName));
        isName.keySet().stream()
                .forEach(x->{
                    System.out.println(x+":"+isName.get(x));
                });
        //按照id相同的进行分组
        Map<String,List<Person>> groupById = persons.stream()
                .collect(Collectors.groupingBy(Person::getId));
        groupById.keySet().stream()
                .forEach(x->{
                    System.out.println(x+":"+groupById.get(x));
                });
    }
}
