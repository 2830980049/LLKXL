package cn.edu.gues.controller;

import cn.edu.gues.pojo.TbStaff;
import cn.edu.gues.service.TbStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/16 14:07
 */
@Controller
@RequestMapping("/admin")
public class AdminControoler {
    @Autowired
    TbStaffService tbStaffService;

    //GET方式时回到登录界面
   /* public void CheckName(@RequestParam String txtNames,HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String txtName = req.getParameter("txtName");
        TbStaff tbStaff = new TbStaff();
        tbStaff.setLoginName(txtName);
        boolean b = tbStaffService.checkNames(tbStaff);
        resp.getWriter().write(b + "");
    }*/

    /**
     * @当为GET时跳转到employeemess界面
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {
        return new ModelAndView("admin/employeemess");
    }

    /**
     * @当为POST时完成查询和插入操作后带参数跳转到employeemess界面
     * @return
     */
    @RequestMapping(value = "/admin.do", method = RequestMethod.POST)
    public ModelAndView AdminSubmit(@RequestParam String txtName, @RequestParam String qq,@RequestParam String trueName,@RequestParam String password,
                                    @RequestParam String ptNum, @RequestParam String dtNum,@RequestParam String hardPhone,@RequestParam String phone,
                                    @RequestParam String companyEmail, @RequestParam String otherEmail,HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        TbStaff tbStaffs = new TbStaff();
        tbStaffs.setPt_name(ptNum);
        tbStaffs.setDt_name(dtNum);
        TbStaff tbStaff1 = tbStaffService.selectOnes(tbStaffs);
        tbStaffs.setPassword(password);
        tbStaffs.setRealName(trueName);
        tbStaffs.setLoginName(txtName);
        tbStaffs.setQqNumber(qq);
        tbStaffs.setCpMail(companyEmail);
        tbStaffs.setMbPhone(phone);
        tbStaffs.setOtherMail(otherEmail);
        tbStaffs.setFtPhone(hardPhone);
        tbStaffs.setPtNum(tbStaff1.getPtNum());
        tbStaffs.setDtNum(tbStaff1.getDtNum());
        boolean b =  tbStaffService.insertOne(tbStaffs);
        ModelAndView mav=new ModelAndView("admin/employeemess");
        if (b) {
            mav.addObject("flag","1");
            return mav;
        } else {
            mav.addObject("flag","2");
            return mav;
        }
    }

    /**
     * @当为GET时带参数跳转到updata界面
     * @return
     */
    @RequestMapping(value = "/updatas", method = RequestMethod.GET)
    public ModelAndView updatas(@RequestParam String loginName,HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ModelAndView mav =  new ModelAndView("admin/updata");
        mav.addObject("loginName",loginName);
        return mav;
    }

    /**
     * @当为POST时完成查询和更新操作后带参数跳转到Start界面
     * @return
     */
    @RequestMapping(value = "/updatanew.do", method = RequestMethod.POST)
    public ModelAndView updatanew(@RequestParam String loginName, @RequestParam String qq,@RequestParam String trueName,@RequestParam String password,
                                    @RequestParam String ptNum, @RequestParam String dtNum,@RequestParam String hardPhone,@RequestParam String phone,
                                    @RequestParam String companyEmail, @RequestParam String otherEmail,HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        TbStaff tbStaffs = new TbStaff();
        tbStaffs.setPt_name(ptNum);
        tbStaffs.setDt_name(dtNum);
        TbStaff tbStaff1 = tbStaffService.selectOnes(tbStaffs);
        tbStaffs.setPassword(password);
        tbStaffs.setRealName(trueName);
        tbStaffs.setLoginName(loginName);
        tbStaffs.setQqNumber(qq);
        tbStaffs.setCpMail(companyEmail);
        tbStaffs.setMbPhone(phone);
        tbStaffs.setOtherMail(otherEmail);
        tbStaffs.setFtPhone(hardPhone);
        tbStaffs.setPtNum(tbStaff1.getPtNum());
        tbStaffs.setDtNum(tbStaff1.getDtNum());
        System.out.println("123123");
        boolean b =  tbStaffService.updatastaff(tbStaffs);
        ModelAndView mav=new ModelAndView("admin/Start");
        if (b) {
            mav.addObject("flag","1");
            return mav;
        } else {
            mav.addObject("flag","2");
            return mav;
        }
    }

    /**
     * @当为GET时带参数跳转到Start界面
     * @return
     */
    @RequestMapping(value = "/deletes", method = RequestMethod.GET)
    public ModelAndView deletes(@RequestParam String loginName,HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        boolean b =  tbStaffService.deletes(loginName);
        ModelAndView mav =  new ModelAndView("admin/Start");
        if (b) {
            mav.addObject("flag","3");
            return mav;
        } else {
            mav.addObject("flag","4");
            return mav;
        }
    }


}
