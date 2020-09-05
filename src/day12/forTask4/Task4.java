package day12.forTask4;



import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Роза Робот");
        members1.add("Шершняга");
        members1.add("Сатан");

        MusicBand band1 = new MusicBand("Багровый фантомас", 2019,members1);

        List<String> members2 = new ArrayList<>();

        members2.add("Сабуров");
        members2.add("Мусаев");
        members2.add("Макаров");
        members2.add("Рептилойд");
        members2.add("Щербаков");

        MusicBand band2 = new MusicBand("ЧБД",2019,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }

}
