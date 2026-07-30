/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kitti
 */
import java.util.Scanner;
class MyRectangle {
    private double centerX, centerY, width, height;
    public MyRectangle(double centerX, double centerY, double width, double height) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.height = height;
    }
    public double getLeft()   { return centerX - width / 2; }
    public double getRight()  { return centerX + width / 2; }
    public double getTop()    { return centerY + height / 2; }
    public double getBottom() { return centerY - height / 2; }
    public boolean isInside(MyRectangle other) {
        return getLeft()   >= other.getLeft()
            && getRight()  <= other.getRight()
            && getTop()    <= other.getTop()
            && getBottom() >= other.getBottom();
    }
    public boolean overlaps(MyRectangle other) {
        return getLeft()   < other.getRight()
            && getRight()  > other.getLeft()
            && getBottom() < other.getTop()
            && getTop()    > other.getBottom();
    }
}
public class lab207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  x y width height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        MyRectangle r1 = new MyRectangle(x1, y1, w1, h1);
        System.out.print("Enterx y width height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        MyRectangle r2 = new MyRectangle(x2, y2, w2, h2);
        if (r2.isInside(r1)) {
            System.out.println("r2 is inside r1");
        } else if (r2.overlaps(r1)) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}