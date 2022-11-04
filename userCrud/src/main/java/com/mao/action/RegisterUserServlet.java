package com.mao.action;

import com.mao.pojo.User;
import com.mao.service.UserService;
import com.mao.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyleContext;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //设置请求和响应的编码
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //response.setContentType("text/html;charset=utf-8");
        //req.setCharacterEncoding("utf-8");
        //resp.setCharacterEncoding("utf-8");
        //获得jsp页面表单中的参数信息
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String birthday=request.getParameter("birthday");
        //SimpleDateFormat 格式化日期 format Date 转 String  parse String 转 Date  转成java.util.Date
        //还有一个java.sql.Date
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(birthday);
            User user=new User(name,password,email,parse);
            UserService userService = new UserServiceImpl();
            Boolean res = userService.RegisterUser(user);
            if (res){
                response.sendRedirect("sys/success.jsp");
            }else {
                response.sendRedirect("sys/error.jsp");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
