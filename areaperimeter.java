class areaperimeter {

    double length;
    double width;

    areaperimeter(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width ;
    }
    double perimeter(){
        return 2*(length + width);
    }

    static void main() {
        areaperimeter r = new areaperimeter(5,4);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }}