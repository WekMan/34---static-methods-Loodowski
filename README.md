# Практична робота "Створення і використання статичних методів"
## Завдання 12 "Перевірити чи задане слово є паліндромом (метод Calculate має повернути булевське значення)"

Паліндромом -  слово, число, набір символів, словосполучення або віршований рядок, що однаково читається в обох напрямках (зліва направо та справа наліво).

## Код

**Exercise**
```java
package domain;

public class Exercise {
    /**
     * Method that checks if a string is a palindrome
     * @param text string that will be check
     * @return boolean true or false
     */
    public static boolean Calculate(String text){
        /**
         * Reverse the word and do it lowercase
         */
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
}
```

**TestResult**
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String text="Арбуз";
        System.out.println("Is a word a palindrome? " + Exercise.Calculate(text));
    }
}
```

## Приклад виконання програми: 
![Image](https://i.ibb.co/92Gvxkx/374.png)
![Image](https://i.ibb.co/ss9G397/375.png)