package controller;

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/users"})
public class UserServlet extends HttpServlet {
    public static UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "edit":
                Integer id = Integer.valueOf(request.getParameter("id"));
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                userService.updateUser(id, name, email, country);
                response.sendRedirect("/users");
                break;
            case "create":
                Integer idCreate = Integer.valueOf(request.getParameter("id"));
                String nameCreate = request.getParameter("name");
                String emailCreate = request.getParameter("email");
                String countryCreate = request.getParameter("country");
                userService.createUser(idCreate, nameCreate, emailCreate, countryCreate);
                response.sendRedirect("/users");
            case "search":
                String countrySearch = request.getParameter("searchCountry");
                ArrayList<User> userCountry = userService.countrySearch(countrySearch);
                request.setAttribute("listUser", userCountry);
                request.getRequestDispatcher("List.jsp").forward(request, response);
                break;
            case "searchId":
                int idSearch = Integer.parseInt(request.getParameter("searchId"));
                User userId = userService.getUserById(idSearch);
                List<User> userListId = new ArrayList<>();
                userListId.add(userId);
                request.setAttribute("listUser", userListId);
                request.getRequestDispatcher("List.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                Integer id = Integer.valueOf(request.getParameter("id"));
                User user = userService.findById(id);
                request.setAttribute("user", user);
                request.getRequestDispatcher("Edit.jsp").forward(request, response);
                break;
            case "delete":
                Integer idDelete = Integer.valueOf(request.getParameter("id"));
                userService.deleteUser(idDelete);
                ArrayList<User> userDelete = userService.FindAll();
                request.setAttribute("listUser", userDelete);
                request.getRequestDispatcher("List.jsp").forward(request, response);
                break;
            case "create":
                request.getRequestDispatcher("Create.jsp").forward(request, response);
                break;

            case "sort":
                ArrayList<User> userSort = userService.sortName();
                request.setAttribute("listUser", userSort);
                request.getRequestDispatcher("List.jsp").forward(request, response);
                break;
            case "permision":

                addUserPermision(request, response);

                break;
            default:
                ArrayList<User> users = userService.FindAll();
                request.setAttribute("listUser", users);
                request.getRequestDispatcher("List.jsp").forward(request, response);
                break;
        }
    }

    private void addUserPermision(HttpServletRequest request, HttpServletResponse response) {
        User user = new User("kien", "kienhoang@gmail.com", "vn");

        int[] permision = {1, 2, 4};

        userService.addUserTransaction(user, permision);
    }
}
