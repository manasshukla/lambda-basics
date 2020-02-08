The classes in need directory state why Lambda expressions are needed.
Prior to Java 8, if we had to pass behaviour to functions 
we had little choice but to pass an interface to the function.
This is illustrated via the code in [java7](java7) package. 
Class [Greeter](java7/Greeter.java) contains a greet method in which we have to pass a behaviour(different greetings).
One way of doing that would be to have a switch case condition in the greet function and print greetings based on the param passed. As you could guess, this is not the best way of doing things.
Better way would be to define and interface and pass the implementation of the interface to the greet method.
In our example, this is done by defining a [Greeting](java7/Greeting.java) interface and classes [HelloGreeting](java7/HelloGreeting.java) and [HolaGreeting](java7/HolaGreeting.java) implement that interface and provide different implementations of greeting method.

This is putting pure polymorphism in the act. However, it is cumbersome and too verbose.
This is where lambda would come to our rescue. Using lambdas we can assign a method(an action) to a variable and pass it to the method.

Let us suppose we were allowed to assign a function to a variable in Java, how would we do it ? 
Probably something like this : 

`aBlockOfCode = public void printingFunction(){
                    System.out.println("Hello !!!");
               }
`

Now if we look closely, the access modified is not required. So we can get rid of `public`. 
The name of the function is not required since the method would be inferred by the name of the variable it is being assigned to.
So we can get rid of `printFunction`. Java compiler can figure out the return type based on the method body (in this case void).Hence the return type is not required and we can get rid of `void.`.
Now the resultant code would look like

`aBlockOfCode = `~~public void printingFunction~~()`{
                    System.out.println("Hello !!!");
               }
` 
But in order to make Java understand that this is a function that is being assigned to a variable, we need to use the `->` operator. 
So the final resultant code looks like : 

`aBlockOfCode = () -> {
                    System.out.println("Hello !!!");
               }
` 

Congratulations, you have written your first lamda expression. More importantly, you have realised that as long as you know how to write a function in Java, you know how to write a lamda as well. 
That is pretty cool !!

In the [java8](java8) package, we would write the whole logic of [java7](java7) package in just a couple of lines. 
 This example drive home the point that the return type of a Lambda function is an interface.
 This interface should have exactly one abstract method that matches the lambda signature. These interfaces are called Functional interfaces.
 Turns out we already have such an interface, the Greeting interface