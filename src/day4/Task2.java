package day4;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int maxNumber = 0;
        int maxIndex = 0;
        int minNumber = 10000;
        int minIndex = 0;
        int kolEle = 0;
        int sumEle = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10001);
            if (maxNumber <= numbers[i]) {
                maxNumber = numbers[i];
                maxIndex = i;

            }

        }
        System.out.println("наибольший элемент массива " + maxIndex);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10001);
            if (minNumber >= numbers[i]) {
                minNumber = numbers[i];
                minIndex = i;

            }

        }
        System.out.println("наименьший элемент массива " + minIndex);

        for (int ke : numbers) {
            if (ke % 10 == 0) {
                kolEle++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + kolEle);

        for (int se : numbers) {
            if (se % 10 == 0) {
                sumEle = sumEle + se;

            }

        }
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEle);


    }
}
