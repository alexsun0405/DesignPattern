package com.dp.section3;

public class TextBuilder2 extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    void makeTitle(String title) {
        buffer.append("**************\n");
        buffer.append("【" + title + "】\n");
    }

    @Override
    void makeString(String string) {
        buffer.append("【" + string + "】\n");
    }

    @Override
    void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("【" + items[i] + "】\n");
        }
    }

    @Override
    void close() {
        buffer.append("**************\n");
        System.out.println(buffer.toString());
    }
}
