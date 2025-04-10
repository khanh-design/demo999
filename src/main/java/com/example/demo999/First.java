package com.example.demo999;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "First", value = "/First")
public class First implements Servlet {
    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("");
        out.println("Hello simple servlet");
        out.println("");
    }

    @Override
    public String getServletInfo() {
        return "copyright 2007-1010";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is destroyed");
    }
}
