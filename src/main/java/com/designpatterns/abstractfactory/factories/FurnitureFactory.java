package com.designpatterns.abstractfactory.factories;

import com.designpatterns.abstractfactory.furniture.Chair;
import com.designpatterns.abstractfactory.furniture.CoffeeTable;
import com.designpatterns.abstractfactory.furniture.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
