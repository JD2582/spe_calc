package com.example.spe_calc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class SpeCalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeCalcApplication.class, args);


        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + addition(num1, num2));
                break;
            case 2:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + subtraction(num1, num2));
                break;
            case 3:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + multiplication(num1, num2));
                break;
            case 4:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + division(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
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

}

