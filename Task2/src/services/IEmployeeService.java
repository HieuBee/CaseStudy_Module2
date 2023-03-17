package services;

import models.Employee;

public interface IEmployeeService extends IService{
    void displayEmployee();
    void addEmployee(Employee employee);
    void updateEmployee(Object employee);
}
