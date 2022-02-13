package ua.com.alevel;

import java.util.Scanner;

public class Lessons {

    public void bell() {
        int timeLessons = 45;
        int breakLong = 15;
        int breakShort = 5;
        int hour = 60;
        int lessonsStart = 9;

        System.out.print("Choose lesson from 1-10: ");
        Scanner sc = new Scanner(System.in);
        int lessons = sc.nextInt();

        lessons = lessons * timeLessons + (lessons / 2) * breakShort + ((lessons + 1) / 2 - 1) * breakLong;
        int hours = lessons / hour + lessonsStart;
        int minutes = lessons % hour;
        System.out.println(hours + ":" + minutes);
    }
}
