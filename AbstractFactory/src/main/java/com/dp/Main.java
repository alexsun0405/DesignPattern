package com.dp;

import com.dp.section1.FemaleFactory;
import com.dp.section1.Human;
import com.dp.section1.HumanFactory;
import com.dp.section1.MaleFactory;

public class Main {
    public static void main(String[] args) {
        HumanFactory femaleHumanFactory = new FemaleFactory();
        HumanFactory maleHumanFactory = new MaleFactory();

        Human female = femaleHumanFactory.createBlackHuman();
        female.getColor();
        female.getSex();
        female.talk();
        Human male = maleHumanFactory.createBlackHuman();
        male.getColor();
        male.getSex();
        male.talk();
    }
}
