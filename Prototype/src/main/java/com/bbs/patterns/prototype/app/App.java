package com.bbs.patterns.prototype.app;

import com.bbs.patterns.prototype.domain.Circle;
import com.bbs.patterns.prototype.domain.Rectangle;
import com.bbs.patterns.prototype.domain.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class App {

    private static final List<Shape> shapes = new ArrayList<>(Collections.emptyList());

    public static void main(String[] args) {

        var circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(12);
        shapes.add(circle);

        var anotherCircle = circle.ofClone();
        shapes.add(anotherCircle);

        var rectangle = new Rectangle();
        rectangle.setHeight(12);
        rectangle.setWidth(12);
        shapes.add(rectangle);

        doSomeClones();
    }

    private static void doSomeClones() {

        List<Shape> clones = new ArrayList<>(Collections.emptyList());

        shapes.forEach(shape -> clones.add(shape.ofClone()));
        clones.forEach(clone -> Logger.getLogger("App").log(Level.INFO, clone.toString()));
    }
}
