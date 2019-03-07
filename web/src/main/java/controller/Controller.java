package controller;


import ums.service.UserService;
import ums.service.impl.UserServiceImpl;
import ums.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regist")
public class Controller extends HttpServlet{
    UserService service=new UserServiceImpl();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/regist.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name=req.getParameter("name");
        String pass=req.getParameter("pass");
        int age=Integer.valueOf(req.getParameter("age"));

        UserVo vo=new UserVo(name,pass,age);
        service.regist(vo);
        //简化处理，不考虑注册失败问题
        req.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(req, resp);
    }
}
