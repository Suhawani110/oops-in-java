package oops;
//main class
public class multilvlinheri {
    int a,b,c;
    //method
    void add(){
        a=10;b=20;c=a+b;
        System.out.println("sum of 2 no"+c);
    }
    //method
    void sub(){
        a =200;b=100;c=a-b;
        System.out.println("diff of 2 no"+c);
    }
}
//first child class
class sec extends multilvlinheri{
    //method
    void multi(){
        a=10;b=20;c=a*b;
        System.out.println("Multiple of 2 no"+c);
    }
    //method
    void div(){
        a =10;b=2;
        c =a/b;
        System.out.println("Divison of 2 no"+c);
    }
}
//second child class
class sec2 extends sec{
    //method
    void rem(){
        a =10;b=3;
        c =a%b;
        System.out.println("Remainder of 2 no"+c);
    }
}
class Test1{
    public static void main(String[] arg){
        // Create an object of sec2 (grandchild class)
        // sec2 inherits all methods from sec and multilvlinheri
        sec2 r = new sec2();
        r.add();r.sub();r.multi();r.div();r.rem();
    }
        }
