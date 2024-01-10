package org.example;

public class AgeVerification {
    public static void main(String[] args) {
        System.out.println("Is person adult: " + whetherThePersonIsAdult(18));
    }

    static boolean whetherThePersonIsAdult(int verifiedAge) {
        return verifiedAge >= 18;
    }
}