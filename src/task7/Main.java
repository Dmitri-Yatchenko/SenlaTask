package task7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Book", 4, 10));
        items.add(new Item("Book2", 4, 15));
        items.add(new Item("Calculator", 2, 5));
        items.add(new Item("FlashDrive", 1, 20));

        Safe safe = new Safe(10);
        safe.makeAllSets(items);
        System.out.println(items);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(safe.getBestItems());

    }

}
