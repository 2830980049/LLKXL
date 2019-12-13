package cn.edu.gues.servlet;

import cn.edu.gues.pojo.TbStaff;
import cn.edu.gues.service.TbStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/17 20:50
 */
@Controller

@WebServlet(name = "querystaffs",value = "/querystaffs.do",loadOnStartup=1)
public class queryStaff extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Autowired
    TbStaffService tbStaffService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("11");
        List<TbStaff> list = tbStaffService.queryStaffs(null);
        session.setAttribute("list", list);
        response.sendRedirect(request.getContextPath()+"/updata.do");
    }
}
