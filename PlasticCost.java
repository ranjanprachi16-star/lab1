import java.util.Scanner;

class Sheet2D {
    double length, width;
    final double costPerSqFt = 40;

    Sheet2D(double l, double w) {
        length = l;
        width = w;
    }

    double calculateCost() {
        double area = length * width;
        return area * costPerSqFt;
    }
}

class Box3D extends Sheet2D {
    double height;
    final double costPerCubicFt = 60;

    Box3D(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    double calculateCost() {
        double volume = length * width * height;
        return volume * costPerCubicFt;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width of sheet:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Sheet2D sheet = new Sheet2D(l, w);
        System.out.println("Cost of sheet = Rs " + sheet.calculateCost());

        System.out.println("Enter length, width and height of box:");
        l = sc.nextDouble();
        w = sc.nextDouble();
        double h = sc.nextDouble();
        Box3D box = new Box3D(l, w, h);
        System.out.println("Cost of box = Rs " + box.calculateCost());
    }
}
