package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class LearnstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LearnstateExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLearndateIsNull() {
            addCriterion("learnDate is null");
            return (Criteria) this;
        }

        public Criteria andLearndateIsNotNull() {
            addCriterion("learnDate is not null");
            return (Criteria) this;
        }

        public Criteria andLearndateEqualTo(Integer value) {
            addCriterion("learnDate =", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateNotEqualTo(Integer value) {
            addCriterion("learnDate <>", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateGreaterThan(Integer value) {
            addCriterion("learnDate >", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnDate >=", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateLessThan(Integer value) {
            addCriterion("learnDate <", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateLessThanOrEqualTo(Integer value) {
            addCriterion("learnDate <=", value, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateIn(List<Integer> values) {
            addCriterion("learnDate in", values, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateNotIn(List<Integer> values) {
            addCriterion("learnDate not in", values, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateBetween(Integer value1, Integer value2) {
            addCriterion("learnDate between", value1, value2, "learndate");
            return (Criteria) this;
        }

        public Criteria andLearndateNotBetween(Integer value1, Integer value2) {
            addCriterion("learnDate not between", value1, value2, "learndate");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeIsNull() {
            addCriterion("attentionTime is null");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeIsNotNull() {
            addCriterion("attentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeEqualTo(Integer value) {
            addCriterion("attentionTime =", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeNotEqualTo(Integer value) {
            addCriterion("attentionTime <>", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeGreaterThan(Integer value) {
            addCriterion("attentionTime >", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentionTime >=", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeLessThan(Integer value) {
            addCriterion("attentionTime <", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("attentionTime <=", value, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeIn(List<Integer> values) {
            addCriterion("attentionTime in", values, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeNotIn(List<Integer> values) {
            addCriterion("attentionTime not in", values, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("attentionTime between", value1, value2, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andAttentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("attentionTime not between", value1, value2, "attentiontime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeIsNull() {
            addCriterion("totalTime is null");
            return (Criteria) this;
        }

        public Criteria andTotaltimeIsNotNull() {
            addCriterion("totalTime is not null");
            return (Criteria) this;
        }

        public Criteria andTotaltimeEqualTo(Integer value) {
            addCriterion("totalTime =", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeNotEqualTo(Integer value) {
            addCriterion("totalTime <>", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeGreaterThan(Integer value) {
            addCriterion("totalTime >", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalTime >=", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeLessThan(Integer value) {
            addCriterion("totalTime <", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("totalTime <=", value, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeIn(List<Integer> values) {
            addCriterion("totalTime in", values, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeNotIn(List<Integer> values) {
            addCriterion("totalTime not in", values, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("totalTime between", value1, value2, "totaltime");
            return (Criteria) this;
        }

        public Criteria andTotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("totalTime not between", value1, value2, "totaltime");
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