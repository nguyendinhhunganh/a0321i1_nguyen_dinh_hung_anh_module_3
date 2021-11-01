package controller;

import entity.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "update":
                Integer id = Integer.valueOf(request.getParameter("id"));
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String status = request.getParameter("status");
                String producer = request.getParameter("producer");
                productService.updateProduct(id, name, price, status, producer);
                response.sendRedirect("/product");
                break;
            case "create" :
                Integer idCreate = Integer.valueOf(request.getParameter("id"));
                String nameCreate = request.getParameter("name");
                String priceCreate = request.getParameter("price");
                String statusCreate = request.getParameter("status");
                String producerCreate = request.getParameter("producer");
                productService.createProduct(idCreate, nameCreate, priceCreate, statusCreate, producerCreate);
                response.sendRedirect("/product");
                break;
            case "seeDetails" :
                response.sendRedirect("/product");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "update":
                Integer id = Integer.valueOf(request.getParameter("id"));
                Product product = productService.findById(id);
                request.setAttribute("product", product);
                request.getRequestDispatcher("ProductUpdate.jsp").forward(request, response);
                break;
            case "create":
                request.getRequestDispatcher("ProductCreate.jsp").forward(request, response);
                break;
            case "seeDetails" :
                Integer idSeeDetails = Integer.valueOf(request.getParameter("id"));
                Product productDetails = productService.findById(idSeeDetails);
                request.setAttribute("product", productDetails);
                request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);
                break;
            case "remove":
                Integer idRemove = Integer.valueOf(request.getParameter("id"));
                productService.remove(idRemove);
                List<Product> productsRemove = this.productService.findAll();
                request.setAttribute("productServlet", productsRemove);
                request.getRequestDispatcher("ProductList.jsp").forward(request, response);
                break;
            default:
                List<Product> products = this.productService.findAll();
                request.setAttribute("productServlet", products);
                request.getRequestDispatcher("ProductList.jsp").forward(request, response);
                break;
        }
    }
}
