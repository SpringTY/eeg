package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class FriendlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendlistExample() {
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

        public Criteria andUserfromIsNull() {
            addCriterion("userFrom is null");
            return (Criteria) this;
        }

        public Criteria andUserfromIsNotNull() {
            addCriterion("userFrom is not null");
            return (Criteria) this;
        }

        public Criteria andUserfromEqualTo(Integer value) {
            addCriterion("userFrom =", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromNotEqualTo(Integer value) {
            addCriterion("userFrom <>", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromGreaterThan(Integer value) {
            addCriterion("userFrom >", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("userFrom >=", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromLessThan(Integer value) {
            addCriterion("userFrom <", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromLessThanOrEqualTo(Integer value) {
            addCriterion("userFrom <=", value, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromIn(List<Integer> values) {
            addCriterion("userFrom in", values, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromNotIn(List<Integer> values) {
            addCriterion("userFrom not in", values, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromBetween(Integer value1, Integer value2) {
            addCriterion("userFrom between", value1, value2, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUserfromNotBetween(Integer value1, Integer value2) {
            addCriterion("userFrom not between", value1, value2, "userfrom");
            return (Criteria) this;
        }

        public Criteria andUsertoIsNull() {
            addCriterion("userTo is null");
            return (Criteria) this;
        }

        public Criteria andUsertoIsNotNull() {
            addCriterion("userTo is not null");
            return (Criteria) this;
        }

        public Criteria andUsertoEqualTo(Integer value) {
            addCriterion("userTo =", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoNotEqualTo(Integer value) {
            addCriterion("userTo <>", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoGreaterThan(Integer value) {
            addCriterion("userTo >", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoGreaterThanOrEqualTo(Integer value) {
            addCriterion("userTo >=", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoLessThan(Integer value) {
            addCriterion("userTo <", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoLessThanOrEqualTo(Integer value) {
            addCriterion("userTo <=", value, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoIn(List<Integer> values) {
            addCriterion("userTo in", values, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoNotIn(List<Integer> values) {
            addCriterion("userTo not in", values, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoBetween(Integer value1, Integer value2) {
            addCriterion("userTo between", value1, value2, "userto");
            return (Criteria) this;
        }

        public Criteria andUsertoNotBetween(Integer value1, Integer value2) {
            addCriterion("userTo not between", value1, value2, "userto");
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