package oops;
//this is basic demo code for understanding of class
public class demo {
    //data member (fields/attributes)
    int a = 10;
    String b = "Shush";

    //method
    void show(){
        System.out.println(a+" "+b);
    }
}
class test{
    public static void main(String[] args) { // main method
        demo r=new demo(); //creating object of demo class
        r.show(); //calling show method
    }
}
