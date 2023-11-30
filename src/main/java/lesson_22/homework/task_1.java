package lesson_22.homework;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.TimeZone;

@WebServlet(name = "task_1", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class task_1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String pathInfo = request.getServletPath();

            if (pathInfo != null)
                switch (pathInfo) {
                    case "/minsk":
                        out.println("Время в Минске: " + getTimeInTimezone("Europe/Minsk"));
                        break;
                    case "/washington":
                        out.println("Время в Вашингтоне: " + getTimeInTimezone("America/New_York"));
                        break;
                    case "/beijing":
                        out.println("Время в Пекине: " + getTimeInTimezone("Asia/Shanghai"));
                        break;
                    default:
                        out.println("Неверный URL");
                }
            else
                out.println("Неверный URL");
        }
    }
    private String getTimeInTimezone(String timezone) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timezone));
        return calendar.getTime().toString();
    }
}
