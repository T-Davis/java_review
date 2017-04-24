package main.java.com.trevor;

public class Basics {

    //for loop, if else ladder
    void forLoop(int x) {
        for (int i = 0; i < x; i++) {
            if (i == x) System.out.println("We're done!");
            else if (i % 5 == 0) System.out.println("Still counting...");
            else if (i % 7 == 0) System.out.println("Why'd you pick such a big number?\nCounting");
            else System.out.println("Counting");
        }
    }

    //for, enhanced for loops, casting
    public void forLoops() {
        char[] chars = new char[10];
        int h = 72;
        for(int i = h; i < chars.length + h; i++) chars[i - h] = (char) i;
        for(char x: chars) System.out.println(x);
    }

    //while, do while loops
    void whileLoops(int x) {
        if (x < 0) x *= x;
        while (x > 10) x /= 2;
        do {
            System.out.println("x now equals " + x);
            x--;
        } while (x > 1);
    }

    //while loop
    public void whileLoop() {
        int thisVar = 0;
        int thatVar = 5;
        while(thisVar < thatVar) {
            System.out.println("this is less than that");
            thisVar++;
        }
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

    //switch statement, casting
    public void switchIt() {
        int a = (int) (Math.random() * 10);
        switch (a) {
            case 0: System.out.println("a = " + 0); break;
            case 1: System.out.println("a = " + 1); break;
            case 2: System.out.println("a = " + 2); break;
            case 3: System.out.println("a = " + 3); break;
            case 4: System.out.println("a = " + 4); break;
            default: System.out.printf("a >= 5"); break;
        }
    }

    //casting, while loop
    void numsToChars(int x) {
        if (x < 0) x *= x;
        while (x > 255) x /= 2;
        System.out.println((char) x);
    }
}