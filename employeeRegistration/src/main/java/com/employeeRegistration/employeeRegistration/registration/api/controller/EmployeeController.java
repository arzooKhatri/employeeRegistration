package com.employeeRegistration.employeeRegistration.registration.api.controller;

import com.employeeRegistration.employeeRegistration.registration.api.constants.EmployeeConstants;
import com.employeeRegistration.employeeRegistration.registration.model.readModel.Employee;
import com.employeeRegistration.employeeRegistration.registration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = EmployeeConstants.EMPLOYEE_BASE_URL)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = EmployeeConstants.SAVE_EMPLOYEE)
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping(value = EmployeeConstants.UPDATE_EMPLOYEE)
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping(value = EmployeeConstants.GET_ALL_EMPLOYEE)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping(value = EmployeeConstants.DELETE_EMPLOYEE)
    public void deleteEmployee(@RequestParam int id) {
        employeeService.deleteEmployee(id);
    }

}
