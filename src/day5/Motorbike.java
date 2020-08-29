package day5;

public class Motorbike {

    private int yearOfIssue;
    private String colour;
    private String model;

    public Motorbike(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
        System.out.println("Год выпуска " + yearOfIssue);
    }
    public Motorbike(String colour, String model){
        this.colour = colour;
        this.model = model;
        System.out.println(colour + " " + model);

    }


}
