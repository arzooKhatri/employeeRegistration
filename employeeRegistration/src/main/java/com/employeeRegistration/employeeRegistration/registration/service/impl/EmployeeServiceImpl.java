package com.employeeRegistration.employeeRegistration.registration.service.impl;

import com.employeeRegistration.employeeRegistration.registration.model.readModel.Employee;
import com.employeeRegistration.employeeRegistration.registration.model.repository.EmployeeRepository;
import com.employeeRegistration.employeeRegistration.registration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAllEmployee();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
