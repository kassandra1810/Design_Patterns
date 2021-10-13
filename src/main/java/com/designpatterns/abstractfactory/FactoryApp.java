package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factories.FurnitureFactory;
import com.designpatterns.abstractfactory.furniture.Chair;
import com.designpatterns.abstractfactory.furniture.CoffeeTable;
import com.designpatterns.abstractfactory.furniture.Sofa;

public class FactoryApp {
    Chair chair;
    Sofa sofa;
    CoffeeTable coffeeTable;

    public FactoryApp(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
        coffeeTable = furnitureFactory.createCoffeeTable();
    }

    public void furnitureDetails() {
        System.out.println(chair.hasLegs());
        System.out.println(sofa.getSize());
        System.out.println(coffeeTable.getType());
    }
}
