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
        /*
        merge(key, value, function) adds the key with the given value if it isn't in the map yet; if it is,
        it **combines** the existing value with the new one using the function you provide.
         */
//        for (String word : words) {
//            wordCount.merge(word, 1, Integer::sum);
//        }
        for(String s: words){
            // easier solution. getOrDefault allows us to get the key.. if the key doesn't exist yet in the hashmap
            // it gives us the default value (here it is 0 because it hasn't been added)
//            int count = wordCount.getOrDefault(s,0);
//            wordCount.put(s, count + 1);
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
        // entryset shows hsahmap **set view** of the mapping
//        System.out.println(wordCount.entrySet());
    }
}
