package org.example;

public class Age {
    public static void main(String[] args) {
        System.out.println("Is person adult: " + checkIfAdult(18));
    }

    static boolean checkIfAdult(int age) {
        return age >= 18;
    }
}