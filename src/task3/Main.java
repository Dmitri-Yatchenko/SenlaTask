package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kx1, ky1, kx2, ky2; // кординаты вектора

        System.out.println("Введите кординаты точки начала x1");
        double x1 = scan.nextDouble();
        System.out.println("Введите кординаты точки начала y1");
        double y1 = scan.nextDouble();

        System.out.println("Введите кординаты точки окончания x2");
        double x2 = scan.nextDouble();
        System.out.println("Введите кординаты точки окончания y2");
        double y2 = scan.nextDouble();

        kx1 = (x2-x1);
        ky1 = (y2 - y1); // кординаты вектора 1
        kx2 = (x1-x2);
        ky2 = (y1 - y2); // кординаты вектора 2


        WorkingWithVectors workingWithVectors = new WorkingWithVectors();
        double vectorLength1 = workingWithVectors.vectorLength(kx1, kx2);
        double vectorLength2 = workingWithVectors.vectorLength(ky1, ky2);
        System.out.println("Длинна вектора 1 = " + vectorLength1);
        System.out.println("Длинна вектора 2 = " + vectorLength2);



        double a;
        a = (x1*x2+y1*y2)/(vectorLength1+vectorLength2); //cos(a)
        double pov1, pov2;
        pov1 = Math.abs(vectorLength1)*Math.abs(vectorLength2)*a;
        pov2 = Math.abs(vectorLength2)*Math.abs(vectorLength1)*a;
        System.out.println("Произведение вектора1 на вектор2 ="+pov1);
        System.out.println("Произведение вектора2 на вектор1 ="+pov2);


    }
}
