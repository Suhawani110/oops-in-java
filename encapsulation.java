package oops;

// Class demonstrating encapsulation
public class encapsulation {

    // Private variable: cannot be accessed directly from outside the class
    private int value;

    // Public setter method: allows controlled modification of 'value'
    public void Setvalue(int x) {
        value = x;  // Assign the passed value to the private variable
    }

    // Public getter method: allows controlled access to 'value'
    public int Getvalue() {
        return value;  // Returns the current value of the private variable
    }
}

// Main class to test encapsulation
class encap {
    public static void main(String[] args) {
        // Create an object of the encapsulation class
        encapsulation obj = new encapsulation();

        // Set the value using the setter method
        obj.Setvalue(10);

        // Get the value using the getter method and print it
        System.out.println(obj.Getvalue());
    }
}
