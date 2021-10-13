package com.designpatterns.abstractfactory.furniture;

import com.designpatterns.abstractfactory.furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public int hasLegs() {
        return 0;
    }

    @Override
    public void sitOn() {

    }
}
