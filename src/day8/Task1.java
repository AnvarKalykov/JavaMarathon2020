package day8;

public class Task1 {
    public static void main(String[] args) {
        String number = "";
        long timeStart = System.nanoTime();

        for (int i = 0; i <= 20000; i++) {
            number = number + i + " ";

        }
        System.out.println(number  + " ");

        long timeEnd = System.nanoTime();

        System.out.println(timeEnd - timeStart);


    }
}
