package project1;

public class copy {
    int a;String b;
    copy(){
        a = 10;b = "learn coding";
        System.out.println(a+" "+b);
    }
    copy(copy ref){
        a = ref.a;
        b =ref.b;
        System.out.println(a+" "+b);
    }
}
class D{
    public static void main(String[] args){
        copy r = new copy();
        copy r1 = new copy(r);
    }
}
