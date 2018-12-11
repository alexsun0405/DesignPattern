package com.dp.section3;

/**
 * 房地产公司，只卖房子
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚钱了！");
    }
}
