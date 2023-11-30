package lesson_22.homework;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "task_2", value = {"/age"})
public class task_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ageParameter = request.getParameter("age");
        PrintWriter out = response.getWriter();

        if (ageParameter != null && !ageParameter.isEmpty() && ageParameter.matches("\\d+")) {
            int age = Integer.parseInt(ageParameter);

            if (age >= 18)
                out.println("Совершеннолетний");
            else
                out.println("Несовершеннолетний");
        }
        else
            out.println("Некорректный возраст");
    }
}
