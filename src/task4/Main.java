package task4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();

        СheckSimple сheckSimple = new СheckSimple();

        сheckSimple.checkSimple(input);

    }

}
