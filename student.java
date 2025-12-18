import java.util.Scanner;

public class student {
    int rollno;
    String name;
    String section;
    String branch;

    student(int rollno, String name, String section, String branch) {
        this.rollno = rollno;
        this.name = name;
        this.section = section;
        this.branch = branch;
    }

    void getStudentDetails() {
        System.out.println("roll no is :" + rollno);
        System.out.println("name is :" + name);
        System.out.println("section is :" + section);
        System.out.println("branch is :" + branch);
    }
}
class studentdemo{
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter roll no :");
        int rollno = sc.nextInt();
        System.out.println("enter name :");
        String name = sc.nextLine();
        System.out.println("enter section :");
        String section = sc.nextLine();
        System.out.println("enter branch :");
        String branch = sc.nextLine();
        student st = new student(rollno,name,section,branch);
        st.getStudentDetails();

    }
}
