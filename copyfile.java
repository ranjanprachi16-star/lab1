import java.io.*;
import java.util.Scanner;

public class copyfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input source and destination file names
        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter the destination file name (character stream): ");
        String destFileChar = sc.nextLine();

        System.out.print("Enter the destination file name (byte stream): ");
        String destFileByte = sc.nextLine();

        // Copy using Character Stream
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destFileChar)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully using Character Stream.");
        } catch (IOException e) {
            System.out.println("Error during character stream copy.");
            e.printStackTrace();
        }

        // Copy using Byte Stream
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFileByte)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully using Byte Stream.");
        } catch (IOException e) {
            System.out.println("Error during byte stream copy.");
            e.printStackTrace();
        }

        sc.close();
    }
}
