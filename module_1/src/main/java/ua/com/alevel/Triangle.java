package ua.com.alevel;

import java.util.Scanner;

public class Triangle {

    public void triangleArea() {

        double abLength;
        double bcLength;
        double acLength;

        double perimeter;
        double triangleArea;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Аx");
        double Ax = scan.nextDouble();

        System.out.println("Enter Аy");
        double Ay = scan.nextDouble();

        System.out.println("Enter Bx");
        double Bx = scan.nextDouble();

        System.out.println("Enter By");
        double By = scan.nextDouble();

        System.out.println("Enter Cx");
        double Cx = scan.nextDouble();

        System.out.println("Enter Cy");
        double Cy = scan.nextDouble();

        if (isOnLine(Ax, Ay, Bx, By, Cx, Cy)) {
            System.out.println("Points on the same line, a triangle is impossible!");
        } else {

            abLength = vectorLength(Ax, Ay, Bx, By);
            bcLength = vectorLength(Bx, By, Cx, Cy);
            acLength = vectorLength(Ax, Ay, Cx, Cy);

            perimeter = (abLength + bcLength + acLength) / 2;
            triangleArea = Math.sqrt(perimeter * (perimeter - abLength) *
                    (perimeter - bcLength) *
                    (perimeter - acLength));
            System.out.println("The area of your triangle");
            System.out.printf("%.4f", triangleArea);
            System.out.println();
        }
    }

    private double vectorLength(double pointFirstX, double pointFirstY,
                                double pointSecX, double pointSecY) {
        double xCoord = Math.abs(pointFirstX - pointSecX);
        double yCoord = Math.abs(pointFirstY - pointSecY);

        double length = Math.sqrt((xCoord * xCoord) + (yCoord * yCoord));
        return length;
    }

    private boolean isOnLine(double Ax, double Ay,
                             double Bx, double By,
                             double Cx, double Cy) {
        boolean onLine = (Cx * (By - Ay) - Cy * (Bx - Ax) == Ax * By - Bx * Ay);
        return onLine;
    }

    static class TriangleRun {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        public void triangleAreaRun() {
            try {
                int selector = 1;
                while (selector != 0) {
                    triangle.triangleArea();

                    System.out.println("Try again?\n" +
                            "1 - Yes\n" +
                            "0 - Back in menu");
                    selector = scanner.nextInt();
                }
            } catch (Exception e) {
                int selector = 1;
                System.out.println("Invalid number\n" +
                        "press 1 to back at menu and try again");
                selector = scanner.nextInt();
            }
        }
    }
}

