package oops;
//usecase 1: this keyword refers to the current objet inside a method or constructor
public class thiskeyword {
    int a;//instance variable
    void show(){
        System.out.println(this);//print reference of the current object
    }
    // usecase 2: when the name of instance and local variable is same
    thiskeyword(int a){
        this.a=a;// 'this.a' refers to instance variable, 'a' refers to constructor parameter
    }
    void showA(){
        System.out.println(a);// prints value of instance variable 'a'
    }
    //usecase 3: when we want to call the default constructor of its own class
    thiskeyword(){
        System.out.println("Learncoding"); // default constructor
    }
    thiskeyword(int b,int c){
        this();// calls the default constructor (thiskeyword())
        System.out.println(b+c);
    }
    public static void main(String[] args) {
        // Creates object using constructor with one parameter (use case 2)
        thiskeyword obj = new thiskeyword(100);
        // Creates object using constructor with two parameters (use case 3)

        thiskeyword r = new thiskeyword(100,60);
        System.out.println(obj);// prints obj reference
        obj.show();              // prints obj reference (this points to obj)
        obj.showA();             // prints value of 'a' (100)
    }
}
