package com.bbs.patterns.prototype.domain;

public final class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle() {
        // Default constructor
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.height = source.getHeight();
        this.width = source.getWidth();
    }

    @Override
    public Shape ofClone() {
        return new Rectangle(this);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
