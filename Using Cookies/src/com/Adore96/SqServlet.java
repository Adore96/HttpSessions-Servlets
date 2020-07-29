package com.Adore96;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();

        System.out.println("Connection Success");

        int k = 0;
        Cookie cookie[] = request.getCookies();

        for (Cookie c : cookie){
            if (c.getName().equals("cookieName")){
                k = Integer.parseInt(c.getValue());
            }
        }

        out.println(k);
    }
}
