package oops;
//code for understanding of constructor
public class constructor {
    int a;String name;
    //constructor
    constructor (){
        a = 7;name = "shush";
    }
    //method
    void show(){
        System.out.print(a+" "+name);
    }
}
class b{
    public static void main(String[] args) {
        constructor ref = new constructor(); //object creation
        ref.show(); // print value
    }
}
