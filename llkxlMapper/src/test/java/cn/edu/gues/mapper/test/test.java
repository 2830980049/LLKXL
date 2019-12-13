package cn.edu.gues.mapper.test;

import cn.edu.gues.mapper.base.*;
import cn.edu.gues.pojo.TbStaff;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/11/14 13:21
 */
public class test {
    private InputStream in;
    private SqlSession session;
    private TbPlanBaseMapper tbPlanBaseMapper;
    private TbDepartmentBaseMapper tbDepartmentBaseMapper;
    private TbMaterialBaseMapper tbMaterialBaseMapper;
    private TbMergeBaseMapper tbMergeBaseMapper;
    private TbPositionBaseMapper tbPositionBaseMapper;
    private TbStaffBaseMapper tbStaffBaseMapper;

    @Before //用于在测试方法执行之前执行
    public void init() throws Exception {
        //1 读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        //3 使用工厂生产SqlSession对象
        session = factory.openSession();

        //4 使用SqlSession创建Dao接口的代理对象
        tbDepartmentBaseMapper = session.getMapper(TbDepartmentBaseMapper.class);
        tbPlanBaseMapper = session.getMapper(TbPlanBaseMapper.class);
        tbMaterialBaseMapper = session.getMapper(TbMaterialBaseMapper.class);
        tbPositionBaseMapper = session.getMapper(TbPositionBaseMapper.class);
        tbStaffBaseMapper = session.getMapper(TbStaffBaseMapper.class);
        tbMergeBaseMapper = session.getMapper(TbMergeBaseMapper.class);
    }

    @After//用于测试方法执行之后执行
    public void destory() throws Exception {
        //提交事务
        session.commit();
        session.close();
        in.close();
    }

    /**
     * 测试staff保存
     */
    @Test
    public void testSave() {
        //5 使用代理对象执行方法
        TbStaff staff = new TbStaff();
        staff.setLoginName("1003");
        staff.setPassword("123458");
        staff.setRealName("艾萨");
        staff.setDtNum("1001");
        staff.setPtNum("3");
        staff.setFtPhone("18085969523");
        staff.setCpMail("2830980149@qq.com");
        staff.setOtherMail("");
        staff.setQqNumber("12345678901");
        staff.setMbPhone("12345678904");
        //执行保存方法
        tbStaffBaseMapper.insertTbStaff(staff);
    }

    /**
     * 测试staff更新
     */
    @Test
    public void testUpdata() {
        //5 使用代理对象执行方法
        TbStaff staff = new TbStaff();
        staff.setLoginName("1008");
        staff.setPassword("123456");
        staff.setRealName("酒儿");
        staff.setDtNum("1004");
        staff.setPtNum("4");
        staff.setFtPhone("18085969524");
        staff.setCpMail("2830980144@qq.com");
        staff.setOtherMail("");
        staff.setQqNumber("18085969524");
        staff.setMbPhone("18085969524");
        //执行保存方法
        tbStaffBaseMapper.updateTbStaff(staff);
    }

    /**
     * 测试staff按条件更新
     */
    @Test
    public void testUpdataContidition() {
        //5 使用代理对象执行方法
        TbStaff staff = new TbStaff();
        staff.setPassword("123457");
//        staff.setRealName("苏苏");
//        staff.setDtNum("1001");
//        staff.setPtNum("1");
//        staff.setFtPhone("18085969525");
//        staff.setCpMail("2830980149@qq.com");
//        staff.setOtherMail("");
//        staff.setQqNumber("18085969523");
//        staff.setMbPhone("18085969523");
        //执行保存方法
        /**
         * @按密码进行更新
         * @return
         */
        TbStaff.UpdateBuilder updateBuilder = new TbStaff.UpdateBuilder();
        updateBuilder.set(staff);
        updateBuilder.where(TbStaff.ConditionBuild().passwordList("123456"));
        tbStaffBaseMapper.update(updateBuilder);

        /**
         * @按名字进行模糊更新
         * @return
         */
        /*updateBuilder.where(TbStaff.ConditionBuild().fuzzyRealName("酒"));
        tbStaffBaseMapper.update(updateBuilder);*/
    }

    /**
     * 测试staff按条件查询
     */
    @Test
    public void testSelectContidition() {
        //5 使用代理对象执行方法
        /**
         * @按账号 密码查询
         * @return
         */
        List<TbStaff> tbStaff1 = null;
        tbStaff1 =  tbStaffBaseMapper.queryTbStaff(null);
        System.out.println(tbStaff1);
        System.out.println(tbStaff1.size());
        /*TbStaff tbStaff = new TbStaff();
        tbStaff.setLoginName("1001");
        tbStaff.setPassword("1001");
        System.out.println(tbStaffBaseMapper.queryTbStaff(tbStaff));
        /**
         * @按密码进行查询
         * @输出多组数据
         */
        //System.out.println(tbStaffBaseMapper.queryTbStaff(TbStaff.QueryBuild().password("123456")));

        /**
         * @按名字进行模糊查询
         * @输出多组数据
         */
//        TbStaff staff = new TbStaff();
//        staff = tbStaffBaseMapper.queryTbStaff(TbStaff.QueryBuild().fuzzyRealName("酒"));
//        System.out.println(tbStaffBaseMapper.queryTbStaff(TbStaff.QueryBuild().fuzzyRealName("酒")));
    }

    /**
     * 测试staff按条件查询
     */
    @Test
    public void testSelectContiditions() {
        //5 使用代理对象执行方法

        /**
         * @按密码进行查询
         * @return
         */
        //System.out.println(tbStaffBaseMapper.queryTbStaff(TbStaff.QueryBuild().password("123457")));

        /**
         * @按名字进行模糊查询
         * @返回名字 多个
         */

        List<TbStaff> tbStaffs = tbStaffBaseMapper.queryTbStaff(TbStaff.QueryBuild().fuzzyRealName("酒"));
        for (TbStaff tbStaff1 : tbStaffs)
            System.out.println(tbStaff1.getRealName());
    }

    @Test
    public void deletes() {
        //5 使用代理对象执行方法


    }

}
