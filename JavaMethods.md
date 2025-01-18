# Instance Methods:
Instance methods are the methods which act on instance variables of the class.To call the instance methods ,we should use the form : `objectname.methodname()`.
It is not compulsory in java to catch the value returned by a method.
## Examples:
### Without Instance Method :
```
public class Main {
    // Static method to add numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Directly call the static method
        int result = add(10, 20);
        System.out.println("Without instance methods: " + result);
    }
}
```
### With Instance Method:
```
class Calculator {
    private int num1;
    private int num2;

    // Constructor to initialize numbers
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Instance method to add numbers
    public int add() {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Calculator
        Calculator calc = new Calculator(10, 20);
        System.out.println("Using instance methods: " + calc.add());
    }
}
```
# Static Methods:
static methods are the methods which dont act upon the instance variables of a class. Static methods are declared as `static`.
To call static methods,we dont need to create a object.
Static methods are called using `Classname.methodname()`.
The reason why static method dont act on instance variables is the JVM first executes the static methods and then only it created objects.Since the objects are not available at the time of calling static methods
,the instance variables are also not available.
Static methods can access static variables.
## Examples:
###  Static Method Accessing Static Variable:
```
class StaticDemo1 {
    // Static variable
    private static int staticVar = 100;

    // Static method
    public static void staticMethod() {
        // Static methods can directly access static variables
        System.out.println("Accessing static variable: " + staticVar);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Call the static method directly
        StaticDemo1.staticMethod();
    }
}
```
Output:
```
Accessing static variable: 100

```

### Static Method Directly Accessing Instance Variable (Error)
```
class StaticDemo2 {
    // Instance variable
    private int instanceVar = 50;

    // Static method
    public static void staticMethod() {
        // This will cause a compilation error because instance variables
        // cannot be accessed directly in a static context.
        System.out.println("Accessing instance variable: " + instanceVar);
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Call the static method
        StaticDemo2.staticMethod();
    }
}

```
Output:
```
Error: non-static variable instanceVar cannot be referenced from a static context

```

Other name for static variable is `class variable` and for static method is `class method`.

## Difference between class variables and instance variables:
1.An instance variable is a variable whose separate copy is available to each object. A class variable is a variable whose single copy is available  in memory shared by all the objects.

2. Instance variables are created in the objects on heap memory.Class variables are stored on method area.

3a.Since the instance variable will have a separate copy in each object,when the value of an instance variable is modified in the object ,it does not affect the instance variables in 

other objects .

3b.Since a class variable have only one copy in memory and that is shared by all the objects ,any modification to it will also affect other objects.

4.the execution sequence of JVM is the process where JVM executes first all the static blocks of the java program. Then it executes static methods and then creates any objects needed by 

the program . finally  it executes the instance methods.





