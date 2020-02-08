package com.firstthough.practise.lamdas.examples;

/**
 * This class show how we can create runnable for the Threads using Lambda Expressions
 * Since Runnable interface has just one abstract method run(),
 * we can use lambdas instead of creating a class that implements Runnable or anonymous inner classes.
 *
 *
 */
public class RunnableExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> { //This is basically overridinf run (){} without the name
            System.out.println(Thread.currentThread().getName()+" printing ...");
        });

        thread1.start();
    }
}
