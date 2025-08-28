package project1;

public class pro {
    int a = 10;
    String b = "Shush";
    void show(){
        System.out.println(a+" "+b);
    }
}
class test{
    public static void main(String[] args) {
        pro r=new pro();
        r.show();
    }
}
