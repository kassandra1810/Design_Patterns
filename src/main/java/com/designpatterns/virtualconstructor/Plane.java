package com.designpatterns.virtualconstructor;

public class Plane implements Transport {
    @Override
    public void pickUpParcel() {
        System.out.println("Plane pick up implementation");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Plane deliver implementation");
    }
}
