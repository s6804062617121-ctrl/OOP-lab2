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

class PrimeChecker {
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
public class lab209{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrimeChecker checker = new PrimeChecker();
        int maxPrime = -1; // ค่าเริ่มต้นถ้าไม่พบจำนวนเฉพาะเลย
        while (input.hasNextInt()) {
            int number = input.nextInt();
            if (number == 0) {
                break; // เลข 0 คือตัวจบข้อมูล
            }
            if (checker.isPrime(number) && number > maxPrime) {
                maxPrime = number;
            }
        }
        System.out.println(maxPrime);
    }
}