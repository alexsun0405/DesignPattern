package com.dp.section2;

/**
 * 抽象公司
 */
public abstract class Corp {
    /**
     * 是公司就应该有生产，不管是软件公司还是制造业公司
     * 每家公司生产的东西都不一样，所以由实现类来完成。
     */
    protected abstract void produce();

    /**
     * 销售
     */
    protected abstract void sell();

    /**
     * 赚钱
     */
    public void makeMoney() {
        //生产
        this.produce();
        //销售
        this.sell();
    }
}
