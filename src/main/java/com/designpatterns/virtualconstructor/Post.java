package com.designpatterns.virtualconstructor;

public abstract class Post {

    public void deliverParcel() {
        Transport transport = createTransport();
        transport.deliverParcel();
    }
    public abstract Transport createTransport();
}
