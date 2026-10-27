package org.detailing;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketBreaker {

    /* Array Dequeue
    *   Note: Array Dequeue allows push and pop from either side of the array.
    *   But, doesn't allow null entry
    *
    *
    *
    * */

    public static void main(String[] args) {
        Deque<String> bracketdequeue = new ArrayDeque<>();
        bracketdequeue.add("Dog");
        bracketdequeue.add("Cat");
        bracketdequeue.add("Polar Bear");

        for(String s: bracketdequeue){
            System.out.println(s);
        }
        bracketdequeue.addFirst("First!");
        bracketdequeue.addLast("last!");
        System.out.println("....");
        for(String s: bracketdequeue){
            System.out.println(s);
        }
    }
}
