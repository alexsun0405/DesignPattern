package com.dp.section1;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return null;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
