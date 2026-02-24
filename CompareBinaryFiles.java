import java.io.*;

public class CompareBinaryFiles {
    public static void main(String[] args) {
        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 1;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which they differ is " + position);
                    return;
                }
                position++;
            }

            if (fis1.read() != -1 || fis2.read() != -1) {
                System.out.println("Two files are not equal: different lengths.");
            } else {
                System.out.println("Two files are equal.");
            }

        } catch (IOException e) {
            System.out.println("Error comparing files.");
            e.printStackTrace();
        }
    }
}
