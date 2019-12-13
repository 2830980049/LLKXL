package cn.edu.gues.controller;

import cn.edu.gues.pojo.TbMaterial;
import cn.edu.gues.pojo.TbStaff;
import cn.edu.gues.pojo.TbUnit;
import cn.edu.gues.pojo.Tbsupply;
import cn.edu.gues.service.TbPlanService;
import cn.edu.gues.service.TbStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 * @date 2019/11/14 20:17
 */
@Controller
@RequestMapping("/")
public class IndexController {
    //依赖注入
    @Autowired
    TbStaffService tbStaffService;

    @Autowired
    TbPlanService tbPlanService;

    //GET方式时回到登录界面
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/updata.do", method = RequestMethod.GET)
    public ModelAndView updatas() {
        /*ModelAndView mav =  new ModelAndView("admin/Updata");
        mav.addObject("list",tbStaff);*/
        return new ModelAndView("admin/Staff-function");
    }

   /* @RequestMapping(value = "/updata.do", method = RequestMethod.POST)
    public ModelAndView updata() {
        /*ModelAndView mav =  new ModelAndView("admin/Updata");
        mav.addObject("list",tbStaff);
        return new ModelAndView("admin/Updata");
    }*/

    //POST使用@RequestParam接受账号密码
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView loginSubmit(@RequestParam String loginname, @RequestParam String password, HttpServletRequest request) {
        TbStaff tbStaff = new TbStaff();
        tbStaff = TbStaff.QueryBuild().password(password).loginName(loginname);
//        tbStaff.setLoginName(loginname);
//        tbStaff.setPassword(password);
        //根据账户密码查询数据
        TbStaff tbStaffTmp = tbStaffService.selectOne(tbStaff);
        if (tbStaffTmp != null) {
            request.getSession().setAttribute("tbstaff", tbStaffTmp);
            switch (tbStaffTmp.getPtNum()) {
                case "0":
                    //管理员
                    return new ModelAndView("admin/Start");
                case "1":
                    //需求计划员
                    List<TbMaterial> mr_cf_num = tbPlanService.findNum();
                    List<TbUnit> tbUnits = tbPlanService.FindAll();
                    List<Tbsupply> tbsupplies = tbPlanService.findsupply();
                    ModelAndView modelAndView = new ModelAndView();
                    modelAndView.addObject("mr_cf_nums", mr_cf_num);
                    modelAndView.addObject("tbUnits", tbUnits);
                    modelAndView.addObject("tbsupplies", tbsupplies);
                    modelAndView.setViewName("demandplaner/yearplan");
                    return modelAndView;
                case "2":
                    //需求审批员
                    return new ModelAndView("demandplanapprovaler/demandplanningapproval");
                case "3":
                    //采购计划员
                    return new ModelAndView("purechaseplaner/materialsupplyprogrammaintenanceInterface");
                case "4":
                    //采购审批员
                    return new ModelAndView("purechaseplanapprovaler/purchaseplanapprovalInterface");
                default:
                    return new ModelAndView("login", "msg", "用户名或密码错误");
            }
        } else {
            //回到登录页面
            return new ModelAndView("login", "msg", "用户名或密码错误");
        }
    }

}
