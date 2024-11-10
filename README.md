Java 8 Features
This repository showcases various features introduced in Java 8, which significantly improved the language and API. Java 8 brought several new features such as Lambda Expressions, Streams, Default Methods, Optional, Date and Time API, and much more.

The purpose of this repository is to demonstrate how these features can be used to write more efficient, readable, and maintainable code.
Features Covered
Lambda Expressions

Lambda expressions allow you to pass behavior as arguments to methods or create anonymous functions.
Example:
List<String> names = Arrays.asList("John", "Jane", "Doe");
names.forEach(name -> System.out.println(name));


Functional Interfaces
A functional interface is an interface with just one abstract method.
Example:
@FunctionalInterface
interface MyFunctionalInterface {
    void apply(String name);
}
