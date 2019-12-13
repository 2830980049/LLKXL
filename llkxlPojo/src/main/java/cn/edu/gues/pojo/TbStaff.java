package cn.edu.gues.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ChenKai
 * @version 1.0
 */
public class TbStaff implements Serializable {

    private static final long serialVersionUID = 1573699608916L;


    /**
     * 主键
     * 登录名
     * isNullAble:0
     */
    private String loginName;

    /**
     * 密码
     * isNullAble:0
     */
    private String password;

    /**
     * 真实姓名
     * isNullAble:0
     */
    private String realName;

    /**
     * 部门编号
     * isNullAble:0
     */
    private String dtNum;

    /**
     * 职位编号
     * isNullAble:0
     */
    private String ptNum;

    /**
     * 固定电话
     * isNullAble:1
     */
    private String ftPhone;

    /**
     * 公司邮箱
     * isNullAble:0
     */
    private String cpMail;

    /**
     * 其他邮箱
     * isNullAble:1
     */
    private String otherMail;

    /**
     * qq
     * isNullAble:1
     */
    private String qqNumber;

    /**
     * 手机
     * isNullAble:1
     */
    private String mbPhone;

    private String dt_name;
    private String pt_name;

    public String getDt_name() {
        return dt_name;
    }

    public void setDt_name(String dt_name) {
        this.dt_name = dt_name;
    }

    public String getPt_name() {
        return pt_name;
    }

    public void setPt_name(String pt_name) {
        this.pt_name = pt_name;
    }

    public static Builder Build() {
        return new Builder();
    }

    public static ConditionBuilder ConditionBuild() {
        return new ConditionBuilder();
    }

    public static UpdateBuilder UpdateBuild() {
        return new UpdateBuilder();
    }

