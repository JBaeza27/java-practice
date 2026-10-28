package org.detailing;

import java.util.PriorityQueue;

public class TaskScheduler {
    //    PriorityQueue - offer, poll, peek, custom comparator
    //         *        Docs:  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/PriorityQueue.html
    //         *        Build: Task scheduler (highest priority first)        ** IMPORTANT
    // FIFO

    /*

        Notes:
        Priority Queue doesn't allow null elements

     */
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("get treats for dog");
        tasks.add("get eggs");
        tasks.add("get new pants");
        tasks.forEach(element -> System.out.println(element));
        System.out.println(tasks.peek());

        // the reason it says eggs is because it is by alphabetical order.
    }
}
