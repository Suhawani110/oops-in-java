package oops;

// Class demonstrating compile-time polymorphism (method overloading)
public class compiletimepolymor {

    // Instance variables
    int a = 10, b = 20;

    // Method 1: No parameters, returns the sum of instance variables
    int add() {
        return a + b;  // Returns 30 (10 + 20)
    }

    // Method 2: Overloaded add() method with two int parameters
    void add(int x, int y) {
        int c;
        c = x + y;  // Calculates sum of passed integers
        System.out.println(c);  // Prints the result
    }

    // Method 3: Overloaded add() method with int and double parameters
    void add(int x, double y) {
        double c;
        c = x + y;  // Calculates sum (handles int + double)
        System.out.println(c);  // Prints the result
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating an object of compiletimepolymor class
        compiletimepolymor r = new compiletimepolymor();

        // Calls add(int, int) -> prints 300
        r.add(100, 200);

        // Calls add(int, double) -> prints 90.32
        r.add(50, 40.32);

        // Calls add() with no parameters -> returns 30
        int add = r.add();
        System.out.println(add);  // Prints 30
    }

}
