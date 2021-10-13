package com.designpatterns.virtualconstructor;

public class Airmail extends Post {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
