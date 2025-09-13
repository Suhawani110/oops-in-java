package oops; // Package name, used to organize classes

// ------------------- ABSTRACT CLASS -------------------
/*
 * Abstract classes in Java are used when you want to provide
 * common functionality to subclasses but also enforce that
 * certain methods must be implemented by them.
 */
abstract class AbstractClass {

    // Constructor of abstract class
    AbstractClass() {
        // This constructor runs whenever a subclass object is created
        System.out.println("All animals..!");
    }

    // Abstract method (no body)
    // Every subclass of AbstractClass must override this method
    public abstract void sound();
}

// ------------------- SUBCLASS DOG -------------------
/*
 * Dog extends AbstractClass, so it must implement the sound() method.
 */
class Dog extends AbstractClass {

    // Constructor of Dog
    Dog() {
        // Calls the constructor of AbstractClass (superclass)
        super();
    }

    // Implementation of abstract method
    public void sound() {
        System.out.println("Dog is barking");
    }
}

// ------------------- SUBCLASS LION -------------------
/*
 * Lion also extends AbstractClass and provides its own version
 * of the sound() method.
 */
class Lion extends AbstractClass {

    // Constructor of Lion
    Lion() {
        // Calls AbstractClass constructor
        super();
    }

    // Implementation of abstract method
    public void sound() {
        System.out.println("Lion is roaring");
    }
}

// ------------------- MAIN CLASS -------------------
class Test2 {
    public static void main(String[] args) {

        // Creating Dog object
        Dog d = new Dog();
        d.sound(); // Calls Dog's sound() method

        // Creating Lion object
        Lion l = new Lion();
        l.sound(); // Calls Lion's sound() method
    }
}
//
