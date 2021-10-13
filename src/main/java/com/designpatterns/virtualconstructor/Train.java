package com.designpatterns.virtualconstructor;

public class Train implements Transport {
    @Override
    public void pickUpParcel() {
        System.out.println("Train pick up implementation");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Train deliver implementation");
    }
}
