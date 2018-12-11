package com.dp.section3;

/**
 * 山寨公司，啥赚钱卖啥
 */
public class ShanzhaiCorp extends Corp {
    public ShanzhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚钱了呀！");
    }
}
