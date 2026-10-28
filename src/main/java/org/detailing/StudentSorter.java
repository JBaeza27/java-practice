package org.detailing;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {
    //    Comparator    - lambdas, Comparator.comparing(), thenComparing()
    //         *        Docs:  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Comparator.html
    //         *        Also:  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collections.html
    //         *        Build: Sort Students by grade, then name

    /*

        Notes:
        "Records are final data carriers, not behavioral blueprints (example is basic class structure with constructor, getter and settters."
        Use a record when you need a quick, immutable container to move data
        from point A to point B without writing boilerplate code.

        Never use a record if you need:
        • Class inheritance (extending another class or letting a class extend it).
        • Structural expansion (adding hidden instance fields later).
        • Mutable state (changing values via setters).


     */

    // a record auto-generates the constructor, getters (name(), grade()), equals, hashCode, toString
    record Student(String name, int grade) {}

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Maya", 88));
        students.add(new Student("Liam", 95));
        students.add(new Student("Zoe", 88));
        students.add(new Student("Ethan", 72));
        students.add(new Student("Ava", 95));
        students.add(new Student("Noah", 88));

        System.out.println("Before sorting:");
        students.forEach(student -> System.out.println(student));

        // TODO: sort students by grade, then by name when grades tie

        // comparator object first and then we sort in list
        Comparator<Student> byGrade = Comparator.comparing(Student::grade);

        System.out.println("\nAfter sorting (by grade):");
        // sort list by the comparator. The sort is in place
        students.sort(byGrade.reversed());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students);

        // Single time organizer (1)
        // sorting by name using lambda
        System.out.println("Sorting by name:\n");
        Comparator<Student> byName = (a, b) -> a.name().compareTo(b.name());
        students.sort(byName);
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
//        students.sort(byGrade);
        System.out.println("Sorting by grade then name:\n");
        Comparator gradeFirst = byGrade.reversed().thenComparing(byName);
        // or students.sort(byGrade.reversed.thenComparing(byName);
        students.sort(gradeFirst);
        for (Student student : students) {
            System.out.println(student);
        }


    }

    // SAMPLE: sorts by name only (one field) - not the full TODO solution
    static void sampleSortByName() {
        List<Student> sample = new ArrayList<>(List.of(
                new Student("Zoe", 88),
                new Student("Ava", 95),
                new Student("Maya", 72)
        ));

        // Way 1: a lambda - you write the compare rule yourself
        // compareTo returns negative if a comes first, positive if b comes first, 0 if equal
        Comparator<Student> byNameLambda = (a,  b) -> a.name().compareTo(b.name());
        sample.sort(byNameLambda);
        System.out.println("Lambda: " + sample);

        // Way 2: Comparator.comparing - you just say WHICH field, it builds the rule for you
        Comparator<Student> byNameComparing = Comparator.comparing(Student::name);
        sample.sort(byNameComparing);
        System.out.println("comparing(): " + sample);
    }
}
