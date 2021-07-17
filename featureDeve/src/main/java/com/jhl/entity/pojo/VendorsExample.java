package com.jhl.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorsExample() {
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

        public Criteria andVendIdIsNull() {
            addCriterion("vend_id is null");
            return (Criteria) this;
        }

        public Criteria andVendIdIsNotNull() {
            addCriterion("vend_id is not null");
            return (Criteria) this;
        }

        public Criteria andVendIdEqualTo(Integer value) {
            addCriterion("vend_id =", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdNotEqualTo(Integer value) {
            addCriterion("vend_id <>", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdGreaterThan(Integer value) {
            addCriterion("vend_id >", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vend_id >=", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdLessThan(Integer value) {
            addCriterion("vend_id <", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdLessThanOrEqualTo(Integer value) {
            addCriterion("vend_id <=", value, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdIn(List<Integer> values) {
            addCriterion("vend_id in", values, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdNotIn(List<Integer> values) {
            addCriterion("vend_id not in", values, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdBetween(Integer value1, Integer value2) {
            addCriterion("vend_id between", value1, value2, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vend_id not between", value1, value2, "vendId");
            return (Criteria) this;
        }

        public Criteria andVendNameIsNull() {
            addCriterion("vend_name is null");
            return (Criteria) this;
        }

        public Criteria andVendNameIsNotNull() {
            addCriterion("vend_name is not null");
            return (Criteria) this;
        }

        public Criteria andVendNameEqualTo(String value) {
            addCriterion("vend_name =", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotEqualTo(String value) {
            addCriterion("vend_name <>", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameGreaterThan(String value) {
            addCriterion("vend_name >", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameGreaterThanOrEqualTo(String value) {
            addCriterion("vend_name >=", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLessThan(String value) {
            addCriterion("vend_name <", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLessThanOrEqualTo(String value) {
            addCriterion("vend_name <=", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLike(String value) {
            addCriterion("vend_name like", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotLike(String value) {
            addCriterion("vend_name not like", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameIn(List<String> values) {
            addCriterion("vend_name in", values, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotIn(List<String> values) {
            addCriterion("vend_name not in", values, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameBetween(String value1, String value2) {
            addCriterion("vend_name between", value1, value2, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotBetween(String value1, String value2) {
            addCriterion("vend_name not between", value1, value2, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendAddressIsNull() {
            addCriterion("vend_address is null");
            return (Criteria) this;
        }

        public Criteria andVendAddressIsNotNull() {
            addCriterion("vend_address is not null");
            return (Criteria) this;
        }

        public Criteria andVendAddressEqualTo(String value) {
            addCriterion("vend_address =", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressNotEqualTo(String value) {
            addCriterion("vend_address <>", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressGreaterThan(String value) {
            addCriterion("vend_address >", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressGreaterThanOrEqualTo(String value) {
            addCriterion("vend_address >=", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressLessThan(String value) {
            addCriterion("vend_address <", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressLessThanOrEqualTo(String value) {
            addCriterion("vend_address <=", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressLike(String value) {
            addCriterion("vend_address like", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressNotLike(String value) {
            addCriterion("vend_address not like", value, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressIn(List<String> values) {
            addCriterion("vend_address in", values, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressNotIn(List<String> values) {
            addCriterion("vend_address not in", values, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressBetween(String value1, String value2) {
            addCriterion("vend_address between", value1, value2, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendAddressNotBetween(String value1, String value2) {
            addCriterion("vend_address not between", value1, value2, "vendAddress");
            return (Criteria) this;
        }

        public Criteria andVendCityIsNull() {
            addCriterion("vend_city is null");
            return (Criteria) this;
        }

        public Criteria andVendCityIsNotNull() {
            addCriterion("vend_city is not null");
            return (Criteria) this;
        }

        public Criteria andVendCityEqualTo(String value) {
            addCriterion("vend_city =", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityNotEqualTo(String value) {
            addCriterion("vend_city <>", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityGreaterThan(String value) {
            addCriterion("vend_city >", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityGreaterThanOrEqualTo(String value) {
            addCriterion("vend_city >=", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityLessThan(String value) {
            addCriterion("vend_city <", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityLessThanOrEqualTo(String value) {
            addCriterion("vend_city <=", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityLike(String value) {
            addCriterion("vend_city like", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityNotLike(String value) {
            addCriterion("vend_city not like", value, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityIn(List<String> values) {
            addCriterion("vend_city in", values, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityNotIn(List<String> values) {
            addCriterion("vend_city not in", values, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityBetween(String value1, String value2) {
            addCriterion("vend_city between", value1, value2, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendCityNotBetween(String value1, String value2) {
            addCriterion("vend_city not between", value1, value2, "vendCity");
            return (Criteria) this;
        }

        public Criteria andVendStateIsNull() {
            addCriterion("vend_state is null");
            return (Criteria) this;
        }

        public Criteria andVendStateIsNotNull() {
            addCriterion("vend_state is not null");
            return (Criteria) this;
        }

        public Criteria andVendStateEqualTo(String value) {
            addCriterion("vend_state =", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateNotEqualTo(String value) {
            addCriterion("vend_state <>", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateGreaterThan(String value) {
            addCriterion("vend_state >", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateGreaterThanOrEqualTo(String value) {
            addCriterion("vend_state >=", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateLessThan(String value) {
            addCriterion("vend_state <", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateLessThanOrEqualTo(String value) {
            addCriterion("vend_state <=", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateLike(String value) {
            addCriterion("vend_state like", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateNotLike(String value) {
            addCriterion("vend_state not like", value, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateIn(List<String> values) {
            addCriterion("vend_state in", values, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateNotIn(List<String> values) {
            addCriterion("vend_state not in", values, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateBetween(String value1, String value2) {
            addCriterion("vend_state between", value1, value2, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendStateNotBetween(String value1, String value2) {
            addCriterion("vend_state not between", value1, value2, "vendState");
            return (Criteria) this;
        }

        public Criteria andVendZipIsNull() {
            addCriterion("vend_zip is null");
            return (Criteria) this;
        }

        public Criteria andVendZipIsNotNull() {
            addCriterion("vend_zip is not null");
            return (Criteria) this;
        }

        public Criteria andVendZipEqualTo(String value) {
            addCriterion("vend_zip =", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipNotEqualTo(String value) {
            addCriterion("vend_zip <>", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipGreaterThan(String value) {
            addCriterion("vend_zip >", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipGreaterThanOrEqualTo(String value) {
            addCriterion("vend_zip >=", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipLessThan(String value) {
            addCriterion("vend_zip <", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipLessThanOrEqualTo(String value) {
            addCriterion("vend_zip <=", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipLike(String value) {
            addCriterion("vend_zip like", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipNotLike(String value) {
            addCriterion("vend_zip not like", value, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipIn(List<String> values) {
            addCriterion("vend_zip in", values, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipNotIn(List<String> values) {
            addCriterion("vend_zip not in", values, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipBetween(String value1, String value2) {
            addCriterion("vend_zip between", value1, value2, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendZipNotBetween(String value1, String value2) {
            addCriterion("vend_zip not between", value1, value2, "vendZip");
            return (Criteria) this;
        }

        public Criteria andVendCountryIsNull() {
            addCriterion("vend_country is null");
            return (Criteria) this;
        }

        public Criteria andVendCountryIsNotNull() {
            addCriterion("vend_country is not null");
            return (Criteria) this;
        }

        public Criteria andVendCountryEqualTo(String value) {
            addCriterion("vend_country =", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryNotEqualTo(String value) {
            addCriterion("vend_country <>", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryGreaterThan(String value) {
            addCriterion("vend_country >", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryGreaterThanOrEqualTo(String value) {
            addCriterion("vend_country >=", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryLessThan(String value) {
            addCriterion("vend_country <", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryLessThanOrEqualTo(String value) {
            addCriterion("vend_country <=", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryLike(String value) {
            addCriterion("vend_country like", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryNotLike(String value) {
            addCriterion("vend_country not like", value, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryIn(List<String> values) {
            addCriterion("vend_country in", values, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryNotIn(List<String> values) {
            addCriterion("vend_country not in", values, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryBetween(String value1, String value2) {
            addCriterion("vend_country between", value1, value2, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andVendCountryNotBetween(String value1, String value2) {
            addCriterion("vend_country not between", value1, value2, "vendCountry");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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