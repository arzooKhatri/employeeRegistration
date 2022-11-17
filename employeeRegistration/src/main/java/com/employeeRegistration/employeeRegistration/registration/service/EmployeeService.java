package com.employeeRegistration.employeeRegistration.registration.service;

import com.employeeRegistration.employeeRegistration.registration.model.readModel.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    List<Employee> getAllEmployee();

    void deleteEmployee(int id);
}
