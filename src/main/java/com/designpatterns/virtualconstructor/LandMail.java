package com.designpatterns.virtualconstructor;

public class LandMail extends Post {
    boolean isCheep;
    public LandMail (boolean isCheep) {
        this.isCheep = isCheep;
    }

    @Override
    public Transport createTransport() {
        if (isCheep) {
            return new Train();
        } else {
            return new Truck();
        }
    }
}
