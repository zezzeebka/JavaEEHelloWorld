package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();


        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
        out.println("<html><body>");
        out.println("<div class=\"center-container\">");
        out.println("<form action=\"hello-servlet\" method=\"get\">");
        out.println("Enter your name: <input type=\"text\" name=\"name\">");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");


        if (name != null && !name.isEmpty()) {

            out.println("<h1>Hello, " + name + "!</h1>");
        } else if (request.getMethod().equalsIgnoreCase("GET")) {

            out.println("<h1>Please enter your name.</h1>");
        }
        out.println("</div>");
        out.println("</body></html>");

        out.close();
    }
}
