package oops;

// Class to demonstrate Constructor Overloading
public class Overloading {
    // Instance variables
    int x, y, z;

    // No-argument constructor (default values)
    Overloading() {
        x = 5;      // default value
        y = 10;     // default value
        z = 0;      // default value
    }

    // Parameterized constructor (2 arguments)
    Overloading(int a, int b) {
        this.x = a; // initialize x with value of 'a'
        this.y = b; // initialize y with value of 'b'
        this.z = 0; // z remains default 0
    }

    // Parameterized constructor (3 arguments)
    Overloading(int f, int g, int h) {
        this.x = f; // initialize x with value of 'f'
        this.y = g; // initialize y with value of 'g'
        this.z = h; // initialize z with value of 'h'
    }

    // Method to display object values
    void show() {
        System.out.println(x + " " + y + " " + z);
    }

    // Main method (entry point)
    public static void main(String[] args) {
        // Calls no-argument constructor
        Overloading s1 = new Overloading();

        // Calls constructor with 2 arguments
        Overloading s2 = new Overloading(100, 200);

        // Calls constructor with 3 arguments
        Overloading s3 = new Overloading(1, 2, 3);

        // Display values of all objects
        s1.show();  // Output: 5 10 0
        s2.show();  // Output: 100 200 0
        s3.show();  // Output: 1 2 3
    }
}

