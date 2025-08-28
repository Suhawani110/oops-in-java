package oops;
//code for understanding default constructor
public class defaultCons {
    int a;String b;boolean c;
    //constructor
    defaultCons(){
        a =10;
        b="hello";
        c=true;
    }
    //method
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
class b{
    public static void main(String[] args){
        defaultCons r = new defaultCons();//object creation
        r.show();//method call
    }
}
