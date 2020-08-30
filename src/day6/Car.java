package day6;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue(int godVypuska) {
        yearOfIssue = godVypuska;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColour(String cvet) {
        colour = cvet;
    }

    public String getColour(){
        return colour;
    }

    public void setModel(String auto) {
        model = auto;
    }

    public String getModel(){
        return model;
    }

    void lineOutputCar() {
        System.out.println("Это автомобиль");
    }

    int differenceBetweenYearsCar(int yearInput) {

        return Math.abs(yearInput - yearOfIssue);

    }




}
