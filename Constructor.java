package oops;
//basic code for understanding constructors;
public class Constructor {
    int a;
    String name;
//constructor
    Constructor() {
        a = 7;
        name = "shush";
    }
//method
    void show() {
        System.out.println(a + " " + name);
    }
}

class D {
    public static void main(String[] args) {
        Constructor ref = new Constructor();//object creation
        ref.show(); // calling method
    }
}
