package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;

public Vector(double x, double y, double z)
{
    this.x =x;
    this.y = y;
    this.z = z;
}
public double length()
{
    return Math.sqrt(x*x+y*y+z*z);
}
}