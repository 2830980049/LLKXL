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
public class TbDepartment implements Serializable {

    private static final long serialVersionUID = 1573699586584L;


    /**
     * 主键
     * 部门编号
     * isNullAble:0
     */
    private String dtNum;

    /**
     * 部门名称
     * isNullAble:0
     */
    private String dtName;

    public static Builder Build() {
        return new Builder();
    }

    public static ConditionBuilder ConditionBuild() {
        return new ConditionBuilder();
    }

    /**
     * @return
     * @按条件更新
     */
    public static UpdateBuilder UpdateBuild() {
        return new UpdateBuilder();
    }

    public static QueryBuilder QueryBuild() {
        return new QueryBuilder();
    }

    public String getDtNum() {
        return this.dtNum;
    }

    public void setDtNum(String dtNum) {
        this.dtNum = dtNum;
    }

    public String getDtName() {
        return this.dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName;
    }

    @Override
    public String toString() {
        return "TbDepartment{" +
                "dtNum='" + dtNum + '\'' +
                "dtName='" + dtName + '\'' +
                '}';
    }

    public static class UpdateBuilder {

        private TbDepartment set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbDepartment set) {
            this.set = set;
            return this;
        }

        public TbDepartment getSet() {
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

    public static class QueryBuilder extends TbDepartment {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;
        private List<String> dtNumList;
        private List<String> fuzzyDtNum;
        private List<String> rightFuzzyDtNum;
        private List<String> dtNameList;
        private List<String> fuzzyDtName;
        private List<String> rightFuzzyDtName;

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
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

        public List<String> getDtNameList() {
            return this.dtNameList;
        }

        public List<String> getFuzzyDtName() {
            return this.fuzzyDtName;
        }

        public List<String> getRightFuzzyDtName() {
            return this.rightFuzzyDtName;
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

        public QueryBuilder fuzzyDtName(List<String> fuzzyDtName) {
            this.fuzzyDtName = fuzzyDtName;
            return this;
        }

        public QueryBuilder fuzzyDtName(String... fuzzyDtName) {
            this.fuzzyDtName = solveNullList(fuzzyDtName);
            return this;
        }

        public QueryBuilder rightFuzzyDtName(List<String> rightFuzzyDtName) {
            this.rightFuzzyDtName = rightFuzzyDtName;
            return this;
        }

        public QueryBuilder rightFuzzyDtName(String... rightFuzzyDtName) {
            this.rightFuzzyDtName = solveNullList(rightFuzzyDtName);
            return this;
        }

        public QueryBuilder dtName(String dtName) {
            setDtName(dtName);
            return this;
        }

        public QueryBuilder dtNameList(String... dtName) {
            this.dtNameList = solveNullList(dtName);
            return this;
        }

        public QueryBuilder dtNameList(List<String> dtName) {
            this.dtNameList = dtName;
            return this;
        }

        public QueryBuilder fetchDtName() {
            setFetchFields("fetchFields", "dtName");
            return this;
        }

        public QueryBuilder excludeDtName() {
            setFetchFields("excludeFields", "dtName");
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

        public TbDepartment build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<String> dtNumList;
        private List<String> fuzzyDtNum;
        private List<String> rightFuzzyDtNum;
        private List<String> dtNameList;
        private List<String> fuzzyDtName;
        private List<String> rightFuzzyDtName;

        public List<String> getDtNumList() {
            return this.dtNumList;
        }

        public List<String> getFuzzyDtNum() {
            return this.fuzzyDtNum;
        }

        public List<String> getRightFuzzyDtNum() {
            return this.rightFuzzyDtNum;
        }

        public List<String> getDtNameList() {
            return this.dtNameList;
        }

        public List<String> getFuzzyDtName() {
            return this.fuzzyDtName;
        }

        public List<String> getRightFuzzyDtName() {
            return this.rightFuzzyDtName;
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

        public ConditionBuilder fuzzyDtName(List<String> fuzzyDtName) {
            this.fuzzyDtName = fuzzyDtName;
            return this;
        }

        public ConditionBuilder fuzzyDtName(String... fuzzyDtName) {
            this.fuzzyDtName = solveNullList(fuzzyDtName);
            return this;
        }

        public ConditionBuilder rightFuzzyDtName(List<String> rightFuzzyDtName) {
            this.rightFuzzyDtName = rightFuzzyDtName;
            return this;
        }

        public ConditionBuilder rightFuzzyDtName(String... rightFuzzyDtName) {
            this.rightFuzzyDtName = solveNullList(rightFuzzyDtName);
            return this;
        }

        public ConditionBuilder dtNameList(String... dtName) {
            this.dtNameList = solveNullList(dtName);
            return this;
        }

        public ConditionBuilder dtNameList(List<String> dtName) {
            this.dtNameList = dtName;
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

        private TbDepartment obj;

        public Builder() {
            this.obj = new TbDepartment();
        }

        public Builder dtNum(String dtNum) {
            this.obj.setDtNum(dtNum);
            return this;
        }

        public Builder dtName(String dtName) {
            this.obj.setDtName(dtName);
            return this;
        }

        public TbDepartment build() {
            return obj;
        }
    }

}