    public static QueryBuilder QueryBuild() {
        return new QueryBuilder();
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDtNum() {
        return this.dtNum;
    }

    public void setDtNum(String dtNum) {
        this.dtNum = dtNum;
    }

    public String getPtNum() {
        return this.ptNum;
    }

    public void setPtNum(String ptNum) {
        this.ptNum = ptNum;
    }

    public String getFtPhone() {
        return this.ftPhone;
    }

    public void setFtPhone(String ftPhone) {
        this.ftPhone = ftPhone;
    }

    public String getCpMail() {
        return this.cpMail;
    }

    public void setCpMail(String cpMail) {
        this.cpMail = cpMail;
    }

    public String getOtherMail() {
        return this.otherMail;
    }

    public void setOtherMail(String otherMail) {
        this.otherMail = otherMail;
    }

    public String getQqNumber() {
        return this.qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getMbPhone() {
        return this.mbPhone;
    }

    public void setMbPhone(String mbPhone) {
        this.mbPhone = mbPhone;
    }

    @Override
    public String toString() {
        return "TbStaff{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", dtNum='" + dtNum + '\'' +
                ", ptNum='" + ptNum + '\'' +
                ", ftPhone='" + ftPhone + '\'' +
                ", cpMail='" + cpMail + '\'' +
                ", otherMail='" + otherMail + '\'' +
                ", qqNumber='" + qqNumber + '\'' +
                ", mbPhone='" + mbPhone + '\'' +
                ", dt_name='" + dt_name + '\'' +
                ", pt_name='" + pt_name + '\'' +
                '}';
    }

    public static class UpdateBuilder {

        private TbStaff set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbStaff set) {
            this.set = set;
            return this;
        }

        public TbStaff getSet() {
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where) {
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere() {
            return this.where;
        }

        public UpdateBuilder build() {
            return this;
        }
    }

    public static class QueryBuilder extends TbStaff {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;
        private List<String> loginNameList;
        private List<String> fuzzyLoginName;
        private List<String> rightFuzzyLoginName;
        private List<String> passwordList;
        private List<String> fuzzyPassword;
        private List<String> rightFuzzyPassword;
        private List<String> realNameList;
        private List<String> fuzzyRealName;
        private List<String> rightFuzzyRealName;
        private List<String> dtNumList;
        private List<String> fuzzyDtNum;
        private List<String> rightFuzzyDtNum;
        private List<String> ptNumList;
        private List<String> fuzzyPtNum;
        private List<String> rightFuzzyPtNum;
        private List<String> ftPhoneList;
        private List<String> fuzzyFtPhone;
        private List<String> rightFuzzyFtPhone;
        private List<String> cpMailList;
        private List<String> fuzzyCpMail;
        private List<String> rightFuzzyCpMail;
        private List<String> otherMailList;
        private List<String> fuzzyOtherMail;
        private List<String> rightFuzzyOtherMail;
        private List<String> qqNumberList;
        private List<String> fuzzyQqNumber;
        private List<String> rightFuzzyQqNumber;
        private List<String> mbPhoneList;
        private List<String> fuzzyMbPhone;
        private List<String> rightFuzzyMbPhone;

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        public List<String> getLoginNameList() {
            return this.loginNameList;
        }

        public List<String> getFuzzyLoginName() {
            return this.fuzzyLoginName;
        }

        public List<String> getRightFuzzyLoginName() {
            return this.rightFuzzyLoginName;
        }

        public List<String> getPasswordList() {
            return this.passwordList;
        }

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        public List<String> getRealNameList() {
            return this.realNameList;
        }

        public List<String> getFuzzyRealName() {
            return this.fuzzyRealName;
        }

        public List<String> getRightFuzzyRealName() {
            return this.rightFuzzyRealName;
        }

        public List<String> getDtNumList() {
            return this.dtNumList;
        }

        public List<String> getFuzzyDtNum() {
            return this.fuzzyDtNum;
        }

        public List<String> getRightFuzzyDtNum() {
            return this.rightFuzzyDtNum;
        }

        public List<String> getPtNumList() {
            return this.ptNumList;
        }

        public List<String> getFuzzyPtNum() {
            return this.fuzzyPtNum;
        }

        public List<String> getRightFuzzyPtNum() {
            return this.rightFuzzyPtNum;
        }

        public List<String> getFtPhoneList() {
            return this.ftPhoneList;
        }

        public List<String> getFuzzyFtPhone() {
            return this.fuzzyFtPhone;
        }

        public List<String> getRightFuzzyFtPhone() {
            return this.rightFuzzyFtPhone;
        }

        public List<String> getCpMailList() {
            return this.cpMailList;
        }

        public List<String> getFuzzyCpMail() {
            return this.fuzzyCpMail;
        }

        public List<String> getRightFuzzyCpMail() {
            return this.rightFuzzyCpMail;
        }

        public List<String> getOtherMailList() {
            return this.otherMailList;
        }

        public List<String> getFuzzyOtherMail() {
            return this.fuzzyOtherMail;
        }

        public List<String> getRightFuzzyOtherMail() {
            return this.rightFuzzyOtherMail;
        }

        public List<String> getQqNumberList() {
            return this.qqNumberList;
        }

        public List<String> getFuzzyQqNumber() {
            return this.fuzzyQqNumber;
        }

        public List<String> getRightFuzzyQqNumber() {
            return this.rightFuzzyQqNumber;
        }

        public List<String> getMbPhoneList() {
            return this.mbPhoneList;
        }

        public List<String> getFuzzyMbPhone() {
            return this.fuzzyMbPhone;
        }

        public List<String> getRightFuzzyMbPhone() {
            return this.rightFuzzyMbPhone;
        }

        public QueryBuilder fuzzyLoginName(List<String> fuzzyLoginName) {
            this.fuzzyLoginName = fuzzyLoginName;
            return this;
        }

        public QueryBuilder fuzzyLoginName(String... fuzzyLoginName) {
            this.fuzzyLoginName = solveNullList(fuzzyLoginName);
            return this;
        }

        public QueryBuilder rightFuzzyLoginName(List<String> rightFuzzyLoginName) {
            this.rightFuzzyLoginName = rightFuzzyLoginName;
            return this;
        }

        public QueryBuilder rightFuzzyLoginName(String... rightFuzzyLoginName) {
            this.rightFuzzyLoginName = solveNullList(rightFuzzyLoginName);
            return this;
        }

        public QueryBuilder loginName(String loginName) {
            setLoginName(loginName);
            return this;
        }

        public QueryBuilder loginNameList(String... loginName) {
            this.loginNameList = solveNullList(loginName);
            return this;
        }

        public QueryBuilder loginNameList(List<String> loginName) {
            this.loginNameList = loginName;
            return this;
        }

        public QueryBuilder fetchLoginName() {
            setFetchFields("fetchFields", "loginName");
            return this;
        }

        public QueryBuilder excludeLoginName() {
            setFetchFields("excludeFields", "loginName");
            return this;
        }

        public QueryBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password) {
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword() {
            setFetchFields("fetchFields", "password");
            return this;
        }

        public QueryBuilder excludePassword() {
            setFetchFields("excludeFields", "password");
            return this;
        }

        public QueryBuilder fuzzyRealName(List<String> fuzzyRealName) {
            this.fuzzyRealName = fuzzyRealName;
            return this;
        }

        public QueryBuilder fuzzyRealName(String... fuzzyRealName) {
            this.fuzzyRealName = solveNullList(fuzzyRealName);
            return this;
        }

        public QueryBuilder rightFuzzyRealName(List<String> rightFuzzyRealName) {
            this.rightFuzzyRealName = rightFuzzyRealName;
            return this;
        }

        public QueryBuilder rightFuzzyRealName(String... rightFuzzyRealName) {
            this.rightFuzzyRealName = solveNullList(rightFuzzyRealName);
            return this;
        }

        public QueryBuilder realName(String realName) {
            setRealName(realName);
            return this;
        }

        public QueryBuilder realNameList(String... realName) {
            this.realNameList = solveNullList(realName);
            return this;
        }

        public QueryBuilder realNameList(List<String> realName) {
            this.realNameList = realName;
            return this;
        }

        public QueryBuilder fetchRealName() {
            setFetchFields("fetchFields", "realName");
            return this;
        }

        public QueryBuilder excludeRealName() {
            setFetchFields("excludeFields", "realName");
            return this;
        }

        public QueryBuilder fuzzyDtNum(List<String> fuzzyDtNum) {
            this.fuzzyDtNum = fuzzyDtNum;
            return this;
        }

        public QueryBuilder fuzzyDtNum(String... fuzzyDtNum) {
            this.fuzzyDtNum = solveNullList(fuzzyDtNum);
            return this;
        }

        public QueryBuilder rightFuzzyDtNum(List<String> rightFuzzyDtNum) {
            this.rightFuzzyDtNum = rightFuzzyDtNum;
            return this;
        }

        public QueryBuilder rightFuzzyDtNum(String... rightFuzzyDtNum) {
            this.rightFuzzyDtNum = solveNullList(rightFuzzyDtNum);
            return this;
        }

        public QueryBuilder dtNum(String dtNum) {
            setDtNum(dtNum);
            return this;
        }

        public QueryBuilder dtNumList(String... dtNum) {
            this.dtNumList = solveNullList(dtNum);
            return this;
        }

        public QueryBuilder dtNumList(List<String> dtNum) {
            this.dtNumList = dtNum;
            return this;
        }

        public QueryBuilder fetchDtNum() {
            setFetchFields("fetchFields", "dtNum");
            return this;
        }

        public QueryBuilder excludeDtNum() {
            setFetchFields("excludeFields", "dtNum");
            return this;
        }

        public QueryBuilder fuzzyPtNum(List<String> fuzzyPtNum) {
            this.fuzzyPtNum = fuzzyPtNum;
            return this;
        }

        public QueryBuilder fuzzyPtNum(String... fuzzyPtNum) {
            this.fuzzyPtNum = solveNullList(fuzzyPtNum);
            return this;
        }

        public QueryBuilder rightFuzzyPtNum(List<String> rightFuzzyPtNum) {
            this.rightFuzzyPtNum = rightFuzzyPtNum;
            return this;
        }

        public QueryBuilder rightFuzzyPtNum(String... rightFuzzyPtNum) {
            this.rightFuzzyPtNum = solveNullList(rightFuzzyPtNum);
            return this;
        }

        public QueryBuilder ptNum(String ptNum) {
            setPtNum(ptNum);
            return this;
        }

        public QueryBuilder ptNumList(String... ptNum) {
            this.ptNumList = solveNullList(ptNum);
            return this;
        }

        public QueryBuilder ptNumList(List<String> ptNum) {
            this.ptNumList = ptNum;
            return this;
        }

        public QueryBuilder fetchPtNum() {
            setFetchFields("fetchFields", "ptNum");
            return this;
        }

        public QueryBuilder excludePtNum() {
            setFetchFields("excludeFields", "ptNum");
            return this;
        }

        public QueryBuilder fuzzyFtPhone(List<String> fuzzyFtPhone) {
            this.fuzzyFtPhone = fuzzyFtPhone;
            return this;
        }

        public QueryBuilder fuzzyFtPhone(String... fuzzyFtPhone) {
            this.fuzzyFtPhone = solveNullList(fuzzyFtPhone);
            return this;
        }

        public QueryBuilder rightFuzzyFtPhone(List<String> rightFuzzyFtPhone) {
            this.rightFuzzyFtPhone = rightFuzzyFtPhone;
            return this;
        }

        public QueryBuilder rightFuzzyFtPhone(String... rightFuzzyFtPhone) {
            this.rightFuzzyFtPhone = solveNullList(rightFuzzyFtPhone);
            return this;
        }

        public QueryBuilder ftPhone(String ftPhone) {
            setFtPhone(ftPhone);
            return this;
        }

        public QueryBuilder ftPhoneList(String... ftPhone) {
            this.ftPhoneList = solveNullList(ftPhone);
            return this;
        }

        public QueryBuilder ftPhoneList(List<String> ftPhone) {
            this.ftPhoneList = ftPhone;
            return this;
        }

        public QueryBuilder fetchFtPhone() {
            setFetchFields("fetchFields", "ftPhone");
            return this;
        }

        public QueryBuilder excludeFtPhone() {
            setFetchFields("excludeFields", "ftPhone");
            return this;
        }

        public QueryBuilder fuzzyCpMail(List<String> fuzzyCpMail) {
            this.fuzzyCpMail = fuzzyCpMail;
            return this;
        }

        public QueryBuilder fuzzyCpMail(String... fuzzyCpMail) {
            this.fuzzyCpMail = solveNullList(fuzzyCpMail);
            return this;
        }

        public QueryBuilder rightFuzzyCpMail(List<String> rightFuzzyCpMail) {
            this.rightFuzzyCpMail = rightFuzzyCpMail;
            return this;
        }

        public QueryBuilder rightFuzzyCpMail(String... rightFuzzyCpMail) {
            this.rightFuzzyCpMail = solveNullList(rightFuzzyCpMail);
            return this;
        }

        public QueryBuilder cpMail(String cpMail) {
            setCpMail(cpMail);
            return this;
        }

        public QueryBuilder cpMailList(String... cpMail) {
            this.cpMailList = solveNullList(cpMail);
            return this;
        }

        public QueryBuilder cpMailList(List<String> cpMail) {
            this.cpMailList = cpMail;
            return this;
        }

        public QueryBuilder fetchCpMail() {
            setFetchFields("fetchFields", "cpMail");
            return this;
        }

        public QueryBuilder excludeCpMail() {
            setFetchFields("excludeFields", "cpMail");
            return this;
        }

        public QueryBuilder fuzzyOtherMail(List<String> fuzzyOtherMail) {
            this.fuzzyOtherMail = fuzzyOtherMail;
            return this;
        }

        public QueryBuilder fuzzyOtherMail(String... fuzzyOtherMail) {
            this.fuzzyOtherMail = solveNullList(fuzzyOtherMail);
            return this;
        }

        public QueryBuilder rightFuzzyOtherMail(List<String> rightFuzzyOtherMail) {
            this.rightFuzzyOtherMail = rightFuzzyOtherMail;
            return this;
        }

        public QueryBuilder rightFuzzyOtherMail(String... rightFuzzyOtherMail) {
            this.rightFuzzyOtherMail = solveNullList(rightFuzzyOtherMail);
            return this;
        }

        public QueryBuilder otherMail(String otherMail) {
            setOtherMail(otherMail);
            return this;
        }

        public QueryBuilder otherMailList(String... otherMail) {
            this.otherMailList = solveNullList(otherMail);
            return this;
        }

        public QueryBuilder otherMailList(List<String> otherMail) {
            this.otherMailList = otherMail;
            return this;
        }

        public QueryBuilder fetchOtherMail() {
            setFetchFields("fetchFields", "otherMail");
            return this;
        }

        public QueryBuilder excludeOtherMail() {
            setFetchFields("excludeFields", "otherMail");
            return this;
        }

        public QueryBuilder fuzzyQqNumber(List<String> fuzzyQqNumber) {
            this.fuzzyQqNumber = fuzzyQqNumber;
            return this;
        }

        public QueryBuilder fuzzyQqNumber(String... fuzzyQqNumber) {
            this.fuzzyQqNumber = solveNullList(fuzzyQqNumber);
            return this;
        }

        public QueryBuilder rightFuzzyQqNumber(List<String> rightFuzzyQqNumber) {
            this.rightFuzzyQqNumber = rightFuzzyQqNumber;
            return this;
        }

        public QueryBuilder rightFuzzyQqNumber(String... rightFuzzyQqNumber) {
            this.rightFuzzyQqNumber = solveNullList(rightFuzzyQqNumber);
            return this;
        }

        public QueryBuilder qqNumber(String qqNumber) {
            setQqNumber(qqNumber);
            return this;
        }

        public QueryBuilder qqNumberList(String... qqNumber) {
            this.qqNumberList = solveNullList(qqNumber);
            return this;
        }

        public QueryBuilder qqNumberList(List<String> qqNumber) {
            this.qqNumberList = qqNumber;
            return this;
        }

        public QueryBuilder fetchQqNumber() {
            setFetchFields("fetchFields", "qqNumber");
            return this;
        }

        public QueryBuilder excludeQqNumber() {
            setFetchFields("excludeFields", "qqNumber");
            return this;
        }

        public QueryBuilder fuzzyMbPhone(List<String> fuzzyMbPhone) {
            this.fuzzyMbPhone = fuzzyMbPhone;
            return this;
        }

        public QueryBuilder fuzzyMbPhone(String... fuzzyMbPhone) {
            this.fuzzyMbPhone = solveNullList(fuzzyMbPhone);
            return this;
        }

        public QueryBuilder rightFuzzyMbPhone(List<String> rightFuzzyMbPhone) {
            this.rightFuzzyMbPhone = rightFuzzyMbPhone;
            return this;
        }

        public QueryBuilder rightFuzzyMbPhone(String... rightFuzzyMbPhone) {
            this.rightFuzzyMbPhone = solveNullList(rightFuzzyMbPhone);
            return this;
        }

        public QueryBuilder mbPhone(String mbPhone) {
            setMbPhone(mbPhone);
            return this;
        }

        public QueryBuilder mbPhoneList(String... mbPhone) {
            this.mbPhoneList = solveNullList(mbPhone);
            return this;
        }

        public QueryBuilder mbPhoneList(List<String> mbPhone) {
            this.mbPhoneList = mbPhone;
            return this;
        }

        public QueryBuilder fetchMbPhone() {
            setFetchFields("fetchFields", "mbPhone");
            return this;
        }

        public QueryBuilder excludeMbPhone() {
            setFetchFields("excludeFields", "mbPhone");
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll() {
            this.fetchFields.put("AllFields", true);
            return this;
        }

        public QueryBuilder addField(String... fields) {
            List<String> list = new ArrayList<>();
            if (fields != null) {
                for (String field : fields) {
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields", list);
            return this;
        }

        @SuppressWarnings("unchecked")
        private void setFetchFields(String key, String val) {
            Map<String, Boolean> fields = (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null) {
                fields = new HashMap<>();
            }
            fields.put(val, true);
            this.fetchFields.put(key, fields);
        }

        public TbStaff build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<String> loginNameList;
        private List<String> fuzzyLoginName;
        private List<String> rightFuzzyLoginName;
        private List<String> passwordList;
        private List<String> fuzzyPassword;
        private List<String> rightFuzzyPassword;
        private List<String> realNameList;
        private List<String> fuzzyRealName;
        private List<String> rightFuzzyRealName;
        private List<String> dtNumList;
        private List<String> fuzzyDtNum;
        private List<String> rightFuzzyDtNum;
        private List<String> ptNumList;
        private List<String> fuzzyPtNum;
        private List<String> rightFuzzyPtNum;
        private List<String> ftPhoneList;
        private List<String> fuzzyFtPhone;
        private List<String> rightFuzzyFtPhone;
        private List<String> cpMailList;
        private List<String> fuzzyCpMail;
        private List<String> rightFuzzyCpMail;
        private List<String> otherMailList;
        private List<String> fuzzyOtherMail;
        private List<String> rightFuzzyOtherMail;
        private List<String> qqNumberList;
        private List<String> fuzzyQqNumber;
        private List<String> rightFuzzyQqNumber;
        private List<String> mbPhoneList;
        private List<String> fuzzyMbPhone;
        private List<String> rightFuzzyMbPhone;

        public List<String> getLoginNameList() {
            return this.loginNameList;
        }

        public List<String> getFuzzyLoginName() {
            return this.fuzzyLoginName;
        }

        public List<String> getRightFuzzyLoginName() {
            return this.rightFuzzyLoginName;
        }

        public List<String> getPasswordList() {
            return this.passwordList;
        }

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        public List<String> getRealNameList() {
            return this.realNameList;
        }

        public List<String> getFuzzyRealName() {
            return this.fuzzyRealName;
        }

        public List<String> getRightFuzzyRealName() {
            return this.rightFuzzyRealName;
        }

        public List<String> getDtNumList() {
            return this.dtNumList;
        }

        public List<String> getFuzzyDtNum() {
            return this.fuzzyDtNum;
        }

        public List<String> getRightFuzzyDtNum() {
            return this.rightFuzzyDtNum;
        }

        public List<String> getPtNumList() {
            return this.ptNumList;
        }

        public List<String> getFuzzyPtNum() {
            return this.fuzzyPtNum;
        }

        public List<String> getRightFuzzyPtNum() {
            return this.rightFuzzyPtNum;
        }

        public List<String> getFtPhoneList() {
            return this.ftPhoneList;
        }

        public List<String> getFuzzyFtPhone() {
            return this.fuzzyFtPhone;
        }

        public List<String> getRightFuzzyFtPhone() {
            return this.rightFuzzyFtPhone;
        }

        public List<String> getCpMailList() {
            return this.cpMailList;
        }

        public List<String> getFuzzyCpMail() {
            return this.fuzzyCpMail;
        }

        public List<String> getRightFuzzyCpMail() {
            return this.rightFuzzyCpMail;
        }

        public List<String> getOtherMailList() {
            return this.otherMailList;
        }

        public List<String> getFuzzyOtherMail() {
            return this.fuzzyOtherMail;
        }

        public List<String> getRightFuzzyOtherMail() {
            return this.rightFuzzyOtherMail;
        }

        public List<String> getQqNumberList() {
            return this.qqNumberList;
        }

        public List<String> getFuzzyQqNumber() {
            return this.fuzzyQqNumber;
        }

        public List<String> getRightFuzzyQqNumber() {
            return this.rightFuzzyQqNumber;
        }

        public List<String> getMbPhoneList() {
            return this.mbPhoneList;
        }

        public List<String> getFuzzyMbPhone() {
            return this.fuzzyMbPhone;
        }

        public List<String> getRightFuzzyMbPhone() {
            return this.rightFuzzyMbPhone;
        }

        public ConditionBuilder fuzzyLoginName(List<String> fuzzyLoginName) {
            this.fuzzyLoginName = fuzzyLoginName;
            return this;
        }

        public ConditionBuilder fuzzyLoginName(String... fuzzyLoginName) {
            this.fuzzyLoginName = solveNullList(fuzzyLoginName);
            return this;
        }

        public ConditionBuilder rightFuzzyLoginName(List<String> rightFuzzyLoginName) {
            this.rightFuzzyLoginName = rightFuzzyLoginName;
            return this;
        }

        public ConditionBuilder rightFuzzyLoginName(String... rightFuzzyLoginName) {
            this.rightFuzzyLoginName = solveNullList(rightFuzzyLoginName);
            return this;
        }

        public ConditionBuilder loginNameList(String... loginName) {
            this.loginNameList = solveNullList(loginName);
            return this;
        }

        public ConditionBuilder loginNameList(List<String> loginName) {
            this.loginNameList = loginName;
            return this;
        }

        public ConditionBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyRealName(List<String> fuzzyRealName) {
            this.fuzzyRealName = fuzzyRealName;
            return this;
        }

        public ConditionBuilder fuzzyRealName(String... fuzzyRealName) {
            this.fuzzyRealName = solveNullList(fuzzyRealName);
            return this;
        }

        public ConditionBuilder rightFuzzyRealName(List<String> rightFuzzyRealName) {
            this.rightFuzzyRealName = rightFuzzyRealName;
            return this;
        }

        public ConditionBuilder rightFuzzyRealName(String... rightFuzzyRealName) {
            this.rightFuzzyRealName = solveNullList(rightFuzzyRealName);
            return this;
        }

        public ConditionBuilder realNameList(String... realName) {
            this.realNameList = solveNullList(realName);
            return this;
        }

        public ConditionBuilder realNameList(List<String> realName) {
            this.realNameList = realName;
            return this;
        }

        public ConditionBuilder fuzzyDtNum(List<String> fuzzyDtNum) {
            this.fuzzyDtNum = fuzzyDtNum;
            return this;
        }

        public ConditionBuilder fuzzyDtNum(String... fuzzyDtNum) {
            this.fuzzyDtNum = solveNullList(fuzzyDtNum);
            return this;
        }

        public ConditionBuilder rightFuzzyDtNum(List<String> rightFuzzyDtNum) {
            this.rightFuzzyDtNum = rightFuzzyDtNum;
            return this;
        }

        public ConditionBuilder rightFuzzyDtNum(String... rightFuzzyDtNum) {
            this.rightFuzzyDtNum = solveNullList(rightFuzzyDtNum);
            return this;
        }

        public ConditionBuilder dtNumList(String... dtNum) {
            this.dtNumList = solveNullList(dtNum);
            return this;
        }

        public ConditionBuilder dtNumList(List<String> dtNum) {
            this.dtNumList = dtNum;
            return this;
        }

        public ConditionBuilder fuzzyPtNum(List<String> fuzzyPtNum) {
            this.fuzzyPtNum = fuzzyPtNum;
            return this;
        }

        public ConditionBuilder fuzzyPtNum(String... fuzzyPtNum) {
            this.fuzzyPtNum = solveNullList(fuzzyPtNum);
            return this;
        }

        public ConditionBuilder rightFuzzyPtNum(List<String> rightFuzzyPtNum) {
            this.rightFuzzyPtNum = rightFuzzyPtNum;
            return this;
        }

        public ConditionBuilder rightFuzzyPtNum(String... rightFuzzyPtNum) {
            this.rightFuzzyPtNum = solveNullList(rightFuzzyPtNum);
            return this;
        }

        public ConditionBuilder ptNumList(String... ptNum) {
            this.ptNumList = solveNullList(ptNum);
            return this;
        }

        public ConditionBuilder ptNumList(List<String> ptNum) {
            this.ptNumList = ptNum;
            return this;
        }

        public ConditionBuilder fuzzyFtPhone(List<String> fuzzyFtPhone) {
            this.fuzzyFtPhone = fuzzyFtPhone;
            return this;
        }

        public ConditionBuilder fuzzyFtPhone(String... fuzzyFtPhone) {
            this.fuzzyFtPhone = solveNullList(fuzzyFtPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyFtPhone(List<String> rightFuzzyFtPhone) {
            this.rightFuzzyFtPhone = rightFuzzyFtPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyFtPhone(String... rightFuzzyFtPhone) {
            this.rightFuzzyFtPhone = solveNullList(rightFuzzyFtPhone);
            return this;
        }

        public ConditionBuilder ftPhoneList(String... ftPhone) {
            this.ftPhoneList = solveNullList(ftPhone);
            return this;
        }

        public ConditionBuilder ftPhoneList(List<String> ftPhone) {
            this.ftPhoneList = ftPhone;
            return this;
        }

        public ConditionBuilder fuzzyCpMail(List<String> fuzzyCpMail) {
            this.fuzzyCpMail = fuzzyCpMail;
            return this;
        }

        public ConditionBuilder fuzzyCpMail(String... fuzzyCpMail) {
            this.fuzzyCpMail = solveNullList(fuzzyCpMail);
            return this;
        }

        public ConditionBuilder rightFuzzyCpMail(List<String> rightFuzzyCpMail) {
            this.rightFuzzyCpMail = rightFuzzyCpMail;
            return this;
        }

        public ConditionBuilder rightFuzzyCpMail(String... rightFuzzyCpMail) {
            this.rightFuzzyCpMail = solveNullList(rightFuzzyCpMail);
            return this;
        }

        public ConditionBuilder cpMailList(String... cpMail) {
            this.cpMailList = solveNullList(cpMail);
            return this;
        }

        public ConditionBuilder cpMailList(List<String> cpMail) {
            this.cpMailList = cpMail;
            return this;
        }

        public ConditionBuilder fuzzyOtherMail(List<String> fuzzyOtherMail) {
            this.fuzzyOtherMail = fuzzyOtherMail;
            return this;
        }

        public ConditionBuilder fuzzyOtherMail(String... fuzzyOtherMail) {
            this.fuzzyOtherMail = solveNullList(fuzzyOtherMail);
            return this;
        }

        public ConditionBuilder rightFuzzyOtherMail(List<String> rightFuzzyOtherMail) {
            this.rightFuzzyOtherMail = rightFuzzyOtherMail;
            return this;
        }

        public ConditionBuilder rightFuzzyOtherMail(String... rightFuzzyOtherMail) {
            this.rightFuzzyOtherMail = solveNullList(rightFuzzyOtherMail);
            return this;
        }

        public ConditionBuilder otherMailList(String... otherMail) {
            this.otherMailList = solveNullList(otherMail);
            return this;
        }

        public ConditionBuilder otherMailList(List<String> otherMail) {
            this.otherMailList = otherMail;
            return this;
        }

        public ConditionBuilder fuzzyQqNumber(List<String> fuzzyQqNumber) {
            this.fuzzyQqNumber = fuzzyQqNumber;
            return this;
        }

        public ConditionBuilder fuzzyQqNumber(String... fuzzyQqNumber) {
            this.fuzzyQqNumber = solveNullList(fuzzyQqNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyQqNumber(List<String> rightFuzzyQqNumber) {
            this.rightFuzzyQqNumber = rightFuzzyQqNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyQqNumber(String... rightFuzzyQqNumber) {
            this.rightFuzzyQqNumber = solveNullList(rightFuzzyQqNumber);
            return this;
        }

        public ConditionBuilder qqNumberList(String... qqNumber) {
            this.qqNumberList = solveNullList(qqNumber);
            return this;
        }

        public ConditionBuilder qqNumberList(List<String> qqNumber) {
            this.qqNumberList = qqNumber;
            return this;
        }

        public ConditionBuilder fuzzyMbPhone(List<String> fuzzyMbPhone) {
            this.fuzzyMbPhone = fuzzyMbPhone;
            return this;
        }

        public ConditionBuilder fuzzyMbPhone(String... fuzzyMbPhone) {
            this.fuzzyMbPhone = solveNullList(fuzzyMbPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyMbPhone(List<String> rightFuzzyMbPhone) {
            this.rightFuzzyMbPhone = rightFuzzyMbPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyMbPhone(String... rightFuzzyMbPhone) {
            this.rightFuzzyMbPhone = solveNullList(rightFuzzyMbPhone);
            return this;
        }

        public ConditionBuilder mbPhoneList(String... mbPhone) {
            this.mbPhoneList = solveNullList(mbPhone);
            return this;
        }

        public ConditionBuilder mbPhoneList(List<String> mbPhone) {
            this.mbPhoneList = mbPhone;
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build() {
            return this;
        }
    }

    public static class Builder {

        private TbStaff obj;

        public Builder() {
            this.obj = new TbStaff();
        }

        public Builder loginName(String loginName) {
            this.obj.setLoginName(loginName);
            return this;
        }

        public Builder password(String password) {
            this.obj.setPassword(password);
            return this;
        }

        public Builder realName(String realName) {
            this.obj.setRealName(realName);
            return this;
        }

        public Builder dtNum(String dtNum) {
            this.obj.setDtNum(dtNum);
            return this;
        }

        public Builder ptNum(String ptNum) {
            this.obj.setPtNum(ptNum);
            return this;
        }

        public Builder ftPhone(String ftPhone) {
            this.obj.setFtPhone(ftPhone);
            return this;
        }

        public Builder cpMail(String cpMail) {
            this.obj.setCpMail(cpMail);
            return this;
        }

        public Builder otherMail(String otherMail) {
            this.obj.setOtherMail(otherMail);
            return this;
        }

        public Builder qqNumber(String qqNumber) {
            this.obj.setQqNumber(qqNumber);
            return this;
        }

        public Builder mbPhone(String mbPhone) {
            this.obj.setMbPhone(mbPhone);
            return this;
        }

        public TbStaff build() {
            return obj;
        }
    }

}
