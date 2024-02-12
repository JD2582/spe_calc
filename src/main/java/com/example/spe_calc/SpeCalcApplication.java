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
        System.out.println("5. Natural Logarithm (ln)");
        System.out.println("6. Square Root (√)");
        System.out.println("7. Factorial (!)");
        System.out.println("8. Power (^)");
        System.out.println("9. Percentage (%)");

        int operation = scanner.nextInt();

        double result;
        switch (operation) {
            case 1:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case 5:
                result = Math.log(num1);
                System.out.println("Result: " + result);
                break;

            case 6:
                result = Math.sqrt(num1);
                System.out.println("Result: " + result);
                break;
            case 7:
                result = factorial((int) num1);
                System.out.println("Result: " + result);
                break;
            case 8:
                System.out.print("Enter second number (power): ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 9:
                System.out.print("Enter second number (percentage): ");
                num2 = scanner.nextDouble();
                result = (num1 * num2) / 100;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }

    public static double factorial(int n) {
        if (n == 0)
            return 1;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


}

