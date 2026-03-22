
package com.gla.inheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 101, 80000, 5);
        Employee d = new Developer("Bob", 102, 60000, "Java");
        Employee i = new Intern("Charlie", 103, 20000, "Alice");

        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println();
        i.displayDetails();
    }
}
