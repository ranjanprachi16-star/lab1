 import java.util.Scanner;

    public class evenoddcounter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter 10 integers:");

            for (int i = 0; i < 10; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    sc.close();
                    return;
                }
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            sc.close();
            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
        }
    }