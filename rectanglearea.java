 class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class rectanglearea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area (default constructor): " + r1.area());

        Rectangle r2 = new Rectangle(10, 5);
        System.out.println("Area (parameterized constructor): " + r2.area());
    }
}