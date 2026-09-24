
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Employee> employees = new ArrayList<>();

            employees.add(new Employee("Alex", 50000));
            employees.add(new Employee("Kate", 70000));
            employees.add(new Employee("Mike", 60000));
            employees.add(new Employee("Anna", 80000));


            ArrayList<String> highPaid = getHighPaidEmployees(employees, 60000);
            System.out.println(highPaid);

            int total = getTotalSalary(employees);
            System.out.println(total);

            Employee highest = getHighestPaidEmployee(employees);
            System.out.println(highest.name + " " + highest.salary);

            Employee lowest = getLowestPaidEmployee(employees);
            System.out.println(lowest.name + " " + lowest.salary);

            HashMap<String, Integer> salaryMap = createSalaryMap(employees);
            System.out.println(salaryMap);

            HashSet<String> uniqueNames = getUniqueNames(employees);
            System.out.println(uniqueNames);


            try{
                Employee employee = new Employee("Alex", -50000);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }


        public static ArrayList<String> getHighPaidEmployees(ArrayList<Employee> employees, int limit) {
            ArrayList<String> result = new ArrayList<>();

            for (Employee employee : employees) {
                if (employee.salary > limit) {
                    result.add(employee.name);
                }
            }
            return result;
        }


        public static int getTotalSalary(ArrayList<Employee> employees) {
            int sum = 0;
            for (Employee employee : employees) {
                sum = sum + employee.salary;


            }
            return sum;
        }


        public static Employee getHighestPaidEmployee(ArrayList<Employee> employees) {

            Employee highest = employees.get(0);
            for (Employee employee : employees) {
                if (employee.salary > highest.salary) {
                    highest = employee;

                }

            }
            return highest;
        }

        public static Employee getLowestPaidEmployee(ArrayList<Employee> employees) {
            Employee lowest = employees.get(0);
            for (Employee employee : employees) {
                if (employee.salary < lowest.salary) {
                    lowest = employee;

                }
            }
            return lowest;
        }

        public static HashMap<String, Integer> createSalaryMap(ArrayList<Employee> employees) {
            HashMap<String, Integer> salaryMap = new HashMap<>();
            for (Employee employee : employees) {
                salaryMap.put(employee.name, employee.salary);


            }

            return salaryMap;
        }

        public static HashSet<String> getUniqueNames(ArrayList<Employee> employees) {
            HashSet<String> unique = new HashSet<>();
            for (Employee employee : employees) {
                unique.add(employee.name);

            }
            return unique;
        }

    }




























































































































































































































































