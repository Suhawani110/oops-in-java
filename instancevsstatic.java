package oops;

// Class to demonstrate difference between static block, instance block, constructor, and method
public class instancevsstatic {
    int a, b;  // Instance variables

    // Static Block: Runs only once when the class is loaded into memory (before main)
    static {
        int x = 70, y = 68;  // Local variables (only exist inside static block)
        System.out.println(x + y);  // Output: 138
    }

    // Constructor: Runs every time a new object of the class is created
    instancevsstatic() {
        a = 30;
        b = 40;
        System.out.println(a + b);  // Output: 70
    }

    // Instance Block: Runs before the constructor whenever an object is created
    {
        a = 10;
        b = 20;
        System.out.println(a + b);  // Output: 30
    }

    // Instance Method: Must be called using an object
    void show() {
        System.out.println("Instance method called");
    }
}

// Main class to run the program
class Z {
    public static void main(String[] args) {
        // Creating object it triggers static block (only once), then instance block, then constructor
        instancevsstatic r = new instancevsstatic();

        // Calling instance method using object
        r.show();
    }
}
