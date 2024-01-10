package org.example;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(numberVerification(0));
    }

    static String numberVerification (int number) {
        if(number != 0) {
            String notify = number % 2 == 0 ? "Given number is even" : "Given number is odd";
            return notify;
        }
        else return "Zero is an undefined number";
    }
}
