package learn;

/**
 * Created by eugen.beloded on 27.06.17.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeDB {
    public static HashMap<Integer, Employee> employees = new HashMap<>();

    static {
        employees.put(1, new Employee(1, "Lokesh", "Gupta", "India"));
        employees.put(2, new Employee(2, "John", "Gruber", "USA"));
        employees.put(3, new Employee(3, "Melcum", "Marshal", "AUS"));
    }

    public static List<Employee> getEmployees() {
        return new ArrayList<Employee>(employees.values());
    }

    public static Integer getNextId() {
        return employees.size() + 1;
    }

    public static Employee getEmployee(Integer id) {
        return employees.get(id);
    }

    public static void updateEmployee(Integer id, Employee employee) {
        employees.put(id, employee);
    }

    public static void removeEmployee(Integer id) {
        employees.remove(id);
    }

    public static Employee addEmployee(Employee employee) {
        employee.setId(employees.size() + 1);
        employees.put(employee.getId(), employee);
        return employee;
    }
}
