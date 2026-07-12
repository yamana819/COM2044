import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double midterm;
    private double finalExam;
    public Student(int id,String name,double midterm,double finalExam){
        this.id=id;
        this.name=name;
        this.midterm=midterm;
        this.finalExam=finalExam;
    }
    public double computeAverage(){
        return 0.6*finalExam+0.4*midterm;
    }
    public String determineStatus(){
        if (computeAverage()>=60){
            return "PASS";
        }
        else{
            return "FAIL";
        }
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getMidterm(){
        return midterm;
    }
    public double getFinalExam(){
        return finalExam;
    } 
    public String toString(){
        return id + " | " + name + " | Average: " + String.format("%.2f", computeAverage()) + " | " + determineStatus();
    }
}

public class StudentAnalyzer {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error exactly 2 arguments are required.");
            System.out.println("Usage java StudentAnalyzer input.csv output.csv");
            return;
        }
        String fileInput = args[0];
        String fileOutput = args[1];
        List<Student> students = readStudentsFromCSV(fileInput);
        if (students == null || students.isEmpty()) {
            System.out.println("No student data found or error occurred. Exiting...");
            return;
        }
        writeResultsToCSV(fileOutput, students);
        printSummary(students);
        promptPerformanceSummary(students);
    }
    public static List<Student> readStudentsFromCSV(String path){
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            String line;
            boolean isFirstLine = true;
            while ((line = buffer.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] data = line.split(",");
                if (data.length == 4) {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    double midterm = Double.parseDouble(data[2].trim());
                    double finalExam = Double.parseDouble(data[3].trim());
                    studentList.add(new Student(id, name, midterm, finalExam));
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            return null;
        } catch (NumberFormatException e) {
            System.out.println("Data format error.");
            return null;
        }
        return studentList;
    }
    public static void writeResultsToCSV(String path, List<Student> list) {
        try (PrintWriter printer = new PrintWriter(new FileWriter(path))) {
            printer.println("ID, Name, Average, Status");
            for (Student s : list) {
                printer.println(s.getId() + ", " + s.getName() + ", " + s.computeAverage() + ", " + s.determineStatus());
            }
            System.out.println("Results successfully written to: " + path+"\n");
        } catch (IOException e) {
            System.out.println("Error while writing to file!");
        }
    }
    public static void printSummary(List<Student> list) {
        int totalStudents = list.size();
        int passedCount = 0;
        Student topStudent = list.get(0);
        for (Student s : list) {
            if (s.determineStatus().equals("PASS")) {
                passedCount++;
            }
            if (s.computeAverage() > topStudent.computeAverage()) {
                topStudent = s;
            }
        }
        System.out.println("Number of students processed: " + totalStudents);
        System.out.println("Number of students passed: " + passedCount);
        System.out.println("Top Performer: " + topStudent.getName() + " (Score: " + String.format("%.2f", topStudent.computeAverage()) + ")\n");
    }
    public static void promptPerformanceSummary(List<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to see the best performing or worst performing students? (yes/no): ");
        String answer = scanner.nextLine().trim().toLowerCase();
        if (!answer.equals("yes")) {
            System.out.println("Program finished.");
            return;
        }
        System.out.print("How many of those would you like to see? You may also provide a percentage (e.g., 25%): ");
        String countInput = scanner.nextLine().trim();
        System.out.print("Show worst or best? (Type 'worst' or 'best'): ");
        String typeInput = scanner.nextLine().trim().toLowerCase();
        int limit = 0;
        try {
            if (countInput.endsWith("%")) {
                String percentStr = countInput.substring(0, countInput.length() - 1);
                double percent = Double.parseDouble(percentStr);
                limit = (int) Math.max(1, Math.round(list.size() * (percent / 100.0)));
            } else {
                limit = Integer.parseInt(countInput);
            }
            limit = Math.min(limit, list.size());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number or percentage format!");
            return;
        }
        if (typeInput.equals("best")) {
            list.sort((s1, s2) -> Double.compare(s2.computeAverage(), s1.computeAverage()));
            System.out.println("\n--- Top " + limit + " Best Performers ---");
        } else if (typeInput.equals("worst")) {
            list.sort((s1, s2) -> Double.compare(s1.computeAverage(), s2.computeAverage()));
            System.out.println("\n--- Top " + limit + " Worst Performers ---");
        } else {
            System.out.println("Invalid type entered. Must be 'best' or 'worst'.");
            return;
        }
        for (int i = 0; i < limit; i++) {
            System.out.println((i + 1) + ". " + list.get(i).toString());
        }
        scanner.close();
    }
}
