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
public class TbMerge implements Serializable {

    private static final long serialVersionUID = 1573699595124L;


    /**
     * 主键
     * 编号
     * isNullAble:0
     */
    private String num;

    /**
     * 记录编号
     * isNullAble:0
     */
    private String recordNum;

    /**
     * 是否物料编码
     * isNullAble:0
     */
    private Integer ynMrNum;

    /**
     * 是否需求月份
     * isNullAble:1
     */
    private Integer ynNdMonth;

    /**
     * 是否期望供应商
     * isNullAble:1
     */
    private Integer ynWtSupply;

    /**
     * 是否固定供应商
     * isNullAble:1
     */
    private Integer ynFtSupply;

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

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRecordNum() {
        return this.recordNum;
    }

    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum;
    }

    public Integer getYnMrNum() {
        return this.ynMrNum;
    }

    public void setYnMrNum(Integer ynMrNum) {
        this.ynMrNum = ynMrNum;
    }

    public Integer getYnNdMonth() {
        return this.ynNdMonth;
    }

    public void setYnNdMonth(Integer ynNdMonth) {
        this.ynNdMonth = ynNdMonth;
    }

    public Integer getYnWtSupply() {
        return this.ynWtSupply;
    }

    public void setYnWtSupply(Integer ynWtSupply) {
        this.ynWtSupply = ynWtSupply;
    }

    public Integer getYnFtSupply() {
        return this.ynFtSupply;
    }

    public void setYnFtSupply(Integer ynFtSupply) {
        this.ynFtSupply = ynFtSupply;
    }

    @Override
    public String toString() {
        return "TbMerge{" +
                "num='" + num + '\'' +
                "recordNum='" + recordNum + '\'' +
                "ynMrNum='" + ynMrNum + '\'' +
                "ynNdMonth='" + ynNdMonth + '\'' +
                "ynWtSupply='" + ynWtSupply + '\'' +
                "ynFtSupply='" + ynFtSupply + '\'' +
                '}';
    }

    public static class UpdateBuilder {

        private TbMerge set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbMerge set) {
            this.set = set;
            return this;
        }

        public TbMerge getSet() {
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

    public static class QueryBuilder extends TbMerge {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;
        private List<String> numList;
        private List<String> fuzzyNum;
        private List<String> rightFuzzyNum;
        private List<String> recordNumList;
        private List<String> fuzzyRecordNum;
        private List<String> rightFuzzyRecordNum;
        private List<Integer> ynMrNumList;
        private Integer ynMrNumSt;
        private Integer ynMrNumEd;
        private List<Integer> ynNdMonthList;
        private Integer ynNdMonthSt;
        private Integer ynNdMonthEd;
        private List<Integer> ynWtSupplyList;
        private Integer ynWtSupplySt;
        private Integer ynWtSupplyEd;
        private List<Integer> ynFtSupplyList;
        private Integer ynFtSupplySt;
        private Integer ynFtSupplyEd;

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        public List<String> getNumList() {
            return this.numList;
        }

        public List<String> getFuzzyNum() {
            return this.fuzzyNum;
        }

        public List<String> getRightFuzzyNum() {
            return this.rightFuzzyNum;
        }

        public List<String> getRecordNumList() {
            return this.recordNumList;
        }

        public List<String> getFuzzyRecordNum() {
            return this.fuzzyRecordNum;
        }

        public List<String> getRightFuzzyRecordNum() {
            return this.rightFuzzyRecordNum;
        }

        public List<Integer> getYnMrNumList() {
            return this.ynMrNumList;
        }

        public Integer getYnMrNumSt() {
            return this.ynMrNumSt;
        }

        public Integer getYnMrNumEd() {
            return this.ynMrNumEd;
        }

        public List<Integer> getYnNdMonthList() {
            return this.ynNdMonthList;
        }

        public Integer getYnNdMonthSt() {
            return this.ynNdMonthSt;
        }

        public Integer getYnNdMonthEd() {
            return this.ynNdMonthEd;
        }

        public List<Integer> getYnWtSupplyList() {
            return this.ynWtSupplyList;
        }

        public Integer getYnWtSupplySt() {
            return this.ynWtSupplySt;
        }

        public Integer getYnWtSupplyEd() {
            return this.ynWtSupplyEd;
        }

        public List<Integer> getYnFtSupplyList() {
            return this.ynFtSupplyList;
        }

        public Integer getYnFtSupplySt() {
            return this.ynFtSupplySt;
        }

        public Integer getYnFtSupplyEd() {
            return this.ynFtSupplyEd;
        }

        public QueryBuilder fuzzyNum(List<String> fuzzyNum) {
            this.fuzzyNum = fuzzyNum;
            return this;
        }

        public QueryBuilder fuzzyNum(String... fuzzyNum) {
            this.fuzzyNum = solveNullList(fuzzyNum);
            return this;
        }

        public QueryBuilder rightFuzzyNum(List<String> rightFuzzyNum) {
            this.rightFuzzyNum = rightFuzzyNum;
            return this;
        }

        public QueryBuilder rightFuzzyNum(String... rightFuzzyNum) {
            this.rightFuzzyNum = solveNullList(rightFuzzyNum);
            return this;
        }

        public QueryBuilder num(String num) {
            setNum(num);
            return this;
        }

        public QueryBuilder numList(String... num) {
            this.numList = solveNullList(num);
            return this;
        }

        public QueryBuilder numList(List<String> num) {
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

        public QueryBuilder fuzzyRecordNum(List<String> fuzzyRecordNum) {
            this.fuzzyRecordNum = fuzzyRecordNum;
            return this;
        }

        public QueryBuilder fuzzyRecordNum(String... fuzzyRecordNum) {
            this.fuzzyRecordNum = solveNullList(fuzzyRecordNum);
            return this;
        }

        public QueryBuilder rightFuzzyRecordNum(List<String> rightFuzzyRecordNum) {
            this.rightFuzzyRecordNum = rightFuzzyRecordNum;
            return this;
        }

        public QueryBuilder rightFuzzyRecordNum(String... rightFuzzyRecordNum) {
            this.rightFuzzyRecordNum = solveNullList(rightFuzzyRecordNum);
            return this;
        }

        public QueryBuilder recordNum(String recordNum) {
            setRecordNum(recordNum);
            return this;
        }

        public QueryBuilder recordNumList(String... recordNum) {
            this.recordNumList = solveNullList(recordNum);
            return this;
        }

        public QueryBuilder recordNumList(List<String> recordNum) {
            this.recordNumList = recordNum;
            return this;
        }

        public QueryBuilder fetchRecordNum() {
            setFetchFields("fetchFields", "recordNum");
            return this;
        }

        public QueryBuilder excludeRecordNum() {
            setFetchFields("excludeFields", "recordNum");
            return this;
        }

        public QueryBuilder ynMrNumBetWeen(Integer ynMrNumSt, Integer ynMrNumEd) {
            this.ynMrNumSt = ynMrNumSt;
            this.ynMrNumEd = ynMrNumEd;
            return this;
        }

        public QueryBuilder ynMrNumGreaterEqThan(Integer ynMrNumSt) {
            this.ynMrNumSt = ynMrNumSt;
            return this;
        }

        public QueryBuilder ynMrNumLessEqThan(Integer ynMrNumEd) {
            this.ynMrNumEd = ynMrNumEd;
            return this;
        }


        public QueryBuilder ynMrNum(Integer ynMrNum) {
            setYnMrNum(ynMrNum);
            return this;
        }

        public QueryBuilder ynMrNumList(Integer... ynMrNum) {
            this.ynMrNumList = solveNullList(ynMrNum);
            return this;
        }

        public QueryBuilder ynMrNumList(List<Integer> ynMrNum) {
            this.ynMrNumList = ynMrNum;
            return this;
        }

        public QueryBuilder fetchYnMrNum() {
            setFetchFields("fetchFields", "ynMrNum");
            return this;
        }

        public QueryBuilder excludeYnMrNum() {
            setFetchFields("excludeFields", "ynMrNum");
            return this;
        }

        public QueryBuilder ynNdMonthBetWeen(Integer ynNdMonthSt, Integer ynNdMonthEd) {
            this.ynNdMonthSt = ynNdMonthSt;
            this.ynNdMonthEd = ynNdMonthEd;
            return this;
        }

        public QueryBuilder ynNdMonthGreaterEqThan(Integer ynNdMonthSt) {
            this.ynNdMonthSt = ynNdMonthSt;
            return this;
        }

        public QueryBuilder ynNdMonthLessEqThan(Integer ynNdMonthEd) {
            this.ynNdMonthEd = ynNdMonthEd;
            return this;
        }


        public QueryBuilder ynNdMonth(Integer ynNdMonth) {
            setYnNdMonth(ynNdMonth);
            return this;
        }

        public QueryBuilder ynNdMonthList(Integer... ynNdMonth) {
            this.ynNdMonthList = solveNullList(ynNdMonth);
            return this;
        }

        public QueryBuilder ynNdMonthList(List<Integer> ynNdMonth) {
            this.ynNdMonthList = ynNdMonth;
            return this;
        }

        public QueryBuilder fetchYnNdMonth() {
            setFetchFields("fetchFields", "ynNdMonth");
            return this;
        }

        public QueryBuilder excludeYnNdMonth() {
            setFetchFields("excludeFields", "ynNdMonth");
            return this;
        }

        public QueryBuilder ynWtSupplyBetWeen(Integer ynWtSupplySt, Integer ynWtSupplyEd) {
            this.ynWtSupplySt = ynWtSupplySt;
            this.ynWtSupplyEd = ynWtSupplyEd;
            return this;
        }

        public QueryBuilder ynWtSupplyGreaterEqThan(Integer ynWtSupplySt) {
            this.ynWtSupplySt = ynWtSupplySt;
            return this;
        }

        public QueryBuilder ynWtSupplyLessEqThan(Integer ynWtSupplyEd) {
            this.ynWtSupplyEd = ynWtSupplyEd;
            return this;
        }


        public QueryBuilder ynWtSupply(Integer ynWtSupply) {
            setYnWtSupply(ynWtSupply);
            return this;
        }

        public QueryBuilder ynWtSupplyList(Integer... ynWtSupply) {
            this.ynWtSupplyList = solveNullList(ynWtSupply);
            return this;
        }

        public QueryBuilder ynWtSupplyList(List<Integer> ynWtSupply) {
            this.ynWtSupplyList = ynWtSupply;
            return this;
        }

        public QueryBuilder fetchYnWtSupply() {
            setFetchFields("fetchFields", "ynWtSupply");
            return this;
        }

        public QueryBuilder excludeYnWtSupply() {
            setFetchFields("excludeFields", "ynWtSupply");
            return this;
        }

        public QueryBuilder ynFtSupplyBetWeen(Integer ynFtSupplySt, Integer ynFtSupplyEd) {
            this.ynFtSupplySt = ynFtSupplySt;
            this.ynFtSupplyEd = ynFtSupplyEd;
            return this;
        }

        public QueryBuilder ynFtSupplyGreaterEqThan(Integer ynFtSupplySt) {
            this.ynFtSupplySt = ynFtSupplySt;
            return this;
        }

        public QueryBuilder ynFtSupplyLessEqThan(Integer ynFtSupplyEd) {
            this.ynFtSupplyEd = ynFtSupplyEd;
            return this;
        }


        public QueryBuilder ynFtSupply(Integer ynFtSupply) {
            setYnFtSupply(ynFtSupply);
            return this;
        }

        public QueryBuilder ynFtSupplyList(Integer... ynFtSupply) {
            this.ynFtSupplyList = solveNullList(ynFtSupply);
            return this;
        }

        public QueryBuilder ynFtSupplyList(List<Integer> ynFtSupply) {
            this.ynFtSupplyList = ynFtSupply;
            return this;
        }

        public QueryBuilder fetchYnFtSupply() {
            setFetchFields("fetchFields", "ynFtSupply");
            return this;
        }

        public QueryBuilder excludeYnFtSupply() {
            setFetchFields("excludeFields", "ynFtSupply");
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

        public TbMerge build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<String> numList;
        private List<String> fuzzyNum;
        private List<String> rightFuzzyNum;
        private List<String> recordNumList;
        private List<String> fuzzyRecordNum;
        private List<String> rightFuzzyRecordNum;
        private List<Integer> ynMrNumList;
        private Integer ynMrNumSt;
        private Integer ynMrNumEd;
        private List<Integer> ynNdMonthList;
        private Integer ynNdMonthSt;
        private Integer ynNdMonthEd;
        private List<Integer> ynWtSupplyList;
        private Integer ynWtSupplySt;
        private Integer ynWtSupplyEd;
        private List<Integer> ynFtSupplyList;
        private Integer ynFtSupplySt;
        private Integer ynFtSupplyEd;

        public List<String> getNumList() {
            return this.numList;
        }

        public List<String> getFuzzyNum() {
            return this.fuzzyNum;
        }

        public List<String> getRightFuzzyNum() {
            return this.rightFuzzyNum;
        }

        public List<String> getRecordNumList() {
            return this.recordNumList;
        }

        public List<String> getFuzzyRecordNum() {
            return this.fuzzyRecordNum;
        }

        public List<String> getRightFuzzyRecordNum() {
            return this.rightFuzzyRecordNum;
        }

        public List<Integer> getYnMrNumList() {
            return this.ynMrNumList;
        }

        public Integer getYnMrNumSt() {
            return this.ynMrNumSt;
        }

        public Integer getYnMrNumEd() {
            return this.ynMrNumEd;
        }

        public List<Integer> getYnNdMonthList() {
            return this.ynNdMonthList;
        }

        public Integer getYnNdMonthSt() {
            return this.ynNdMonthSt;
        }

        public Integer getYnNdMonthEd() {
            return this.ynNdMonthEd;
        }

        public List<Integer> getYnWtSupplyList() {
            return this.ynWtSupplyList;
        }

        public Integer getYnWtSupplySt() {
            return this.ynWtSupplySt;
        }

        public Integer getYnWtSupplyEd() {
            return this.ynWtSupplyEd;
        }

        public List<Integer> getYnFtSupplyList() {
            return this.ynFtSupplyList;
        }

        public Integer getYnFtSupplySt() {
            return this.ynFtSupplySt;
        }

        public Integer getYnFtSupplyEd() {
            return this.ynFtSupplyEd;
        }


        public ConditionBuilder fuzzyNum(List<String> fuzzyNum) {
            this.fuzzyNum = fuzzyNum;
            return this;
        }

        public ConditionBuilder fuzzyNum(String... fuzzyNum) {
            this.fuzzyNum = solveNullList(fuzzyNum);
            return this;
        }

        public ConditionBuilder rightFuzzyNum(List<String> rightFuzzyNum) {
            this.rightFuzzyNum = rightFuzzyNum;
            return this;
        }

        public ConditionBuilder rightFuzzyNum(String... rightFuzzyNum) {
            this.rightFuzzyNum = solveNullList(rightFuzzyNum);
            return this;
        }

        public ConditionBuilder numList(String... num) {
            this.numList = solveNullList(num);
            return this;
        }

        public ConditionBuilder numList(List<String> num) {
            this.numList = num;
            return this;
        }

        public ConditionBuilder fuzzyRecordNum(List<String> fuzzyRecordNum) {
            this.fuzzyRecordNum = fuzzyRecordNum;
            return this;
        }

        public ConditionBuilder fuzzyRecordNum(String... fuzzyRecordNum) {
            this.fuzzyRecordNum = solveNullList(fuzzyRecordNum);
            return this;
        }

        public ConditionBuilder rightFuzzyRecordNum(List<String> rightFuzzyRecordNum) {
            this.rightFuzzyRecordNum = rightFuzzyRecordNum;
            return this;
        }

        public ConditionBuilder rightFuzzyRecordNum(String... rightFuzzyRecordNum) {
            this.rightFuzzyRecordNum = solveNullList(rightFuzzyRecordNum);
            return this;
        }

        public ConditionBuilder recordNumList(String... recordNum) {
            this.recordNumList = solveNullList(recordNum);
            return this;
        }

        public ConditionBuilder recordNumList(List<String> recordNum) {
            this.recordNumList = recordNum;
            return this;
        }

        public ConditionBuilder ynMrNumBetWeen(Integer ynMrNumSt, Integer ynMrNumEd) {
            this.ynMrNumSt = ynMrNumSt;
            this.ynMrNumEd = ynMrNumEd;
            return this;
        }

        public ConditionBuilder ynMrNumGreaterEqThan(Integer ynMrNumSt) {
            this.ynMrNumSt = ynMrNumSt;
            return this;
        }

        public ConditionBuilder ynMrNumLessEqThan(Integer ynMrNumEd) {
            this.ynMrNumEd = ynMrNumEd;
            return this;
        }


        public ConditionBuilder ynMrNumList(Integer... ynMrNum) {
            this.ynMrNumList = solveNullList(ynMrNum);
            return this;
        }

        public ConditionBuilder ynMrNumList(List<Integer> ynMrNum) {
            this.ynMrNumList = ynMrNum;
            return this;
        }

        public ConditionBuilder ynNdMonthBetWeen(Integer ynNdMonthSt, Integer ynNdMonthEd) {
            this.ynNdMonthSt = ynNdMonthSt;
            this.ynNdMonthEd = ynNdMonthEd;
            return this;
        }

        public ConditionBuilder ynNdMonthGreaterEqThan(Integer ynNdMonthSt) {
            this.ynNdMonthSt = ynNdMonthSt;
            return this;
        }

        public ConditionBuilder ynNdMonthLessEqThan(Integer ynNdMonthEd) {
            this.ynNdMonthEd = ynNdMonthEd;
            return this;
        }


        public ConditionBuilder ynNdMonthList(Integer... ynNdMonth) {
            this.ynNdMonthList = solveNullList(ynNdMonth);
            return this;
        }

        public ConditionBuilder ynNdMonthList(List<Integer> ynNdMonth) {
            this.ynNdMonthList = ynNdMonth;
            return this;
        }

        public ConditionBuilder ynWtSupplyBetWeen(Integer ynWtSupplySt, Integer ynWtSupplyEd) {
            this.ynWtSupplySt = ynWtSupplySt;
            this.ynWtSupplyEd = ynWtSupplyEd;
            return this;
        }

        public ConditionBuilder ynWtSupplyGreaterEqThan(Integer ynWtSupplySt) {
            this.ynWtSupplySt = ynWtSupplySt;
            return this;
        }

        public ConditionBuilder ynWtSupplyLessEqThan(Integer ynWtSupplyEd) {
            this.ynWtSupplyEd = ynWtSupplyEd;
            return this;
        }


        public ConditionBuilder ynWtSupplyList(Integer... ynWtSupply) {
            this.ynWtSupplyList = solveNullList(ynWtSupply);
            return this;
        }

        public ConditionBuilder ynWtSupplyList(List<Integer> ynWtSupply) {
            this.ynWtSupplyList = ynWtSupply;
            return this;
        }

        public ConditionBuilder ynFtSupplyBetWeen(Integer ynFtSupplySt, Integer ynFtSupplyEd) {
            this.ynFtSupplySt = ynFtSupplySt;
            this.ynFtSupplyEd = ynFtSupplyEd;
            return this;
        }

        public ConditionBuilder ynFtSupplyGreaterEqThan(Integer ynFtSupplySt) {
            this.ynFtSupplySt = ynFtSupplySt;
            return this;
        }

        public ConditionBuilder ynFtSupplyLessEqThan(Integer ynFtSupplyEd) {
            this.ynFtSupplyEd = ynFtSupplyEd;
            return this;
        }


        public ConditionBuilder ynFtSupplyList(Integer... ynFtSupply) {
            this.ynFtSupplyList = solveNullList(ynFtSupply);
            return this;
        }

        public ConditionBuilder ynFtSupplyList(List<Integer> ynFtSupply) {
            this.ynFtSupplyList = ynFtSupply;
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

        private TbMerge obj;

        public Builder() {
            this.obj = new TbMerge();
        }

        public Builder num(String num) {
            this.obj.setNum(num);
            return this;
        }

        public Builder recordNum(String recordNum) {
            this.obj.setRecordNum(recordNum);
            return this;
        }

        public Builder ynMrNum(Integer ynMrNum) {
            this.obj.setYnMrNum(ynMrNum);
            return this;
        }

        public Builder ynNdMonth(Integer ynNdMonth) {
            this.obj.setYnNdMonth(ynNdMonth);
            return this;
        }

        public Builder ynWtSupply(Integer ynWtSupply) {
            this.obj.setYnWtSupply(ynWtSupply);
            return this;
        }

        public Builder ynFtSupply(Integer ynFtSupply) {
            this.obj.setYnFtSupply(ynFtSupply);
            return this;
        }

        public TbMerge build() {
            return obj;
        }
    }

}
