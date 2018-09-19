package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductCurrencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductCurrencyExample() {
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

        public Criteria andFinishedProductCurrencyIdIsNull() {
            addCriterion("finished_product_currency_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdIsNotNull() {
            addCriterion("finished_product_currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdEqualTo(Integer value) {
            addCriterion("finished_product_currency_id =", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdNotEqualTo(Integer value) {
            addCriterion("finished_product_currency_id <>", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdGreaterThan(Integer value) {
            addCriterion("finished_product_currency_id >", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_product_currency_id >=", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdLessThan(Integer value) {
            addCriterion("finished_product_currency_id <", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("finished_product_currency_id <=", value, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdIn(List<Integer> values) {
            addCriterion("finished_product_currency_id in", values, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdNotIn(List<Integer> values) {
            addCriterion("finished_product_currency_id not in", values, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_currency_id between", value1, value2, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_product_currency_id not between", value1, value2, "finishedProductCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceIsNull() {
            addCriterion("finished_product_currency_g_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceIsNotNull() {
            addCriterion("finished_product_currency_g_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceEqualTo(String value) {
            addCriterion("finished_product_currency_g_price =", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceNotEqualTo(String value) {
            addCriterion("finished_product_currency_g_price <>", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceGreaterThan(String value) {
            addCriterion("finished_product_currency_g_price >", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_g_price >=", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceLessThan(String value) {
            addCriterion("finished_product_currency_g_price <", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_g_price <=", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceLike(String value) {
            addCriterion("finished_product_currency_g_price like", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceNotLike(String value) {
            addCriterion("finished_product_currency_g_price not like", value, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceIn(List<String> values) {
            addCriterion("finished_product_currency_g_price in", values, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceNotIn(List<String> values) {
            addCriterion("finished_product_currency_g_price not in", values, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceBetween(String value1, String value2) {
            addCriterion("finished_product_currency_g_price between", value1, value2, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGPriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_currency_g_price not between", value1, value2, "finishedProductCurrencyGPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceIsNull() {
            addCriterion("finished_product_currency_piece_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceIsNotNull() {
            addCriterion("finished_product_currency_piece_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceEqualTo(String value) {
            addCriterion("finished_product_currency_piece_price =", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceNotEqualTo(String value) {
            addCriterion("finished_product_currency_piece_price <>", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceGreaterThan(String value) {
            addCriterion("finished_product_currency_piece_price >", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_piece_price >=", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceLessThan(String value) {
            addCriterion("finished_product_currency_piece_price <", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_piece_price <=", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceLike(String value) {
            addCriterion("finished_product_currency_piece_price like", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceNotLike(String value) {
            addCriterion("finished_product_currency_piece_price not like", value, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceIn(List<String> values) {
            addCriterion("finished_product_currency_piece_price in", values, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceNotIn(List<String> values) {
            addCriterion("finished_product_currency_piece_price not in", values, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceBetween(String value1, String value2) {
            addCriterion("finished_product_currency_piece_price between", value1, value2, "finishedProductCurrencyPiecePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyPiecePriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_currency_piece_price not between", value1, value2, "finishedProductCurrencyPiecePrice");
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

        public Criteria andFinishedProductCurrencyAllPriceIsNull() {
            addCriterion("finished_product_currency_all_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceIsNotNull() {
            addCriterion("finished_product_currency_all_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceEqualTo(String value) {
            addCriterion("finished_product_currency_all_price =", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceNotEqualTo(String value) {
            addCriterion("finished_product_currency_all_price <>", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceGreaterThan(String value) {
            addCriterion("finished_product_currency_all_price >", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_all_price >=", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceLessThan(String value) {
            addCriterion("finished_product_currency_all_price <", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_currency_all_price <=", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceLike(String value) {
            addCriterion("finished_product_currency_all_price like", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceNotLike(String value) {
            addCriterion("finished_product_currency_all_price not like", value, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceIn(List<String> values) {
            addCriterion("finished_product_currency_all_price in", values, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceNotIn(List<String> values) {
            addCriterion("finished_product_currency_all_price not in", values, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceBetween(String value1, String value2) {
            addCriterion("finished_product_currency_all_price between", value1, value2, "finishedProductCurrencyAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyAllPriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_currency_all_price not between", value1, value2, "finishedProductCurrencyAllPrice");
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