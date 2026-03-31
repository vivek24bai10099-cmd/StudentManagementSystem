// Handles file saving operationsimport java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public static void saveToFile(ArrayList<Student> students) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("students.txt"));
            for (Student s : students) {
                pw.println(s.toFileString());
            }
            pw.close();
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
