package lesson_26.homework;
/*
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate-request")
@SuppressWarnings("all")
public class RequestValidatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Метод GET не поддерживается</h1>");
        out.println("<p>Этот URL поддерживает только POST-запросы.</p>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String description = request.getParameter("description");

        if (name == null || email == null || description == null || name.isEmpty() || email.isEmpty() || description.isEmpty()) {
            response.sendRedirect("save-request.jsp");
        }
        else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Заявка успешно сохранена</h1>");
            out.println("<p>Имя: " + name + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Описание заявки: " + description + "</p>");
        }
    }
}
*/


