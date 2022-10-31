import java.util.Scanner;

abstract class Shape {
    abstract void numberofsides();
}

class rectangle extends Shape {
    void numberofsides() {
        System.out.println("The number of sides of rectangle is 4");
    }
}

class triangle extends Shape {
    void numberofsides() {
        System.out.println("The number of sides of triangle is 3");
    }
}

class hexagon extends Shape {
    void numberofsides() {
        System.out.println("The number of sides of hexagon is 6");
    }
}

public class shapes {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        rectangle rec = new rectangle();
        triangle tr = new triangle();
        hexagon hex = new hexagon();
        rec.numberofsides();
        tr.numberofsides();
        hex.numberofsides();
    }
}
