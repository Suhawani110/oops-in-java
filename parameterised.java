package project1;

public class parameterised {
    int x,y;
    parameterised(int a,int b){
        this.x = a;
        this.y = b;
    }
    void show(){
            System.out.println(x+" "+y);
        }
    }
class C{
    public static void main(String[] args){
        parameterised r = new parameterised(100,200);
        r.show();
    }
}
