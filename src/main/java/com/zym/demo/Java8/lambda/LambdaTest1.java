package com.zym.demo.Java8.lambda;

import com.zym.demo.Java8.lambda.interfacetest.NoReturnMultiParam;
import com.zym.demo.Java8.lambda.interfacetest.NoReturnNoParam;
import com.zym.demo.Java8.lambda.interfacetest.ReturnMultiParam;
import com.zym.demo.Java8.lambda.interfacetest.ReturnOneParam;

/**
 * 练习lambda的写法
 * 语法为()->{},其中() 为描述参数列表，{}用来描述方法体，->为lambda运算符，读作 goes to
 */
public class LambdaTest1 {

    public static void main(String[] args) {
        //调用无参数，无返回值的函数式接口
        NoReturnNoParam noReturnNoParam = () -> System.out.println(77777);
        noReturnNoParam.method();

        //调用有参数无返回的接口
        NoReturnMultiParam noReturnMultiParam = (a, b, c) -> {
            System.out.println("11111" + a + b + c);
        };
        noReturnMultiParam.method(7, 8, 9);

        //调用只有一个参数的接口
        ReturnOneParam returnOneParam = a -> {
            return a;
        };
        System.out.println(returnOneParam.methos(2));

        //调用有返回值的有参数的接口
        //ReturnMultiParam returnMultiParam = ( a,  b)-> doubleNum(a+b);
        //System.out.println(returnMultiParam.method(8,9));

        //有时候我们不是要自己重写某个内部类的方法，我们可以利用lambda表达式的接口快速指向一个已经被实现的方法
        //语法：方法归属者::方法名，静态方法的归属者为类名，普通方法的归属者为对象
        ReturnMultiParam returnMultiParam1 = LambdaTest1::doubleNum;
        returnMultiParam1.method(6, 8);
    }

    private static int doubleNum(int a, int b) {
        return a + b;
    }

    /**
     * 要求
     * 1.参数数量和类型要与接口中定义的一致
     * 2.返回值类型要与接口中定义的一致
     */
    public static int doubleNum(int a) {
        return a * 2;
    }

    public int addTwo(int a) {
        return a + 2;
    }
}
