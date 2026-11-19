package tutorial_6;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ADD TASKS =====");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");
            tasks.add(scanner.nextLine());
        }

        // Save to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }

        // Load from file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");
        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading tasks.");
        }

        scanner.close();
    }
}