package com.training.backend;

import java.util.Scanner;

public class testj {
    public static void main(String[] args) {
        int in;
        try {
            for (int i = 1; i <= 3; i++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Try it");
                in = input.nextInt();

                if (in < 99) {
                    switch (in) {
                        case 25 -> System.out.println("YES");
                        case 2 -> System.out.println("YES");
                    }
                } else break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
