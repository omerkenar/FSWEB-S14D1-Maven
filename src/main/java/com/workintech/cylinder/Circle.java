package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
        radiusControl(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        radiusControl(radius);
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }


    public void radiusControl(double radius){
        if(radius<0){
            this.radius=0;
        } else {this.radius=radius;}
    }
}
