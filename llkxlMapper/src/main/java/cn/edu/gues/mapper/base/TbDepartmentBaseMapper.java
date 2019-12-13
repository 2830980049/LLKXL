package cn.edu.gues.mapper.base;

import cn.edu.gues.pojo.TbDepartment;

import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbDepartmentBaseMapper {

    int insertTbDepartment(TbDepartment object);

    int updateTbDepartment(TbDepartment object);

    int update(TbDepartment.UpdateBuilder object);

    List<TbDepartment> queryTbDepartment(TbDepartment object);


    List<TbDepartment> queryTbDepartments();

    TbDepartment queryTbDepartmentLimit1(TbDepartment object);

}