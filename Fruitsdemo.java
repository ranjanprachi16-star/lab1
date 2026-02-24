class Fruit {
    void show() {
        System.out.println("This is a Fruit.");
    }
}

class Banana extends Fruit {
    void show() {
        System.out.println("This is a Banana.");
    }
}

class Cherry extends Fruit {
    void show() {
        System.out.println("This is a Cherry.");
    }
}

public class Fruitsdemo {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();

        f.show();
        b.show();
        c.show();
    }
}
