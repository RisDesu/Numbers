/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Text {
    private static final Scanner in = new Scanner(System.in);
    
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }
    
     public boolean checkOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //check number is squarenumber or not
    public boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }

    
    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    
    public void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(c)) {
            System.out.print(b + " ");
        }
        if (checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
}
