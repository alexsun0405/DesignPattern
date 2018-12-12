package com.dp.section3;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new TextBuilder());
        director1.construct();

        Director director2 = new Director(new TextBuilder2());
        director2.construct();
    }
}
