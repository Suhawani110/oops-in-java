package oops;  // Package name: groups related classes together

// Parent class
public class override {  // Class name 'override' (better to use 'Parent' to avoid confusion with @Override)

    // Method in parent class
    void show() {
        System.out.println("Hello World");  // Prints "Hello World"
    }
}

// Child class extending the parent class
class B3 extends override {

    // Override the 'show' method from parent
    @Override  // Annotation to indicate this method overrides a parent method
    void show() {
        System.out.println("Hello World 2");  // Prints "Hello World 2" instead of parent method
    }
}

// Main class with the entry point
class Test7 {
    public static void main(String[] args) {

        B3 b = new B3();  // Create an object of child class B3
        b.show();          // Calls the overridden method in B3
        // Output: "Hello World 2"
    }
}
/