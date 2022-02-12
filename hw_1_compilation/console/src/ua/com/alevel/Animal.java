package ua.com.alevel;

import org.apache.commons.lang3.*;
import org.apache.commons.io.*;

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        String s1 = cat.greeting();
        String s2 = dog.greeting();
        String s1_Upper = StringUtils.upperCase(s1);
        System.out.println("Gretting: " + s1 + "\n" + s2);
        System.out.println("Tranform to upper case:" + s1_Upper);
        System.out.println("Equality Check cat greeting (case sensitive): " + IOCase.SENSITIVE.checkEquals(s1, s1_Upper));

    }
}