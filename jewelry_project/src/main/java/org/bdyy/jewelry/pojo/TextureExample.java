package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class TextureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextureExample() {
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

        public Criteria andTextureIdIsNull() {
            addCriterion("texture_id is null");
            return (Criteria) this;
        }

        public Criteria andTextureIdIsNotNull() {
            addCriterion("texture_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextureIdEqualTo(Integer value) {
            addCriterion("texture_id =", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotEqualTo(Integer value) {
            addCriterion("texture_id <>", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdGreaterThan(Integer value) {
            addCriterion("texture_id >", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("texture_id >=", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdLessThan(Integer value) {
            addCriterion("texture_id <", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdLessThanOrEqualTo(Integer value) {
            addCriterion("texture_id <=", value, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdIn(List<Integer> values) {
            addCriterion("texture_id in", values, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotIn(List<Integer> values) {
            addCriterion("texture_id not in", values, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdBetween(Integer value1, Integer value2) {
            addCriterion("texture_id between", value1, value2, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("texture_id not between", value1, value2, "textureId");
            return (Criteria) this;
        }

        public Criteria andTextureNameIsNull() {
            addCriterion("texture_name is null");
            return (Criteria) this;
        }

        public Criteria andTextureNameIsNotNull() {
            addCriterion("texture_name is not null");
            return (Criteria) this;
        }

        public Criteria andTextureNameEqualTo(String value) {
            addCriterion("texture_name =", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameNotEqualTo(String value) {
            addCriterion("texture_name <>", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameGreaterThan(String value) {
            addCriterion("texture_name >", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameGreaterThanOrEqualTo(String value) {
            addCriterion("texture_name >=", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameLessThan(String value) {
            addCriterion("texture_name <", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameLessThanOrEqualTo(String value) {
            addCriterion("texture_name <=", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameLike(String value) {
            addCriterion("texture_name like", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameNotLike(String value) {
            addCriterion("texture_name not like", value, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameIn(List<String> values) {
            addCriterion("texture_name in", values, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameNotIn(List<String> values) {
            addCriterion("texture_name not in", values, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameBetween(String value1, String value2) {
            addCriterion("texture_name between", value1, value2, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureNameNotBetween(String value1, String value2) {
            addCriterion("texture_name not between", value1, value2, "textureName");
            return (Criteria) this;
        }

        public Criteria andTextureTokenIsNull() {
            addCriterion("texture_token is null");
            return (Criteria) this;
        }

        public Criteria andTextureTokenIsNotNull() {
            addCriterion("texture_token is not null");
            return (Criteria) this;
        }

        public Criteria andTextureTokenEqualTo(String value) {
            addCriterion("texture_token =", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenNotEqualTo(String value) {
            addCriterion("texture_token <>", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenGreaterThan(String value) {
            addCriterion("texture_token >", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenGreaterThanOrEqualTo(String value) {
            addCriterion("texture_token >=", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenLessThan(String value) {
            addCriterion("texture_token <", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenLessThanOrEqualTo(String value) {
            addCriterion("texture_token <=", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenLike(String value) {
            addCriterion("texture_token like", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenNotLike(String value) {
            addCriterion("texture_token not like", value, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenIn(List<String> values) {
            addCriterion("texture_token in", values, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenNotIn(List<String> values) {
            addCriterion("texture_token not in", values, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenBetween(String value1, String value2) {
            addCriterion("texture_token between", value1, value2, "textureToken");
            return (Criteria) this;
        }

        public Criteria andTextureTokenNotBetween(String value1, String value2) {
            addCriterion("texture_token not between", value1, value2, "textureToken");
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