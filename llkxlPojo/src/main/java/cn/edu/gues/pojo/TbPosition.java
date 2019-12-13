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
public class TbPosition implements Serializable {

    private static final long serialVersionUID = 1573699603981L;


    /**
     * 主键
     * 职位编号
     * isNullAble:0
     */
    private String ptNum;

    /**
     * 职位名称
     * isNullAble:0
     */
    private String ptName;

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

    public String getPtNum() {
        return this.ptNum;
    }

    public void setPtNum(String ptNum) {
        this.ptNum = ptNum;
    }

    public String getPtName() {
        return this.ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    @Override
    public String toString() {
        return "TbPosition{" +
                "ptNum='" + ptNum + '\'' +
                "ptName='" + ptName + '\'' +
                '}';
    }

    public static class UpdateBuilder {

        private TbPosition set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbPosition set) {
            this.set = set;
            return this;
        }

        public TbPosition getSet() {
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

    public static class QueryBuilder extends TbPosition {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;
        private List<String> ptNumList;
        private List<String> fuzzyPtNum;
        private List<String> rightFuzzyPtNum;
        private List<String> ptNameList;
        private List<String> fuzzyPtName;
        private List<String> rightFuzzyPtName;

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
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

        public List<String> getPtNameList() {
            return this.ptNameList;
        }

        public List<String> getFuzzyPtName() {
            return this.fuzzyPtName;
        }

        public List<String> getRightFuzzyPtName() {
            return this.rightFuzzyPtName;
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

        public QueryBuilder fuzzyPtName(List<String> fuzzyPtName) {
            this.fuzzyPtName = fuzzyPtName;
            return this;
        }

        public QueryBuilder fuzzyPtName(String... fuzzyPtName) {
            this.fuzzyPtName = solveNullList(fuzzyPtName);
            return this;
        }

        public QueryBuilder rightFuzzyPtName(List<String> rightFuzzyPtName) {
            this.rightFuzzyPtName = rightFuzzyPtName;
            return this;
        }

        public QueryBuilder rightFuzzyPtName(String... rightFuzzyPtName) {
            this.rightFuzzyPtName = solveNullList(rightFuzzyPtName);
            return this;
        }

        public QueryBuilder ptName(String ptName) {
            setPtName(ptName);
            return this;
        }

        public QueryBuilder ptNameList(String... ptName) {
            this.ptNameList = solveNullList(ptName);
            return this;
        }

        public QueryBuilder ptNameList(List<String> ptName) {
            this.ptNameList = ptName;
            return this;
        }

        public QueryBuilder fetchPtName() {
            setFetchFields("fetchFields", "ptName");
            return this;
        }

        public QueryBuilder excludePtName() {
            setFetchFields("excludeFields", "ptName");
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

        public TbPosition build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<String> ptNumList;
        private List<String> fuzzyPtNum;
        private List<String> rightFuzzyPtNum;
        private List<String> ptNameList;
        private List<String> fuzzyPtName;
        private List<String> rightFuzzyPtName;

        public List<String> getPtNumList() {
            return this.ptNumList;
        }

        public List<String> getFuzzyPtNum() {
            return this.fuzzyPtNum;
        }

        public List<String> getRightFuzzyPtNum() {
            return this.rightFuzzyPtNum;
        }

        public List<String> getPtNameList() {
            return this.ptNameList;
        }

        public List<String> getFuzzyPtName() {
            return this.fuzzyPtName;
        }

        public List<String> getRightFuzzyPtName() {
            return this.rightFuzzyPtName;
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

        public ConditionBuilder fuzzyPtName(List<String> fuzzyPtName) {
            this.fuzzyPtName = fuzzyPtName;
            return this;
        }

        public ConditionBuilder fuzzyPtName(String... fuzzyPtName) {
            this.fuzzyPtName = solveNullList(fuzzyPtName);
            return this;
        }

        public ConditionBuilder rightFuzzyPtName(List<String> rightFuzzyPtName) {
            this.rightFuzzyPtName = rightFuzzyPtName;
            return this;
        }

        public ConditionBuilder rightFuzzyPtName(String... rightFuzzyPtName) {
            this.rightFuzzyPtName = solveNullList(rightFuzzyPtName);
            return this;
        }

        public ConditionBuilder ptNameList(String... ptName) {
            this.ptNameList = solveNullList(ptName);
            return this;
        }

        public ConditionBuilder ptNameList(List<String> ptName) {
            this.ptNameList = ptName;
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

        private TbPosition obj;

        public Builder() {
            this.obj = new TbPosition();
        }

        public Builder ptNum(String ptNum) {
            this.obj.setPtNum(ptNum);
            return this;
        }

        public Builder ptName(String ptName) {
            this.obj.setPtName(ptName);
            return this;
        }

        public TbPosition build() {
            return obj;
        }
    }

}
