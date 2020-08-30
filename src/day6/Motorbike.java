package day6;

import java.util.Scanner;

public class Motorbike {
    Scanner scanner = new Scanner(System.in);

    private int yearOfIssueMoto;
    private String colour;
    private String model;

    public Motorbike(int yearOfIssueMoto) {
        this.yearOfIssueMoto = yearOfIssueMoto;
    }


    public Motorbike(int yearOfIssueMoto, String colour, String model){
        this.yearOfIssueMoto = yearOfIssueMoto;
        this.colour = colour;
        this.model = model;
        System.out.println("Год выпуска " + yearOfIssueMoto + ". Цвет " + colour + ". Модель " + model);
    }

    void lineOutputMoto() {
        System.out.println("Это мотоцикл");
    }

    int differenceBetweenYearsMoto(int yearInput) {

        return Math.abs(yearInput - yearOfIssueMoto);

    }



}
