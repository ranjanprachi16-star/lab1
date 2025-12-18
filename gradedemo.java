import java.util.Scanner;
class grade {
    char grade;
    int marks;

    grade(int marks) {
        this.marks = marks;
    }

    void getgradedetails() {
        System.out.println("marks of the student" + marks);
    }

    void getgradedetailsm() {
        if (marks < 40) {
            grade = 'F';
        } else if (marks >= 40 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'E';
        } else {
            grade = 'O';
        }
        System.out.println("grade :" + grade);
    }
}
    class gradedemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter marks :");
            int marks = sc.nextInt();
            grade st = new grade(marks);
            st.getgradedetails();
            st.getgradedetailsm();
        }
    }

