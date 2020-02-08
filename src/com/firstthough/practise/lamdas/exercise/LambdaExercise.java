package com.firstthough.practise.lamdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 20),
                new Person("Alice", "Art", 25),
                new Person("Bobby", "Bob", 40),
                new Person("Crabby", "Crab", 40),
                new Person("Doggy", "Dog", 50)
        );

        //Step1 : Sort list by last Name
        //Java 7 approach : Anonymous inner class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Java 8 Approach : Lambda
        Collections.sort(people, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2 : Create method that prints all the element in the list
        //Java 7 Approach : Call the method that enumerates the list
        printAll(people);

        //Step 3 : Create a method that prints all people that have last names beginning with C.
        //Java 7 Approach : Call the method that checks and enumerates the list
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        //Java 8 : Lambda

        printConditionally(people, person -> person.getLastName().startsWith("C"));
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for (Person person : people) {
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }

}

interface Condition{
    boolean test(Person person);
}