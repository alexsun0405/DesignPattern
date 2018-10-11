package com.dp.section1;

public class Main {

    /**
     * 优点
     * 首先, 良好的封装性. 隐蔽了对象创建的过程, 调用者只需要知道产品的名称即可.
     * 其次, 优秀的扩展性. 易于扩展, 如果哪天需要增加一个 棕色人种 那么直接添加一个 BrownHuman 实现类即可, 工厂类不需要进行任何修改.
     * 再次, 屏蔽产品类. 只需要知道 Human 即可, 不需要知道具体的实现类是什么. 只要接口不变, 上层模块不需要改变.
     * 最后, 典型的解耦框架. 高层模块只需要知道产品的抽象类, 符合迪米特法则, 我们不需要的就不关心; 只依赖产品类的抽象类, 符合依赖倒置原则;使用产品子类替换产品父类, 符合里氏替换原则.
     * @param args
     */
    public static void main(String[] args) {
        // 创建具体的工厂来生产具体的实现
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
