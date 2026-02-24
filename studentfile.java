import java.io.*;
import java.util.Scanner;

public class studentfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the name of existing file to which student details will be written: ");
        String fileName = sc.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) { // append mode
            writer.write("Roll No: " + rollNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Subject: " + subject + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("-------------------------\n");
            System.out.println("\nStudent details stored successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        System.out.println("Displaying contents of file:\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        sc.close();
    }
}