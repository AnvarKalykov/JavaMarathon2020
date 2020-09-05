package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    private static Object Integer;

    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Eminem",2000);
        MusicBand musicBand2 = new MusicBand("Linkin Park", 1999);
        MusicBand musicBand3 = new MusicBand("Gorilazz",2001);
        MusicBand musicBand4 = new MusicBand("Limp Bizkit", 1998);
        MusicBand musicBand5 = new MusicBand("Сплин", 2003);
        MusicBand musicBand6 = new MusicBand("RHCP", 1997);
        MusicBand musicBand7 = new MusicBand("The White Stripes", 2005);
        MusicBand musicBand8 = new MusicBand("Руки Вверх", 1997);
        MusicBand musicBand9 = new MusicBand("Ёлка", 2010);
        MusicBand musicBand10 = new MusicBand("RadioHead", 1985);

        List<MusicBand> musicBandsNames = new ArrayList<>();
        musicBandsNames.add(musicBand1);
        musicBandsNames.add(musicBand2);
        musicBandsNames.add(musicBand3);
        musicBandsNames.add(musicBand4);
        musicBandsNames.add(musicBand5);
        musicBandsNames.add(musicBand6);
        musicBandsNames.add(musicBand7);
        musicBandsNames.add(musicBand8);
        musicBandsNames.add(musicBand9);
        musicBandsNames.add(musicBand10);

        System.out.println(musicBandsNames);

        Collections.shuffle(musicBandsNames);

        System.out.println(musicBandsNames);

        List<MusicBand> musicBands2000 = new ArrayList<>();

        for (MusicBand m : musicBandsNames) {
            if (m.getYear() > 2000) {
                musicBands2000.add(m);
            }
        }
        System.out.println(musicBands2000);


    }
}
