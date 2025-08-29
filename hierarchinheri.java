package oops;
//parents class
public class hierarchinheri {
    //method
    void input (){
        System.out.println("Enter your name");
    }
}
//first child class
class inh extends hierarchinheri {
    //method
    void show (){
        System.out.println("My name is Shush");
    }
}
//second child class
class inh2 extends hierarchinheri {
    //method
    void disp(){
        System.out.println("My name is abhi");
    }
}

class res{
    public static void main(String[] args){
        inh r = new inh();// creating obj of inh
        inh2 r2= new inh2();//creating object of inh2
        r.input();// from parents class
        r.show();//from inh class
        r2.input();// from parents class
        r2.disp();//from inheri class
    }
}
