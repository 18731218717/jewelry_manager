package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductSubclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductSubclassExample() {
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

        public Criteria andFinishedProductSubclassIdIsNull() {
            addCriterion("finished_product_subclass_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdIsNotNull() {
            addCriterion("finished_product_subclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdEqualTo(Integer value) {
            addCriterion("finished_product_subclass_id =", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdNotEqualTo(Integer value) {
            addCriterion("finished_product_subclass_id <>", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdGreaterThan(Integer value) {
            addCriterion("finished_product_subclass_id >", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_subclass_id >=", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdLessThan(Integer value) {
            addCriterion("finished_product_subclass_id <", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_subclass_id <=", value, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdIn(List<Integer> values) {
            addCriterion("finished_product_subclass_id in", values, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdNotIn(List<Integer> values) {
            addCriterion("finished_product_subclass_id not in", values, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_subclass_id between", value1, value2, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_subclass_id not between", value1, value2, "finishedProductSubclassId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameIsNull() {
            addCriterion("finished_product_subclass_name is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameIsNotNull() {
            addCriterion("finished_product_subclass_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameEqualTo(String value) {
            addCriterion("finished_product_subclass_name =", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameNotEqualTo(String value) {
            addCriterion("finished_product_subclass_name <>", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameGreaterThan(String value) {
            addCriterion("finished_product_subclass_name >", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_subclass_name >=", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameLessThan(String value) {
            addCriterion("finished_product_subclass_name <", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameLessThanOrEqualTo(String value) {
            addCriterion("finished_product_subclass_name <=", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameLike(String value) {
            addCriterion("finished_product_subclass_name like", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameNotLike(String value) {
            addCriterion("finished_product_subclass_name not like", value, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameIn(List<String> values) {
            addCriterion("finished_product_subclass_name in", values, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameNotIn(List<String> values) {
            addCriterion("finished_product_subclass_name not in", values, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameBetween(String value1, String value2) {
            addCriterion("finished_product_subclass_name between", value1, value2, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassNameNotBetween(String value1, String value2) {
            addCriterion("finished_product_subclass_name not between", value1, value2, "finishedProductSubclassName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenIsNull() {
            addCriterion("finished_product_subclass_token is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenIsNotNull() {
            addCriterion("finished_product_subclass_token is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenEqualTo(String value) {
            addCriterion("finished_product_subclass_token =", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenNotEqualTo(String value) {
            addCriterion("finished_product_subclass_token <>", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenGreaterThan(String value) {
            addCriterion("finished_product_subclass_token >", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_subclass_token >=", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenLessThan(String value) {
            addCriterion("finished_product_subclass_token <", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenLessThanOrEqualTo(String value) {
            addCriterion("finished_product_subclass_token <=", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenLike(String value) {
            addCriterion("finished_product_subclass_token like", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenNotLike(String value) {
            addCriterion("finished_product_subclass_token not like", value, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenIn(List<String> values) {
            addCriterion("finished_product_subclass_token in", values, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenNotIn(List<String> values) {
            addCriterion("finished_product_subclass_token not in", values, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenBetween(String value1, String value2) {
            addCriterion("finished_product_subclass_token between", value1, value2, "finishedProductSubclassToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductSubclassTokenNotBetween(String value1, String value2) {
            addCriterion("finished_product_subclass_token not between", value1, value2, "finishedProductSubclassToken");
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