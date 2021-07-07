package com.syncretis.productContainer;

public abstract class Container {
    private final double mass;

    public Container(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Container{" +
                "mass=" + mass +
                '}';
    }
}
