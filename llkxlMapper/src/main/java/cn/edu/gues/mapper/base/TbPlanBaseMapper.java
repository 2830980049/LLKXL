package cn.edu.gues.mapper.base;

import cn.edu.gues.pojo.TbPlan;

import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbPlanBaseMapper {

    int insertTbPlan(TbPlan object);

    int updateTbPlan(TbPlan object);

    int update(TbPlan.UpdateBuilder object);

    List<TbPlan> queryTbPlan(TbPlan object);

    TbPlan queryTbPlanLimit1(TbPlan object);

}