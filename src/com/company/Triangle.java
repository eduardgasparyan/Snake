package com.company;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double makeres()
    {
        int d=(a+b+c)/2;
        return Math.sqrt(d*(d-a)*(d-b*(d-c)));
    }
}

