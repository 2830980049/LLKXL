package cn.edu.gues.mapper.base;

import cn.edu.gues.pojo.TbMaterial;
import cn.edu.gues.pojo.TbUnit;
import cn.edu.gues.pojo.Tbsupply;

import java.util.List;

/**
 * @author ChenKai
 * @version 1.0
 */
public interface TbMaterialBaseMapper {

    int insertTbMaterial(TbMaterial object);

    int updateTbMaterial(TbMaterial object);

    int update(TbMaterial.UpdateBuilder object);

    List<TbMaterial> queryTbMaterial(TbMaterial object);

    TbMaterial queryTbMaterialLimit1(TbMaterial object);

    List<TbUnit> findalls(TbUnit tbUnit);

    List<Tbsupply> findsupply();
}