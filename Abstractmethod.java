package oops; // Package declaration

// -------------------- ABSTRACT BASE CLASS --------------------
/*
 * Abstractmethod acts as a blueprint.
 * It forces all subclasses to implement the methods:
 *  - Developer()
 *  - Rank()
 */
abstract class Abstractmethod {
    public abstract void Developer(); // Abstract method (no body)
    public abstract void Rank();      // Abstract method (no body)
}

// -------------------- PARTIAL IMPLEMENTATION: HTML --------------------
/*
 * HTML extends Abstractmethod but only implements Developer().
 * Since Rank() is not implemented here, HTML must remain abstract.
 */
abstract class HTML extends Abstractmethod {
    @Override
    public void Developer() {
        System.out.println("Tim Berners-Lee"); // Creator of HTML
    }
}

// -------------------- PARTIAL IMPLEMENTATION: JAVA --------------------
/*
 * Java extends Abstractmethod but only implements Developer().
 * Rank() is still missing, so Java is also abstract.
 */
abstract class Java extends Abstractmethod {
    @Override
    public void Developer() {
        System.out.println("James Gosling"); // Creator of Java
    }
}

// -------------------- CONCRETE CLASS: HTMLDetails --------------------
/*
 * HTMLDetails extends HTML (which already implemented Developer()).
 * Here, we implement Rank() as well, making HTMLDetails a concrete class.
 */
class HTMLDetails extends HTML {
    @Override
    public void Rank() {
        System.out.println("HTML is ranked as a core web technology.");
    }
}

// -------------------- CONCRETE CLASS: JavaDetails --------------------
/*
 * JavaDetails extends Java (which already implemented Developer()).
 * Here, we implement Rank(), making JavaDetails a concrete class.
 */
class JavaDetails extends Java {
    @Override
    public void Rank() {
        System.out.println("Java is ranked as a top OOP language.");
    }
}

// -------------------- MAIN CLASS --------------------
/*
 * Main demonstrates polymorphism:
 * - Parent class reference (Abstractmethod)
 * - Child class object (HTMLDetails / JavaDetails)
 * This allows calling overridden methods at runtime.
 */
class Main {
    public static void main(String[] args) {

        // Using Abstractmethod reference for HTMLDetails object
        Abstractmethod h = new HTMLDetails();
        h.Developer(); // Calls HTML's Developer()
        h.Rank();      // Calls HTMLDetails's Rank()

        // Using Abstractmethod reference for JavaDetails object
        Abstractmethod j = new JavaDetails();
        j.Developer(); // Calls Java's Developer()
        j.Rank();      // Calls JavaDetails's Rank()
    }
}
