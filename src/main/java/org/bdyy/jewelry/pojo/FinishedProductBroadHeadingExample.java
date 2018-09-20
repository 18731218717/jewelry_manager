package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductBroadHeadingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductBroadHeadingExample() {
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

        public Criteria andFinishedProductBroadHeadingIdIsNull() {
            addCriterion("finished_product_broad_heading_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdIsNotNull() {
            addCriterion("finished_product_broad_heading_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdEqualTo(Integer value) {
            addCriterion("finished_product_broad_heading_id =", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdNotEqualTo(Integer value) {
            addCriterion("finished_product_broad_heading_id <>", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdGreaterThan(Integer value) {
            addCriterion("finished_product_broad_heading_id >", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_broad_heading_id >=", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdLessThan(Integer value) {
            addCriterion("finished_product_broad_heading_id <", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_broad_heading_id <=", value, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdIn(List<Integer> values) {
            addCriterion("finished_product_broad_heading_id in", values, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdNotIn(List<Integer> values) {
            addCriterion("finished_product_broad_heading_id not in", values, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_broad_heading_id between", value1, value2, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_broad_heading_id not between", value1, value2, "finishedProductBroadHeadingId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameIsNull() {
            addCriterion("finished_product_broad_heading_name is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameIsNotNull() {
            addCriterion("finished_product_broad_heading_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameEqualTo(String value) {
            addCriterion("finished_product_broad_heading_name =", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameNotEqualTo(String value) {
            addCriterion("finished_product_broad_heading_name <>", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameGreaterThan(String value) {
            addCriterion("finished_product_broad_heading_name >", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_broad_heading_name >=", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameLessThan(String value) {
            addCriterion("finished_product_broad_heading_name <", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameLessThanOrEqualTo(String value) {
            addCriterion("finished_product_broad_heading_name <=", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameLike(String value) {
            addCriterion("finished_product_broad_heading_name like", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameNotLike(String value) {
            addCriterion("finished_product_broad_heading_name not like", value, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameIn(List<String> values) {
            addCriterion("finished_product_broad_heading_name in", values, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameNotIn(List<String> values) {
            addCriterion("finished_product_broad_heading_name not in", values, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameBetween(String value1, String value2) {
            addCriterion("finished_product_broad_heading_name between", value1, value2, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadHeadingNameNotBetween(String value1, String value2) {
            addCriterion("finished_product_broad_heading_name not between", value1, value2, "finishedProductBroadHeadingName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenIsNull() {
            addCriterion("finished_product_broad_token is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenIsNotNull() {
            addCriterion("finished_product_broad_token is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenEqualTo(String value) {
            addCriterion("finished_product_broad_token =", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenNotEqualTo(String value) {
            addCriterion("finished_product_broad_token <>", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenGreaterThan(String value) {
            addCriterion("finished_product_broad_token >", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_broad_token >=", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenLessThan(String value) {
            addCriterion("finished_product_broad_token <", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenLessThanOrEqualTo(String value) {
            addCriterion("finished_product_broad_token <=", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenLike(String value) {
            addCriterion("finished_product_broad_token like", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenNotLike(String value) {
            addCriterion("finished_product_broad_token not like", value, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenIn(List<String> values) {
            addCriterion("finished_product_broad_token in", values, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenNotIn(List<String> values) {
            addCriterion("finished_product_broad_token not in", values, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenBetween(String value1, String value2) {
            addCriterion("finished_product_broad_token between", value1, value2, "finishedProductBroadToken");
            return (Criteria) this;
        }

        public Criteria andFinishedProductBroadTokenNotBetween(String value1, String value2) {
            addCriterion("finished_product_broad_token not between", value1, value2, "finishedProductBroadToken");
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