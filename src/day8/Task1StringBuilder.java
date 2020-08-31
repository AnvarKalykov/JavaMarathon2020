package day8;

public class Task1StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        long timeStart = System.nanoTime();

        for (int i = 0; i<=20000; i++) {

            sb.append(i).append(" ");


        }
        System.out.println(sb);

        long timeEnd = System.nanoTime();

        System.out.println(timeEnd - timeStart);

    }
}
