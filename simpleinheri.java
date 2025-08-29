package oops;
//[parent class
public class simpleinheri {
    int roll;
      String name;
    int marks;
    void input(){
        System.out.println("Enter roll no");//method
    }
}
class ankit extends simpleinheri{ // child class
    void disp(){
        roll=1;             // assign values to inherited variables
        name = "ankit";
        marks = 89;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
ankit r = new ankit(); //create object to child class
 r.input();
r.disp();
}
}