package com.dp.section2;

public class Client {

    public static void main(String[] args) {
        Invoker zhangsan = new Invoker();
        Command command = new DeletePageCommand();
        zhangsan.setCommand(command);
        zhangsan.action();
    }

}
