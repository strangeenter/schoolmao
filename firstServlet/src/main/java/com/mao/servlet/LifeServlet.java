package com.mao.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class LifeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("当前访问的Servlet对象是："+this);
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        //引用数据类型
        PrintWriter printWriter = response.getWriter();
        //拿到这个类之后可以在浏览器写东西
        printWriter.print("<p>当前访问的Servlet对象是："+this+"</p>");
        printWriter.print("<p> <a href = '/'> 返回 </p>");
    }
    @Override
    public void destroy(){
        System.out.println("LifeServlet类的destroy方法调用了！");
    }
    @Override
    public void init() throws ServletException{
        System.out.println("LifeServlet 类的init方法被调用！");
    }

}