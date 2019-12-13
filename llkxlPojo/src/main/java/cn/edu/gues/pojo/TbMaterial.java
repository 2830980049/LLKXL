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
public class TbMaterial implements Serializable {

    private static final long serialVersionUID = 1573699590872L;


    /**
     * 主键
     * 物料编码
     * isNullAble:0
     */
    private String mrNum;

    /**
     * 物料名称
     * isNullAble:0
     */
    private String mrName;

    /**
     * 物料分类码
     * isNullAble:0
     */
    private String mrCfNum;

    /**
     * 物料分类名称
     * isNullAble:0
     */
    private String mrCfName;

    /**
     * 规格
     * isNullAble:0
     */
    private String specification;

    /**
     * 型号
     * isNullAble:0
     */
    private String type;

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

    public String getMrNum() {
        return this.mrNum;
    }

    public void setMrNum(String mrNum) {
        this.mrNum = mrNum;
    }

    public String getMrName() {
        return this.mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    public String getMrCfNum() {
        return this.mrCfNum;
    }

    public void setMrCfNum(String mrCfNum) {
        this.mrCfNum = mrCfNum;
    }

    public String getMrCfName() {
        return this.mrCfName;
    }

    public void setMrCfName(String mrCfName) {
        this.mrCfName = mrCfName;
    }

    public String getSpecification() {
        return this.specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TbMaterial{" +
                "mrNum='" + mrNum + '\'' +
                "mrName='" + mrName + '\'' +
                "mrCfNum='" + mrCfNum + '\'' +
                "mrCfName='" + mrCfName + '\'' +
                "specification='" + specification + '\'' +
                "type='" + type + '\'' +
                '}';
    }

    public static class UpdateBuilder {

        private TbMaterial set;

        private ConditionBuilder where;

        public UpdateBuilder set(TbMaterial set) {
            this.set = set;
            return this;
        }

        public TbMaterial getSet() {
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

    public static class QueryBuilder extends TbMaterial {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;
        private List<String> mrNumList;
        private List<String> fuzzyMrNum;
        private List<String> rightFuzzyMrNum;
        private List<String> mrNameList;
        private List<String> fuzzyMrName;
        private List<String> rightFuzzyMrName;
        private List<String> mrCfNumList;
        private List<String> fuzzyMrCfNum;
        private List<String> rightFuzzyMrCfNum;
        private List<String> mrCfNameList;
        private List<String> fuzzyMrCfName;
        private List<String> rightFuzzyMrCfName;
        private List<String> specificationList;
        private List<String> fuzzySpecification;
        private List<String> rightFuzzySpecification;
        private List<String> typeList;
        private List<String> fuzzyType;
        private List<String> rightFuzzyType;

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        public List<String> getMrNumList() {
            return this.mrNumList;
        }

        public List<String> getFuzzyMrNum() {
            return this.fuzzyMrNum;
        }

        public List<String> getRightFuzzyMrNum() {
            return this.rightFuzzyMrNum;
        }

        public List<String> getMrNameList() {
            return this.mrNameList;
        }

        public List<String> getFuzzyMrName() {
            return this.fuzzyMrName;
        }

        public List<String> getRightFuzzyMrName() {
            return this.rightFuzzyMrName;
        }

        public List<String> getMrCfNumList() {
            return this.mrCfNumList;
        }

        public List<String> getFuzzyMrCfNum() {
            return this.fuzzyMrCfNum;
        }

        public List<String> getRightFuzzyMrCfNum() {
            return this.rightFuzzyMrCfNum;
        }

        public List<String> getMrCfNameList() {
            return this.mrCfNameList;
        }

        public List<String> getFuzzyMrCfName() {
            return this.fuzzyMrCfName;
        }

        public List<String> getRightFuzzyMrCfName() {
            return this.rightFuzzyMrCfName;
        }

        public List<String> getSpecificationList() {
            return this.specificationList;
        }

        public List<String> getFuzzySpecification() {
            return this.fuzzySpecification;
        }

        public List<String> getRightFuzzySpecification() {
            return this.rightFuzzySpecification;
        }

        public List<String> getTypeList() {
            return this.typeList;
        }

        public List<String> getFuzzyType() {
            return this.fuzzyType;
        }

        public List<String> getRightFuzzyType() {
            return this.rightFuzzyType;
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

        public QueryBuilder fuzzyMrName(List<String> fuzzyMrName) {
            this.fuzzyMrName = fuzzyMrName;
            return this;
        }

        public QueryBuilder fuzzyMrName(String... fuzzyMrName) {
            this.fuzzyMrName = solveNullList(fuzzyMrName);
            return this;
        }

        public QueryBuilder rightFuzzyMrName(List<String> rightFuzzyMrName) {
            this.rightFuzzyMrName = rightFuzzyMrName;
            return this;
        }

        public QueryBuilder rightFuzzyMrName(String... rightFuzzyMrName) {
            this.rightFuzzyMrName = solveNullList(rightFuzzyMrName);
            return this;
        }

        public QueryBuilder mrName(String mrName) {
            setMrName(mrName);
            return this;
        }

        public QueryBuilder mrNameList(String... mrName) {
            this.mrNameList = solveNullList(mrName);
            return this;
        }

        public QueryBuilder mrNameList(List<String> mrName) {
            this.mrNameList = mrName;
            return this;
        }

        public QueryBuilder fetchMrName() {
            setFetchFields("fetchFields", "mrName");
            return this;
        }

        public QueryBuilder excludeMrName() {
            setFetchFields("excludeFields", "mrName");
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

        public QueryBuilder fuzzyMrCfName(List<String> fuzzyMrCfName) {
            this.fuzzyMrCfName = fuzzyMrCfName;
            return this;
        }

        public QueryBuilder fuzzyMrCfName(String... fuzzyMrCfName) {
            this.fuzzyMrCfName = solveNullList(fuzzyMrCfName);
            return this;
        }

        public QueryBuilder rightFuzzyMrCfName(List<String> rightFuzzyMrCfName) {
            this.rightFuzzyMrCfName = rightFuzzyMrCfName;
            return this;
        }

        public QueryBuilder rightFuzzyMrCfName(String... rightFuzzyMrCfName) {
            this.rightFuzzyMrCfName = solveNullList(rightFuzzyMrCfName);
            return this;
        }

        public QueryBuilder mrCfName(String mrCfName) {
            setMrCfName(mrCfName);
            return this;
        }

        public QueryBuilder mrCfNameList(String... mrCfName) {
            this.mrCfNameList = solveNullList(mrCfName);
            return this;
        }

        public QueryBuilder mrCfNameList(List<String> mrCfName) {
            this.mrCfNameList = mrCfName;
            return this;
        }

        public QueryBuilder fetchMrCfName() {
            setFetchFields("fetchFields", "mrCfName");
            return this;
        }

        public QueryBuilder excludeMrCfName() {
            setFetchFields("excludeFields", "mrCfName");
            return this;
        }

        public QueryBuilder fuzzySpecification(List<String> fuzzySpecification) {
            this.fuzzySpecification = fuzzySpecification;
            return this;
        }

        public QueryBuilder fuzzySpecification(String... fuzzySpecification) {
            this.fuzzySpecification = solveNullList(fuzzySpecification);
            return this;
        }

        public QueryBuilder rightFuzzySpecification(List<String> rightFuzzySpecification) {
            this.rightFuzzySpecification = rightFuzzySpecification;
            return this;
        }

        public QueryBuilder rightFuzzySpecification(String... rightFuzzySpecification) {
            this.rightFuzzySpecification = solveNullList(rightFuzzySpecification);
            return this;
        }

        public QueryBuilder specification(String specification) {
            setSpecification(specification);
            return this;
        }

        public QueryBuilder specificationList(String... specification) {
            this.specificationList = solveNullList(specification);
            return this;
        }

        public QueryBuilder specificationList(List<String> specification) {
            this.specificationList = specification;
            return this;
        }

        public QueryBuilder fetchSpecification() {
            setFetchFields("fetchFields", "specification");
            return this;
        }

        public QueryBuilder excludeSpecification() {
            setFetchFields("excludeFields", "specification");
            return this;
        }

        public QueryBuilder fuzzyType(List<String> fuzzyType) {
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType(String... fuzzyType) {
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType(List<String> rightFuzzyType) {
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType(String... rightFuzzyType) {
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type) {
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String... type) {
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type) {
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType() {
            setFetchFields("fetchFields", "type");
            return this;
        }

        public QueryBuilder excludeType() {
            setFetchFields("excludeFields", "type");
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

        public TbMaterial build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<String> mrNumList;
        private List<String> fuzzyMrNum;
        private List<String> rightFuzzyMrNum;
        private List<String> mrNameList;
        private List<String> fuzzyMrName;
        private List<String> rightFuzzyMrName;
        private List<String> mrCfNumList;
        private List<String> fuzzyMrCfNum;
        private List<String> rightFuzzyMrCfNum;
        private List<String> mrCfNameList;
        private List<String> fuzzyMrCfName;
        private List<String> rightFuzzyMrCfName;
        private List<String> specificationList;
        private List<String> fuzzySpecification;
        private List<String> rightFuzzySpecification;
        private List<String> typeList;
        private List<String> fuzzyType;
        private List<String> rightFuzzyType;

        public List<String> getMrNumList() {
            return this.mrNumList;
        }

        public List<String> getFuzzyMrNum() {
            return this.fuzzyMrNum;
        }

        public List<String> getRightFuzzyMrNum() {
            return this.rightFuzzyMrNum;
        }

        public List<String> getMrNameList() {
            return this.mrNameList;
        }

        public List<String> getFuzzyMrName() {
            return this.fuzzyMrName;
        }

        public List<String> getRightFuzzyMrName() {
            return this.rightFuzzyMrName;
        }

        public List<String> getMrCfNumList() {
            return this.mrCfNumList;
        }

        public List<String> getFuzzyMrCfNum() {
            return this.fuzzyMrCfNum;
        }

        public List<String> getRightFuzzyMrCfNum() {
            return this.rightFuzzyMrCfNum;
        }

        public List<String> getMrCfNameList() {
            return this.mrCfNameList;
        }

        public List<String> getFuzzyMrCfName() {
            return this.fuzzyMrCfName;
        }

        public List<String> getRightFuzzyMrCfName() {
            return this.rightFuzzyMrCfName;
        }

        public List<String> getSpecificationList() {
            return this.specificationList;
        }

        public List<String> getFuzzySpecification() {
            return this.fuzzySpecification;
        }

        public List<String> getRightFuzzySpecification() {
            return this.rightFuzzySpecification;
        }

        public List<String> getTypeList() {
            return this.typeList;
        }

        public List<String> getFuzzyType() {
            return this.fuzzyType;
        }

        public List<String> getRightFuzzyType() {
            return this.rightFuzzyType;
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

        public ConditionBuilder fuzzyMrName(List<String> fuzzyMrName) {
            this.fuzzyMrName = fuzzyMrName;
            return this;
        }

        public ConditionBuilder fuzzyMrName(String... fuzzyMrName) {
            this.fuzzyMrName = solveNullList(fuzzyMrName);
            return this;
        }

        public ConditionBuilder rightFuzzyMrName(List<String> rightFuzzyMrName) {
            this.rightFuzzyMrName = rightFuzzyMrName;
            return this;
        }

        public ConditionBuilder rightFuzzyMrName(String... rightFuzzyMrName) {
            this.rightFuzzyMrName = solveNullList(rightFuzzyMrName);
            return this;
        }

        public ConditionBuilder mrNameList(String... mrName) {
            this.mrNameList = solveNullList(mrName);
            return this;
        }

        public ConditionBuilder mrNameList(List<String> mrName) {
            this.mrNameList = mrName;
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

        public ConditionBuilder fuzzyMrCfName(List<String> fuzzyMrCfName) {
            this.fuzzyMrCfName = fuzzyMrCfName;
            return this;
        }

        public ConditionBuilder fuzzyMrCfName(String... fuzzyMrCfName) {
            this.fuzzyMrCfName = solveNullList(fuzzyMrCfName);
            return this;
        }

        public ConditionBuilder rightFuzzyMrCfName(List<String> rightFuzzyMrCfName) {
            this.rightFuzzyMrCfName = rightFuzzyMrCfName;
            return this;
        }

        public ConditionBuilder rightFuzzyMrCfName(String... rightFuzzyMrCfName) {
            this.rightFuzzyMrCfName = solveNullList(rightFuzzyMrCfName);
            return this;
        }

        public ConditionBuilder mrCfNameList(String... mrCfName) {
            this.mrCfNameList = solveNullList(mrCfName);
            return this;
        }

        public ConditionBuilder mrCfNameList(List<String> mrCfName) {
            this.mrCfNameList = mrCfName;
            return this;
        }

        public ConditionBuilder fuzzySpecification(List<String> fuzzySpecification) {
            this.fuzzySpecification = fuzzySpecification;
            return this;
        }

        public ConditionBuilder fuzzySpecification(String... fuzzySpecification) {
            this.fuzzySpecification = solveNullList(fuzzySpecification);
            return this;
        }

        public ConditionBuilder rightFuzzySpecification(List<String> rightFuzzySpecification) {
            this.rightFuzzySpecification = rightFuzzySpecification;
            return this;
        }

        public ConditionBuilder rightFuzzySpecification(String... rightFuzzySpecification) {
            this.rightFuzzySpecification = solveNullList(rightFuzzySpecification);
            return this;
        }

        public ConditionBuilder specificationList(String... specification) {
            this.specificationList = solveNullList(specification);
            return this;
        }

        public ConditionBuilder specificationList(List<String> specification) {
            this.specificationList = specification;
            return this;
        }

        public ConditionBuilder fuzzyType(List<String> fuzzyType) {
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType(String... fuzzyType) {
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType(List<String> rightFuzzyType) {
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType(String... rightFuzzyType) {
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String... type) {
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type) {
            this.typeList = type;
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

        private TbMaterial obj;

        public Builder() {
            this.obj = new TbMaterial();
        }

        public Builder mrNum(String mrNum) {
            this.obj.setMrNum(mrNum);
            return this;
        }

        public Builder mrName(String mrName) {
            this.obj.setMrName(mrName);
            return this;
        }

        public Builder mrCfNum(String mrCfNum) {
            this.obj.setMrCfNum(mrCfNum);
            return this;
        }

        public Builder mrCfName(String mrCfName) {
            this.obj.setMrCfName(mrCfName);
            return this;
        }

        public Builder specification(String specification) {
            this.obj.setSpecification(specification);
            return this;
        }

        public Builder type(String type) {
            this.obj.setType(type);
            return this;
        }

        public TbMaterial build() {
            return obj;
        }
    }

}
