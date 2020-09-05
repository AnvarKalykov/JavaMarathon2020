package day12.forTask5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Джастин Бибер", 2014));
        members1.add(new MusicArtist("Джастин Тимберлейк", 2009));

        MusicBand band1 = new MusicBand("Duet",2015,members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Eminem",2000));
        members2.add(new MusicArtist("Dr. Dre", 1998));
        members2.add(new MusicArtist("50 cent",2003));

        MusicBand band2 = new MusicBand("Trio",2014,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
