package org.detailing;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatCharacter {
    public static void main(String[] args) {
        HashSet<String> wordCounter = new HashSet<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String input = scanner.nextLine();
        String[] words = input.split("[\"“().:,\\s]+");



    }
}
