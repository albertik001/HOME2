//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.PrintStream;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(ageTemperature(35, 5));
        System.out.println(ageTemperature(50, -4));
        System.out.println(ageTemperature(24, -25));
        System.out.println(ageTemperature(12, 35));
        System.out.println(ageTemperature(33, 12));
        PrintStream var10000 = System.out;
        int var10001 = generateRandomAge();
        var10000.println(var10001 + " " + ageTemperature(generateRandomAge(), 25));
    }

    public static String ageTemperature(int age, int temperature) {
        String res = "Можно идти гулять!";
        String res2 = "Остовайтесь дома!";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return res;
        } else if (age <= 20 && temperature > 0 && temperature <= 28) {
            return res;
        } else {
            return age >= 45 && temperature >= -10 && temperature <= 25 ? res : res2;
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int a = random.nextInt(45);
        return a;
    }
}
