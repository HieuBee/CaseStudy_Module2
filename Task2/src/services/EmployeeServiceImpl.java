package services;

import models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService{
    static List<Employee> arrListEmployee = new ArrayList<>();
    private static int size = 0;

    static {
        Employee employee1 = new Employee(1, "Dinh Bao Dieu Khue", 12, "Nu", 17122002, 0123, "khue@gmail.com", "Master", "CAP.Dev", 5000);
        Employee employee2 = new Employee(2, "Dinh Bao Dieu A", 12, "Nam", 17122002, 4567, "khue1@gmail.com", "Newbie", "F.Dev", 1000);
        Employee employee3 = new Employee(3, "Dinh Bao Dieu B", 12, "Nu", 17122002, 8910, "khue2@gmail.com", "Newbie", "F.Dev", 1000);
        Employee employee4 = new Employee(4, "Dinh Bao Dieu C", 12, "Nam", 17122002, 1112, "khue3@gmail.com", "Newbie", "F.Dev", 1000);
        arrListEmployee.add(employee1);
        arrListEmployee.add(employee2);
        arrListEmployee.add(employee3);
        arrListEmployee.add(employee4);
        size = 4;
    }

    @Override
    public void displayEmployee() {
        for (Employee employee : arrListEmployee) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        arrListEmployee.add(employee);
    }

    @Override
    public void updateEmployee(Object employee) {

    }
}
