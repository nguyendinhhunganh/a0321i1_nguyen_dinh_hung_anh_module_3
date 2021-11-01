package repository.impl;

import bean.Employee;
import repository.EmployeeRepository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public List<Employee> findAllEmployees() {
        Connection connection = ConnectDatabase.getConnection();
        CallableStatement callableStatement;
        List<Employee> employeeList = new ArrayList<>();

            try {
                callableStatement = connection.prepareCall("call findAllEmployees()");
                ResultSet resultSet = callableStatement.executeQuery();
                Employee employee;
                while (resultSet.next()){
                    employee = new Employee();
                    employee.setEmployeeCode(resultSet.getInt("id_nhan_vien"));
                    employee.setName(resultSet.getString("ho_ten"));
                    employee.setPosition(resultSet.getString("ten_vi_tri"));
                    employee.setAcademicLevel(resultSet.getString("trinh_do"));
                    employee.setDateOfBirth(resultSet.getString("ngay_sinh"));
                    employee.setIdentityCardNumber(resultSet.getString("so_cmnd"));
                    employee.setTelephoneNumber(resultSet.getString("sdt"));
                    employee.setEmail(resultSet.getString("email"));
                    employee.setSalary(resultSet.getFloat("luong"));
                    employeeList.add(employee);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        return employeeList;
    }
}
