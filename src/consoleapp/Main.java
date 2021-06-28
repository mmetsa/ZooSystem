package consoleapp;

import model.*;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Location tamsalu = new Location("Eesti", "Tamsalu", 54.8124, 51.8512985);
        Zoo tamsaluLoomad = new Zoo("Tamsalu loomad", tamsalu, 50, "08:00 - 17:00");
        Cage cage = new Cage("Linnud", 1, 10);
        tamsaluLoomad.addCage(cage);
        System.out.println(Arrays.toString(tamsaluLoomad.getCageList()));
        tamsaluLoomad.getCageList()[0].setNextFeed(new Date(System.currentTimeMillis() + 86400 * 1000));
        System.out.println(tamsaluLoomad.getCageList()[0].getNextFeed() + " is the next feed time");
        Animal animal2 = new Animal("Joosep", "KIRJU_KOER", 51, new Date(System.currentTimeMillis()));
        Animal[] animals = new Animal[cage.getCapacity()];
        animals[0] = animal2;
        cage.setAnimals(animals);
        System.out.println(Arrays.toString(cage.getAnimals()));

    }

}
