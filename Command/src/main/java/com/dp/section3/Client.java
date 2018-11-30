package com.dp.section3;

/**
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//首先声明出调用者Invoker
		Invoker invoker = new Invoker();
		
		//定义接收者，此处可以在Command中指定Receiver，进一步解耦，Client完全不需要以来Receiver。参见section4
		Receiver receiver = new ConcreteReciver1();
		
		//定义一个发送给接收者的命令
		Command command = new ConcreteCommand1(receiver);
		
		//执行者接收命令
		invoker.setCommand(command);

		//执行
		invoker.action();
	}

}