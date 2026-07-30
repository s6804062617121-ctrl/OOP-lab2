/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kitti
 */
// ComplexTest.java
/*class Complex {
    private double r, i;

    Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    Complex(Complex c) {
        this(c.r, c.i);
    }

    public void add(Complex c) {
        r += c.r;
        i += c.i;
    }

    public void subtract(Complex c) {
        r -= c.r;
        i -= c.i;
    }

    public void multiply(Complex c) {
        // (a+bi)(c+di) = (ac-bd) + (ad+bc)i
        double newR = r * c.r - i * c.i;
        double newI = r * c.i + i * c.r;
        r = newR;
        i = newI;
    }

    public void divide(Complex c) {
        // (a+bi)/(c+di) = ((ac+bd)/(c^2+d^2)) + ((bc-ad)/(c^2+d^2))i
        double denom = c.r * c.r + c.i * c.i;
        double newR = (r * c.r + i * c.i) / denom;
        double newI = (i * c.r - r * c.i) / denom;
        r = newR;
        i = newI;
    }

    public void print() {
        if (i >= 0) {
            System.out.println(r + " + " + i + "i");
        } else {
            System.out.println(r + " - " + (-i) + "i");
        }
    }
}

class ComplexTest {
    public static void main(String args[]) {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);

        Complex sum = new Complex(a);
        sum.add(b);
        System.out.print("a + b = ");
        sum.print();

        Complex diff = new Complex(a);
        diff.subtract(b);
        System.out.print("a - b = ");
        diff.print();

        Complex prod = new Complex(a);
        prod.multiply(b);
        System.out.print("a * b = ");
        prod.print();

        Complex quot = new Complex(a);
        quot.divide(b);
        System.out.print("a / b = ");
        quot.print();
    }
}