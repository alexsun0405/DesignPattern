package com.dp.section4;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }


    /**
     * 修正父类的行为
     */
    @Override
    public void request() {
        // 加一些逻辑
        super.request();
        super.getImplementor().doAnyThing();
    }
}
