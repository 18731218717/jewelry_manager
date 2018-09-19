package org.bdyy.jewelry.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinishedProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinishedProductExample() {
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

        public Criteria andFinishedProductCodeIsNull() {
            addCriterion("finished_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeIsNotNull() {
            addCriterion("finished_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeEqualTo(String value) {
            addCriterion("finished_product_code =", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeNotEqualTo(String value) {
            addCriterion("finished_product_code <>", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeGreaterThan(String value) {
            addCriterion("finished_product_code >", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_code >=", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeLessThan(String value) {
            addCriterion("finished_product_code <", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeLessThanOrEqualTo(String value) {
            addCriterion("finished_product_code <=", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeLike(String value) {
            addCriterion("finished_product_code like", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeNotLike(String value) {
            addCriterion("finished_product_code not like", value, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeIn(List<String> values) {
            addCriterion("finished_product_code in", values, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeNotIn(List<String> values) {
            addCriterion("finished_product_code not in", values, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeBetween(String value1, String value2) {
            addCriterion("finished_product_code between", value1, value2, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCodeNotBetween(String value1, String value2) {
            addCriterion("finished_product_code not between", value1, value2, "finishedProductCode");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameIsNull() {
            addCriterion("finished_product_name is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameIsNotNull() {
            addCriterion("finished_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameEqualTo(String value) {
            addCriterion("finished_product_name =", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameNotEqualTo(String value) {
            addCriterion("finished_product_name <>", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameGreaterThan(String value) {
            addCriterion("finished_product_name >", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_name >=", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameLessThan(String value) {
            addCriterion("finished_product_name <", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameLessThanOrEqualTo(String value) {
            addCriterion("finished_product_name <=", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameLike(String value) {
            addCriterion("finished_product_name like", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameNotLike(String value) {
            addCriterion("finished_product_name not like", value, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameIn(List<String> values) {
            addCriterion("finished_product_name in", values, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameNotIn(List<String> values) {
            addCriterion("finished_product_name not in", values, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameBetween(String value1, String value2) {
            addCriterion("finished_product_name between", value1, value2, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNameNotBetween(String value1, String value2) {
            addCriterion("finished_product_name not between", value1, value2, "finishedProductName");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberIsNull() {
            addCriterion("finished_product_number is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberIsNotNull() {
            addCriterion("finished_product_number is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberEqualTo(String value) {
            addCriterion("finished_product_number =", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberNotEqualTo(String value) {
            addCriterion("finished_product_number <>", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberGreaterThan(String value) {
            addCriterion("finished_product_number >", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_number >=", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberLessThan(String value) {
            addCriterion("finished_product_number <", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberLessThanOrEqualTo(String value) {
            addCriterion("finished_product_number <=", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberLike(String value) {
            addCriterion("finished_product_number like", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberNotLike(String value) {
            addCriterion("finished_product_number not like", value, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberIn(List<String> values) {
            addCriterion("finished_product_number in", values, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberNotIn(List<String> values) {
            addCriterion("finished_product_number not in", values, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberBetween(String value1, String value2) {
            addCriterion("finished_product_number between", value1, value2, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductNumberNotBetween(String value1, String value2) {
            addCriterion("finished_product_number not between", value1, value2, "finishedProductNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIsNull() {
            addCriterion("finished_product_unit is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIsNotNull() {
            addCriterion("finished_product_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitEqualTo(String value) {
            addCriterion("finished_product_unit =", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitNotEqualTo(String value) {
            addCriterion("finished_product_unit <>", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitGreaterThan(String value) {
            addCriterion("finished_product_unit >", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_unit >=", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitLessThan(String value) {
            addCriterion("finished_product_unit <", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitLessThanOrEqualTo(String value) {
            addCriterion("finished_product_unit <=", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitLike(String value) {
            addCriterion("finished_product_unit like", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitNotLike(String value) {
            addCriterion("finished_product_unit not like", value, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitIn(List<String> values) {
            addCriterion("finished_product_unit in", values, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitNotIn(List<String> values) {
            addCriterion("finished_product_unit not in", values, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitBetween(String value1, String value2) {
            addCriterion("finished_product_unit between", value1, value2, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductUnitNotBetween(String value1, String value2) {
            addCriterion("finished_product_unit not between", value1, value2, "finishedProductUnit");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIsNull() {
            addCriterion("finished_product_texture is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIsNotNull() {
            addCriterion("finished_product_texture is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureEqualTo(String value) {
            addCriterion("finished_product_texture =", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureNotEqualTo(String value) {
            addCriterion("finished_product_texture <>", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureGreaterThan(String value) {
            addCriterion("finished_product_texture >", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_texture >=", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureLessThan(String value) {
            addCriterion("finished_product_texture <", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureLessThanOrEqualTo(String value) {
            addCriterion("finished_product_texture <=", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureLike(String value) {
            addCriterion("finished_product_texture like", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureNotLike(String value) {
            addCriterion("finished_product_texture not like", value, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureIn(List<String> values) {
            addCriterion("finished_product_texture in", values, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureNotIn(List<String> values) {
            addCriterion("finished_product_texture not in", values, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureBetween(String value1, String value2) {
            addCriterion("finished_product_texture between", value1, value2, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTextureNotBetween(String value1, String value2) {
            addCriterion("finished_product_texture not between", value1, value2, "finishedProductTexture");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIsNull() {
            addCriterion("finished_product_currency is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIsNotNull() {
            addCriterion("finished_product_currency is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyEqualTo(String value) {
            addCriterion("finished_product_currency =", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyNotEqualTo(String value) {
            addCriterion("finished_product_currency <>", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGreaterThan(String value) {
            addCriterion("finished_product_currency >", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_currency >=", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyLessThan(String value) {
            addCriterion("finished_product_currency <", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyLessThanOrEqualTo(String value) {
            addCriterion("finished_product_currency <=", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyLike(String value) {
            addCriterion("finished_product_currency like", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyNotLike(String value) {
            addCriterion("finished_product_currency not like", value, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyIn(List<String> values) {
            addCriterion("finished_product_currency in", values, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyNotIn(List<String> values) {
            addCriterion("finished_product_currency not in", values, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyBetween(String value1, String value2) {
            addCriterion("finished_product_currency between", value1, value2, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCurrencyNotBetween(String value1, String value2) {
            addCriterion("finished_product_currency not between", value1, value2, "finishedProductCurrency");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceIsNull() {
            addCriterion("finished_product_process_single_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceIsNotNull() {
            addCriterion("finished_product_process_single_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceEqualTo(String value) {
            addCriterion("finished_product_process_single_price =", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceNotEqualTo(String value) {
            addCriterion("finished_product_process_single_price <>", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceGreaterThan(String value) {
            addCriterion("finished_product_process_single_price >", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_process_single_price >=", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceLessThan(String value) {
            addCriterion("finished_product_process_single_price <", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_process_single_price <=", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceLike(String value) {
            addCriterion("finished_product_process_single_price like", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceNotLike(String value) {
            addCriterion("finished_product_process_single_price not like", value, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceIn(List<String> values) {
            addCriterion("finished_product_process_single_price in", values, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceNotIn(List<String> values) {
            addCriterion("finished_product_process_single_price not in", values, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceBetween(String value1, String value2) {
            addCriterion("finished_product_process_single_price between", value1, value2, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessSinglePriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_process_single_price not between", value1, value2, "finishedProductProcessSinglePrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceIsNull() {
            addCriterion("finished_product_process_all_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceIsNotNull() {
            addCriterion("finished_product_process_all_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceEqualTo(String value) {
            addCriterion("finished_product_process_all_price =", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceNotEqualTo(String value) {
            addCriterion("finished_product_process_all_price <>", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceGreaterThan(String value) {
            addCriterion("finished_product_process_all_price >", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_process_all_price >=", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceLessThan(String value) {
            addCriterion("finished_product_process_all_price <", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_process_all_price <=", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceLike(String value) {
            addCriterion("finished_product_process_all_price like", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceNotLike(String value) {
            addCriterion("finished_product_process_all_price not like", value, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceIn(List<String> values) {
            addCriterion("finished_product_process_all_price in", values, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceNotIn(List<String> values) {
            addCriterion("finished_product_process_all_price not in", values, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceBetween(String value1, String value2) {
            addCriterion("finished_product_process_all_price between", value1, value2, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductProcessAllPriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_process_all_price not between", value1, value2, "finishedProductProcessAllPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostIsNull() {
            addCriterion("finished_product_cost is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostIsNotNull() {
            addCriterion("finished_product_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostEqualTo(String value) {
            addCriterion("finished_product_cost =", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostNotEqualTo(String value) {
            addCriterion("finished_product_cost <>", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostGreaterThan(String value) {
            addCriterion("finished_product_cost >", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_cost >=", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostLessThan(String value) {
            addCriterion("finished_product_cost <", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostLessThanOrEqualTo(String value) {
            addCriterion("finished_product_cost <=", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostLike(String value) {
            addCriterion("finished_product_cost like", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostNotLike(String value) {
            addCriterion("finished_product_cost not like", value, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostIn(List<String> values) {
            addCriterion("finished_product_cost in", values, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostNotIn(List<String> values) {
            addCriterion("finished_product_cost not in", values, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostBetween(String value1, String value2) {
            addCriterion("finished_product_cost between", value1, value2, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductCostNotBetween(String value1, String value2) {
            addCriterion("finished_product_cost not between", value1, value2, "finishedProductCost");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceIsNull() {
            addCriterion("finished_product_tag_price is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceIsNotNull() {
            addCriterion("finished_product_tag_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceEqualTo(String value) {
            addCriterion("finished_product_tag_price =", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceNotEqualTo(String value) {
            addCriterion("finished_product_tag_price <>", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceGreaterThan(String value) {
            addCriterion("finished_product_tag_price >", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_tag_price >=", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceLessThan(String value) {
            addCriterion("finished_product_tag_price <", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceLessThanOrEqualTo(String value) {
            addCriterion("finished_product_tag_price <=", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceLike(String value) {
            addCriterion("finished_product_tag_price like", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceNotLike(String value) {
            addCriterion("finished_product_tag_price not like", value, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceIn(List<String> values) {
            addCriterion("finished_product_tag_price in", values, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceNotIn(List<String> values) {
            addCriterion("finished_product_tag_price not in", values, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceBetween(String value1, String value2) {
            addCriterion("finished_product_tag_price between", value1, value2, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductTagPriceNotBetween(String value1, String value2) {
            addCriterion("finished_product_tag_price not between", value1, value2, "finishedProductTagPrice");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleIsNull() {
            addCriterion("finished_product_wholesale is null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleIsNotNull() {
            addCriterion("finished_product_wholesale is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleEqualTo(String value) {
            addCriterion("finished_product_wholesale =", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleNotEqualTo(String value) {
            addCriterion("finished_product_wholesale <>", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleGreaterThan(String value) {
            addCriterion("finished_product_wholesale >", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleGreaterThanOrEqualTo(String value) {
            addCriterion("finished_product_wholesale >=", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleLessThan(String value) {
            addCriterion("finished_product_wholesale <", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleLessThanOrEqualTo(String value) {
            addCriterion("finished_product_wholesale <=", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleLike(String value) {
            addCriterion("finished_product_wholesale like", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleNotLike(String value) {
            addCriterion("finished_product_wholesale not like", value, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleIn(List<String> values) {
            addCriterion("finished_product_wholesale in", values, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleNotIn(List<String> values) {
            addCriterion("finished_product_wholesale not in", values, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleBetween(String value1, String value2) {
            addCriterion("finished_product_wholesale between", value1, value2, "finishedProductWholesale");
            return (Criteria) this;
        }

        public Criteria andFinishedProductWholesaleNotBetween(String value1, String value2) {
            addCriterion("finished_product_wholesale not between", value1, value2, "finishedProductWholesale");
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