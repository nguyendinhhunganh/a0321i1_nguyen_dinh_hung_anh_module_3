import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customer", "/index"})
public class CustomerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội", "https://toplist.vn/images/800px/son-tung-mtp-600598.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://www.dkn.tv/wp-content/uploads/2018/12/1545205549651-1433_Untitled.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToWhrKZE_UTNYGj6CCEMS3c1uL5fMk72dVag&usqp=CAU"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqyZF2IhGy8kD0ajAG7B8RQ8M6p4vnmhMNCA&usqp=CAU"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3lsTJBoyPl7Y5uLFYj6rD-mVozhISFbpK8A&usqp=CAU"));
        request.setAttribute("customerListServlet",customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
