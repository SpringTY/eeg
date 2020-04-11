package com.spring.eeg.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlanstatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanstatExample() {
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

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Long value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Long value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Long value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Long value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Long value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Long value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Long> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Long> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Long value1, Long value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Long value1, Long value2) {
            addCriterion("finished not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andImportantIsNull() {
            addCriterion("important is null");
            return (Criteria) this;
        }

        public Criteria andImportantIsNotNull() {
            addCriterion("important is not null");
            return (Criteria) this;
        }

        public Criteria andImportantEqualTo(Long value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(Long value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(Long value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(Long value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(Long value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(Long value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<Long> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<Long> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(Long value1, Long value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(Long value1, Long value2) {
            addCriterion("important not between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andTrashIsNull() {
            addCriterion("trash is null");
            return (Criteria) this;
        }

        public Criteria andTrashIsNotNull() {
            addCriterion("trash is not null");
            return (Criteria) this;
        }

        public Criteria andTrashEqualTo(Long value) {
            addCriterion("trash =", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotEqualTo(Long value) {
            addCriterion("trash <>", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThan(Long value) {
            addCriterion("trash >", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThanOrEqualTo(Long value) {
            addCriterion("trash >=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThan(Long value) {
            addCriterion("trash <", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThanOrEqualTo(Long value) {
            addCriterion("trash <=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashIn(List<Long> values) {
            addCriterion("trash in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotIn(List<Long> values) {
            addCriterion("trash not in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashBetween(Long value1, Long value2) {
            addCriterion("trash between", value1, value2, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotBetween(Long value1, Long value2) {
            addCriterion("trash not between", value1, value2, "trash");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNull() {
            addCriterion("realTime is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNotNull() {
            addCriterion("realTime is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeEqualTo(BigDecimal value) {
            addCriterion("realTime =", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotEqualTo(BigDecimal value) {
            addCriterion("realTime <>", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThan(BigDecimal value) {
            addCriterion("realTime >", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realTime >=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThan(BigDecimal value) {
            addCriterion("realTime <", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realTime <=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIn(List<BigDecimal> values) {
            addCriterion("realTime in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotIn(List<BigDecimal> values) {
            addCriterion("realTime not in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realTime between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realTime not between", value1, value2, "realtime");
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