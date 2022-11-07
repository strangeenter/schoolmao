package com.mao.action;

import com.mao.exception.IdNullException;
import com.mao.pojo.User;
import com.mao.service.UserService;
import com.mao.service.impl.UserServiceImpl;
import com.mao.utils.DateForMat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/selectUser")
public class SelectUserServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request：请求 getparamter:获得请求里的参数
        Integer  id = null;
        try {
            String stringId = request.getParameter("id");
            id = Integer.valueOf(stringId);
        } catch (Exception exception) {
            throw new IdNullException("id不能为空");
        }

        User user = userService.getUser(id);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",user.getId());
        map.put("name",user.getName());
        map.put("birthday", DateForMat.format(user.getDate()));
        map.put("email",user.getEmail());
        request.setAttribute("data",map);
        request.getRequestDispatcher("user/userview.jsp").forward(request, response);
    }
}
