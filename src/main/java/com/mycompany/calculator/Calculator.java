/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculator;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author saugat
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number x");
        int x = sc.nextInt();
        System.out.println("Enter the second number y");
        int y = sc.nextInt();
        boolean flag = true;

        while (flag) {
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nChoose:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    new Addition().add(x, y);
                    break;
                case 2:
                    new Subtraction().sub(x, y);
                    break;
                case 3:
                    new Multiplication().mult(x, y);
                    break;
                case 4:
                    new Division().div(x, y);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    break;
            }
        }

    }
}
