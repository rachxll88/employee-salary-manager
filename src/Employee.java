public class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;

        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;
    }
}