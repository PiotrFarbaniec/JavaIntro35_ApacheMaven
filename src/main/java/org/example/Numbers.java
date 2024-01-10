package org.example;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(isNumberEven(3));
    }

    static boolean isNumberEven(int number) {

        return (number%2 == 0 && number !=0);
    }
}
