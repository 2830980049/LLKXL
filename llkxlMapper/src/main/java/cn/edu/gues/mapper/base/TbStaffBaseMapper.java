package cn.edu.gues.mapper.base;

import java.util.List;

import cn.edu.gues.pojo.TbStaff;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbStaffBaseMapper {
    /**
     * @return
     * @无条件插入
     */
    int insertTbStaff(TbStaff object);

    /**
     * @return
     * @更新
     */
    int updateTbStaff(TbStaff object);

    /**
     * @return
     * @按条件进行更新（按模糊名等）
     */
    int update(TbStaff.UpdateBuilder object);

    /**
     * @按条件查询 （按模糊名等）
     * @返回一个列表
     */
    List<TbStaff> queryTbStaff(TbStaff object);

    TbStaff queryTbDP(TbStaff tbStaff);

    /**
     * @param
     * @return
     */
    TbStaff queryTbStaffLimit1(TbStaff object);

    /**
     * @删除
     * @return
     */
    int deletes(String loginName);
}