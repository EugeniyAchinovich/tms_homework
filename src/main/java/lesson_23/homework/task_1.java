package lesson_23.homework;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.Date;

@WebServlet("/requesttime")
public class task_1 extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Приложение запущено.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        getRemoteAddress(request.getRemoteAddr(), request);
    }

    public static void getRemoteAddress(String remoteAddr2, HttpServletRequest request) {
        System.out.println("/====================================================/");
        System.out.println("Request: " + request);
        System.out.println("DateTime = " + new Date());
        System.out.println("IP = " + remoteAddr2);
        System.out.println("/====================================================/");
    }

    @Override
    public void destroy() {
        System.out.println("Приложение завершено.");
    }
}
