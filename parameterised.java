package oops;

public class parameterised {
    int x,y;
    //constructor
    parameterised(int a,int b){
        this.x = a;
        this.y = b;
    }
    //method
    void show(){
            System.out.println(x+" "+y);
        }
    }
class C{
    public static void main(String[] args){
        parameterised r = new parameterised(100,200); //object creation
        r.show();// method call
    }
}
