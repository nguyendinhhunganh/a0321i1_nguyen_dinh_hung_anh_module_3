import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertServlet", urlPatterns = "/convert")
public class ConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String usd = request.getParameter("usd");
    String rate = request.getParameter("rate");
    float vnd = Float.parseFloat(usd) * Float.parseFloat(rate);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<h1>Rate: " + Float.parseFloat(rate)+ "</h1>");
        out.println("<h1>USD: " + Float.parseFloat(usd)+ "</h1>");
        out.println("<h1>VND: " + vnd+ "</h1>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
