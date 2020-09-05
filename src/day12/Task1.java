package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("ВАЗ 2101");
        cars.add("ВАЗ 2102");
        cars.add("ВАЗ 2104");
        cars.add("ВАЗ 2105");
        cars.add("ВАЗ 2106");

        System.out.println(cars);

        cars.add(2,"ВАЗ 2103");
        cars.remove(0);

        System.out.println(cars);

    }
}
