package com.mao.action;

import com.mao.service.UserService;
import com.mao.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteUser")
public class DeleteUesr extends HttpServlet {

    UserService userService = new UserServiceImpl();

    public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("id");
        boolean b = userService.deleteUser(Integer.valueOf(parameter));
    }
}
