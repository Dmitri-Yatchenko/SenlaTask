package task1;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите строку для анализа повторяющихся триад");
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        String line =  scanner.nextLine();

        NumberTriplets numberTriplets = new NumberTriplets();
        System.out.println("Заданная сторока: " + line);
        System.out.println("Количество \"троек\" в заданной строке: " + numberTriplets.numberOfTriplets(line));

    }


}
