package cn.edu.gues.servlet;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/16 21:59
 */
import cn.edu.gues.pojo.TbStaff;
import cn.edu.gues.service.TbStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.management.Query;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 17-7-20.
 * This Servlet suppport register page.
 */

@Controller
@RequestMapping("/checkName")

@WebServlet(name = "checkName",value = "/checkName.do",loadOnStartup=1)
    public class checkName extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Autowired
    TbStaffService tbStaffService;
    //GET方式时回到登录界面
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            String txtName = request.getParameter("txtName");
            System.out.println(txtName);
            boolean b = tbStaffService.checkNames(txtName);
            //System.out.println(b);
            response.getWriter().write(b + "");
        }
}
