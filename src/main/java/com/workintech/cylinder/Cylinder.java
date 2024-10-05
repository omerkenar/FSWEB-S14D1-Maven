package com.workintech.cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height=height;
        heightControl(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        heightControl(height);
    }

    public void heightControl(double height){
        if(height<0){
            this.height=0;
        } else {this.height=height;}
    }


    public double getVolume(){
        return super.getArea()*this.height;
    }
}
