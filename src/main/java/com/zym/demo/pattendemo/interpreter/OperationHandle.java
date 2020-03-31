package com.zym.demo.pattendemo.interpreter;

import org.springframework.util.StringUtils;

import java.util.Stack;
import java.util.stream.Stream;

public class OperationHandle {

    public void handle(String instrution){
        if(StringUtils.isEmpty(instrution)){
            System.out.println("input params is empty !!");
        }

        String [] paramsArray = instrution.split(" ");
        Stack<Operation> operationStack = new Stack<Operation>();
        String operation = "";
        Operation right = null;
        Operation left = null;
        for(String str : paramsArray){
            if(!"and".equals(str) && !"or".equals(str)){//是终结符
                if(StringUtils.isEmpty(operation)){//第一个终结符
                    left = new IntOperation(Integer.parseInt(str));
                }else{
                    //将前面的operation拿出来当做非终结符来拼接语法
                    if("and".equals(operation)){
                        left = new AndOperation(left,new IntOperation(Integer.parseInt(str)));
                    }else{
                        left = new OrOperation(left,new IntOperation(Integer.parseInt(str)));
                    }
                }
            }else{
                operation = str;
            }
        }
        if(left != null){
            System.out.println(left.interpreter());
        }
    }
}
