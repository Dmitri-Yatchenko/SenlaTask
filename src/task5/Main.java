package task5;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the string in English");
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String line;
        line = scanner.nextLine();

        String[] subStr;
        String delimeter = " "; // Разделитель
        subStr = line.split(delimeter); // Разделения строки str с помощью метода split()

        //Сортировка
        SortByVowel sortByVowel = new SortByVowel();
        sortByVowel.sortByVowel(subStr);

        //Верхний регистр
        for(int i = 0; i < subStr.length; i++) {
            subStr[i] = new SortByVowel().largeVowel(subStr[i]);
        }

        //Выводим
        for(int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

    }

}
