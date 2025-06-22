abstract  class computer{// objects cannot created in abstraction
    abstract void turnoff();   //contains an abstract have to definnitly overwrite them otherwise shows error

    void turnon(){
        System.out.println("turn on");
    }
}

class hp extends computer{
    void turnon(){
        System.out.println("turn on hp");


    }
    void turnoff(){
        System.out.println("turn off hp");
    }
}

class  dell extends computer{
    void turnon(){
        System.out.println("turn on dell");
    }
    void turnoff(){
        System.out.println("turn off dell");
    }
}


public class OOPS_12_Abstract_and_classes {
    public static void main(String[] args) {
        hp uo = new hp();
        uo.turnon();
        uo.turnoff();


        dell ho = new dell();
        ho.turnoff();
        ho.turnon();

    }
}

/*
Abstraction in Java is a fundamental concept of object-oriented programming (OOP) that focuses on hiding complex implementation details and exposing only necessary information to the user. It simplifies the interaction with objects by providing a high-level view, abstracting away the underlying complexities.
Key aspects of abstraction in Java:
Hiding Implementation:
Abstraction conceals the internal workings of a class or system, preventing the user from directly accessing or modifying the underlying data and processes.
Exposing Essential Information:
It presents only the necessary information and functionalities that are relevant to the user's interaction with the object.
Simplifying Complexity:
By abstracting away unnecessary details, abstraction reduces the complexity of a system, making it easier to understand, use, and maintain.
How is abstraction achieved?
Abstract Classes:
An abstract class is a class that cannot be instantiated directly. It can contain both abstract methods (methods without implementation) and concrete methods (methods with implementation). Subclasses of an abstract class must provide implementations for all abstract methods.
        Interfaces:
An interface is a blueprint for a class. It declares a set of abstract methods that must be implemented by any class that implements the interface. Interfaces provide 100% abstraction.
Benefits of abstraction:
Reduced Complexity: Simplifies complex systems by hiding unnecessary details.
Code Reusability: Abstract classes and interfaces promote code reusability by providing a common base for subclasses.
        Flexibility: Allows for changes in the underlying implementation without affecting the user's interface.
Maintainability: Makes code easier to maintain by isolating changes to specific classes or interfaces.
        Security: Hides sensitive implementation details, improving system security.
Example:
Consider a Shape class with subclasses like Circle and Rectangle. The Shape class can be abstract, defining a generic draw() method, while each subclass provides its specific implementation for drawing a circle or a rectangle, respectively. The user interacts with the shape objects through the common draw() method, without needing to know the specific drawing logic for each shape.
*/
