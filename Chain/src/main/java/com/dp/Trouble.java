package com.dp;

import lombok.Data;

/**
 * 需要解决的问题
 */
@Data
public class Trouble {

    /**
     * 问题编号
     */
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
