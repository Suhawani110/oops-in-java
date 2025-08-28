package oops;

public class copy {
    int a;String b;
    //Default / no-arg constructor
    copy(){
        a = 10;b = "learn coding";
        System.out.println(a+" "+b);
    }
    //copy constructor
    copy(copy ref){
        a = ref.a; //copy value of a fron another object
        b =ref.b; // copy value of b from another object
        System.out.println(a+" "+b);
    }
}
class N{
    public static void main(String[] args){
        copy r = new copy(); //calls default constructor
        copy r1 = new copy(r); // calls copy constructor
    }
}
