package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(performingCalculationsForGivenNumbers(10, 20, '-'));
    }

    static double performingCalculationsForGivenNumbers(double valA, double valB, char sign) {
        double equation = 0;

        switch (sign) {
            case '+':
                equation = valA + valB;
                System.out.println("Sum of entered values: ");
                break;

            case '-':
                equation = valA - valB;
                System.out.println("Subtraction of entered values: ");
                break;

            case '*':
                equation = valA * valB;
                System.out.println("Multiplication of entered values: ");
                break;

            case '/':
                equation = valA / valB;
                System.out.println("Dividing of entered values: ");
                break;

            default:
                System.out.println("Wrong operator! Allowed {'+' , '-', '*', '/'} types only");
        }
        return equation;
    }
}