import java.util.ArrayList;

class  Employee {
    String name;
    int salary;

    Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    int getSalary() {
        return salary;
    }


    void showInfo() {
        System.out.println("Сотрудник: " + name);
    }

    void work() {
        System.out.println("Сотрудник работает");
    }

}
class Developer extends Employee {
    Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void showInfo() {
        System.out.println("Разработчик: " + name);
    }

    @Override
    void work() {
        System.out.println(name + " пишет код");
    }
}


class Manager extends Employee {
    Manager(String name,int salary) {
        super(name,salary);
    }

    @Override
    void showInfo() {
        System.out.println("Менеджер: " + name);
    }

    @Override
    void work() {
        System.out.println(name + " управляет командой");
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Alex",120000));
        employees.add(new Manager("Kate",150000));
        employees.add(new Developer("Max",130000));
        employees.add(new Manager("Anna",160000));

        for (Employee employee : employees) {
            employee.showInfo();
           employee.work();
           System.out.println("Зарплата: ");
           System.out.println(employee.getSalary());

        }
    }
}





















































































































































































































