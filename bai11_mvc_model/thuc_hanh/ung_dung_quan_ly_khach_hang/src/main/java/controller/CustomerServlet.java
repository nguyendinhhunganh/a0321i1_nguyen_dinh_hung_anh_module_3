package controller;

import entity.Customer;
import repository.CustomerRepository;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customer"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                Integer idCreate = Integer.valueOf(request.getParameter("id"));
                String nameCreate = request.getParameter("name");
                String emailCreate = request.getParameter("email");
                String addressCreate = request.getParameter("address");
                this.customerService.createCustomer(idCreate,nameCreate,emailCreate,addressCreate);
                response.sendRedirect("/customer");
                break;
            case "update":
                Integer id = Integer.valueOf(request.getParameter("id"));
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                this.customerService.updateCustomer(id,name,email,address);
                response.sendRedirect("/customer");
                break;
            case "remove":
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create" :
                request.getRequestDispatcher("CreateCustomer.jsp").forward(request,response);
                break;
            case "update":
                Integer idUpdate = Integer.valueOf(request.getParameter("id"));
                Customer customerUpdate = customerService.findById(idUpdate);
                request.setAttribute("customer",customerUpdate);
                request.getRequestDispatcher("UpdateCustomer.jsp").forward(request,response);
                break;
            case "remove":
                Integer key = Integer.valueOf(request.getParameter("key"));
                this.customerService.deleteCustomer(key);
                Map<Integer, Customer> customerMap1 = this.customerService.findAll();
                request.setAttribute("customerListServlet", customerMap1);
                request.getRequestDispatcher("DisplayList.jsp").forward(request, response);
                break;
            default:
                Map<Integer, Customer> customerMap = this.customerService.findAll();
                request.setAttribute("customerListServlet", customerMap);
                request.getRequestDispatcher("DisplayList.jsp").forward(request, response);
                break;
        }
    }
}