package cn.edu.gues.mapper.base;

import cn.edu.gues.pojo.TbMerge;

import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbMergeBaseMapper {

    int insertTbMerge(TbMerge object);

    int updateTbMerge(TbMerge object);

    int update(TbMerge.UpdateBuilder object);

    List<TbMerge> queryTbMerge(TbMerge object);

    TbMerge queryTbMergeLimit1(TbMerge object);

}