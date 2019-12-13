package cn.edu.gues.mapper.base;

import cn.edu.gues.pojo.TbPosition;

import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbPositionBaseMapper {

    int insertTbPosition(TbPosition object);

    int updateTbPosition(TbPosition object);

    int update(TbPosition.UpdateBuilder object);

    List<TbPosition> queryTbPosition(TbPosition object);

    TbPosition queryTbPositionLimit1(TbPosition object);

}