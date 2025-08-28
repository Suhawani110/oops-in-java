package project1;

public class privatecons {
    int a;
    double b;
    String c;

    private privatecons() {
        a = 10;
        b = 30.56;
        c = "ankit";
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        privatecons r = new privatecons();
    }
}
