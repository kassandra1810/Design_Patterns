package com.designpatterns;

import com.designpatterns.abstractfactory.FactoryApp;
import com.designpatterns.abstractfactory.factories.FurnitureFactory;
import com.designpatterns.abstractfactory.factories.ModernFurnitureFactory;
import com.designpatterns.abstractfactory.factories.VictorianFurnitureFactory;

public class Main {
    public static FactoryApp configureFactoryApplication() throws Exception {
        FactoryApp factoryApp;
        FurnitureFactory furnitureFactory;
        if(true) {
            furnitureFactory = new ModernFurnitureFactory();
            factoryApp = new FactoryApp(furnitureFactory);
        } else if (true) {
            furnitureFactory = new VictorianFurnitureFactory();
            factoryApp = new FactoryApp(furnitureFactory);
        } else {
            throw new Exception("unknown type of furniture factory!");
        }
        return factoryApp;
    }

    public static void main(String [] args) throws Exception {
        FactoryApp app = configureFactoryApplication();
        app.furnitureDetails();
    }
}
