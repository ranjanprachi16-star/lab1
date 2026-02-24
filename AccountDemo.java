import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account No: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;


    void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.next();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\n... Details of Persons ...");
        for (Person p : persons) {
            p.disp();
            System.out.println(".---.---.---.---.---.---.");
        }
    }
}