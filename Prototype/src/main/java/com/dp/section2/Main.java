package com.dp.section2;

import com.dp.section2.framework.Manager;
import com.dp.section2.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("Strong message", underlinePen);
        manager.register("Warning box", messageBox1);
        manager.register("Slash box", messageBox2);

        Product p1 = manager.create("Strong message");
        p1.use("Hello, World!");
        Product p2 = manager.create("Warning box");
        p2.use("Hello, World!");
        Product p3 = manager.create("Slash box");
        p3.use("Hello, World!");
    }
}
