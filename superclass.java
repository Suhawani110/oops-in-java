package oops;
//create superclass
public class superclass {
    int a = 10;
}
// Child class (res1) that inherits from superclass
class res1 extends superclass{
    int a = 20;
    void show(){
        System.out.println(a);//print child class variable a
        System.out.println(super.a);//print super class variable a
    }
}
class res2{
    public static void main(String[] args){
        res1 r = new res1();  // Create object of child class 'res1'
        r.show(); // Call 'show' method → prints 20 and 10

    }
}