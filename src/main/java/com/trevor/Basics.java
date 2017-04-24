package main.java.com.trevor;

public class Basics {

    //for loop
    void forLoop(int x) {
        for (int i = 0; i < x; i++) {
            if (i == x) System.out.println("We're done!");
            else if (i % 5 == 0) System.out.println("Still counting...");
            else if (i % 7 == 0) System.out.println("Why'd you pick such a big number?\nCounting");
            else System.out.println("Counting");
        }
    }

    //while and do while loops
    void whileLoops(int x) {
        if (x < 0) x *= x;
        while (x > 10) x /= 2;
        do {
            System.out.println("x now equals " + x);
            x--;
        } while (x > 1);
    }

    //enhanced for loop
    void enhancedFor() {
        int[] x = new int[]{1, 4, 8, 15, 29};
        for (int i : x) System.out.println(x);
    }

    //if else ladder
    void ifsAndElses() {
        if (System.currentTimeMillis() % 3 == 0 &&
                System.currentTimeMillis() % 5 == 0) System.out.println("FizzBuzz");
        else if (System.currentTimeMillis() % 3 == 0) System.out.println("Fizz");
        else if (System.currentTimeMillis() % 5 == 0) System.out.println("Buzz");
        else System.out.println(System.currentTimeMillis());
    }

    //switch statement
    void switchin(String yesNoMaybe) {
        switch (yesNoMaybe) {
            case "yes":
                System.out.println("Didn't get it");
                break;
            case "no":
                System.out.println("Almost got it");
                break;
            case "maybe":
                System.out.println("You got it!");
                break;
            default:
                System.out.println("yes, no, maybe");
        }
    }

    //casting
    void numsToChars(int x) {
        if (x < 0) x *= x;
        while (x > 255) x /= 2;
        System.out.println((char) x);
    }
}