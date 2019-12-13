package cn.edu.gues.controller;

import cn.edu.gues.pojo.TbMaterial;
import cn.edu.gues.pojo.TbUnit;
import cn.edu.gues.pojo.Tbsupply;
import cn.edu.gues.service.TbPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/18 18:17
 */
@Controller
@RequestMapping("/add")
public class PlanController {
    @Autowired
    TbPlanService tbPlanService;

    @RequestMapping("/addNum")
    public ModelAndView addNum()throws Exception{
        //查询所有分类并传数据到jsp页面去
        List<TbMaterial> mr_cf_num = tbPlanService.findNum();
        ModelAndView modelAndView = new ModelAndView();
        List<TbUnit> tbUnits = tbPlanService.FindAll();
        //System.out.println(tbUnits);
        modelAndView.addObject("mr_cf_nums", mr_cf_num);
        modelAndView.addObject("tbUnits", tbUnits);
        modelAndView.setViewName("demandplaner/yearplan");
        return modelAndView;
    }

    @RequestMapping("/addName")
    public @ResponseBody Map<String,Object> addName(String mr_cf_num, String mr_num, HttpServletResponse response )throws Exception{
        TbMaterial tbMaterial = new TbMaterial();
        tbMaterial.setMrCfNum(mr_cf_num);
        tbMaterial.setMrNum(mr_num);
        TbMaterial tbMaterials = tbPlanService.selectName(tbMaterial);
        TbMaterial tbMaterial12 = new TbMaterial();
        tbMaterial12.setMrCfName(tbMaterials.getMrCfName());
        //System.out.println(tbMaterial12);
        List<TbMaterial> tbMaterial2 = null;
        if(mr_num == null)
            tbMaterial2 = tbPlanService.findNums(tbMaterial12);
        System.out.println(tbMaterials);
        Map<String,Object> jsonMap = new HashMap<String, Object>();
        List list = null;
        list = new ArrayList();
        Map<String,String> taskMap=new HashMap<String,String>();
        if(mr_num != null){
             taskMap.put("name", tbMaterials.getMrName());
         }
        if(mr_cf_num != null) {
            for (TbMaterial tbMaterial1 : tbMaterial2) {
                Map<String,String> taskMaps=new HashMap<String,String>();
                taskMaps.put("name", tbMaterials.getMrCfName());
                taskMaps.put("id", tbMaterial1.getMrNum());
                list.add(taskMaps);
            }
        }
        if(mr_num != null)
            list.add(taskMap);
      jsonMap.put("tasks", list);
      return jsonMap;
    }

    @RequestMapping("/updataTime")
    public @ResponseBody Map<String,Object> updataTime(String need_month)throws Exception{
        Map<String,Object> jsonMap = new HashMap<String, Object>();
        List list = null;
        list = new ArrayList();
        Map<String,String> taskMap=new HashMap<String,String>();
        String time = new String();
        time = need_month;
        String times = new String();
        int cnt = 0;
        int len = time.length();
        for(int i = 0; i < len; i++){
            if(time.charAt(i) != '-')
                times += time.charAt(i);
            else cnt++;
            if(cnt == 2)break;
        }
        System.out.println(times);
        taskMap.put("time", times);
        list.add(taskMap);
        jsonMap.put("tasks", list);
        return jsonMap;
    }

}
