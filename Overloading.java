package project1;

public class Overloading {
    int x, y, z;

    Overloading() {
        x = 5;
        y = 10;
        z = 0;
    }

    Overloading(int a, int b) {
        this.x = a;
        this.y = b;
        this.z = 0;
    }


    Overloading(int f, int g, int h) {
        this.x = f;
        this.y = g;
        this.z = h;
    }

    void show() {
        System.out.println(x + " " + y + " " + z);
    }

    public static void main(String[] args) {
        Overloading s1 = new Overloading();
        Overloading s2 = new Overloading(100, 200);
        Overloading s3 = new Overloading(1, 2, 3);

        s1.show();
        s2.show();
        s3.show();
    }
}
