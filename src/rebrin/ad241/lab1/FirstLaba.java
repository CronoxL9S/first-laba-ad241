package rebrin.ad241.lab1;

/*
 * @(#)FirstLaba.java
 *
 * Лабораторна робота №1
 * Тема: Знайомство з базовим синтаксисом та операторами Java
 * @author Ребрин Володимир
 * @version 1.0 2025/09/09
 * Група: АД-241
 */

/**
 * Клас містить реалізації завдань лабораторної роботи №1.
 */
public class FirstLaba {

    /**
     * Цей метод перевіряє, чи кожен елемент масиву чисел
     * є більшим або рівним попередньому елементу.
     *
     * @param arr масив цілих чисел, довжина масиву мінімум 2
     * @return true, якщо елементи відсортовані за зростанням або рівні, інакше false
     */

    public static boolean isNotDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Цей метод реалізує відому Британську гру FizzBuzz
     * Виводить числа від 1 до 100, замінюючи ті, що кратні 3 - на Fizz,
     * кратні 5 - на Buzz та кратні і 3 і 5 - на FizzBuzz
     */

    public static void fizzBuzz() {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Метод перевіряє, чи можна розділити масив на дві частини з однаковою сумою.
     *
     * @param arr масив цілих чисел, довжина масиву мінімум 2
     * @return true, якщо існує варіант поділу з рівною сумою частин, інакше false
     */
    public static boolean canDivide (int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftPartSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftPartSum += arr[i];
            if (leftPartSum * 2 == totalSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testFirstTask = {1, 4, 5, 5, 9};
        int[] testSecondTaskOne = {1, 2, 1, 1, 1};
        int[] testSecondTaskTwo = {2, 1, 1, 2, 1};

        System.out.println("Перше завданн: " + isNotDecreasing(testFirstTask));

        System.out.print("Друге завдання: ");
        fizzBuzz();

        System.out.print("Третє завдання: " + canDivide(testSecondTaskOne) + " ");
        System.out.print(canDivide(testSecondTaskTwo));

        System.out.println();
    }
}