package com.designpatterns;

import com.designpatterns.abstractfactory.FactoryApp;
import com.designpatterns.abstractfactory.factories.FurnitureFactory;
import com.designpatterns.abstractfactory.factories.ModernFurnitureFactory;
import com.designpatterns.abstractfactory.factories.VictorianFurnitureFactory;
import com.designpatterns.virtualconstructor.Airmail;
import com.designpatterns.virtualconstructor.LandMail;
import com.designpatterns.virtualconstructor.Post;
import com.designpatterns.virtualconstructor.Transport;

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

    static void configureVirtualConstructorApp() {
        Post post;
        Transport transport;
        if (true) {
            post = new LandMail(false);
        } else {
            post = new Airmail();
        }
        post.deliverParcel();
    }



    public static void main(String [] args) throws Exception {
        // Abstract factory example
        FactoryApp app = configureFactoryApplication();
        app.furnitureDetails();

        // Virtual constructor, Factory Method example
        configureVirtualConstructorApp();


    }
}
