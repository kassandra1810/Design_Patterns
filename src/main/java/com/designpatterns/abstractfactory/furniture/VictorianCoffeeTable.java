package com.designpatterns.abstractfactory.furniture;

import com.designpatterns.abstractfactory.furniture.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean madeFromGlass() {
        return false;
    }
}
