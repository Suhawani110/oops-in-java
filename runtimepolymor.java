package oops;
// Class demonstrating run-time polymorphism (method overiding)
// Parent class
public class runtimepolymor {
    // Method to be overridden in child class
    void draw() {
        System.out.println("shape type"); // Base class message
    }
}

// Child class
class runtimepolymor1 extends runtimepolymor {
    @Override
    void draw() {
        super.draw(); // Calls the draw() method of parent class
        System.out.println("Square shape"); // Child class specific message
    }
}

// Main class
class runtimepolymor2 {
    public static void main(String[] args) {
        // Creating an object of child class
        runtimepolymor1 obj = new runtimepolymor1();

        // Calls the draw() method of runtimepolymor1
        // This also demonstrates method overriding
        obj.draw();
    }
}
