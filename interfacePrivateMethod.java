package oops;  // package declaration (class belongs to 'oops' package)

// Define an interface with a private static method
interface interfacePrivateMethod {

    // Public static method that can be called outside the interface
    public static void call() {
        // Inside this method, we call the private static method 'add'
        add(10, 20);
    }

    // Private static method (Java 9+ feature)
    // - Can only be used inside the interface
    // - Acts like a helper method
    private static void add(int x, int y) {
        System.out.println(x + y); // Prints the sum of x and y
    }
}

// Class Z1 implements the interface
// But note: it does not inherit static or private methods from the interface
class Z1 implements interfacePrivateMethod {

    // A normal instance method that subtracts two numbers
    public void sub(int x, int y) {
        System.out.println(x - y);
    }
}

// Main class with the 'main' method (entry point)
class test3 {
    public static void main(String[] args) {

        // Create an object of Z1
        Z1 b = new Z1();

        // Call the static method of the interface
        // This will internally call the private add() method
        interfacePrivateMethod.call();  // Output: 30

        // Call the instance method of class Z1
        b.sub(100, 200);  // Output: -100
    }
}
