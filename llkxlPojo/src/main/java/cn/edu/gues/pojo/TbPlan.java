package cn.edu.gues.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
public class TbPlan implements Serializable {

    private static final long serialVersionUID = 1573878348934L;


    /**
     * 主键
     * 编号
     * isNullAble:0
     */
    private Integer num;

    /**
     * 需求计划名称
     * isNullAble:0
     */
    private String planName;

    /**
     * 计划类型
     * isNullAble:0
     */
    private String planType;

    /**
     * 物料分类码
     * isNullAble:0
     */
    private String mrCfNum;

    /**
     * 物料编码
     * isNullAble:0
     */
    private String mrNum;

    /**
     * 需求数量
     * isNullAble:0
     */
    private Integer needNum;

    /**
     * 填写日期
     * isNullAble:0
     */
    private java.time.LocalDateTime writeTime;

    /**
     * 需求部门
     * isNullAble:0
     */
    private String needUnit;

    /**
     * 审批状态
     * isNullAble:0
     */
    private String avStatus;

    /**
     * 需求月份
     * isNullAble:0
     */
    private String needMonth;

    /**
     * 货源是否确定
     * isNullAble:0
     */
    private Integer ynSupply;

    /**
     * 期望供应商
     * isNullAble:0
     */
    private String wtSupply;

    /**
     * 固定供应商
     * isNullAble:0
     */
    private String ftSupply;

    /**
     * 物料追踪码
     * isNullAble:0
     */
    private String mrTrace;

    /**
     * 备注
     * isNullAble:1
     */
    private String remark;

    /**
     * 需求提出人
     * isNullAble:0
     */
    private String needMan;

    /**
     * 需求时间
     * isNullAble:0
     */
    private java.time.LocalDateTime needTime;

    /**
     * 需求审批人
     * isNullAble:1
     */
    private String needAvMan;

    /**
     * 需求审批时间
     * isNullAble:1
     */
    private java.time.LocalDateTime needAvTime;

    /**
     * 需求审批意见
     * isNullAble:1
     */
    private String needAvIdea;

    /**
     * 需求说明
     * isNullAble:1
     */
    private String needExplain;

    /**
     * 采购提出人
     * isNullAble:1
     */
    private String buyMan;

    /**
     * 采购时间
     * isNullAble:1
     */
    private java.time.LocalDateTime buyTime;

    /**
     * 采购审批人
     * isNullAble:1
     */
    private String buyAvMan;

    /**
     * 采购审批时间
     * isNullAble:1
     */
    private java.time.LocalDateTime buyAvTime;

    /**
     * 采购审批意见
     * isNullAble:1
     */
    private String buyAvIdea;

    /**
     * 采购说明
     * isNullAble:1
     */
    private String buyExplain;


    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return this.num;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return this.planName;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanType() {
        return this.planType;
    }

    public void setMrCfNum(String mrCfNum) {
        this.mrCfNum = mrCfNum;
    }

    public String getMrCfNum() {
        return this.mrCfNum;
    }

    public void setMrNum(String mrNum) {
        this.mrNum = mrNum;
    }

