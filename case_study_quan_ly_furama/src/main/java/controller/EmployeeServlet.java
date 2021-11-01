package controller;

import bean.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "EmployeeServlet", urlPatterns = {"", "/employee"})
public class EmployeeServlet extends javax.servlet.http.HttpServlet {
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        List<Employee> employeeList = employeeService.findAllEmployees();
        request.setAttribute("employeesList", employeeList);
        request.getRequestDispatcher("/employee.jsp").forward(request,response);
    }
}
