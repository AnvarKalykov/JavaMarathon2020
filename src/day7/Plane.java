package day7;

public class Plane {
    private String manufacturerPlane;
    private int yearOfIssuePlane;
    private int lengthPlane;
    private int weightPlane;
    private int fuelVolumeTank = 0;

    public  Plane(int lengthPlane) {
        this.lengthPlane = lengthPlane;

    }

    public Plane(String manufacturerPlane, int yearOfIssuePlane, int lengthPlane, int weightPlane) {
        this.manufacturerPlane = manufacturerPlane;
        this.yearOfIssuePlane = yearOfIssuePlane;
        this.lengthPlane = lengthPlane;
        this.weightPlane = weightPlane;
        this.fuelVolumeTank = 0;
    }

    public static void planesLength(Plane plane1, Plane plane2) {
        if (plane1.lengthPlane > plane2.lengthPlane) {
            System.out.println("Первый самолет длиннее второго");
        } else if (plane1.lengthPlane < plane2.lengthPlane) {
            System.out.println("Второй самолет длиннее первого");
        } else {
            System.out.println("Длина самолетов одинакова");
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturerPlane + ", год выпуска: "
                + yearOfIssuePlane + ", длина: " + lengthPlane + ", вес: " + weightPlane + ", объем топлива в баке: " + fuelVolumeTank);
    }

    public void fillUp(int inputFuel) {
        fuelVolumeTank+=inputFuel;

    }

    public String getManufacturerPlane() {
        return manufacturerPlane;
    }

    public void setManufacturerPlane(String manufacturerPlane) {
        this.manufacturerPlane = manufacturerPlane;
    }

    public int getYearOfIssuePlane() {
        return yearOfIssuePlane;
    }

    public void setYearOfIssuePlane(int yearOfIssuePlane) {
        this.yearOfIssuePlane = yearOfIssuePlane;
    }

    public int getLengthPlane() {
        return lengthPlane;
    }

    public void setLengthPlane(int lengthPlane) {
        this.lengthPlane = lengthPlane;
    }

    public int getWeightPlane() {
        return weightPlane;
    }

    public void setWeightPlane(int weightPlane) {
        this.weightPlane = weightPlane;
    }

    public int getFuelVolumeTank() {
        return fuelVolumeTank;
    }

    public void setFuelVolumeTank(int fuelVolumeTank) {
        this.fuelVolumeTank = fuelVolumeTank;
    }
}
