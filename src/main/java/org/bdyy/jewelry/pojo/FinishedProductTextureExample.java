package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductTextureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductTextureExample() {
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

        public Criteria andFinishedProductTextureIdIsNull() {
            addCriterion("finished_product_texture_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdIsNotNull() {
            addCriterion("finished_product_texture_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdEqualTo(Integer value) {
            addCriterion("finished_product_texture_id =", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdNotEqualTo(Integer value) {
            addCriterion("finished_product_texture_id <>", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdGreaterThan(Integer value) {
            addCriterion("finished_product_texture_id >", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_texture_id >=", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdLessThan(Integer value) {
            addCriterion("finished_product_texture_id <", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_texture_id <=", value, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdIn(List<Integer> values) {
            addCriterion("finished_product_texture_id in", values, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdNotIn(List<Integer> values) {
            addCriterion("finished_product_texture_id not in", values, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_texture_id between", value1, value2, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_texture_id not between", value1, value2, "finishedProductTextureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdIsNull() {
            addCriterion("texture_id is null");
            return (Criteria) this;
        }

        public Criteria andTextureIdIsNotNull() {
            addCriterion("texture_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextureIdEqualTo(String value) {
            addCriterion("texture_id =", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotEqualTo(String value) {
            addCriterion("texture_id <>", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdGreaterThan(String value) {
            addCriterion("texture_id >", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdGreaterThanOrEqualTo(String value) {
            addCriterion("texture_id >=", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdLessThan(String value) {
            addCriterion("texture_id <", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdLessThanOrEqualTo(String value) {
            addCriterion("texture_id <=", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdLike(String value) {
            addCriterion("texture_id like", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotLike(String value) {
            addCriterion("texture_id not like", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdIn(List<String> values) {
            addCriterion("texture_id in", values, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotIn(List<String> values) {
            addCriterion("texture_id not in", values, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdBetween(String value1, String value2) {
            addCriterion("texture_id between", value1, value2, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotBetween(String value1, String value2) {
            addCriterion("texture_id not between", value1, value2, "textureId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightIsNull() {
            addCriterion("finished_product_texture_weight is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightIsNotNull() {
            addCriterion("finished_product_texture_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightEqualTo(String value) {
            addCriterion("finished_product_texture_weight =", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightNotEqualTo(String value) {
            addCriterion("finished_product_texture_weight <>", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightGreaterThan(String value) {
            addCriterion("finished_product_texture_weight >", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_weight >=", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightLessThan(String value) {
            addCriterion("finished_product_texture_weight <", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightLessThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_weight <=", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightLike(String value) {
            addCriterion("finished_product_texture_weight like", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightNotLike(String value) {
            addCriterion("finished_product_texture_weight not like", value, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightIn(List<String> values) {
            addCriterion("finished_product_texture_weight in", values, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightNotIn(List<String> values) {
            addCriterion("finished_product_texture_weight not in", values, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightBetween(String value1, String value2) {
            addCriterion("finished_product_texture_weight between", value1, value2, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureWeightNotBetween(String value1, String value2) {
            addCriterion("finished_product_texture_weight not between", value1, value2, "finishedProductTextureWeight");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceIsNull() {
            addCriterion("finished_product_texture_single_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceIsNotNull() {
            addCriterion("finished_product_texture_single_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceEqualTo(String value) {
            addCriterion("finished_product_texture_single_price =", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceNotEqualTo(String value) {
            addCriterion("finished_product_texture_single_price <>", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceGreaterThan(String value) {
            addCriterion("finished_product_texture_single_price >", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_single_price >=", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceLessThan(String value) {
            addCriterion("finished_product_texture_single_price <", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_single_price <=", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceLike(String value) {
            addCriterion("finished_product_texture_single_price like", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceNotLike(String value) {
            addCriterion("finished_product_texture_single_price not like", value, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceIn(List<String> values) {
            addCriterion("finished_product_texture_single_price in", values, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceNotIn(List<String> values) {
            addCriterion("finished_product_texture_single_price not in", values, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceBetween(String value1, String value2) {
            addCriterion("finished_product_texture_single_price between", value1, value2, "finishedProductTextureSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureSinglePriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_texture_single_price not between", value1, value2, "finishedProductTextureSinglePrice");
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

        public Criteria andFinishedProductTextureAllPriceIsNull() {
            addCriterion("finished_product_texture_all_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceIsNotNull() {
            addCriterion("finished_product_texture_all_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceEqualTo(String value) {
            addCriterion("finished_product_texture_all_price =", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceNotEqualTo(String value) {
            addCriterion("finished_product_texture_all_price <>", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceGreaterThan(String value) {
            addCriterion("finished_product_texture_all_price >", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_all_price >=", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceLessThan(String value) {
            addCriterion("finished_product_texture_all_price <", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_texture_all_price <=", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceLike(String value) {
            addCriterion("finished_product_texture_all_price like", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceNotLike(String value) {
            addCriterion("finished_product_texture_all_price not like", value, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceIn(List<String> values) {
            addCriterion("finished_product_texture_all_price in", values, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceNotIn(List<String> values) {
            addCriterion("finished_product_texture_all_price not in", values, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceBetween(String value1, String value2) {
            addCriterion("finished_product_texture_all_price between", value1, value2, "finishedProductTextureAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureAllPriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_texture_all_price not between", value1, value2, "finishedProductTextureAllPrice");
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