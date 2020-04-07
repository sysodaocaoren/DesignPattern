package com.zym.demo.pattendemo.memento;

/**
 * 备忘录模式
 * 需求：利用stack在模拟一个ctrl+z  ctrl+y的功能
 *
 * @Author zhuyumeng
 * @Since 2020年4月7日22:04:54
 */
public class Test {
    public static void main(String[] args) {

        CareTaker taker = new CareTaker();

        //声明操作
        OperationOrignal op1 = new OperationOrignal("写了hello word!");
        taker.addRestore(op1.createMementto());

        op1.setOperationName("删除了 word");
        taker.addRestore(op1.createMementto());

        op1.setOperationName("写了 god");
        taker.addRestore(op1.createMementto());

        //撤销一步Memo
        op1.restore(taker.restore());
        System.out.println(op1.getOperationName());

        //再撤销一部
        op1.restore(taker.restore());
        System.out.println(op1.getOperationName());

        //再回复一步
        op1.reply(taker.reply());
        System.out.println(op1.getOperationName());
        //再回复一步
        op1.reply(taker.reply());
        System.out.println(op1.getOperationName());
    }
}
