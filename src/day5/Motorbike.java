package day5;

public class Motorbike {

    private int yearOfIssue;
    private String colour;
    private String model;

    public Motorbike(int yearOfIssue, String colour, String model){
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
        this.model = model;
        System.out.println("Год выпуска " + yearOfIssue + ". Цвет " + colour + ". Модель " + model);
    }



}
