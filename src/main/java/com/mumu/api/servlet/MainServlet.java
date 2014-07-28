package com.mumu.api.servlet;

/**
 * Created by chenxi.chen on 2014/06/16/下午4:54.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        handleRequest(req, resp, false);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        handleRequest(req, resp, true);

    }

    private void handleRequest(HttpServletRequest req, HttpServletResponse resp, boolean isPost) throws IOException {


        String username=req.getParameter("user");
        String password=req.getParameter("pass");
        String body=req.getParameter("body");

        byte[] bytes = "hello tommorry".getBytes();
        resp.getOutputStream().write(bytes);
        //resp.sendRedirect("index.jsp");
        System.out.println("POST:"+isPost);
        System.out.println(username);
        System.out.println(password);
        System.out.println(body);
    }
}