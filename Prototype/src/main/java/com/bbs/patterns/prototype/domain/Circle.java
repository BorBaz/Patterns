package com.bbs.patterns.prototype.domain;

public final class Circle extends Shape {

    private int radius;

    public Circle() {
        // Default constructor
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.getRadius();
    }

    @Override
    public Shape ofClone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