    public String getMrNum() {
        return this.mrNum;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public Integer getNeedNum() {
        return this.needNum;
    }

    public void setWriteTime(java.time.LocalDateTime writeTime) {
        this.writeTime = writeTime;
    }

    public java.time.LocalDateTime getWriteTime() {
        return this.writeTime;
    }

    public void setNeedUnit(String needUnit) {
        this.needUnit = needUnit;
    }

    public String getNeedUnit() {
        return this.needUnit;
    }

    public void setAvStatus(String avStatus) {
        this.avStatus = avStatus;
    }

    public String getAvStatus() {
        return this.avStatus;
    }

    public void setNeedMonth(String needMonth) {
        this.needMonth = needMonth;
    }

    public String getNeedMonth() {
        return this.needMonth;
    }

    public void setYnSupply(Integer ynSupply) {
        this.ynSupply = ynSupply;
    }

    public Integer getYnSupply() {
        return this.ynSupply;
    }

    public void setWtSupply(String wtSupply) {
        this.wtSupply = wtSupply;
    }

    public String getWtSupply() {
        return this.wtSupply;
    }

    public void setFtSupply(String ftSupply) {
        this.ftSupply = ftSupply;
    }

    public String getFtSupply() {
        return this.ftSupply;
    }

    public void setMrTrace(String mrTrace) {
        this.mrTrace = mrTrace;
    }

    public String getMrTrace() {
        return this.mrTrace;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setNeedMan(String needMan) {
        this.needMan = needMan;
    }

    public String getNeedMan() {
        return this.needMan;
    }

    public void setNeedTime(java.time.LocalDateTime needTime) {
        this.needTime = needTime;
    }

    public java.time.LocalDateTime getNeedTime() {
        return this.needTime;
    }

    public void setNeedAvMan(String needAvMan) {
        this.needAvMan = needAvMan;
    }

    public String getNeedAvMan() {
        return this.needAvMan;
    }

    public void setNeedAvTime(java.time.LocalDateTime needAvTime) {
        this.needAvTime = needAvTime;
    }

    public java.time.LocalDateTime getNeedAvTime() {
        return this.needAvTime;
    }

    public void setNeedAvIdea(String needAvIdea) {
        this.needAvIdea = needAvIdea;
    }

    public String getNeedAvIdea() {
        return this.needAvIdea;
    }

    public void setNeedExplain(String needExplain) {
        this.needExplain = needExplain;
    }

    public String getNeedExplain() {
        return this.needExplain;
    }

    public void setBuyMan(String buyMan) {
        this.buyMan = buyMan;
    }

    public String getBuyMan() {
        return this.buyMan;
    }

    public void setBuyTime(java.time.LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public java.time.LocalDateTime getBuyTime() {
        return this.buyTime;
    }

    public void setBuyAvMan(String buyAvMan) {
        this.buyAvMan = buyAvMan;
    }

    public String getBuyAvMan() {
        return this.buyAvMan;
    }

    public void setBuyAvTime(java.time.LocalDateTime buyAvTime) {
        this.buyAvTime = buyAvTime;
    }

    public java.time.LocalDateTime getBuyAvTime() {
        return this.buyAvTime;
    }

    public void setBuyAvIdea(String buyAvIdea) {
        this.buyAvIdea = buyAvIdea;
    }

    public String getBuyAvIdea() {
        return this.buyAvIdea;
    }

    public void setBuyExplain(String buyExplain) {
        this.buyExplain = buyExplain;
    }

    public String getBuyExplain() {
        return this.buyExplain;
    }

    @Override
    public String toString() {
        return "TbPlan{" +
                "num='" + num + '\'' +
                "planName='" + planName + '\'' +
                "planType='" + planType + '\'' +
                "mrCfNum='" + mrCfNum + '\'' +
                "mrNum='" + mrNum + '\'' +
                "needNum='" + needNum + '\'' +
                "writeTime='" + writeTime + '\'' +
                "needUnit='" + needUnit + '\'' +
                "avStatus='" + avStatus + '\'' +
                "needMonth='" + needMonth + '\'' +
                "ynSupply='" + ynSupply + '\'' +
                "wtSupply='" + wtSupply + '\'' +
                "ftSupply='" + ftSupply + '\'' +
                "mrTrace='" + mrTrace + '\'' +
                "remark='" + remark + '\'' +
                "needMan='" + needMan + '\'' +
                "needTime='" + needTime + '\'' +
                "needAvMan='" + needAvMan + '\'' +
                "needAvTime='" + needAvTime + '\'' +
                "needAvIdea='" + needAvIdea + '\'' +
                "needExplain='" + needExplain + '\'' +
                "buyMan='" + buyMan + '\'' +
                "buyTime='" + buyTime + '\'' +
                "buyAvMan='" + buyAvMan + '\'' +
                "buyAvTime='" + buyAvTime + '\'' +
                "buyAvIdea='" + buyAvIdea + '\'' +
                "buyExplain='" + buyExplain + '\'' +
                '}';
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

    public static class UpdateBuilder {

        private TbPlan set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbPlan set) {
            this.set = set;
            return this;
        }

        public TbPlan getSet() {
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

    public static class QueryBuilder extends TbPlan {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        private List<Integer> numList;

        public List<Integer> getNumList() {
            return this.numList;
        }

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt() {
            return this.numSt;
        }

        public Integer getNumEd() {
            return this.numEd;
        }

        private List<String> planNameList;

        public List<String> getPlanNameList() {
            return this.planNameList;
        }


        private List<String> fuzzyPlanName;

        public List<String> getFuzzyPlanName() {
            return this.fuzzyPlanName;
        }

        private List<String> rightFuzzyPlanName;

        public List<String> getRightFuzzyPlanName() {
            return this.rightFuzzyPlanName;
        }

        private List<String> planTypeList;

        public List<String> getPlanTypeList() {
            return this.planTypeList;
        }


        private List<String> fuzzyPlanType;

        public List<String> getFuzzyPlanType() {
            return this.fuzzyPlanType;
        }

        private List<String> rightFuzzyPlanType;

        public List<String> getRightFuzzyPlanType() {
            return this.rightFuzzyPlanType;
        }

        private List<String> mrCfNumList;

        public List<String> getMrCfNumList() {
            return this.mrCfNumList;
        }


        private List<String> fuzzyMrCfNum;

        public List<String> getFuzzyMrCfNum() {
            return this.fuzzyMrCfNum;
        }

        private List<String> rightFuzzyMrCfNum;

        public List<String> getRightFuzzyMrCfNum() {
            return this.rightFuzzyMrCfNum;
        }

        private List<String> mrNumList;

        public List<String> getMrNumList() {
            return this.mrNumList;
        }


        private List<String> fuzzyMrNum;

        public List<String> getFuzzyMrNum() {
            return this.fuzzyMrNum;
        }

        private List<String> rightFuzzyMrNum;

        public List<String> getRightFuzzyMrNum() {
            return this.rightFuzzyMrNum;
        }

        private List<Integer> needNumList;

        public List<Integer> getNeedNumList() {
            return this.needNumList;
        }

        private Integer needNumSt;

        private Integer needNumEd;

        public Integer getNeedNumSt() {
            return this.needNumSt;
        }

        public Integer getNeedNumEd() {
            return this.needNumEd;
        }

        private List<java.time.LocalDateTime> writeTimeList;

        public List<java.time.LocalDateTime> getWriteTimeList() {
            return this.writeTimeList;
        }

        private java.time.LocalDateTime writeTimeSt;

        private java.time.LocalDateTime writeTimeEd;

        public java.time.LocalDateTime getWriteTimeSt() {
            return this.writeTimeSt;
        }

        public java.time.LocalDateTime getWriteTimeEd() {
            return this.writeTimeEd;
        }

        private List<String> needUnitList;

        public List<String> getNeedUnitList() {
            return this.needUnitList;
        }


        private List<String> fuzzyNeedUnit;

        public List<String> getFuzzyNeedUnit() {
            return this.fuzzyNeedUnit;
        }

        private List<String> rightFuzzyNeedUnit;

        public List<String> getRightFuzzyNeedUnit() {
            return this.rightFuzzyNeedUnit;
        }

        private List<String> avStatusList;

        public List<String> getAvStatusList() {
            return this.avStatusList;
        }


        private List<String> fuzzyAvStatus;

        public List<String> getFuzzyAvStatus() {
            return this.fuzzyAvStatus;
        }

        private List<String> rightFuzzyAvStatus;

        public List<String> getRightFuzzyAvStatus() {
            return this.rightFuzzyAvStatus;
        }

        private List<String> needMonthList;

        public List<String> getNeedMonthList() {
            return this.needMonthList;
        }


        private List<String> fuzzyNeedMonth;

        public List<String> getFuzzyNeedMonth() {
            return this.fuzzyNeedMonth;
        }

        private List<String> rightFuzzyNeedMonth;

        public List<String> getRightFuzzyNeedMonth() {
            return this.rightFuzzyNeedMonth;
        }

        private List<Integer> ynSupplyList;

        public List<Integer> getYnSupplyList() {
            return this.ynSupplyList;
        }

        private Integer ynSupplySt;

        private Integer ynSupplyEd;

        public Integer getYnSupplySt() {
            return this.ynSupplySt;
        }

        public Integer getYnSupplyEd() {
            return this.ynSupplyEd;
        }

        private List<String> wtSupplyList;

        public List<String> getWtSupplyList() {
            return this.wtSupplyList;
        }


        private List<String> fuzzyWtSupply;

        public List<String> getFuzzyWtSupply() {
            return this.fuzzyWtSupply;
        }

        private List<String> rightFuzzyWtSupply;

        public List<String> getRightFuzzyWtSupply() {
            return this.rightFuzzyWtSupply;
        }

        private List<String> ftSupplyList;

        public List<String> getFtSupplyList() {
            return this.ftSupplyList;
        }


        private List<String> fuzzyFtSupply;

        public List<String> getFuzzyFtSupply() {
            return this.fuzzyFtSupply;
        }

        private List<String> rightFuzzyFtSupply;

        public List<String> getRightFuzzyFtSupply() {
            return this.rightFuzzyFtSupply;
        }

        private List<String> mrTraceList;

        public List<String> getMrTraceList() {
            return this.mrTraceList;
        }


        private List<String> fuzzyMrTrace;

        public List<String> getFuzzyMrTrace() {
            return this.fuzzyMrTrace;
        }

        private List<String> rightFuzzyMrTrace;

        public List<String> getRightFuzzyMrTrace() {
            return this.rightFuzzyMrTrace;
        }

        private List<String> remarkList;

        public List<String> getRemarkList() {
            return this.remarkList;
        }


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark() {
            return this.fuzzyRemark;
        }

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark() {
            return this.rightFuzzyRemark;
        }

        private List<String> needManList;

        public List<String> getNeedManList() {
            return this.needManList;
        }


        private List<String> fuzzyNeedMan;

        public List<String> getFuzzyNeedMan() {
            return this.fuzzyNeedMan;
        }

        private List<String> rightFuzzyNeedMan;

        public List<String> getRightFuzzyNeedMan() {
            return this.rightFuzzyNeedMan;
        }

        private List<java.time.LocalDateTime> needTimeList;

        public List<java.time.LocalDateTime> getNeedTimeList() {
            return this.needTimeList;
        }

        private java.time.LocalDateTime needTimeSt;

        private java.time.LocalDateTime needTimeEd;

        public java.time.LocalDateTime getNeedTimeSt() {
            return this.needTimeSt;
        }

        public java.time.LocalDateTime getNeedTimeEd() {
            return this.needTimeEd;
        }

        private List<String> needAvManList;

        public List<String> getNeedAvManList() {
            return this.needAvManList;
        }


        private List<String> fuzzyNeedAvMan;

        public List<String> getFuzzyNeedAvMan() {
            return this.fuzzyNeedAvMan;
        }

        private List<String> rightFuzzyNeedAvMan;

        public List<String> getRightFuzzyNeedAvMan() {
            return this.rightFuzzyNeedAvMan;
        }

        private List<java.time.LocalDateTime> needAvTimeList;

        public List<java.time.LocalDateTime> getNeedAvTimeList() {
            return this.needAvTimeList;
        }

        private java.time.LocalDateTime needAvTimeSt;

        private java.time.LocalDateTime needAvTimeEd;

        public java.time.LocalDateTime getNeedAvTimeSt() {
            return this.needAvTimeSt;
        }

        public java.time.LocalDateTime getNeedAvTimeEd() {
            return this.needAvTimeEd;
        }

        private List<String> needAvIdeaList;

        public List<String> getNeedAvIdeaList() {
            return this.needAvIdeaList;
        }


        private List<String> fuzzyNeedAvIdea;

        public List<String> getFuzzyNeedAvIdea() {
            return this.fuzzyNeedAvIdea;
        }

        private List<String> rightFuzzyNeedAvIdea;

        public List<String> getRightFuzzyNeedAvIdea() {
            return this.rightFuzzyNeedAvIdea;
        }

        private List<String> needExplainList;

        public List<String> getNeedExplainList() {
            return this.needExplainList;
        }


        private List<String> fuzzyNeedExplain;

        public List<String> getFuzzyNeedExplain() {
            return this.fuzzyNeedExplain;
        }

        private List<String> rightFuzzyNeedExplain;

        public List<String> getRightFuzzyNeedExplain() {
            return this.rightFuzzyNeedExplain;
        }

        private List<String> buyManList;

        public List<String> getBuyManList() {
            return this.buyManList;
        }


        private List<String> fuzzyBuyMan;

        public List<String> getFuzzyBuyMan() {
            return this.fuzzyBuyMan;
        }

        private List<String> rightFuzzyBuyMan;

        public List<String> getRightFuzzyBuyMan() {
            return this.rightFuzzyBuyMan;
        }

        private List<java.time.LocalDateTime> buyTimeList;

        public List<java.time.LocalDateTime> getBuyTimeList() {
            return this.buyTimeList;
        }

        private java.time.LocalDateTime buyTimeSt;

        private java.time.LocalDateTime buyTimeEd;

        public java.time.LocalDateTime getBuyTimeSt() {
            return this.buyTimeSt;
        }

        public java.time.LocalDateTime getBuyTimeEd() {
            return this.buyTimeEd;
        }

        private List<String> buyAvManList;

        public List<String> getBuyAvManList() {
            return this.buyAvManList;
        }


        private List<String> fuzzyBuyAvMan;

        public List<String> getFuzzyBuyAvMan() {
            return this.fuzzyBuyAvMan;
        }

        private List<String> rightFuzzyBuyAvMan;

        public List<String> getRightFuzzyBuyAvMan() {
            return this.rightFuzzyBuyAvMan;
        }

        private List<java.time.LocalDateTime> buyAvTimeList;

        public List<java.time.LocalDateTime> getBuyAvTimeList() {
            return this.buyAvTimeList;
        }

        private java.time.LocalDateTime buyAvTimeSt;

        private java.time.LocalDateTime buyAvTimeEd;

        public java.time.LocalDateTime getBuyAvTimeSt() {
            return this.buyAvTimeSt;
        }

        public java.time.LocalDateTime getBuyAvTimeEd() {
            return this.buyAvTimeEd;
        }

        private List<String> buyAvIdeaList;

        public List<String> getBuyAvIdeaList() {
            return this.buyAvIdeaList;
        }


        private List<String> fuzzyBuyAvIdea;

        public List<String> getFuzzyBuyAvIdea() {
            return this.fuzzyBuyAvIdea;
        }

        private List<String> rightFuzzyBuyAvIdea;

        public List<String> getRightFuzzyBuyAvIdea() {
            return this.rightFuzzyBuyAvIdea;
        }

        private List<String> buyExplainList;

        public List<String> getBuyExplainList() {
            return this.buyExplainList;
        }


        private List<String> fuzzyBuyExplain;

        public List<String> getFuzzyBuyExplain() {
            return this.fuzzyBuyExplain;
        }

        private List<String> rightFuzzyBuyExplain;

        public List<String> getRightFuzzyBuyExplain() {
            return this.rightFuzzyBuyExplain;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder numBetWeen(Integer numSt, Integer numEd) {
            this.numSt = numSt;
            this.numEd = numEd;
            return this;
        }

        public QueryBuilder numGreaterEqThan(Integer numSt) {
            this.numSt = numSt;
            return this;
        }

        public QueryBuilder numLessEqThan(Integer numEd) {
            this.numEd = numEd;
            return this;
        }


        public QueryBuilder num(Integer num) {
            setNum(num);
            return this;
        }

        public QueryBuilder numList(Integer... num) {
            this.numList = solveNullList(num);
            return this;
        }

        public QueryBuilder numList(List<Integer> num) {
            this.numList = num;
            return this;
        }

        public QueryBuilder fetchNum() {
            setFetchFields("fetchFields", "num");
            return this;
        }

        public QueryBuilder excludeNum() {
            setFetchFields("excludeFields", "num");
            return this;
        }

        public QueryBuilder fuzzyPlanName(List<String> fuzzyPlanName) {
            this.fuzzyPlanName = fuzzyPlanName;
            return this;
        }

        public QueryBuilder fuzzyPlanName(String... fuzzyPlanName) {
            this.fuzzyPlanName = solveNullList(fuzzyPlanName);
            return this;
        }

        public QueryBuilder rightFuzzyPlanName(List<String> rightFuzzyPlanName) {
            this.rightFuzzyPlanName = rightFuzzyPlanName;
            return this;
        }

        public QueryBuilder rightFuzzyPlanName(String... rightFuzzyPlanName) {
            this.rightFuzzyPlanName = solveNullList(rightFuzzyPlanName);
            return this;
        }

        public QueryBuilder planName(String planName) {
            setPlanName(planName);
            return this;
        }

        public QueryBuilder planNameList(String... planName) {
            this.planNameList = solveNullList(planName);
            return this;
        }

        public QueryBuilder planNameList(List<String> planName) {
            this.planNameList = planName;
            return this;
        }

        public QueryBuilder fetchPlanName() {
            setFetchFields("fetchFields", "planName");
            return this;
        }

        public QueryBuilder excludePlanName() {
            setFetchFields("excludeFields", "planName");
            return this;
        }

        public QueryBuilder fuzzyPlanType(List<String> fuzzyPlanType) {
            this.fuzzyPlanType = fuzzyPlanType;
            return this;
        }

        public QueryBuilder fuzzyPlanType(String... fuzzyPlanType) {
            this.fuzzyPlanType = solveNullList(fuzzyPlanType);
            return this;
        }

        public QueryBuilder rightFuzzyPlanType(List<String> rightFuzzyPlanType) {
            this.rightFuzzyPlanType = rightFuzzyPlanType;
            return this;
        }

        public QueryBuilder rightFuzzyPlanType(String... rightFuzzyPlanType) {
            this.rightFuzzyPlanType = solveNullList(rightFuzzyPlanType);
            return this;
        }

        public QueryBuilder planType(String planType) {
            setPlanType(planType);
            return this;
        }

        public QueryBuilder planTypeList(String... planType) {
            this.planTypeList = solveNullList(planType);
            return this;
        }

        public QueryBuilder planTypeList(List<String> planType) {
            this.planTypeList = planType;
            return this;
        }

        public QueryBuilder fetchPlanType() {
            setFetchFields("fetchFields", "planType");
            return this;
        }

        public QueryBuilder excludePlanType() {
            setFetchFields("excludeFields", "planType");
            return this;
        }

        public QueryBuilder fuzzyMrCfNum(List<String> fuzzyMrCfNum) {
            this.fuzzyMrCfNum = fuzzyMrCfNum;
            return this;
        }

        public QueryBuilder fuzzyMrCfNum(String... fuzzyMrCfNum) {
            this.fuzzyMrCfNum = solveNullList(fuzzyMrCfNum);
            return this;
        }

        public QueryBuilder rightFuzzyMrCfNum(List<String> rightFuzzyMrCfNum) {
            this.rightFuzzyMrCfNum = rightFuzzyMrCfNum;
            return this;
        }

        public QueryBuilder rightFuzzyMrCfNum(String... rightFuzzyMrCfNum) {
            this.rightFuzzyMrCfNum = solveNullList(rightFuzzyMrCfNum);
            return this;
        }

        public QueryBuilder mrCfNum(String mrCfNum) {
            setMrCfNum(mrCfNum);
            return this;
        }

        public QueryBuilder mrCfNumList(String... mrCfNum) {
            this.mrCfNumList = solveNullList(mrCfNum);
            return this;
        }

        public QueryBuilder mrCfNumList(List<String> mrCfNum) {
            this.mrCfNumList = mrCfNum;
            return this;
        }

        public QueryBuilder fetchMrCfNum() {
            setFetchFields("fetchFields", "mrCfNum");
            return this;
        }

        public QueryBuilder excludeMrCfNum() {
            setFetchFields("excludeFields", "mrCfNum");
            return this;
        }

        public QueryBuilder fuzzyMrNum(List<String> fuzzyMrNum) {
            this.fuzzyMrNum = fuzzyMrNum;
            return this;
        }

        public QueryBuilder fuzzyMrNum(String... fuzzyMrNum) {
            this.fuzzyMrNum = solveNullList(fuzzyMrNum);
            return this;
        }

        public QueryBuilder rightFuzzyMrNum(List<String> rightFuzzyMrNum) {
            this.rightFuzzyMrNum = rightFuzzyMrNum;
            return this;
        }

        public QueryBuilder rightFuzzyMrNum(String... rightFuzzyMrNum) {
            this.rightFuzzyMrNum = solveNullList(rightFuzzyMrNum);
            return this;
        }

        public QueryBuilder mrNum(String mrNum) {
            setMrNum(mrNum);
            return this;
        }

        public QueryBuilder mrNumList(String... mrNum) {
            this.mrNumList = solveNullList(mrNum);
            return this;
        }

        public QueryBuilder mrNumList(List<String> mrNum) {
            this.mrNumList = mrNum;
            return this;
        }

        public QueryBuilder fetchMrNum() {
            setFetchFields("fetchFields", "mrNum");
            return this;
        }

        public QueryBuilder excludeMrNum() {
            setFetchFields("excludeFields", "mrNum");
            return this;
        }

        public QueryBuilder needNumBetWeen(Integer needNumSt, Integer needNumEd) {
            this.needNumSt = needNumSt;
            this.needNumEd = needNumEd;
            return this;
        }

        public QueryBuilder needNumGreaterEqThan(Integer needNumSt) {
            this.needNumSt = needNumSt;
            return this;
        }

        public QueryBuilder needNumLessEqThan(Integer needNumEd) {
            this.needNumEd = needNumEd;
            return this;
        }


        public QueryBuilder needNum(Integer needNum) {
            setNeedNum(needNum);
            return this;
        }

        public QueryBuilder needNumList(Integer... needNum) {
            this.needNumList = solveNullList(needNum);
            return this;
        }

        public QueryBuilder needNumList(List<Integer> needNum) {
            this.needNumList = needNum;
            return this;
        }

        public QueryBuilder fetchNeedNum() {
            setFetchFields("fetchFields", "needNum");
            return this;
        }

        public QueryBuilder excludeNeedNum() {
            setFetchFields("excludeFields", "needNum");
            return this;
        }

        public QueryBuilder writeTimeBetWeen(java.time.LocalDateTime writeTimeSt, java.time.LocalDateTime writeTimeEd) {
            this.writeTimeSt = writeTimeSt;
            this.writeTimeEd = writeTimeEd;
            return this;
        }

        public QueryBuilder writeTimeGreaterEqThan(java.time.LocalDateTime writeTimeSt) {
            this.writeTimeSt = writeTimeSt;
            return this;
        }

        public QueryBuilder writeTimeLessEqThan(java.time.LocalDateTime writeTimeEd) {
            this.writeTimeEd = writeTimeEd;
            return this;
        }


        public QueryBuilder writeTime(java.time.LocalDateTime writeTime) {
            setWriteTime(writeTime);
            return this;
        }

        public QueryBuilder writeTimeList(java.time.LocalDateTime... writeTime) {
            this.writeTimeList = solveNullList(writeTime);
            return this;
        }

        public QueryBuilder writeTimeList(List<java.time.LocalDateTime> writeTime) {
            this.writeTimeList = writeTime;
            return this;
        }

        public QueryBuilder fetchWriteTime() {
            setFetchFields("fetchFields", "writeTime");
            return this;
        }

        public QueryBuilder excludeWriteTime() {
            setFetchFields("excludeFields", "writeTime");
            return this;
        }

        public QueryBuilder fuzzyNeedUnit(List<String> fuzzyNeedUnit) {
            this.fuzzyNeedUnit = fuzzyNeedUnit;
            return this;
        }

        public QueryBuilder fuzzyNeedUnit(String... fuzzyNeedUnit) {
            this.fuzzyNeedUnit = solveNullList(fuzzyNeedUnit);
            return this;
        }

        public QueryBuilder rightFuzzyNeedUnit(List<String> rightFuzzyNeedUnit) {
            this.rightFuzzyNeedUnit = rightFuzzyNeedUnit;
            return this;
        }

        public QueryBuilder rightFuzzyNeedUnit(String... rightFuzzyNeedUnit) {
            this.rightFuzzyNeedUnit = solveNullList(rightFuzzyNeedUnit);
            return this;
        }

        public QueryBuilder needUnit(String needUnit) {
            setNeedUnit(needUnit);
            return this;
        }

        public QueryBuilder needUnitList(String... needUnit) {
            this.needUnitList = solveNullList(needUnit);
            return this;
        }

        public QueryBuilder needUnitList(List<String> needUnit) {
            this.needUnitList = needUnit;
            return this;
        }

        public QueryBuilder fetchNeedUnit() {
            setFetchFields("fetchFields", "needUnit");
            return this;
        }

        public QueryBuilder excludeNeedUnit() {
            setFetchFields("excludeFields", "needUnit");
            return this;
        }

        public QueryBuilder fuzzyAvStatus(List<String> fuzzyAvStatus) {
            this.fuzzyAvStatus = fuzzyAvStatus;
            return this;
        }

        public QueryBuilder fuzzyAvStatus(String... fuzzyAvStatus) {
            this.fuzzyAvStatus = solveNullList(fuzzyAvStatus);
            return this;
        }

        public QueryBuilder rightFuzzyAvStatus(List<String> rightFuzzyAvStatus) {
            this.rightFuzzyAvStatus = rightFuzzyAvStatus;
            return this;
        }

        public QueryBuilder rightFuzzyAvStatus(String... rightFuzzyAvStatus) {
            this.rightFuzzyAvStatus = solveNullList(rightFuzzyAvStatus);
            return this;
        }

        public QueryBuilder avStatus(String avStatus) {
            setAvStatus(avStatus);
            return this;
        }

        public QueryBuilder avStatusList(String... avStatus) {
            this.avStatusList = solveNullList(avStatus);
            return this;
        }

        public QueryBuilder avStatusList(List<String> avStatus) {
            this.avStatusList = avStatus;
            return this;
        }

        public QueryBuilder fetchAvStatus() {
            setFetchFields("fetchFields", "avStatus");
            return this;
        }

        public QueryBuilder excludeAvStatus() {
            setFetchFields("excludeFields", "avStatus");
            return this;
        }

        public QueryBuilder fuzzyNeedMonth(List<String> fuzzyNeedMonth) {
            this.fuzzyNeedMonth = fuzzyNeedMonth;
            return this;
        }

        public QueryBuilder fuzzyNeedMonth(String... fuzzyNeedMonth) {
            this.fuzzyNeedMonth = solveNullList(fuzzyNeedMonth);
            return this;
        }

        public QueryBuilder rightFuzzyNeedMonth(List<String> rightFuzzyNeedMonth) {
            this.rightFuzzyNeedMonth = rightFuzzyNeedMonth;
            return this;
        }

        public QueryBuilder rightFuzzyNeedMonth(String... rightFuzzyNeedMonth) {
            this.rightFuzzyNeedMonth = solveNullList(rightFuzzyNeedMonth);
            return this;
        }

        public QueryBuilder needMonth(String needMonth) {
            setNeedMonth(needMonth);
            return this;
        }

        public QueryBuilder needMonthList(String... needMonth) {
            this.needMonthList = solveNullList(needMonth);
            return this;
        }

        public QueryBuilder needMonthList(List<String> needMonth) {
            this.needMonthList = needMonth;
            return this;
        }

        public QueryBuilder fetchNeedMonth() {
            setFetchFields("fetchFields", "needMonth");
            return this;
        }

        public QueryBuilder excludeNeedMonth() {
            setFetchFields("excludeFields", "needMonth");
            return this;
        }

        public QueryBuilder ynSupplyBetWeen(Integer ynSupplySt, Integer ynSupplyEd) {
            this.ynSupplySt = ynSupplySt;
            this.ynSupplyEd = ynSupplyEd;
            return this;
        }

        public QueryBuilder ynSupplyGreaterEqThan(Integer ynSupplySt) {
            this.ynSupplySt = ynSupplySt;
            return this;
        }

        public QueryBuilder ynSupplyLessEqThan(Integer ynSupplyEd) {
            this.ynSupplyEd = ynSupplyEd;
            return this;
        }


        public QueryBuilder ynSupply(Integer ynSupply) {
            setYnSupply(ynSupply);
            return this;
        }

        public QueryBuilder ynSupplyList(Integer... ynSupply) {
            this.ynSupplyList = solveNullList(ynSupply);
            return this;
        }

        public QueryBuilder ynSupplyList(List<Integer> ynSupply) {
            this.ynSupplyList = ynSupply;
            return this;
        }

        public QueryBuilder fetchYnSupply() {
            setFetchFields("fetchFields", "ynSupply");
            return this;
        }

        public QueryBuilder excludeYnSupply() {
            setFetchFields("excludeFields", "ynSupply");
            return this;
        }

        public QueryBuilder fuzzyWtSupply(List<String> fuzzyWtSupply) {
            this.fuzzyWtSupply = fuzzyWtSupply;
            return this;
        }

        public QueryBuilder fuzzyWtSupply(String... fuzzyWtSupply) {
            this.fuzzyWtSupply = solveNullList(fuzzyWtSupply);
            return this;
        }

        public QueryBuilder rightFuzzyWtSupply(List<String> rightFuzzyWtSupply) {
            this.rightFuzzyWtSupply = rightFuzzyWtSupply;
            return this;
        }

        public QueryBuilder rightFuzzyWtSupply(String... rightFuzzyWtSupply) {
            this.rightFuzzyWtSupply = solveNullList(rightFuzzyWtSupply);
            return this;
        }

        public QueryBuilder wtSupply(String wtSupply) {
            setWtSupply(wtSupply);
            return this;
        }

        public QueryBuilder wtSupplyList(String... wtSupply) {
            this.wtSupplyList = solveNullList(wtSupply);
            return this;
        }

        public QueryBuilder wtSupplyList(List<String> wtSupply) {
            this.wtSupplyList = wtSupply;
            return this;
        }

        public QueryBuilder fetchWtSupply() {
            setFetchFields("fetchFields", "wtSupply");
            return this;
        }

        public QueryBuilder excludeWtSupply() {
            setFetchFields("excludeFields", "wtSupply");
            return this;
        }

        public QueryBuilder fuzzyFtSupply(List<String> fuzzyFtSupply) {
            this.fuzzyFtSupply = fuzzyFtSupply;
            return this;
        }

        public QueryBuilder fuzzyFtSupply(String... fuzzyFtSupply) {
            this.fuzzyFtSupply = solveNullList(fuzzyFtSupply);
            return this;
        }

        public QueryBuilder rightFuzzyFtSupply(List<String> rightFuzzyFtSupply) {
            this.rightFuzzyFtSupply = rightFuzzyFtSupply;
            return this;
        }

        public QueryBuilder rightFuzzyFtSupply(String... rightFuzzyFtSupply) {
            this.rightFuzzyFtSupply = solveNullList(rightFuzzyFtSupply);
            return this;
        }

        public QueryBuilder ftSupply(String ftSupply) {
            setFtSupply(ftSupply);
            return this;
        }

        public QueryBuilder ftSupplyList(String... ftSupply) {
            this.ftSupplyList = solveNullList(ftSupply);
            return this;
        }

        public QueryBuilder ftSupplyList(List<String> ftSupply) {
            this.ftSupplyList = ftSupply;
            return this;
        }

        public QueryBuilder fetchFtSupply() {
            setFetchFields("fetchFields", "ftSupply");
            return this;
        }

        public QueryBuilder excludeFtSupply() {
            setFetchFields("excludeFields", "ftSupply");
            return this;
        }

        public QueryBuilder fuzzyMrTrace(List<String> fuzzyMrTrace) {
            this.fuzzyMrTrace = fuzzyMrTrace;
            return this;
        }

        public QueryBuilder fuzzyMrTrace(String... fuzzyMrTrace) {
            this.fuzzyMrTrace = solveNullList(fuzzyMrTrace);
            return this;
        }

        public QueryBuilder rightFuzzyMrTrace(List<String> rightFuzzyMrTrace) {
            this.rightFuzzyMrTrace = rightFuzzyMrTrace;
            return this;
        }

        public QueryBuilder rightFuzzyMrTrace(String... rightFuzzyMrTrace) {
            this.rightFuzzyMrTrace = solveNullList(rightFuzzyMrTrace);
            return this;
        }

        public QueryBuilder mrTrace(String mrTrace) {
            setMrTrace(mrTrace);
            return this;
        }

        public QueryBuilder mrTraceList(String... mrTrace) {
            this.mrTraceList = solveNullList(mrTrace);
            return this;
        }

        public QueryBuilder mrTraceList(List<String> mrTrace) {
            this.mrTraceList = mrTrace;
            return this;
        }

        public QueryBuilder fetchMrTrace() {
            setFetchFields("fetchFields", "mrTrace");
            return this;
        }

        public QueryBuilder excludeMrTrace() {
            setFetchFields("excludeFields", "mrTrace");
            return this;
        }

        public QueryBuilder fuzzyRemark(List<String> fuzzyRemark) {
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark(String... fuzzyRemark) {
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark(List<String> rightFuzzyRemark) {
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark(String... rightFuzzyRemark) {
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark) {
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String... remark) {
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark) {
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark() {
            setFetchFields("fetchFields", "remark");
            return this;
        }

        public QueryBuilder excludeRemark() {
            setFetchFields("excludeFields", "remark");
            return this;
        }

        public QueryBuilder fuzzyNeedMan(List<String> fuzzyNeedMan) {
            this.fuzzyNeedMan = fuzzyNeedMan;
            return this;
        }

        public QueryBuilder fuzzyNeedMan(String... fuzzyNeedMan) {
            this.fuzzyNeedMan = solveNullList(fuzzyNeedMan);
            return this;
        }

        public QueryBuilder rightFuzzyNeedMan(List<String> rightFuzzyNeedMan) {
            this.rightFuzzyNeedMan = rightFuzzyNeedMan;
            return this;
        }

        public QueryBuilder rightFuzzyNeedMan(String... rightFuzzyNeedMan) {
            this.rightFuzzyNeedMan = solveNullList(rightFuzzyNeedMan);
            return this;
        }

        public QueryBuilder needMan(String needMan) {
            setNeedMan(needMan);
            return this;
        }

        public QueryBuilder needManList(String... needMan) {
            this.needManList = solveNullList(needMan);
            return this;
        }

        public QueryBuilder needManList(List<String> needMan) {
            this.needManList = needMan;
            return this;
        }

        public QueryBuilder fetchNeedMan() {
            setFetchFields("fetchFields", "needMan");
            return this;
        }

        public QueryBuilder excludeNeedMan() {
            setFetchFields("excludeFields", "needMan");
            return this;
        }

        public QueryBuilder needTimeBetWeen(java.time.LocalDateTime needTimeSt, java.time.LocalDateTime needTimeEd) {
            this.needTimeSt = needTimeSt;
            this.needTimeEd = needTimeEd;
            return this;
        }

        public QueryBuilder needTimeGreaterEqThan(java.time.LocalDateTime needTimeSt) {
            this.needTimeSt = needTimeSt;
            return this;
        }

        public QueryBuilder needTimeLessEqThan(java.time.LocalDateTime needTimeEd) {
            this.needTimeEd = needTimeEd;
            return this;
        }


        public QueryBuilder needTime(java.time.LocalDateTime needTime) {
            setNeedTime(needTime);
            return this;
        }

        public QueryBuilder needTimeList(java.time.LocalDateTime... needTime) {
            this.needTimeList = solveNullList(needTime);
            return this;
        }

        public QueryBuilder needTimeList(List<java.time.LocalDateTime> needTime) {
            this.needTimeList = needTime;
            return this;
        }

        public QueryBuilder fetchNeedTime() {
            setFetchFields("fetchFields", "needTime");
            return this;
        }

        public QueryBuilder excludeNeedTime() {
            setFetchFields("excludeFields", "needTime");
            return this;
        }

        public QueryBuilder fuzzyNeedAvMan(List<String> fuzzyNeedAvMan) {
            this.fuzzyNeedAvMan = fuzzyNeedAvMan;
            return this;
        }

        public QueryBuilder fuzzyNeedAvMan(String... fuzzyNeedAvMan) {
            this.fuzzyNeedAvMan = solveNullList(fuzzyNeedAvMan);
            return this;
        }

        public QueryBuilder rightFuzzyNeedAvMan(List<String> rightFuzzyNeedAvMan) {
            this.rightFuzzyNeedAvMan = rightFuzzyNeedAvMan;
            return this;
        }

        public QueryBuilder rightFuzzyNeedAvMan(String... rightFuzzyNeedAvMan) {
            this.rightFuzzyNeedAvMan = solveNullList(rightFuzzyNeedAvMan);
            return this;
        }

        public QueryBuilder needAvMan(String needAvMan) {
            setNeedAvMan(needAvMan);
            return this;
        }

        public QueryBuilder needAvManList(String... needAvMan) {
            this.needAvManList = solveNullList(needAvMan);
            return this;
        }

        public QueryBuilder needAvManList(List<String> needAvMan) {
            this.needAvManList = needAvMan;
            return this;
        }

        public QueryBuilder fetchNeedAvMan() {
            setFetchFields("fetchFields", "needAvMan");
            return this;
        }

        public QueryBuilder excludeNeedAvMan() {
            setFetchFields("excludeFields", "needAvMan");
            return this;
        }

        public QueryBuilder needAvTimeBetWeen(java.time.LocalDateTime needAvTimeSt, java.time.LocalDateTime needAvTimeEd) {
            this.needAvTimeSt = needAvTimeSt;
            this.needAvTimeEd = needAvTimeEd;
            return this;
        }

        public QueryBuilder needAvTimeGreaterEqThan(java.time.LocalDateTime needAvTimeSt) {
            this.needAvTimeSt = needAvTimeSt;
            return this;
        }

        public QueryBuilder needAvTimeLessEqThan(java.time.LocalDateTime needAvTimeEd) {
            this.needAvTimeEd = needAvTimeEd;
            return this;
        }


        public QueryBuilder needAvTime(java.time.LocalDateTime needAvTime) {
            setNeedAvTime(needAvTime);
            return this;
        }

        public QueryBuilder needAvTimeList(java.time.LocalDateTime... needAvTime) {
            this.needAvTimeList = solveNullList(needAvTime);
            return this;
        }

        public QueryBuilder needAvTimeList(List<java.time.LocalDateTime> needAvTime) {
            this.needAvTimeList = needAvTime;
            return this;
        }

        public QueryBuilder fetchNeedAvTime() {
            setFetchFields("fetchFields", "needAvTime");
            return this;
        }

        public QueryBuilder excludeNeedAvTime() {
            setFetchFields("excludeFields", "needAvTime");
            return this;
        }

        public QueryBuilder fuzzyNeedAvIdea(List<String> fuzzyNeedAvIdea) {
            this.fuzzyNeedAvIdea = fuzzyNeedAvIdea;
            return this;
        }

        public QueryBuilder fuzzyNeedAvIdea(String... fuzzyNeedAvIdea) {
            this.fuzzyNeedAvIdea = solveNullList(fuzzyNeedAvIdea);
            return this;
        }

        public QueryBuilder rightFuzzyNeedAvIdea(List<String> rightFuzzyNeedAvIdea) {
            this.rightFuzzyNeedAvIdea = rightFuzzyNeedAvIdea;
            return this;
        }

        public QueryBuilder rightFuzzyNeedAvIdea(String... rightFuzzyNeedAvIdea) {
            this.rightFuzzyNeedAvIdea = solveNullList(rightFuzzyNeedAvIdea);
            return this;
        }

        public QueryBuilder needAvIdea(String needAvIdea) {
            setNeedAvIdea(needAvIdea);
            return this;
        }

        public QueryBuilder needAvIdeaList(String... needAvIdea) {
            this.needAvIdeaList = solveNullList(needAvIdea);
            return this;
        }

        public QueryBuilder needAvIdeaList(List<String> needAvIdea) {
            this.needAvIdeaList = needAvIdea;
            return this;
        }

        public QueryBuilder fetchNeedAvIdea() {
            setFetchFields("fetchFields", "needAvIdea");
            return this;
        }

        public QueryBuilder excludeNeedAvIdea() {
            setFetchFields("excludeFields", "needAvIdea");
            return this;
        }

        public QueryBuilder fuzzyNeedExplain(List<String> fuzzyNeedExplain) {
            this.fuzzyNeedExplain = fuzzyNeedExplain;
            return this;
        }

        public QueryBuilder fuzzyNeedExplain(String... fuzzyNeedExplain) {
            this.fuzzyNeedExplain = solveNullList(fuzzyNeedExplain);
            return this;
        }

        public QueryBuilder rightFuzzyNeedExplain(List<String> rightFuzzyNeedExplain) {
            this.rightFuzzyNeedExplain = rightFuzzyNeedExplain;
            return this;
        }

        public QueryBuilder rightFuzzyNeedExplain(String... rightFuzzyNeedExplain) {
            this.rightFuzzyNeedExplain = solveNullList(rightFuzzyNeedExplain);
            return this;
        }

        public QueryBuilder needExplain(String needExplain) {
            setNeedExplain(needExplain);
            return this;
        }

        public QueryBuilder needExplainList(String... needExplain) {
            this.needExplainList = solveNullList(needExplain);
            return this;
        }

        public QueryBuilder needExplainList(List<String> needExplain) {
            this.needExplainList = needExplain;
            return this;
        }

        public QueryBuilder fetchNeedExplain() {
            setFetchFields("fetchFields", "needExplain");
            return this;
        }

        public QueryBuilder excludeNeedExplain() {
            setFetchFields("excludeFields", "needExplain");
            return this;
        }

        public QueryBuilder fuzzyBuyMan(List<String> fuzzyBuyMan) {
            this.fuzzyBuyMan = fuzzyBuyMan;
            return this;
        }

        public QueryBuilder fuzzyBuyMan(String... fuzzyBuyMan) {
            this.fuzzyBuyMan = solveNullList(fuzzyBuyMan);
            return this;
        }

        public QueryBuilder rightFuzzyBuyMan(List<String> rightFuzzyBuyMan) {
            this.rightFuzzyBuyMan = rightFuzzyBuyMan;
            return this;
        }

        public QueryBuilder rightFuzzyBuyMan(String... rightFuzzyBuyMan) {
            this.rightFuzzyBuyMan = solveNullList(rightFuzzyBuyMan);
            return this;
        }

        public QueryBuilder buyMan(String buyMan) {
            setBuyMan(buyMan);
            return this;
        }

        public QueryBuilder buyManList(String... buyMan) {
            this.buyManList = solveNullList(buyMan);
            return this;
        }

        public QueryBuilder buyManList(List<String> buyMan) {
            this.buyManList = buyMan;
            return this;
        }

        public QueryBuilder fetchBuyMan() {
            setFetchFields("fetchFields", "buyMan");
            return this;
        }

        public QueryBuilder excludeBuyMan() {
            setFetchFields("excludeFields", "buyMan");
            return this;
        }

        public QueryBuilder buyTimeBetWeen(java.time.LocalDateTime buyTimeSt, java.time.LocalDateTime buyTimeEd) {
            this.buyTimeSt = buyTimeSt;
            this.buyTimeEd = buyTimeEd;
            return this;
        }

        public QueryBuilder buyTimeGreaterEqThan(java.time.LocalDateTime buyTimeSt) {
            this.buyTimeSt = buyTimeSt;
            return this;
        }

        public QueryBuilder buyTimeLessEqThan(java.time.LocalDateTime buyTimeEd) {
            this.buyTimeEd = buyTimeEd;
            return this;
        }


        public QueryBuilder buyTime(java.time.LocalDateTime buyTime) {
            setBuyTime(buyTime);
            return this;
        }

        public QueryBuilder buyTimeList(java.time.LocalDateTime... buyTime) {
            this.buyTimeList = solveNullList(buyTime);
            return this;
        }

        public QueryBuilder buyTimeList(List<java.time.LocalDateTime> buyTime) {
            this.buyTimeList = buyTime;
            return this;
        }

        public QueryBuilder fetchBuyTime() {
            setFetchFields("fetchFields", "buyTime");
            return this;
        }

        public QueryBuilder excludeBuyTime() {
            setFetchFields("excludeFields", "buyTime");
            return this;
        }

        public QueryBuilder fuzzyBuyAvMan(List<String> fuzzyBuyAvMan) {
            this.fuzzyBuyAvMan = fuzzyBuyAvMan;
            return this;
        }

        public QueryBuilder fuzzyBuyAvMan(String... fuzzyBuyAvMan) {
            this.fuzzyBuyAvMan = solveNullList(fuzzyBuyAvMan);
            return this;
        }

        public QueryBuilder rightFuzzyBuyAvMan(List<String> rightFuzzyBuyAvMan) {
            this.rightFuzzyBuyAvMan = rightFuzzyBuyAvMan;
            return this;
        }

        public QueryBuilder rightFuzzyBuyAvMan(String... rightFuzzyBuyAvMan) {
            this.rightFuzzyBuyAvMan = solveNullList(rightFuzzyBuyAvMan);
            return this;
        }

        public QueryBuilder buyAvMan(String buyAvMan) {
            setBuyAvMan(buyAvMan);
            return this;
        }

        public QueryBuilder buyAvManList(String... buyAvMan) {
            this.buyAvManList = solveNullList(buyAvMan);
            return this;
        }

        public QueryBuilder buyAvManList(List<String> buyAvMan) {
            this.buyAvManList = buyAvMan;
            return this;
        }

        public QueryBuilder fetchBuyAvMan() {
            setFetchFields("fetchFields", "buyAvMan");
            return this;
        }

        public QueryBuilder excludeBuyAvMan() {
            setFetchFields("excludeFields", "buyAvMan");
            return this;
        }

        public QueryBuilder buyAvTimeBetWeen(java.time.LocalDateTime buyAvTimeSt, java.time.LocalDateTime buyAvTimeEd) {
            this.buyAvTimeSt = buyAvTimeSt;
            this.buyAvTimeEd = buyAvTimeEd;
            return this;
        }

        public QueryBuilder buyAvTimeGreaterEqThan(java.time.LocalDateTime buyAvTimeSt) {
            this.buyAvTimeSt = buyAvTimeSt;
            return this;
        }

        public QueryBuilder buyAvTimeLessEqThan(java.time.LocalDateTime buyAvTimeEd) {
            this.buyAvTimeEd = buyAvTimeEd;
            return this;
        }


        public QueryBuilder buyAvTime(java.time.LocalDateTime buyAvTime) {
            setBuyAvTime(buyAvTime);
            return this;
        }

        public QueryBuilder buyAvTimeList(java.time.LocalDateTime... buyAvTime) {
            this.buyAvTimeList = solveNullList(buyAvTime);
            return this;
        }

        public QueryBuilder buyAvTimeList(List<java.time.LocalDateTime> buyAvTime) {
            this.buyAvTimeList = buyAvTime;
            return this;
        }

        public QueryBuilder fetchBuyAvTime() {
            setFetchFields("fetchFields", "buyAvTime");
            return this;
        }

        public QueryBuilder excludeBuyAvTime() {
            setFetchFields("excludeFields", "buyAvTime");
            return this;
        }

        public QueryBuilder fuzzyBuyAvIdea(List<String> fuzzyBuyAvIdea) {
            this.fuzzyBuyAvIdea = fuzzyBuyAvIdea;
            return this;
        }

        public QueryBuilder fuzzyBuyAvIdea(String... fuzzyBuyAvIdea) {
            this.fuzzyBuyAvIdea = solveNullList(fuzzyBuyAvIdea);
            return this;
        }

        public QueryBuilder rightFuzzyBuyAvIdea(List<String> rightFuzzyBuyAvIdea) {
            this.rightFuzzyBuyAvIdea = rightFuzzyBuyAvIdea;
            return this;
        }

        public QueryBuilder rightFuzzyBuyAvIdea(String... rightFuzzyBuyAvIdea) {
            this.rightFuzzyBuyAvIdea = solveNullList(rightFuzzyBuyAvIdea);
            return this;
        }

        public QueryBuilder buyAvIdea(String buyAvIdea) {
            setBuyAvIdea(buyAvIdea);
            return this;
        }

        public QueryBuilder buyAvIdeaList(String... buyAvIdea) {
            this.buyAvIdeaList = solveNullList(buyAvIdea);
            return this;
        }

        public QueryBuilder buyAvIdeaList(List<String> buyAvIdea) {
            this.buyAvIdeaList = buyAvIdea;
            return this;
        }

        public QueryBuilder fetchBuyAvIdea() {
            setFetchFields("fetchFields", "buyAvIdea");
            return this;
        }

        public QueryBuilder excludeBuyAvIdea() {
            setFetchFields("excludeFields", "buyAvIdea");
            return this;
        }

        public QueryBuilder fuzzyBuyExplain(List<String> fuzzyBuyExplain) {
            this.fuzzyBuyExplain = fuzzyBuyExplain;
            return this;
        }

        public QueryBuilder fuzzyBuyExplain(String... fuzzyBuyExplain) {
            this.fuzzyBuyExplain = solveNullList(fuzzyBuyExplain);
            return this;
        }

        public QueryBuilder rightFuzzyBuyExplain(List<String> rightFuzzyBuyExplain) {
            this.rightFuzzyBuyExplain = rightFuzzyBuyExplain;
            return this;
        }

        public QueryBuilder rightFuzzyBuyExplain(String... rightFuzzyBuyExplain) {
            this.rightFuzzyBuyExplain = solveNullList(rightFuzzyBuyExplain);
            return this;
        }

        public QueryBuilder buyExplain(String buyExplain) {
            setBuyExplain(buyExplain);
            return this;
        }

        public QueryBuilder buyExplainList(String... buyExplain) {
            this.buyExplainList = solveNullList(buyExplain);
            return this;
        }

        public QueryBuilder buyExplainList(List<String> buyExplain) {
            this.buyExplainList = buyExplain;
            return this;
        }

        public QueryBuilder fetchBuyExplain() {
            setFetchFields("fetchFields", "buyExplain");
            return this;
        }

        public QueryBuilder excludeBuyExplain() {
            setFetchFields("excludeFields", "buyExplain");
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

        public TbPlan build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<Integer> numList;

        public List<Integer> getNumList() {
            return this.numList;
        }

        private Integer numSt;

        private Integer numEd;

        public Integer getNumSt() {
            return this.numSt;
        }

        public Integer getNumEd() {
            return this.numEd;
        }

        private List<String> planNameList;

        public List<String> getPlanNameList() {
            return this.planNameList;
        }


        private List<String> fuzzyPlanName;

        public List<String> getFuzzyPlanName() {
            return this.fuzzyPlanName;
        }

        private List<String> rightFuzzyPlanName;

        public List<String> getRightFuzzyPlanName() {
            return this.rightFuzzyPlanName;
        }

        private List<String> planTypeList;

        public List<String> getPlanTypeList() {
            return this.planTypeList;
        }


        private List<String> fuzzyPlanType;

        public List<String> getFuzzyPlanType() {
            return this.fuzzyPlanType;
        }

        private List<String> rightFuzzyPlanType;

        public List<String> getRightFuzzyPlanType() {
            return this.rightFuzzyPlanType;
        }

        private List<String> mrCfNumList;

        public List<String> getMrCfNumList() {
            return this.mrCfNumList;
        }


        private List<String> fuzzyMrCfNum;

        public List<String> getFuzzyMrCfNum() {
            return this.fuzzyMrCfNum;
        }

        private List<String> rightFuzzyMrCfNum;

        public List<String> getRightFuzzyMrCfNum() {
            return this.rightFuzzyMrCfNum;
        }

        private List<String> mrNumList;

        public List<String> getMrNumList() {
            return this.mrNumList;
        }


        private List<String> fuzzyMrNum;

        public List<String> getFuzzyMrNum() {
            return this.fuzzyMrNum;
        }

        private List<String> rightFuzzyMrNum;

        public List<String> getRightFuzzyMrNum() {
            return this.rightFuzzyMrNum;
        }

        private List<Integer> needNumList;

        public List<Integer> getNeedNumList() {
            return this.needNumList;
        }

        private Integer needNumSt;

        private Integer needNumEd;

        public Integer getNeedNumSt() {
            return this.needNumSt;
        }

        public Integer getNeedNumEd() {
            return this.needNumEd;
        }

        private List<java.time.LocalDateTime> writeTimeList;

        public List<java.time.LocalDateTime> getWriteTimeList() {
            return this.writeTimeList;
        }

        private java.time.LocalDateTime writeTimeSt;

        private java.time.LocalDateTime writeTimeEd;

        public java.time.LocalDateTime getWriteTimeSt() {
            return this.writeTimeSt;
        }

        public java.time.LocalDateTime getWriteTimeEd() {
            return this.writeTimeEd;
        }

        private List<String> needUnitList;

        public List<String> getNeedUnitList() {
            return this.needUnitList;
        }


        private List<String> fuzzyNeedUnit;

        public List<String> getFuzzyNeedUnit() {
            return this.fuzzyNeedUnit;
        }

        private List<String> rightFuzzyNeedUnit;

        public List<String> getRightFuzzyNeedUnit() {
            return this.rightFuzzyNeedUnit;
        }

        private List<String> avStatusList;

        public List<String> getAvStatusList() {
            return this.avStatusList;
        }


        private List<String> fuzzyAvStatus;

        public List<String> getFuzzyAvStatus() {
            return this.fuzzyAvStatus;
        }

        private List<String> rightFuzzyAvStatus;

        public List<String> getRightFuzzyAvStatus() {
            return this.rightFuzzyAvStatus;
        }

        private List<String> needMonthList;

        public List<String> getNeedMonthList() {
            return this.needMonthList;
        }


        private List<String> fuzzyNeedMonth;

        public List<String> getFuzzyNeedMonth() {
            return this.fuzzyNeedMonth;
        }

        private List<String> rightFuzzyNeedMonth;

        public List<String> getRightFuzzyNeedMonth() {
            return this.rightFuzzyNeedMonth;
        }

        private List<Integer> ynSupplyList;

        public List<Integer> getYnSupplyList() {
            return this.ynSupplyList;
        }

        private Integer ynSupplySt;

        private Integer ynSupplyEd;

        public Integer getYnSupplySt() {
            return this.ynSupplySt;
        }

        public Integer getYnSupplyEd() {
            return this.ynSupplyEd;
        }

        private List<String> wtSupplyList;

        public List<String> getWtSupplyList() {
            return this.wtSupplyList;
        }


        private List<String> fuzzyWtSupply;

        public List<String> getFuzzyWtSupply() {
            return this.fuzzyWtSupply;
        }

        private List<String> rightFuzzyWtSupply;

        public List<String> getRightFuzzyWtSupply() {
            return this.rightFuzzyWtSupply;
        }

        private List<String> ftSupplyList;

        public List<String> getFtSupplyList() {
            return this.ftSupplyList;
        }


        private List<String> fuzzyFtSupply;

        public List<String> getFuzzyFtSupply() {
            return this.fuzzyFtSupply;
        }

        private List<String> rightFuzzyFtSupply;

        public List<String> getRightFuzzyFtSupply() {
            return this.rightFuzzyFtSupply;
        }

        private List<String> mrTraceList;

        public List<String> getMrTraceList() {
            return this.mrTraceList;
        }


        private List<String> fuzzyMrTrace;

        public List<String> getFuzzyMrTrace() {
            return this.fuzzyMrTrace;
        }

        private List<String> rightFuzzyMrTrace;

        public List<String> getRightFuzzyMrTrace() {
            return this.rightFuzzyMrTrace;
        }

        private List<String> remarkList;

        public List<String> getRemarkList() {
            return this.remarkList;
        }


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark() {
            return this.fuzzyRemark;
        }

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark() {
            return this.rightFuzzyRemark;
        }

        private List<String> needManList;

        public List<String> getNeedManList() {
            return this.needManList;
        }


        private List<String> fuzzyNeedMan;

        public List<String> getFuzzyNeedMan() {
            return this.fuzzyNeedMan;
        }

        private List<String> rightFuzzyNeedMan;

        public List<String> getRightFuzzyNeedMan() {
            return this.rightFuzzyNeedMan;
        }

        private List<java.time.LocalDateTime> needTimeList;

        public List<java.time.LocalDateTime> getNeedTimeList() {
            return this.needTimeList;
        }

        private java.time.LocalDateTime needTimeSt;

        private java.time.LocalDateTime needTimeEd;

        public java.time.LocalDateTime getNeedTimeSt() {
            return this.needTimeSt;
        }

        public java.time.LocalDateTime getNeedTimeEd() {
            return this.needTimeEd;
        }

        private List<String> needAvManList;

        public List<String> getNeedAvManList() {
            return this.needAvManList;
        }


        private List<String> fuzzyNeedAvMan;

        public List<String> getFuzzyNeedAvMan() {
            return this.fuzzyNeedAvMan;
        }

        private List<String> rightFuzzyNeedAvMan;

        public List<String> getRightFuzzyNeedAvMan() {
            return this.rightFuzzyNeedAvMan;
        }

        private List<java.time.LocalDateTime> needAvTimeList;

        public List<java.time.LocalDateTime> getNeedAvTimeList() {
            return this.needAvTimeList;
        }

        private java.time.LocalDateTime needAvTimeSt;

        private java.time.LocalDateTime needAvTimeEd;

        public java.time.LocalDateTime getNeedAvTimeSt() {
            return this.needAvTimeSt;
        }

        public java.time.LocalDateTime getNeedAvTimeEd() {
            return this.needAvTimeEd;
        }

        private List<String> needAvIdeaList;

        public List<String> getNeedAvIdeaList() {
            return this.needAvIdeaList;
        }


        private List<String> fuzzyNeedAvIdea;

        public List<String> getFuzzyNeedAvIdea() {
            return this.fuzzyNeedAvIdea;
        }

        private List<String> rightFuzzyNeedAvIdea;

        public List<String> getRightFuzzyNeedAvIdea() {
            return this.rightFuzzyNeedAvIdea;
        }

        private List<String> needExplainList;

        public List<String> getNeedExplainList() {
            return this.needExplainList;
        }


        private List<String> fuzzyNeedExplain;

        public List<String> getFuzzyNeedExplain() {
            return this.fuzzyNeedExplain;
        }

        private List<String> rightFuzzyNeedExplain;

        public List<String> getRightFuzzyNeedExplain() {
            return this.rightFuzzyNeedExplain;
        }

        private List<String> buyManList;

        public List<String> getBuyManList() {
            return this.buyManList;
        }


        private List<String> fuzzyBuyMan;

        public List<String> getFuzzyBuyMan() {
            return this.fuzzyBuyMan;
        }

        private List<String> rightFuzzyBuyMan;

        public List<String> getRightFuzzyBuyMan() {
            return this.rightFuzzyBuyMan;
        }

        private List<java.time.LocalDateTime> buyTimeList;

        public List<java.time.LocalDateTime> getBuyTimeList() {
            return this.buyTimeList;
        }

        private java.time.LocalDateTime buyTimeSt;

        private java.time.LocalDateTime buyTimeEd;

        public java.time.LocalDateTime getBuyTimeSt() {
            return this.buyTimeSt;
        }

        public java.time.LocalDateTime getBuyTimeEd() {
            return this.buyTimeEd;
        }

        private List<String> buyAvManList;

        public List<String> getBuyAvManList() {
            return this.buyAvManList;
        }


        private List<String> fuzzyBuyAvMan;

        public List<String> getFuzzyBuyAvMan() {
            return this.fuzzyBuyAvMan;
        }

        private List<String> rightFuzzyBuyAvMan;

        public List<String> getRightFuzzyBuyAvMan() {
            return this.rightFuzzyBuyAvMan;
        }

        private List<java.time.LocalDateTime> buyAvTimeList;

        public List<java.time.LocalDateTime> getBuyAvTimeList() {
            return this.buyAvTimeList;
        }

        private java.time.LocalDateTime buyAvTimeSt;

        private java.time.LocalDateTime buyAvTimeEd;

        public java.time.LocalDateTime getBuyAvTimeSt() {
            return this.buyAvTimeSt;
        }

        public java.time.LocalDateTime getBuyAvTimeEd() {
            return this.buyAvTimeEd;
        }

        private List<String> buyAvIdeaList;

        public List<String> getBuyAvIdeaList() {
            return this.buyAvIdeaList;
        }


        private List<String> fuzzyBuyAvIdea;

        public List<String> getFuzzyBuyAvIdea() {
            return this.fuzzyBuyAvIdea;
        }

        private List<String> rightFuzzyBuyAvIdea;

        public List<String> getRightFuzzyBuyAvIdea() {
            return this.rightFuzzyBuyAvIdea;
        }

        private List<String> buyExplainList;

        public List<String> getBuyExplainList() {
            return this.buyExplainList;
        }


        private List<String> fuzzyBuyExplain;

        public List<String> getFuzzyBuyExplain() {
            return this.fuzzyBuyExplain;
        }

        private List<String> rightFuzzyBuyExplain;

        public List<String> getRightFuzzyBuyExplain() {
            return this.rightFuzzyBuyExplain;
        }

        public ConditionBuilder numBetWeen(Integer numSt, Integer numEd) {
            this.numSt = numSt;
            this.numEd = numEd;
            return this;
        }

        public ConditionBuilder numGreaterEqThan(Integer numSt) {
            this.numSt = numSt;
            return this;
        }

        public ConditionBuilder numLessEqThan(Integer numEd) {
            this.numEd = numEd;
            return this;
        }


        public ConditionBuilder numList(Integer... num) {
            this.numList = solveNullList(num);
            return this;
        }

        public ConditionBuilder numList(List<Integer> num) {
            this.numList = num;
            return this;
        }

        public ConditionBuilder fuzzyPlanName(List<String> fuzzyPlanName) {
            this.fuzzyPlanName = fuzzyPlanName;
            return this;
        }

        public ConditionBuilder fuzzyPlanName(String... fuzzyPlanName) {
            this.fuzzyPlanName = solveNullList(fuzzyPlanName);
            return this;
        }

        public ConditionBuilder rightFuzzyPlanName(List<String> rightFuzzyPlanName) {
            this.rightFuzzyPlanName = rightFuzzyPlanName;
            return this;
        }

        public ConditionBuilder rightFuzzyPlanName(String... rightFuzzyPlanName) {
            this.rightFuzzyPlanName = solveNullList(rightFuzzyPlanName);
            return this;
        }

        public ConditionBuilder planNameList(String... planName) {
            this.planNameList = solveNullList(planName);
            return this;
        }

        public ConditionBuilder planNameList(List<String> planName) {
            this.planNameList = planName;
            return this;
        }

        public ConditionBuilder fuzzyPlanType(List<String> fuzzyPlanType) {
            this.fuzzyPlanType = fuzzyPlanType;
            return this;
        }

        public ConditionBuilder fuzzyPlanType(String... fuzzyPlanType) {
            this.fuzzyPlanType = solveNullList(fuzzyPlanType);
            return this;
        }

        public ConditionBuilder rightFuzzyPlanType(List<String> rightFuzzyPlanType) {
            this.rightFuzzyPlanType = rightFuzzyPlanType;
            return this;
        }

        public ConditionBuilder rightFuzzyPlanType(String... rightFuzzyPlanType) {
            this.rightFuzzyPlanType = solveNullList(rightFuzzyPlanType);
            return this;
        }

        public ConditionBuilder planTypeList(String... planType) {
            this.planTypeList = solveNullList(planType);
            return this;
        }

        public ConditionBuilder planTypeList(List<String> planType) {
            this.planTypeList = planType;
            return this;
        }

        public ConditionBuilder fuzzyMrCfNum(List<String> fuzzyMrCfNum) {
            this.fuzzyMrCfNum = fuzzyMrCfNum;
            return this;
        }

        public ConditionBuilder fuzzyMrCfNum(String... fuzzyMrCfNum) {
            this.fuzzyMrCfNum = solveNullList(fuzzyMrCfNum);
            return this;
        }

        public ConditionBuilder rightFuzzyMrCfNum(List<String> rightFuzzyMrCfNum) {
            this.rightFuzzyMrCfNum = rightFuzzyMrCfNum;
            return this;
        }

        public ConditionBuilder rightFuzzyMrCfNum(String... rightFuzzyMrCfNum) {
            this.rightFuzzyMrCfNum = solveNullList(rightFuzzyMrCfNum);
            return this;
        }

        public ConditionBuilder mrCfNumList(String... mrCfNum) {
            this.mrCfNumList = solveNullList(mrCfNum);
            return this;
        }

        public ConditionBuilder mrCfNumList(List<String> mrCfNum) {
            this.mrCfNumList = mrCfNum;
            return this;
        }

        public ConditionBuilder fuzzyMrNum(List<String> fuzzyMrNum) {
            this.fuzzyMrNum = fuzzyMrNum;
            return this;
        }

        public ConditionBuilder fuzzyMrNum(String... fuzzyMrNum) {
            this.fuzzyMrNum = solveNullList(fuzzyMrNum);
            return this;
        }

        public ConditionBuilder rightFuzzyMrNum(List<String> rightFuzzyMrNum) {
            this.rightFuzzyMrNum = rightFuzzyMrNum;
            return this;
        }

        public ConditionBuilder rightFuzzyMrNum(String... rightFuzzyMrNum) {
            this.rightFuzzyMrNum = solveNullList(rightFuzzyMrNum);
            return this;
        }

        public ConditionBuilder mrNumList(String... mrNum) {
            this.mrNumList = solveNullList(mrNum);
            return this;
        }

        public ConditionBuilder mrNumList(List<String> mrNum) {
            this.mrNumList = mrNum;
            return this;
        }

        public ConditionBuilder needNumBetWeen(Integer needNumSt, Integer needNumEd) {
            this.needNumSt = needNumSt;
            this.needNumEd = needNumEd;
            return this;
        }

        public ConditionBuilder needNumGreaterEqThan(Integer needNumSt) {
            this.needNumSt = needNumSt;
            return this;
        }

        public ConditionBuilder needNumLessEqThan(Integer needNumEd) {
            this.needNumEd = needNumEd;
            return this;
        }


        public ConditionBuilder needNumList(Integer... needNum) {
            this.needNumList = solveNullList(needNum);
            return this;
        }

        public ConditionBuilder needNumList(List<Integer> needNum) {
            this.needNumList = needNum;
            return this;
        }

        public ConditionBuilder writeTimeBetWeen(java.time.LocalDateTime writeTimeSt, java.time.LocalDateTime writeTimeEd) {
            this.writeTimeSt = writeTimeSt;
            this.writeTimeEd = writeTimeEd;
            return this;
        }

        public ConditionBuilder writeTimeGreaterEqThan(java.time.LocalDateTime writeTimeSt) {
            this.writeTimeSt = writeTimeSt;
            return this;
        }

        public ConditionBuilder writeTimeLessEqThan(java.time.LocalDateTime writeTimeEd) {
            this.writeTimeEd = writeTimeEd;
            return this;
        }


        public ConditionBuilder writeTimeList(java.time.LocalDateTime... writeTime) {
            this.writeTimeList = solveNullList(writeTime);
            return this;
        }

        public ConditionBuilder writeTimeList(List<java.time.LocalDateTime> writeTime) {
            this.writeTimeList = writeTime;
            return this;
        }

        public ConditionBuilder fuzzyNeedUnit(List<String> fuzzyNeedUnit) {
            this.fuzzyNeedUnit = fuzzyNeedUnit;
            return this;
        }

        public ConditionBuilder fuzzyNeedUnit(String... fuzzyNeedUnit) {
            this.fuzzyNeedUnit = solveNullList(fuzzyNeedUnit);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedUnit(List<String> rightFuzzyNeedUnit) {
            this.rightFuzzyNeedUnit = rightFuzzyNeedUnit;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedUnit(String... rightFuzzyNeedUnit) {
            this.rightFuzzyNeedUnit = solveNullList(rightFuzzyNeedUnit);
            return this;
        }

        public ConditionBuilder needUnitList(String... needUnit) {
            this.needUnitList = solveNullList(needUnit);
            return this;
        }

        public ConditionBuilder needUnitList(List<String> needUnit) {
            this.needUnitList = needUnit;
            return this;
        }

        public ConditionBuilder fuzzyAvStatus(List<String> fuzzyAvStatus) {
            this.fuzzyAvStatus = fuzzyAvStatus;
            return this;
        }

        public ConditionBuilder fuzzyAvStatus(String... fuzzyAvStatus) {
            this.fuzzyAvStatus = solveNullList(fuzzyAvStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyAvStatus(List<String> rightFuzzyAvStatus) {
            this.rightFuzzyAvStatus = rightFuzzyAvStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyAvStatus(String... rightFuzzyAvStatus) {
            this.rightFuzzyAvStatus = solveNullList(rightFuzzyAvStatus);
            return this;
        }

        public ConditionBuilder avStatusList(String... avStatus) {
            this.avStatusList = solveNullList(avStatus);
            return this;
        }

        public ConditionBuilder avStatusList(List<String> avStatus) {
            this.avStatusList = avStatus;
            return this;
        }

        public ConditionBuilder fuzzyNeedMonth(List<String> fuzzyNeedMonth) {
            this.fuzzyNeedMonth = fuzzyNeedMonth;
            return this;
        }

        public ConditionBuilder fuzzyNeedMonth(String... fuzzyNeedMonth) {
            this.fuzzyNeedMonth = solveNullList(fuzzyNeedMonth);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedMonth(List<String> rightFuzzyNeedMonth) {
            this.rightFuzzyNeedMonth = rightFuzzyNeedMonth;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedMonth(String... rightFuzzyNeedMonth) {
            this.rightFuzzyNeedMonth = solveNullList(rightFuzzyNeedMonth);
            return this;
        }

        public ConditionBuilder needMonthList(String... needMonth) {
            this.needMonthList = solveNullList(needMonth);
            return this;
        }

        public ConditionBuilder needMonthList(List<String> needMonth) {
            this.needMonthList = needMonth;
            return this;
        }

        public ConditionBuilder ynSupplyBetWeen(Integer ynSupplySt, Integer ynSupplyEd) {
            this.ynSupplySt = ynSupplySt;
            this.ynSupplyEd = ynSupplyEd;
            return this;
        }

        public ConditionBuilder ynSupplyGreaterEqThan(Integer ynSupplySt) {
            this.ynSupplySt = ynSupplySt;
            return this;
        }

        public ConditionBuilder ynSupplyLessEqThan(Integer ynSupplyEd) {
            this.ynSupplyEd = ynSupplyEd;
            return this;
        }


        public ConditionBuilder ynSupplyList(Integer... ynSupply) {
            this.ynSupplyList = solveNullList(ynSupply);
            return this;
        }

        public ConditionBuilder ynSupplyList(List<Integer> ynSupply) {
            this.ynSupplyList = ynSupply;
            return this;
        }

        public ConditionBuilder fuzzyWtSupply(List<String> fuzzyWtSupply) {
            this.fuzzyWtSupply = fuzzyWtSupply;
            return this;
        }

        public ConditionBuilder fuzzyWtSupply(String... fuzzyWtSupply) {
            this.fuzzyWtSupply = solveNullList(fuzzyWtSupply);
            return this;
        }

        public ConditionBuilder rightFuzzyWtSupply(List<String> rightFuzzyWtSupply) {
            this.rightFuzzyWtSupply = rightFuzzyWtSupply;
            return this;
        }

        public ConditionBuilder rightFuzzyWtSupply(String... rightFuzzyWtSupply) {
            this.rightFuzzyWtSupply = solveNullList(rightFuzzyWtSupply);
            return this;
        }

        public ConditionBuilder wtSupplyList(String... wtSupply) {
            this.wtSupplyList = solveNullList(wtSupply);
            return this;
        }

        public ConditionBuilder wtSupplyList(List<String> wtSupply) {
            this.wtSupplyList = wtSupply;
            return this;
        }

        public ConditionBuilder fuzzyFtSupply(List<String> fuzzyFtSupply) {
            this.fuzzyFtSupply = fuzzyFtSupply;
            return this;
        }

        public ConditionBuilder fuzzyFtSupply(String... fuzzyFtSupply) {
            this.fuzzyFtSupply = solveNullList(fuzzyFtSupply);
            return this;
        }

        public ConditionBuilder rightFuzzyFtSupply(List<String> rightFuzzyFtSupply) {
            this.rightFuzzyFtSupply = rightFuzzyFtSupply;
            return this;
        }

        public ConditionBuilder rightFuzzyFtSupply(String... rightFuzzyFtSupply) {
            this.rightFuzzyFtSupply = solveNullList(rightFuzzyFtSupply);
            return this;
        }

        public ConditionBuilder ftSupplyList(String... ftSupply) {
            this.ftSupplyList = solveNullList(ftSupply);
            return this;
        }

        public ConditionBuilder ftSupplyList(List<String> ftSupply) {
            this.ftSupplyList = ftSupply;
            return this;
        }

        public ConditionBuilder fuzzyMrTrace(List<String> fuzzyMrTrace) {
            this.fuzzyMrTrace = fuzzyMrTrace;
            return this;
        }

        public ConditionBuilder fuzzyMrTrace(String... fuzzyMrTrace) {
            this.fuzzyMrTrace = solveNullList(fuzzyMrTrace);
            return this;
        }

        public ConditionBuilder rightFuzzyMrTrace(List<String> rightFuzzyMrTrace) {
            this.rightFuzzyMrTrace = rightFuzzyMrTrace;
            return this;
        }

        public ConditionBuilder rightFuzzyMrTrace(String... rightFuzzyMrTrace) {
            this.rightFuzzyMrTrace = solveNullList(rightFuzzyMrTrace);
            return this;
        }

        public ConditionBuilder mrTraceList(String... mrTrace) {
            this.mrTraceList = solveNullList(mrTrace);
            return this;
        }

        public ConditionBuilder mrTraceList(List<String> mrTrace) {
            this.mrTraceList = mrTrace;
            return this;
        }

        public ConditionBuilder fuzzyRemark(List<String> fuzzyRemark) {
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark(String... fuzzyRemark) {
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark(List<String> rightFuzzyRemark) {
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark(String... rightFuzzyRemark) {
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String... remark) {
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark) {
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder fuzzyNeedMan(List<String> fuzzyNeedMan) {
            this.fuzzyNeedMan = fuzzyNeedMan;
            return this;
        }

        public ConditionBuilder fuzzyNeedMan(String... fuzzyNeedMan) {
            this.fuzzyNeedMan = solveNullList(fuzzyNeedMan);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedMan(List<String> rightFuzzyNeedMan) {
            this.rightFuzzyNeedMan = rightFuzzyNeedMan;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedMan(String... rightFuzzyNeedMan) {
            this.rightFuzzyNeedMan = solveNullList(rightFuzzyNeedMan);
            return this;
        }

        public ConditionBuilder needManList(String... needMan) {
            this.needManList = solveNullList(needMan);
            return this;
        }

        public ConditionBuilder needManList(List<String> needMan) {
            this.needManList = needMan;
            return this;
        }

        public ConditionBuilder needTimeBetWeen(java.time.LocalDateTime needTimeSt, java.time.LocalDateTime needTimeEd) {
            this.needTimeSt = needTimeSt;
            this.needTimeEd = needTimeEd;
            return this;
        }

        public ConditionBuilder needTimeGreaterEqThan(java.time.LocalDateTime needTimeSt) {
            this.needTimeSt = needTimeSt;
            return this;
        }

        public ConditionBuilder needTimeLessEqThan(java.time.LocalDateTime needTimeEd) {
            this.needTimeEd = needTimeEd;
            return this;
        }


        public ConditionBuilder needTimeList(java.time.LocalDateTime... needTime) {
            this.needTimeList = solveNullList(needTime);
            return this;
        }

        public ConditionBuilder needTimeList(List<java.time.LocalDateTime> needTime) {
            this.needTimeList = needTime;
            return this;
        }

        public ConditionBuilder fuzzyNeedAvMan(List<String> fuzzyNeedAvMan) {
            this.fuzzyNeedAvMan = fuzzyNeedAvMan;
            return this;
        }

        public ConditionBuilder fuzzyNeedAvMan(String... fuzzyNeedAvMan) {
            this.fuzzyNeedAvMan = solveNullList(fuzzyNeedAvMan);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedAvMan(List<String> rightFuzzyNeedAvMan) {
            this.rightFuzzyNeedAvMan = rightFuzzyNeedAvMan;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedAvMan(String... rightFuzzyNeedAvMan) {
            this.rightFuzzyNeedAvMan = solveNullList(rightFuzzyNeedAvMan);
            return this;
        }

        public ConditionBuilder needAvManList(String... needAvMan) {
            this.needAvManList = solveNullList(needAvMan);
            return this;
        }

        public ConditionBuilder needAvManList(List<String> needAvMan) {
            this.needAvManList = needAvMan;
            return this;
        }

        public ConditionBuilder needAvTimeBetWeen(java.time.LocalDateTime needAvTimeSt, java.time.LocalDateTime needAvTimeEd) {
            this.needAvTimeSt = needAvTimeSt;
            this.needAvTimeEd = needAvTimeEd;
            return this;
        }

        public ConditionBuilder needAvTimeGreaterEqThan(java.time.LocalDateTime needAvTimeSt) {
            this.needAvTimeSt = needAvTimeSt;
            return this;
        }

        public ConditionBuilder needAvTimeLessEqThan(java.time.LocalDateTime needAvTimeEd) {
            this.needAvTimeEd = needAvTimeEd;
            return this;
        }


        public ConditionBuilder needAvTimeList(java.time.LocalDateTime... needAvTime) {
            this.needAvTimeList = solveNullList(needAvTime);
            return this;
        }

        public ConditionBuilder needAvTimeList(List<java.time.LocalDateTime> needAvTime) {
            this.needAvTimeList = needAvTime;
            return this;
        }

        public ConditionBuilder fuzzyNeedAvIdea(List<String> fuzzyNeedAvIdea) {
            this.fuzzyNeedAvIdea = fuzzyNeedAvIdea;
            return this;
        }

        public ConditionBuilder fuzzyNeedAvIdea(String... fuzzyNeedAvIdea) {
            this.fuzzyNeedAvIdea = solveNullList(fuzzyNeedAvIdea);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedAvIdea(List<String> rightFuzzyNeedAvIdea) {
            this.rightFuzzyNeedAvIdea = rightFuzzyNeedAvIdea;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedAvIdea(String... rightFuzzyNeedAvIdea) {
            this.rightFuzzyNeedAvIdea = solveNullList(rightFuzzyNeedAvIdea);
            return this;
        }

        public ConditionBuilder needAvIdeaList(String... needAvIdea) {
            this.needAvIdeaList = solveNullList(needAvIdea);
            return this;
        }

        public ConditionBuilder needAvIdeaList(List<String> needAvIdea) {
            this.needAvIdeaList = needAvIdea;
            return this;
        }

        public ConditionBuilder fuzzyNeedExplain(List<String> fuzzyNeedExplain) {
            this.fuzzyNeedExplain = fuzzyNeedExplain;
            return this;
        }

        public ConditionBuilder fuzzyNeedExplain(String... fuzzyNeedExplain) {
            this.fuzzyNeedExplain = solveNullList(fuzzyNeedExplain);
            return this;
        }

        public ConditionBuilder rightFuzzyNeedExplain(List<String> rightFuzzyNeedExplain) {
            this.rightFuzzyNeedExplain = rightFuzzyNeedExplain;
            return this;
        }

        public ConditionBuilder rightFuzzyNeedExplain(String... rightFuzzyNeedExplain) {
            this.rightFuzzyNeedExplain = solveNullList(rightFuzzyNeedExplain);
            return this;
        }

        public ConditionBuilder needExplainList(String... needExplain) {
            this.needExplainList = solveNullList(needExplain);
            return this;
        }

        public ConditionBuilder needExplainList(List<String> needExplain) {
            this.needExplainList = needExplain;
            return this;
        }

        public ConditionBuilder fuzzyBuyMan(List<String> fuzzyBuyMan) {
            this.fuzzyBuyMan = fuzzyBuyMan;
            return this;
        }

        public ConditionBuilder fuzzyBuyMan(String... fuzzyBuyMan) {
            this.fuzzyBuyMan = solveNullList(fuzzyBuyMan);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyMan(List<String> rightFuzzyBuyMan) {
            this.rightFuzzyBuyMan = rightFuzzyBuyMan;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyMan(String... rightFuzzyBuyMan) {
            this.rightFuzzyBuyMan = solveNullList(rightFuzzyBuyMan);
            return this;
        }

        public ConditionBuilder buyManList(String... buyMan) {
            this.buyManList = solveNullList(buyMan);
            return this;
        }

        public ConditionBuilder buyManList(List<String> buyMan) {
            this.buyManList = buyMan;
            return this;
        }

        public ConditionBuilder buyTimeBetWeen(java.time.LocalDateTime buyTimeSt, java.time.LocalDateTime buyTimeEd) {
            this.buyTimeSt = buyTimeSt;
            this.buyTimeEd = buyTimeEd;
            return this;
        }

        public ConditionBuilder buyTimeGreaterEqThan(java.time.LocalDateTime buyTimeSt) {
            this.buyTimeSt = buyTimeSt;
            return this;
        }

        public ConditionBuilder buyTimeLessEqThan(java.time.LocalDateTime buyTimeEd) {
            this.buyTimeEd = buyTimeEd;
            return this;
        }


        public ConditionBuilder buyTimeList(java.time.LocalDateTime... buyTime) {
            this.buyTimeList = solveNullList(buyTime);
            return this;
        }

        public ConditionBuilder buyTimeList(List<java.time.LocalDateTime> buyTime) {
            this.buyTimeList = buyTime;
            return this;
        }

        public ConditionBuilder fuzzyBuyAvMan(List<String> fuzzyBuyAvMan) {
            this.fuzzyBuyAvMan = fuzzyBuyAvMan;
            return this;
        }

        public ConditionBuilder fuzzyBuyAvMan(String... fuzzyBuyAvMan) {
            this.fuzzyBuyAvMan = solveNullList(fuzzyBuyAvMan);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyAvMan(List<String> rightFuzzyBuyAvMan) {
            this.rightFuzzyBuyAvMan = rightFuzzyBuyAvMan;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyAvMan(String... rightFuzzyBuyAvMan) {
            this.rightFuzzyBuyAvMan = solveNullList(rightFuzzyBuyAvMan);
            return this;
        }

        public ConditionBuilder buyAvManList(String... buyAvMan) {
            this.buyAvManList = solveNullList(buyAvMan);
            return this;
        }

        public ConditionBuilder buyAvManList(List<String> buyAvMan) {
            this.buyAvManList = buyAvMan;
            return this;
        }

        public ConditionBuilder buyAvTimeBetWeen(java.time.LocalDateTime buyAvTimeSt, java.time.LocalDateTime buyAvTimeEd) {
            this.buyAvTimeSt = buyAvTimeSt;
            this.buyAvTimeEd = buyAvTimeEd;
            return this;
        }

        public ConditionBuilder buyAvTimeGreaterEqThan(java.time.LocalDateTime buyAvTimeSt) {
            this.buyAvTimeSt = buyAvTimeSt;
            return this;
        }

        public ConditionBuilder buyAvTimeLessEqThan(java.time.LocalDateTime buyAvTimeEd) {
            this.buyAvTimeEd = buyAvTimeEd;
            return this;
        }


        public ConditionBuilder buyAvTimeList(java.time.LocalDateTime... buyAvTime) {
            this.buyAvTimeList = solveNullList(buyAvTime);
            return this;
        }

        public ConditionBuilder buyAvTimeList(List<java.time.LocalDateTime> buyAvTime) {
            this.buyAvTimeList = buyAvTime;
            return this;
        }

        public ConditionBuilder fuzzyBuyAvIdea(List<String> fuzzyBuyAvIdea) {
            this.fuzzyBuyAvIdea = fuzzyBuyAvIdea;
            return this;
        }

        public ConditionBuilder fuzzyBuyAvIdea(String... fuzzyBuyAvIdea) {
            this.fuzzyBuyAvIdea = solveNullList(fuzzyBuyAvIdea);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyAvIdea(List<String> rightFuzzyBuyAvIdea) {
            this.rightFuzzyBuyAvIdea = rightFuzzyBuyAvIdea;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyAvIdea(String... rightFuzzyBuyAvIdea) {
            this.rightFuzzyBuyAvIdea = solveNullList(rightFuzzyBuyAvIdea);
            return this;
        }

        public ConditionBuilder buyAvIdeaList(String... buyAvIdea) {
            this.buyAvIdeaList = solveNullList(buyAvIdea);
            return this;
        }

        public ConditionBuilder buyAvIdeaList(List<String> buyAvIdea) {
            this.buyAvIdeaList = buyAvIdea;
            return this;
        }

        public ConditionBuilder fuzzyBuyExplain(List<String> fuzzyBuyExplain) {
            this.fuzzyBuyExplain = fuzzyBuyExplain;
            return this;
        }

        public ConditionBuilder fuzzyBuyExplain(String... fuzzyBuyExplain) {
            this.fuzzyBuyExplain = solveNullList(fuzzyBuyExplain);
            return this;
        }

        public ConditionBuilder rightFuzzyBuyExplain(List<String> rightFuzzyBuyExplain) {
            this.rightFuzzyBuyExplain = rightFuzzyBuyExplain;
            return this;
        }

        public ConditionBuilder rightFuzzyBuyExplain(String... rightFuzzyBuyExplain) {
            this.rightFuzzyBuyExplain = solveNullList(rightFuzzyBuyExplain);
            return this;
        }

        public ConditionBuilder buyExplainList(String... buyExplain) {
            this.buyExplainList = solveNullList(buyExplain);
            return this;
        }

        public ConditionBuilder buyExplainList(List<String> buyExplain) {
            this.buyExplainList = buyExplain;
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

        private TbPlan obj;

        public Builder() {
            this.obj = new TbPlan();
        }

        public Builder num(Integer num) {
            this.obj.setNum(num);
            return this;
        }

        public Builder planName(String planName) {
            this.obj.setPlanName(planName);
            return this;
        }

        public Builder planType(String planType) {
            this.obj.setPlanType(planType);
            return this;
        }

        public Builder mrCfNum(String mrCfNum) {
            this.obj.setMrCfNum(mrCfNum);
            return this;
        }

        public Builder mrNum(String mrNum) {
            this.obj.setMrNum(mrNum);
            return this;
        }

        public Builder needNum(Integer needNum) {
            this.obj.setNeedNum(needNum);
            return this;
        }

        public Builder writeTime(java.time.LocalDateTime writeTime) {
            this.obj.setWriteTime(writeTime);
            return this;
        }

        public Builder needUnit(String needUnit) {
            this.obj.setNeedUnit(needUnit);
            return this;
        }

        public Builder avStatus(String avStatus) {
            this.obj.setAvStatus(avStatus);
            return this;
        }

        public Builder needMonth(String needMonth) {
            this.obj.setNeedMonth(needMonth);
            return this;
        }

        public Builder ynSupply(Integer ynSupply) {
            this.obj.setYnSupply(ynSupply);
            return this;
        }

        public Builder wtSupply(String wtSupply) {
            this.obj.setWtSupply(wtSupply);
            return this;
        }

        public Builder ftSupply(String ftSupply) {
            this.obj.setFtSupply(ftSupply);
            return this;
        }

        public Builder mrTrace(String mrTrace) {
            this.obj.setMrTrace(mrTrace);
            return this;
        }

        public Builder remark(String remark) {
            this.obj.setRemark(remark);
            return this;
        }

        public Builder needMan(String needMan) {
            this.obj.setNeedMan(needMan);
            return this;
        }

        public Builder needTime(java.time.LocalDateTime needTime) {
            this.obj.setNeedTime(needTime);
            return this;
        }

        public Builder needAvMan(String needAvMan) {
            this.obj.setNeedAvMan(needAvMan);
            return this;
        }

        public Builder needAvTime(java.time.LocalDateTime needAvTime) {
            this.obj.setNeedAvTime(needAvTime);
            return this;
        }

        public Builder needAvIdea(String needAvIdea) {
            this.obj.setNeedAvIdea(needAvIdea);
            return this;
        }

        public Builder needExplain(String needExplain) {
            this.obj.setNeedExplain(needExplain);
            return this;
        }

        public Builder buyMan(String buyMan) {
            this.obj.setBuyMan(buyMan);
            return this;
        }

        public Builder buyTime(java.time.LocalDateTime buyTime) {
            this.obj.setBuyTime(buyTime);
            return this;
        }

        public Builder buyAvMan(String buyAvMan) {
            this.obj.setBuyAvMan(buyAvMan);
            return this;
        }

        public Builder buyAvTime(java.time.LocalDateTime buyAvTime) {
            this.obj.setBuyAvTime(buyAvTime);
            return this;
        }

        public Builder buyAvIdea(String buyAvIdea) {
            this.obj.setBuyAvIdea(buyAvIdea);
            return this;
        }

        public Builder buyExplain(String buyExplain) {
            this.obj.setBuyExplain(buyExplain);
            return this;
        }

        public TbPlan build() {
            return obj;
        }
    }

}
