package com.jhl.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomersExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNull() {
            addCriterion("cust_address is null");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNotNull() {
            addCriterion("cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddressEqualTo(String value) {
            addCriterion("cust_address =", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotEqualTo(String value) {
            addCriterion("cust_address <>", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThan(String value) {
            addCriterion("cust_address >", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_address >=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThan(String value) {
            addCriterion("cust_address <", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThanOrEqualTo(String value) {
            addCriterion("cust_address <=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLike(String value) {
            addCriterion("cust_address like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotLike(String value) {
            addCriterion("cust_address not like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressIn(List<String> values) {
            addCriterion("cust_address in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotIn(List<String> values) {
            addCriterion("cust_address not in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressBetween(String value1, String value2) {
            addCriterion("cust_address between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotBetween(String value1, String value2) {
            addCriterion("cust_address not between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustCityIsNull() {
            addCriterion("cust_city is null");
            return (Criteria) this;
        }

        public Criteria andCustCityIsNotNull() {
            addCriterion("cust_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustCityEqualTo(String value) {
            addCriterion("cust_city =", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotEqualTo(String value) {
            addCriterion("cust_city <>", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityGreaterThan(String value) {
            addCriterion("cust_city >", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityGreaterThanOrEqualTo(String value) {
            addCriterion("cust_city >=", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLessThan(String value) {
            addCriterion("cust_city <", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLessThanOrEqualTo(String value) {
            addCriterion("cust_city <=", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityLike(String value) {
            addCriterion("cust_city like", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotLike(String value) {
            addCriterion("cust_city not like", value, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityIn(List<String> values) {
            addCriterion("cust_city in", values, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotIn(List<String> values) {
            addCriterion("cust_city not in", values, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityBetween(String value1, String value2) {
            addCriterion("cust_city between", value1, value2, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustCityNotBetween(String value1, String value2) {
            addCriterion("cust_city not between", value1, value2, "custCity");
            return (Criteria) this;
        }

        public Criteria andCustStateIsNull() {
            addCriterion("cust_state is null");
            return (Criteria) this;
        }

        public Criteria andCustStateIsNotNull() {
            addCriterion("cust_state is not null");
            return (Criteria) this;
        }

        public Criteria andCustStateEqualTo(String value) {
            addCriterion("cust_state =", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotEqualTo(String value) {
            addCriterion("cust_state <>", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateGreaterThan(String value) {
            addCriterion("cust_state >", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateGreaterThanOrEqualTo(String value) {
            addCriterion("cust_state >=", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateLessThan(String value) {
            addCriterion("cust_state <", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateLessThanOrEqualTo(String value) {
            addCriterion("cust_state <=", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateLike(String value) {
            addCriterion("cust_state like", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotLike(String value) {
            addCriterion("cust_state not like", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateIn(List<String> values) {
            addCriterion("cust_state in", values, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotIn(List<String> values) {
            addCriterion("cust_state not in", values, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateBetween(String value1, String value2) {
            addCriterion("cust_state between", value1, value2, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotBetween(String value1, String value2) {
            addCriterion("cust_state not between", value1, value2, "custState");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNull() {
            addCriterion("cust_zip is null");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNotNull() {
            addCriterion("cust_zip is not null");
            return (Criteria) this;
        }

        public Criteria andCustZipEqualTo(String value) {
            addCriterion("cust_zip =", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotEqualTo(String value) {
            addCriterion("cust_zip <>", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThan(String value) {
            addCriterion("cust_zip >", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThanOrEqualTo(String value) {
            addCriterion("cust_zip >=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThan(String value) {
            addCriterion("cust_zip <", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThanOrEqualTo(String value) {
            addCriterion("cust_zip <=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLike(String value) {
            addCriterion("cust_zip like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotLike(String value) {
            addCriterion("cust_zip not like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipIn(List<String> values) {
            addCriterion("cust_zip in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotIn(List<String> values) {
            addCriterion("cust_zip not in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipBetween(String value1, String value2) {
            addCriterion("cust_zip between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotBetween(String value1, String value2) {
            addCriterion("cust_zip not between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustCountryIsNull() {
            addCriterion("cust_country is null");
            return (Criteria) this;
        }

        public Criteria andCustCountryIsNotNull() {
            addCriterion("cust_country is not null");
            return (Criteria) this;
        }

        public Criteria andCustCountryEqualTo(String value) {
            addCriterion("cust_country =", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotEqualTo(String value) {
            addCriterion("cust_country <>", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryGreaterThan(String value) {
            addCriterion("cust_country >", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryGreaterThanOrEqualTo(String value) {
            addCriterion("cust_country >=", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLessThan(String value) {
            addCriterion("cust_country <", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLessThanOrEqualTo(String value) {
            addCriterion("cust_country <=", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryLike(String value) {
            addCriterion("cust_country like", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotLike(String value) {
            addCriterion("cust_country not like", value, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryIn(List<String> values) {
            addCriterion("cust_country in", values, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotIn(List<String> values) {
            addCriterion("cust_country not in", values, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryBetween(String value1, String value2) {
            addCriterion("cust_country between", value1, value2, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustCountryNotBetween(String value1, String value2) {
            addCriterion("cust_country not between", value1, value2, "custCountry");
            return (Criteria) this;
        }

        public Criteria andCustContactIsNull() {
            addCriterion("cust_contact is null");
            return (Criteria) this;
        }

        public Criteria andCustContactIsNotNull() {
            addCriterion("cust_contact is not null");
            return (Criteria) this;
        }

        public Criteria andCustContactEqualTo(String value) {
            addCriterion("cust_contact =", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactNotEqualTo(String value) {
            addCriterion("cust_contact <>", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactGreaterThan(String value) {
            addCriterion("cust_contact >", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactGreaterThanOrEqualTo(String value) {
            addCriterion("cust_contact >=", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactLessThan(String value) {
            addCriterion("cust_contact <", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactLessThanOrEqualTo(String value) {
            addCriterion("cust_contact <=", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactLike(String value) {
            addCriterion("cust_contact like", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactNotLike(String value) {
            addCriterion("cust_contact not like", value, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactIn(List<String> values) {
            addCriterion("cust_contact in", values, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactNotIn(List<String> values) {
            addCriterion("cust_contact not in", values, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactBetween(String value1, String value2) {
            addCriterion("cust_contact between", value1, value2, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustContactNotBetween(String value1, String value2) {
            addCriterion("cust_contact not between", value1, value2, "custContact");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNull() {
            addCriterion("cust_email is null");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNotNull() {
            addCriterion("cust_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustEmailEqualTo(String value) {
            addCriterion("cust_email =", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotEqualTo(String value) {
            addCriterion("cust_email <>", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThan(String value) {
            addCriterion("cust_email >", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cust_email >=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThan(String value) {
            addCriterion("cust_email <", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThanOrEqualTo(String value) {
            addCriterion("cust_email <=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLike(String value) {
            addCriterion("cust_email like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotLike(String value) {
            addCriterion("cust_email not like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailIn(List<String> values) {
            addCriterion("cust_email in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotIn(List<String> values) {
            addCriterion("cust_email not in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailBetween(String value1, String value2) {
            addCriterion("cust_email between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotBetween(String value1, String value2) {
            addCriterion("cust_email not between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNull() {
            addCriterion("cust_age is null");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNotNull() {
            addCriterion("cust_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustAgeEqualTo(Integer value) {
            addCriterion("cust_age =", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotEqualTo(Integer value) {
            addCriterion("cust_age <>", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThan(Integer value) {
            addCriterion("cust_age >", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_age >=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThan(Integer value) {
            addCriterion("cust_age <", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThanOrEqualTo(Integer value) {
            addCriterion("cust_age <=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeIn(List<Integer> values) {
            addCriterion("cust_age in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotIn(List<Integer> values) {
            addCriterion("cust_age not in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeBetween(Integer value1, Integer value2) {
            addCriterion("cust_age between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_age not between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNull() {
            addCriterion("cust_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNotNull() {
            addCriterion("cust_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustMobileEqualTo(String value) {
            addCriterion("cust_mobile =", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotEqualTo(String value) {
            addCriterion("cust_mobile <>", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThan(String value) {
            addCriterion("cust_mobile >", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cust_mobile >=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThan(String value) {
            addCriterion("cust_mobile <", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThanOrEqualTo(String value) {
            addCriterion("cust_mobile <=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLike(String value) {
            addCriterion("cust_mobile like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotLike(String value) {
            addCriterion("cust_mobile not like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileIn(List<String> values) {
            addCriterion("cust_mobile in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotIn(List<String> values) {
            addCriterion("cust_mobile not in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileBetween(String value1, String value2) {
            addCriterion("cust_mobile between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotBetween(String value1, String value2) {
            addCriterion("cust_mobile not between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeIsNull() {
            addCriterion("cust_id_type is null");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeIsNotNull() {
            addCriterion("cust_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeEqualTo(String value) {
            addCriterion("cust_id_type =", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeNotEqualTo(String value) {
            addCriterion("cust_id_type <>", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeGreaterThan(String value) {
            addCriterion("cust_id_type >", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id_type >=", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeLessThan(String value) {
            addCriterion("cust_id_type <", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeLessThanOrEqualTo(String value) {
            addCriterion("cust_id_type <=", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeLike(String value) {
            addCriterion("cust_id_type like", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeNotLike(String value) {
            addCriterion("cust_id_type not like", value, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeIn(List<String> values) {
            addCriterion("cust_id_type in", values, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeNotIn(List<String> values) {
            addCriterion("cust_id_type not in", values, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeBetween(String value1, String value2) {
            addCriterion("cust_id_type between", value1, value2, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdTypeNotBetween(String value1, String value2) {
            addCriterion("cust_id_type not between", value1, value2, "custIdType");
            return (Criteria) this;
        }

        public Criteria andCustIdNoIsNull() {
            addCriterion("cust_id_no is null");
            return (Criteria) this;
        }

        public Criteria andCustIdNoIsNotNull() {
            addCriterion("cust_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdNoEqualTo(String value) {
            addCriterion("cust_id_no =", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoNotEqualTo(String value) {
            addCriterion("cust_id_no <>", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoGreaterThan(String value) {
            addCriterion("cust_id_no >", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id_no >=", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoLessThan(String value) {
            addCriterion("cust_id_no <", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoLessThanOrEqualTo(String value) {
            addCriterion("cust_id_no <=", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoLike(String value) {
            addCriterion("cust_id_no like", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoNotLike(String value) {
            addCriterion("cust_id_no not like", value, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoIn(List<String> values) {
            addCriterion("cust_id_no in", values, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoNotIn(List<String> values) {
            addCriterion("cust_id_no not in", values, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoBetween(String value1, String value2) {
            addCriterion("cust_id_no between", value1, value2, "custIdNo");
            return (Criteria) this;
        }

        public Criteria andCustIdNoNotBetween(String value1, String value2) {
            addCriterion("cust_id_no not between", value1, value2, "custIdNo");
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