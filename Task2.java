import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file = new File("myfile.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World");
            writer.close();
            System.out.println("Data written to file.");
            FileReader reader = new FileReader(file);
            Scanner read = new Scanner(reader);
            System.out.println("Reading data from file:");
            read.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}