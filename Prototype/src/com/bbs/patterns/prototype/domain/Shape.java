package com.bbs.patterns.prototype.domain;

import com.bbs.patterns.prototype.architecture.Prototype;

import java.awt.Color;

public abstract class Shape implements Prototype<Shape> {

    private int x;
    private int y;
    private Color color;

    // Regular constructor
    protected Shape() {

    }

    // Prototype constructor
    protected Shape(Shape source) {
        this.x = source.getX();
        this.y = source.getY();
        this.color = source.getColor();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
