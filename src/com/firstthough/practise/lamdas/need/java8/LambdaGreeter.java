package com.firstthough.practise.lamdas.need.java8;

import com.firstthough.practise.lamdas.need.java7.Greeting;

/**
 * This example drive home the point that the return type of a Lambda function is an interface.
 * This interface should have exactly one abstract method that matches the lambda signature. These interfaces are called Functional interfaces.
 * Turns out we already have such an interface, the Greeting interface
 *
 */

public class LambdaGreeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeting helloGreeting = ()-> System.out.println("Hello Greeting !!!");

        LambdaGreeter greeter = new LambdaGreeter();

        greeter.greet(helloGreeting);
        greeter.greet(()-> System.out.println("Hello Greeting !! "));
        greeter.greet(()-> System.out.println("Hola Greeting !!!"));

    }
}

