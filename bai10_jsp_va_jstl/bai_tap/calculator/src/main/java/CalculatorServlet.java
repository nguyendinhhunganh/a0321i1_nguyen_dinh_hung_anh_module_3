import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"","/calculator"})
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        String operator = request.getParameter("operator");
        float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
        float result = 0;
        try {
            if (operator.equals("addition")) {
                result = firstOperand + secondOperand;
            } else if (operator.equals("subtraction")) {
                result = firstOperand - secondOperand;
            } else if (operator.equals("multiplication")) {
                result = firstOperand * secondOperand;
            } else {
                result = firstOperand / secondOperand;
            }
            request.setAttribute("result", result);
            request.setAttribute("firstOperand", firstOperand);
            request.setAttribute("operator", operator);
            request.setAttribute("secondOperand", secondOperand);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
