package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductUnitExample() {
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

        public Criteria andFinishedProductUnitIdIsNull() {
            addCriterion("finished_product_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdIsNotNull() {
            addCriterion("finished_product_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdEqualTo(Integer value) {
            addCriterion("finished_product_unit_id =", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdNotEqualTo(Integer value) {
            addCriterion("finished_product_unit_id <>", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdGreaterThan(Integer value) {
            addCriterion("finished_product_unit_id >", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_unit_id >=", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdLessThan(Integer value) {
            addCriterion("finished_product_unit_id <", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_unit_id <=", value, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdIn(List<Integer> values) {
            addCriterion("finished_product_unit_id in", values, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdNotIn(List<Integer> values) {
            addCriterion("finished_product_unit_id not in", values, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_unit_id between", value1, value2, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_unit_id not between", value1, value2, "finishedProductUnitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightIsNull() {
            addCriterion("finished_product_unit_all_weight is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightIsNotNull() {
            addCriterion("finished_product_unit_all_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightEqualTo(String value) {
            addCriterion("finished_product_unit_all_weight =", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightNotEqualTo(String value) {
            addCriterion("finished_product_unit_all_weight <>", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightGreaterThan(String value) {
            addCriterion("finished_product_unit_all_weight >", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_unit_all_weight >=", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightLessThan(String value) {
            addCriterion("finished_product_unit_all_weight <", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightLessThanOrEqualTo(String value) {
            addCriterion("finished_product_unit_all_weight <=", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightLike(String value) {
            addCriterion("finished_product_unit_all_weight like", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightNotLike(String value) {
            addCriterion("finished_product_unit_all_weight not like", value, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightIn(List<String> values) {
            addCriterion("finished_product_unit_all_weight in", values, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightNotIn(List<String> values) {
            addCriterion("finished_product_unit_all_weight not in", values, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightBetween(String value1, String value2) {
            addCriterion("finished_product_unit_all_weight between", value1, value2, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitAllWeightNotBetween(String value1, String value2) {
            addCriterion("finished_product_unit_all_weight not between", value1, value2, "finishedProductUnitAllWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightIsNull() {
            addCriterion("finished_product_unit_single_weight is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightIsNotNull() {
            addCriterion("finished_product_unit_single_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightEqualTo(String value) {
            addCriterion("finished_product_unit_single_weight =", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightNotEqualTo(String value) {
            addCriterion("finished_product_unit_single_weight <>", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightGreaterThan(String value) {
            addCriterion("finished_product_unit_single_weight >", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_unit_single_weight >=", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightLessThan(String value) {
            addCriterion("finished_product_unit_single_weight <", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightLessThanOrEqualTo(String value) {
            addCriterion("finished_product_unit_single_weight <=", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightLike(String value) {
            addCriterion("finished_product_unit_single_weight like", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightNotLike(String value) {
            addCriterion("finished_product_unit_single_weight not like", value, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightIn(List<String> values) {
            addCriterion("finished_product_unit_single_weight in", values, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightNotIn(List<String> values) {
            addCriterion("finished_product_unit_single_weight not in", values, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightBetween(String value1, String value2) {
            addCriterion("finished_product_unit_single_weight between", value1, value2, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitSingleWeightNotBetween(String value1, String value2) {
            addCriterion("finished_product_unit_single_weight not between", value1, value2, "finishedProductUnitSingleWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdIsNull() {
            addCriterion("finished_product_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdIsNotNull() {
            addCriterion("finished_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdEqualTo(Integer value) {
            addCriterion("finished_product_id =", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdNotEqualTo(Integer value) {
            addCriterion("finished_product_id <>", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdGreaterThan(Integer value) {
            addCriterion("finished_product_id >", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_id >=", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdLessThan(Integer value) {
            addCriterion("finished_product_id <", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_id <=", value, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdIn(List<Integer> values) {
            addCriterion("finished_product_id in", values, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdNotIn(List<Integer> values) {
            addCriterion("finished_product_id not in", values, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_id between", value1, value2, "finishedProductId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_id not between", value1, value2, "finishedProductId");
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