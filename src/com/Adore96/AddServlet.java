package com.Adore96;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("num1")) ;
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i+j;

        HttpSession session = request.getSession();
        session.setAttribute("k",k);

//        response.sendRedirect("Sq");
        PrintWriter out = response.getWriter();

        RequestDispatcher RD = request.getRequestDispatcher("/check.jsp");
        RD.include(request,response);

        System.out.println("check page worked");
    }
}
