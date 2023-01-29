package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // level 1
        String question1 = "d\te\tt\tt\tl\ti";
        String[] answers1 = {
                "die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet",
                "edit", "idle", "lied", "tied", "tile", "tilt", "tilde", "tiled", "title",
                "tilted", "titled"
        };
        int correctCount1 = 0;
        List<String> correctAnsw1 = new ArrayList<String>();

        //level 2
        String question2 = "s\te\tc\ta\te\tn";
        String[] answers2 = {
                "ace", "can", "sea", "sec", "see", "aces", "acne", "case",
                "scan", "ease", "seen", "cane", "cease", "scene", "encase"
        };
        int correctCount2 = 0;
        List<String> correctAnsw2 = new ArrayList<String>();

        //level 3
        String question3 = "h\tk\tr\tn\te\to";
        String[] answers3 = {
                "her", "ore", "hen", "one", "roe", "honk", "hero", "horn",
                "honker", "hone", "kern", "eon", "oke"
        };
        int correctCount3 = 0;
        List<String> correctAnsw3 = new ArrayList<String>();

        boolean running = true;

        while(running){
            System.out.println("Coepoe Word Puzzle"+ "\n" + "==================");
            System.out.println("Rules :");
            System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters.");
            System.out.println("2. Each level, you have 10 chances to answer correctly.");
            System.out.println("3. To get through to next level, you have to score 70 points each level.\n");

            correctCount1 = startGame(
                    "1",
                    question1,
                    answers1,
                    correctCount1,
                    correctAnsw1
            );
            if(correctCount1 >= 7){
                correctCount2 = startGame(
                        "2",
                        question2,
                        answers2,
                        correctCount2,
                        correctAnsw2
                );
                if (correctCount2 >= 7) {
                    correctCount3 = startGame(
                            "3",
                            question3,
                            answers3,
                            correctCount3,
                            correctAnsw3
                    );
                    if (correctCount3 >= 7) {
                        System.out.println("Overall Score: " + (correctCount1+correctCount2+correctCount3)*10);
                        System.out.println("You Win!!");
                        System.out.println("Press ENTER to exit..");
                        String retry = in.nextLine();
                        running = false;
                    }
                } else {
                    System.out.println("You lose!! Try Again...");
                    System.out.println("Do you want to retry [y/t] ?");
                    String retry = in.nextLine();
                    if (retry.equalsIgnoreCase("t")) {
                        running = false;
                    }
                }
            } else {
                System.out.println("You lose!! Try Again...");
                System.out.println("Do you want to retry [y/t] ?");
                String retry = in.nextLine();
                if (retry.equalsIgnoreCase("t")) {
                    running = false;
                }
            }
        }
    }

    public static int startGame(String level, String question, String[] answers, int correctCount, List<String> correctAnsw) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Level " + level + "\n" + "-------");
        System.out.println(question);
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "> Your Answer: ");
            String answer = scanner.nextLine();
            if (answer.length() >= 3 && answer.length() <= 6){
                for (String ans : answers) {
                    if (answer.equalsIgnoreCase(ans)){
                        if (correctAnsw.contains(answer)) {
                            System.out.println("You had already type this words before...");
                        } else {
                            correctAnsw.add(answer);
                            correctCount++;
                            System.out.println("#Right. Score : " + correctCount*10);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("You had answered 10 times with " + correctCount + " right answers...");
        if(correctCount >= 7) {
            System.out.println("Correct Answers:");
            System.out.println(removeFirstandLast(Arrays.toString(answers)));
        }
        System.out.println("");
        return correctCount;
    }

    public static String removeFirstandLast(String str) {
        str = str.substring(1, str.length() - 1);

        return str;
    }
}