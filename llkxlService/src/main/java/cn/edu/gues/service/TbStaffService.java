package cn.edu.gues.service;

import cn.edu.gues.mapper.TbDepartmentMapper;
import cn.edu.gues.mapper.TbMaterialMapper;
import cn.edu.gues.mapper.TbMergeMapper;
import cn.edu.gues.mapper.TbStaffMapper;
import cn.edu.gues.pojo.TbPosition;
import cn.edu.gues.pojo.TbStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.spi.StateFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 * @date 2019/11/14 20:26
 */
@Service
public class TbStaffService {
    @Autowired
    private TbStaffMapper tbStaffMapper;
    private TbDepartmentMapper tbDepartmentMapper;
    private TbPosition tbPosition;
    private TbMaterialMapper tbMaterialMapper;

    public int insert(TbStaff pojo) {
        return tbStaffMapper.insertTbStaff(pojo);
    }

    public int update(TbStaff pojo) {
        return tbStaffMapper.updateTbStaff(pojo);
    }

//    public int delete(Long id){
//        if(id==null){
//            throw new RuntimeException("删除时必须指定id的值");
//        }
//        return tbStaffMapper.deleteTbStaff(id);
//    }

    public List<TbStaff> selectList() {
        return tbStaffMapper.queryTbStaff(null);
    }

    public List<TbStaff> selectList(TbStaff pojo) {
        return tbStaffMapper.queryTbStaff(pojo);
    }

    //登录数据获取
    public TbStaff selectOne(TbStaff pojo) {
        List<TbStaff> list = tbStaffMapper.queryTbStaff(pojo);
        if (list != null && list.size() > 1) {
            throw new RuntimeException("查询到多条数据");
        }
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return null;
        }
        //有且只有一条数据时返回
        return list.get(0);
    }
    /**
     * @插入数据
     * @return
     */
    public boolean insertOne(TbStaff tbStaff){
        int i = tbStaffMapper.insertTbStaff(tbStaff);
        if (!"".equals(tbStaff) && null != tbStaff) {
            if (i > 0)
                return true;
        }
            return false;
    }

    /**
     * @查询
     * @return
     */
    public TbStaff selectOnes(TbStaff tbStaff) {
        return  tbStaffMapper.queryTbDP(tbStaff);
    }

    /**
     * @以登录名查询信息
     * @return
     */
    public boolean checkNames(String log_name){

        if (!"".equals(log_name) && null != log_name) {
            List<TbStaff> tbStaff1 = null;
            tbStaff1 = tbStaffMapper.queryTbStaff(TbStaff.QueryBuild().loginName(log_name));
            if (tbStaff1.size() > 0) {
                return true;
            }
            else return false;
        }
        return false;
    }

    /**
     * @查询所有员工信息
     * @return
     */
    public List<TbStaff> queryStaffs(TbStaff tbStaff){
        return  tbStaffMapper.queryTbStaff(tbStaff);
    }

    /**
     * @更新员工信息
     * @return
     */
    public boolean updatastaff(TbStaff tbStaff){
        TbStaff.UpdateBuilder updateBuilder = new TbStaff.UpdateBuilder();
        updateBuilder.set(tbStaff);
        updateBuilder.where(TbStaff.ConditionBuild().loginNameList(tbStaff.getLoginName()));
        int i = tbStaffMapper.update(updateBuilder);
        //int i = tbStaffMapper.update(tbStaff);
        if(null != tbStaff && !"".equals(tbStaff)) {
            if (i > 0)
                return true;
        }
            return false;
    }

    /**
     * @删除员工信息
     * @return
     */
    public boolean deletes(String name){
        int i = tbStaffMapper.deletes(name);
        //int i = tbStaffMapper.update(tbStaff);
        if(null != name && !"".equals(name)) {
            if (i > 0)
                return true;
        }
        return false;
    }

}
