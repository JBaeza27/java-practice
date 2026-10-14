package org.detailing;

import java.util.ArrayList;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<>();
        System.out.println("Welcome to todolist!\n");
        while(true){
            System.out.println("---Menu---");
            System.out.println("Press 1 to add tasks");
            System.out.println("Press 2 to see tasks");
            System.out.println("Press 3 to remove a task");
            System.out.println("Type exit to exit\n");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    addTasks(todo);
                    break;
                case "2":
                    printTasks(todo);
                    break;
                case "3":
                    removeTask(todo);
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Enter valid number");
        }

        }
    }
    public static void addTasks(ArrayList<String> todo){
        System.out.println("Enter things to do: (type exit to exit)");
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            todo.add(input);
        }
    }

    public static void printTasks(ArrayList<String> todo){
        System.out.printf("/////////////////////////\n");
        System.out.println("Your tasks:");
        for(String item: todo){
            System.out.println(item);
        }
        System.out.printf("/////////////////////////\n");
    }

    public static void removeTask(ArrayList<String> todo){
        printTasks(todo);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter the name of the task you want to remove");
            System.out.println("type exit to exit");
            String input = scanner.nextLine();
            if(todo.contains(input)){
                todo.remove(input);
                printTasks(todo);
            }else if (input.equals("exit")){
                break;
            }else{
                System.out.println("\nEnter the name of the task you want to remove");
                System.out.println("type exit to exit");
                printTasks(todo);
            }
            todo.add(input);
        }
    }
}
