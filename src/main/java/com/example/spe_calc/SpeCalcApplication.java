package com.example.spe_calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.lang.Math;

@SpringBootApplication
public class SpeCalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeCalcApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int operation;
        // Loop until user chooses to exit
        while (true) {
            System.out.print("Select operation:\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n5. Natural Logarithm (ln)\n6. Square Root (√)\n7. Factorial (!)\n8. Power (^)\n9. Exit\nEnter your choice: ");
            operation = scanner.nextInt();

            if (operation == 9) {
                System.out.println("Exiting...");
                break; // Exit the loop if user chooses 9
            }

            switch (operation) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + division(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + naturalLog(num1));
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + factorial(num1));
                    break;
                case 8:
                    System.out.print("Enter base number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + power(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }

        scanner.close();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public static double naturalLog(double num) {
        return Math.log(num);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double factorial(double num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
