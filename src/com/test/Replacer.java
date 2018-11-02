package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Replacer extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String text = req.getParameter("text");
        String stopStr = getServletConfig().getInitParameter("filter");
        TextFilter textFilter = new TextFilter();
        res.getWriter().println(textFilter.filter(text, stopStr));
    }
}
