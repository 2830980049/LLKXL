package cn.edu.gues.service;

import cn.edu.gues.mapper.TbMaterialMapper;
import cn.edu.gues.pojo.TbMaterial;
import cn.edu.gues.pojo.TbUnit;
import cn.edu.gues.pojo.Tbsupply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/18 18:24
 */
@Service
public class TbPlanService {
    @Autowired
    private TbMaterialMapper tbMaterialMapper;
    public List<TbMaterial> findNum() {
        return  tbMaterialMapper.queryTbMaterial(null);
    }

    public TbMaterial selectName(TbMaterial tbMaterial){
        return tbMaterialMapper.queryTbMaterialLimit1(tbMaterial);
    }

    public List<TbMaterial> findNums(TbMaterial tbMaterial) {
        return  tbMaterialMapper.queryTbMaterial(tbMaterial);
    }

    public List<TbUnit> FindAll(){
        return tbMaterialMapper.findalls(null);
    }

    public List<Tbsupply> findsupply(){
        return tbMaterialMapper.findsupply();
    }

}
