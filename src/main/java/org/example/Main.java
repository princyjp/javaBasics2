package org.example;

public class Main {

    private static void printGreeting(String name){
        System.out.println("Hello " + name);
    }
    private static int sumOfTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    private static boolean isStringLonger(String word, int wordLength){
        return (word.length() == wordLength);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "Hello Princy";
        int birthYear = 1995;
        double pi = 3.14;
        String firstName = "Reece";
        boolean isLearningJava= true;
        int num1=3;
        int num2 =4;


        System.out.println(name);
        System.out.println("I was born in" + birthYear);
        System.out.println(isLearningJava);
        String favouriteFilm = "Thor";
        System.out.println("My favourite film is "+ favouriteFilm);
        favouriteFilm = "Hannah Montana";
        System.out.println("My favourite film is "+ favouriteFilm);
        printGreeting(firstName);
        int sum = sumOfTwoNumbers(num1,num2);
        System.out.println("sum= "+ sum);
        System.out.println(isStringLonger("Hello",5));

    }
}