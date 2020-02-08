package com.firstthough.practise.lamdas.need.java7;

/**
 * This class demonstrates the way of passing behaviour to a method pre Java8.
 */
public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloGreeting = new HelloGreeting();
        Greeting holaGreeting = new HolaGreeting();

        greeter.greet(helloGreeting);
        greeter.greet(holaGreeting);

    }
}
