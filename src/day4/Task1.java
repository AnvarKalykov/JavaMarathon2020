package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int len = scanner.nextInt();
        int[] array = new int[len];
        int dlina = 0;
        int sum = 0;
        int od = 0;
        int chet = 0;
        int nechet = 0;

        //выводим весь массив
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        //выводим длину массива
        for (int s : array) {
            dlina++;
        }
        System.out.println("Длина массива: " + dlina);

        for (int odin : array) {
            if (odin == 1) {
                od++;

            }

        }
        System.out.println("Количество чисел равных 1: " + od);

        //выводим количество четных
        for (int c : array) {
            if (c % 2 == 0) {
                chet++;
            }
        }
        System.out.println("Количество четных чисел: " + chet);

        //выводим количество нечетных

        for (int c : array) {
            if (c % 2 != 0) {
                nechet++;
            }
        }
        System.out.println("Количество четных чисел: " + nechet);

        //выводим  сумму массива
        for (int d : array) {
            sum=sum + d;
        }
        System.out.println("Сумма всех элементов массива: " + sum );


    }
}
