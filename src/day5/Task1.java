package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue(2000);
        car.setColour("Баклажан!");
        car.setModel("Лада Седан!");
        System.out.println(car.getModel() + " " + car.getColour());
        System.out.println(car.getYearOfIssue() + " года выпуска");



    }
}


