package com.jhl.entity.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductcustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductcustomersExample() {
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