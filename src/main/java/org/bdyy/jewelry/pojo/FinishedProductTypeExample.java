package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFinishedProductTypeIdIsNull() {
            addCriterion("finished_product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdIsNotNull() {
            addCriterion("finished_product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdEqualTo(Integer value) {
            addCriterion("finished_product_type_id =", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdNotEqualTo(Integer value) {
            addCriterion("finished_product_type_id <>", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdGreaterThan(Integer value) {
            addCriterion("finished_product_type_id >", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_type_id >=", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdLessThan(Integer value) {
            addCriterion("finished_product_type_id <", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_type_id <=", value, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdIn(List<Integer> values) {
            addCriterion("finished_product_type_id in", values, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdNotIn(List<Integer> values) {
            addCriterion("finished_product_type_id not in", values, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_type_id between", value1, value2, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_type_id not between", value1, value2, "finishedProductTypeId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameIsNull() {
            addCriterion("finished_product_type_name is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameIsNotNull() {
            addCriterion("finished_product_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameEqualTo(String value) {
            addCriterion("finished_product_type_name =", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameNotEqualTo(String value) {
            addCriterion("finished_product_type_name <>", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameGreaterThan(String value) {
            addCriterion("finished_product_type_name >", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_type_name >=", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameLessThan(String value) {
            addCriterion("finished_product_type_name <", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameLessThanOrEqualTo(String value) {
            addCriterion("finished_product_type_name <=", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameLike(String value) {
            addCriterion("finished_product_type_name like", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameNotLike(String value) {
            addCriterion("finished_product_type_name not like", value, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameIn(List<String> values) {
            addCriterion("finished_product_type_name in", values, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameNotIn(List<String> values) {
            addCriterion("finished_product_type_name not in", values, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameBetween(String value1, String value2) {
            addCriterion("finished_product_type_name between", value1, value2, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeNameNotBetween(String value1, String value2) {
            addCriterion("finished_product_type_name not between", value1, value2, "finishedProductTypeName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenIsNull() {
            addCriterion("finished_product_type_token is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenIsNotNull() {
            addCriterion("finished_product_type_token is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenEqualTo(String value) {
            addCriterion("finished_product_type_token =", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenNotEqualTo(String value) {
            addCriterion("finished_product_type_token <>", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenGreaterThan(String value) {
            addCriterion("finished_product_type_token >", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_type_token >=", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenLessThan(String value) {
            addCriterion("finished_product_type_token <", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenLessThanOrEqualTo(String value) {
            addCriterion("finished_product_type_token <=", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenLike(String value) {
            addCriterion("finished_product_type_token like", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenNotLike(String value) {
            addCriterion("finished_product_type_token not like", value, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenIn(List<String> values) {
            addCriterion("finished_product_type_token in", values, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenNotIn(List<String> values) {
            addCriterion("finished_product_type_token not in", values, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenBetween(String value1, String value2) {
            addCriterion("finished_product_type_token between", value1, value2, "finishedProductTypeToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTypeTokenNotBetween(String value1, String value2) {
            addCriterion("finished_product_type_token not between", value1, value2, "finishedProductTypeToken");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}