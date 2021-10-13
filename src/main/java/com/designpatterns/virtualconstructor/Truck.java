package com.designpatterns.virtualconstructor;

public class Truck implements Transport {
    @Override
    public void pickUpParcel() {
        System.out.println("Truck pick up implementation");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Truck deliver implementation");
    }
}
