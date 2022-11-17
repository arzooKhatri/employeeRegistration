package com.employeeRegistration.employeeRegistration.registration.model.repository;

import com.employeeRegistration.employeeRegistration.registration.model.readModel.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    //save
    @Query(value = "insert into Employee (id, firstName, lastName, email, address) values (id, firstName, lastName, email, address) ")
    Employee saveEmployee(@Param("employee") Employee employee);

    //update
    @Modifying
    @Query(value = "update Employee  set where Employee=:Employee")
    Employee updateEmployee(@Param("employee") Employee employee);

    //get
    @Query(value = "select from Employee")
    List<Employee> findAllEmployee();

    //delete
    @Query(value = "delete from Employee e where e.id=:id")
    Employee deleteEmployeeById(@Param("id") int id);

}
