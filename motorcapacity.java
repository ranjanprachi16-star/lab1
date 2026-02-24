interface motor {
    int capacity = 15;

    void run();

    void consume();
}
class washingmachine implements motor{
    public void run()
        {
            System.out.println("washing machine is running");
    }
public void consume() {
    System.out.println("washing machine is consuming power");
}
}
public class motorcapacity {
    static void main() {
        motor m = new
        washingmachine();
        m.run();
        m.consume();
        System.out.println("capacity of the motor" + m.capacity);
    }
}

