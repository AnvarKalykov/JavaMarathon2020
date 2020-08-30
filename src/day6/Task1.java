package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike motorbike1 = new Motorbike(2011);
        car1.lineOutputCar();
        car1.setYearOfIssue(2010);
        int yearCar = car1.differenceBetweenYearsCar(1888);
        System.out.println(yearCar);
        motorbike1.lineOutputMoto();
        int yearMoto = motorbike1.differenceBetweenYearsMoto(999);
        System.out.println(yearMoto);


    }
}
