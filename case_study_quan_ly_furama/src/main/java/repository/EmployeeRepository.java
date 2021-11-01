package repository;

import bean.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAllEmployees();
}
