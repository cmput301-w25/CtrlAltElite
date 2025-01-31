package com.example.ctrlaltelite;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius, int x, int y) {
        super(x,y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
