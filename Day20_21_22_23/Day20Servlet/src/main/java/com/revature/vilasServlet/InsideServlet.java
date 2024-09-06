package com.revature.vilasServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InsideServlet")
public class InsideServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InsideServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Output for the user
        out.println("<html>");
        out.println("<head><title>InsideServlet</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome guys</h1>");
        out.println("<h2>This servlet forwards the request to Servlet_1</h2>");

        // Forward request to Servlet_1 and include its response
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Servlet_1");
        dispatcher.include(request, response);

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
