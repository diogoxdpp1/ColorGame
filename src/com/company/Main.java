package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String[] ColorArr = new String[10];
    private static User user;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input your name");
        String uName = input.next();
        user = new User(uName, 0, 0);
        ColorPicker();
        Game();

    }

    public static void ColorPicker() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int Randnum = random.nextInt(7) + 1;
            if (Randnum == 1) {
                ColorArr[i] = "Red";
            }
            if (Randnum == 2) {
                ColorArr[i] = "Blue";
            }
            if (Randnum == 3) {
                ColorArr[i] = "Green";
            }
            if (Randnum == 4) {
                ColorArr[i] = "Purple";
            }
            if (Randnum == 5) {
                ColorArr[i] = "Black";
            }
            if (Randnum == 6) {
                ColorArr[i] = "White";
            }
        }
    }

        public static void Game() {
            for (int i = 0; i < ColorArr.length; i++) {
                System.out.println(Arrays.toString(ColorArr));
                if (user.getTries() != 3) {
                    System.out.println("You have " + (3-user.getTries()) + " tries" + "\n" +
                            "And you have currently " + user.getTotalPoints() + " total points" + "\n" +
                            "Have a guess what the next Color will be: (In caps, e.g Red)");
                    String guess = input.next();
                    if (guess.equals(ColorArr[i])) {
                        user.setTotalPoints(user.getTotalPoints() + 1);
                        System.out.println("You got it correct! + 1 point");
                        user.setTries(0);
                    } else {
                        user.setTries(user.getTries() + 1);
                        System.out.println("You got it wrong u have: " + (3 - user.getTries()) + " tries left");
                    }
                } else {
                    System.out.println("You have no tries left! game over");
                    break;
                }
                if (user.getTotalPoints() == 10){
                    System.out.println("You have won the game! SIUUUUU");
                    break;
                }
            }
        }
    }

