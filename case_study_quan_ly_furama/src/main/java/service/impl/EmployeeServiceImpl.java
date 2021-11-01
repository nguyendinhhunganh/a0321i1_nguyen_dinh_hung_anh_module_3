package service.impl;

import bean.Employee;
import repository.EmployeeRepository;
import repository.impl.EmployeeRepositoryImpl;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAllEmployees();
    }
}
