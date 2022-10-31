package first;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LifeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("当前访问的Servlet对象是："+this);
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