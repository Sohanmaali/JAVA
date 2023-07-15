class Bank {
	String name;
	long accNum;
	double belance;
}
class Account extends Bank {
	
    void deposit(double amount);

    void withdraw(double amount);

    void displayBalance();
}

interface Transction extends  Account {
	
}

class SavAcc extends Account implements Transction {
    
}

class CurrAcc extends Account implements Transction {
   
}


public class Main {
    public static void main(String[] args) {
       
    }
}






Inner classes in Java serve several purposes and provide various benefits. Here are some reasons why inner classes are used:

1. Encapsulation and Organization: Inner classes allow you to logically group classes within one another, helping to encapsulate related code. By placing a class inside another class, you can express a stronger relationship between the two classes and improve code organization.

2. Improved Readability and Maintainability: Inner classes make the code more readable and maintainable by keeping related classes closer to each other. This is especially useful when the inner class is tightly related to the outer class and doesn't need to be accessed from outside.

3. Access to Private Members: Inner classes can access private members (fields and methods) of the enclosing class. This allows for tighter encapsulation, as the inner class can manipulate the private members directly without exposing them to the outside world.

4. Event Handling: Inner classes are commonly used for event handling in graphical user interface (GUI) programming. By defining event listeners as inner classes, you can easily access and manipulate the components and data of the enclosing class.

5. Implementation of Data Structures: Inner classes can be used to implement data structures like linked lists, binary trees, etc., as inner classes have direct access to the private members of the enclosing class.

6. Enhanced Encapsulation: Inner classes can be used to create more encapsulated and self-contained units of code within a class. They can be used to hide implementation details and provide a clean, well-encapsulated API to the outer world.

7. Callbacks and Callback Mechanisms: Inner classes can be used to implement callback mechanisms. By defining an interface or an abstract class within the outer class and implementing it in an inner class, you can create a callback mechanism where the inner class object can invoke methods on the outer class.

8. Limited Scope and Name Conflicts: Inner classes have access to the members of the enclosing class, and they can help prevent naming conflicts with other classes or interfaces in the wider scope.

Overall, inner classes provide flexibility, improved code organization, and encapsulation in Java, making them useful in a variety of scenarios. However, it's important to note that the decision to use inner classes should be made based on the specific requirements and design considerations of your application.