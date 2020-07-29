package com.Adore96;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("num1")) ;
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i+j;

        Cookie cookie = new Cookie("cookieName",k+"");
        response.addCookie(cookie);

        response.sendRedirect("Sq");
    }
}
