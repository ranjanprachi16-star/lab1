class volumebox {

    double length;
    double width;
    double height;
    volumebox(double l, double w,double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height ;
    }
    static void main() {
        volumebox r = new volumebox(5,4,2);
        System.out.println(r.volume());
    }}