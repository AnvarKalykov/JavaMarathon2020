package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 9;
        int answer = 0;
        for (int i = 1; i < 10; i++) {
            answer = i * k;
            System.out.println(i +" x "+ k + " = " + answer);
        }
    }
}
