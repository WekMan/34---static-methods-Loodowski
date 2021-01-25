package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String text="Арбуз";
        System.out.println("Is a word a palindrome? " + Exercise.Calculate(text));
    }
}
