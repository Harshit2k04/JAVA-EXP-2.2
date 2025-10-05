import java.util.*;
import java.util.stream.*;
import java.io.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + age + " " + salary;
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " " + price + " " + category;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Sort Employees (Lambda)");
            System.out.println("2. Filter & Sort Students (Streams)");
            System.out.println("3. Process Products (Streams)");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            if (choice == 1) employeeSorting();
            else if (choice == 2) studentFiltering();
            else if (choice == 3) productProcessing();
            else if (choice == 4) break;
        }
    }

    static void employeeSorting() {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000)
        );
        System.out.println("\nSort by Name:");
        employees.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name)).forEach(System.out::println);
        System.out.println("\nSort by Age:");
        employees.stream().sorted((e1, e2) -> Integer.compare(e1.age, e2.age)).forEach(System.out::println);
        System.out.println("\nSort by Salary (Descending):");
        employees.stream().sorted((e1, e2) -> Double.compare(e2.salary, e1.salary)).forEach(System.out::println);
    }

    static void studentFiltering() {
        List<Student> students = Arrays.asList(
            new Student("Aniketh", 80),
            new Student("Maya", 72),
            new Student("Ravi", 90),
            new Student("Sara", 65)
        );
        System.out.println("\nStudents with marks > 75 sorted by marks:");
        students.stream()
            .filter(s -> s.marks > 75)
            .sorted((s1, s2) -> Integer.compare(s1.marks, s2.marks))
            .map(s -> s.name)
            .forEach(System.out::println);
    }

    static void productProcessing() {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 80000, "Electronics"),
            new Product("Phone", 60000, "Electronics"),
            new Product("Shirt", 2000, "Clothing"),
            new Product("Jeans", 3000, "Clothing"),
            new Product("Fridge", 40000, "Appliances"),
            new Product("Oven", 15000, "Appliances")
        );
        System.out.println("\nGroup by Category:");
        Map<String, List<Product>> grouped = products.stream().collect(Collectors.groupingBy(p -> p.category));
        grouped.forEach((cat, list) -> {
            System.out.println(cat + " -> " + list);
        });
        System.out.println("\nMost Expensive Product in Each Category:");
        Map<String, Optional<Product>> maxByCategory = products.stream()
            .collect(Collectors.groupingBy(p -> p.category, Collectors.maxBy(Comparator.comparingDouble(p -> p.price))));
        maxByCategory.forEach((cat, prod) -> System.out.println(cat + " -> " + prod.get()));
        double avgPrice = products.stream().collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("\nAverage Price of All Products: " + avgPrice);
    }
}
