package com.harammal.exercises.oop_full.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{
    Point upperLeft;
    Point bottomRight;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getBase(){
        return Math.abs(bottomRight.getX() - upperLeft.getX());
    }

    public double getHeight(){
        return Math.abs(upperLeft.getY() - bottomRight.getY());
    }

    @Override
    public double getPerimeter() {
        return (getBase() + getHeight()) * 2.0;
    }

    @Override
    public double getArea() {
        return getBase() * getHeight();
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        double newX = upperLeft.getX() + getBase() * scale;
        double newY = upperLeft.getY() - getHeight() * scale;
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + "id=" + id + '\'' + ", color=" + color + '}';
    }
}
