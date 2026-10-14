package org.detailing;

import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Word counter
        // want to get the number of times a word is in a sentence
        // print out all words AND the amount of times it showed up
        // use hashmap to have key be the word and value be the number (count)

        HashMap<String, Integer> wordCount = new HashMap<>();
        // doing sentence input first as a test

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String input = scanner.nextLine();

        String[] words = input.split("[\"“().:,\\s]+");

        for(String s: words){
            if(!(wordCount.containsKey(s))){
                wordCount.put(s, 0);
            }
            int count = wordCount.get(s);
            count++;
            wordCount.put(s, count);
        }
        for(String s: wordCount.keySet()){
            System.out.println(s + "  :  " + wordCount.get(s));
        }
    }
}
