package task2;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SumOfNumbers sumOfNumbers = new SumOfNumbers();

        System.out.println("Введите строку для подсчета суммы чисел");
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String line =  scanner.nextLine();

        System.out.println("Заданная сторока: " + line);
        System.out.println("Сумма цифр присутствующих в данной строке: "+sumOfNumbers.sumOfNumbers(line));

    }


}
