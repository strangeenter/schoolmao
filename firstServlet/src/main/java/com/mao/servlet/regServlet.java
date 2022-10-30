package com.mao.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet
public class regServlet extends HttpServlet {
    private static final String dirver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/school";
    private static final String user = "root";
    private static final String password = "root";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String pwd=req.getParameter("pwd");
        String email=req.getParameter("email");
        String birthday=req.getParameter("birthday");
        Connection connection = null;
        try{
            Class.forName(dirver);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
