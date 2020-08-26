package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            sum = a / b;
            counter++;
            if (counter == 5) break;
            System.out.println(sum);


        }
    }
}
