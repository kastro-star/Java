class findmin{
    public static void min(int a , int b) {
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
    public static void min(int a, int b,int c ){
            min(a,b);
            min(b,c);
            min(a,c);
            System.out.println("method overloading");
        }

    public static void min(int a){
            System.out.println(a);
        }
    }


public class OOPS_9_Polymorphism_methodoverloadding {
    public static void main(String[] args) {
        findmin find = new findmin();
        find.min(5,9);
    }

}

/*
Types of Polymorphism in Java
1. Compile-Time Polymorphism (Static Binding)
Also known as method overloading, this occurs when multiple methods have the same name but different parameters (type, number, or order).

Example:

java
Copy
Edit
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
The add method is overloaded with different parameter lists.

The method to be called is determined at compile time.

2. Run-Time Polymorphism (Dynamic Binding)
Also known as method overriding, this occurs when a subclass provides a specific implementation of a method already defined in its superclass.

Example:

java
Copy
Edit
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // upcasting
        Animal a2 = new Cat();

        a1.sound(); // Output: Dog barks
        a2.sound(); // Output: Cat meows
    }
}
The method to be executed is determined at runtime based on the object type, not the reference type.

Benefits of Polymorphism
Code reusability and cleaner code structure.

Supports extensibility and interface-driven design.

Enables loose coupling in application design.


 */