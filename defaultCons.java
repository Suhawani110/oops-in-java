package project1;

public class defaultCons {
    int a;String b;boolean c;
    defaultCons(){
        a =10;
        b="hello";
        c=true;
    }
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
class B{
    public static void main(String[] args){
        defaultCons r = new defaultCons();
        r.show();
    }
}
