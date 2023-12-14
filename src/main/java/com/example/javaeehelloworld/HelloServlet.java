package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Устанавливаем тип контента для ответа
        response.setContentType("text/html");

        // Получаем параметр "name" из запроса
        String name = request.getParameter("name");

        // Создаем объект PrintWriter для записи ответа
        PrintWriter out = response.getWriter();

        // Форма для ввода имени
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
        out.println("<html><body>");
        out.println("<div class=\"center-container\">");
        out.println("<form action=\"hello-servlet\" method=\"get\">");
        out.println("Enter your name: <input type=\"text\" name=\"name\">");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        // Проверяем, было ли передано имя
        if (name != null && !name.isEmpty()) {
            // Отправляем приветственное сообщение с использованием переданного имени
            out.println("<h1>Hello, " + name + "!</h1>");
        } else if (request.getMethod().equalsIgnoreCase("GET")) {
            // Если имя не было передано, и запрос был GET, показываем предупреждение
            out.println("<h1>Please enter your name.</h1>");
        }
        out.println("</div>");
        out.println("</body></html>");

        // Закрываем PrintWriter
        out.close();
    }
}
