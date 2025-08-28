package project1;

public class constructor {
    int a;String name;
    constructor (){
        a = 7;name = "shush";
    }
    void show(){
        System.out.print(a+" "+name);
    }
}
class b{
    public static void main(String[] args) {
        constructor ref = new constructor();
        ref.show();
    }
}
