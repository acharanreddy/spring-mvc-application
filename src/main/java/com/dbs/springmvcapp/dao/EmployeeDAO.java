package com.dbs.springmvcapp.dao;

import com.dbs.springmvcapp.model.Employee;
import java.util.List;

public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee update(long empId, Employee employee);

    List<Employee> findAll();

    Employee findById(long id);

    void deleteEmployee(long id);
}