import java.io.*;
import java.util.*;

class Student implements Serializable {
    int studentID;
    String name;
    String grade;

    Student(int studentID, String name, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return studentID + " " + name + " " + grade;
    }
}

class Employee {
    String name;
    int id;
    String designation;
    double salary;

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + designation + " " + salary;
    }
}

public class Main {
    static final String EMP_FILE = "employees.txt";
    static final String STUD_FILE = "student.ser";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Sum of Integers (Autoboxing)");
            System.out.println("2. Student Serialization");
            System.out.println("3. Employee Management");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            if (choice == 1) sumOfIntegers(sc);
            else if (choice == 2) studentSerialization(sc);
            else if (choice == 3) employeeManagement(sc);
            else if (choice == 4) break;
        }
    }

    static void sumOfIntegers(Scanner sc) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers (type 'end' to stop):");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("end")) break;
            numbers.add(Integer.parseInt(input));
        }
        int sum = 0;
        for (Integer n : numbers) sum += n;
        System.out.println("Sum = " + sum);
    }

    static void studentSerialization(Scanner sc) throws Exception {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        Student s = new Student(id, name, grade);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(STUD_FILE));
        out.writeObject(s);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(STUD_FILE));
        Student st = (Student) in.readObject();
        in.close();
        System.out.println("Deserialized Student: " + st);
    }

    static void employeeManagement(Scanner sc) throws Exception {
        while (true) {
            System.out.println("\nEmployee Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Back");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Designation: ");
                String designation = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                Employee e = new Employee(name, id, designation, salary);
                BufferedWriter bw = new BufferedWriter(new FileWriter(EMP_FILE, true));
                bw.write(e.toString());
                bw.newLine();
                bw.close();
            } else if (choice == 2) {
                BufferedReader br = new BufferedReader(new FileReader(EMP_FILE));
                String line;
                while ((line = br.readLine()) != null) System.out.println(line);
                br.close();
            } else if (choice == 3) break;
        }
    }
}
