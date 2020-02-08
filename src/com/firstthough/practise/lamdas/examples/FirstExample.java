package com.firstthough.practise.lamdas.examples;

/**
 * This example is a basic example for Lambda Expression.
 *
 * In the PSVM we are implementing the getLength method of LambdaInterface (s->s.length()).
 * s -> s.length : This means 1) Take a String as the input param and return the length of that String.
 * Notice that this matches the signature of getLength method. It takes in a string and returns an int.
 *
 * We use @FunctionalInterface annotation to mark the functional interfaces. This would avoid adding another abstract method in the interface.
 */

@FunctionalInterface
interface LambdaInterface{
    int getLength(String s);

}

public class FirstExample {

    public void printLength(LambdaInterface lambda, String s){
        System.out.println(lambda.getLength(s));
    }
    public static void main(String[] args) {
        FirstExample example = new FirstExample();
        example.printLength(s ->s.length(), "Hello World");
    }

}
