package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Kukuruznik", 1984, 10, 2000);

        plane.setYearOfIssuePlane(1974);
        plane.setLengthPlane(15);

        plane.fillUp(800);

        plane.fillUp(1400);

        plane.info();

    }
}
