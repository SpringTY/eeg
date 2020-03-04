package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class UserlastweekstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserlastweekstateExample() {
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

        public Criteria andMondaytotaltimeIsNull() {
            addCriterion("mondayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeIsNotNull() {
            addCriterion("mondayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeEqualTo(Integer value) {
            addCriterion("mondayTotalTime =", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeNotEqualTo(Integer value) {
            addCriterion("mondayTotalTime <>", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeGreaterThan(Integer value) {
            addCriterion("mondayTotalTime >", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mondayTotalTime >=", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeLessThan(Integer value) {
            addCriterion("mondayTotalTime <", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("mondayTotalTime <=", value, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeIn(List<Integer> values) {
            addCriterion("mondayTotalTime in", values, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeNotIn(List<Integer> values) {
            addCriterion("mondayTotalTime not in", values, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("mondayTotalTime between", value1, value2, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("mondayTotalTime not between", value1, value2, "mondaytotaltime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeIsNull() {
            addCriterion("mondayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeIsNotNull() {
            addCriterion("mondayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeEqualTo(Integer value) {
            addCriterion("mondayAttentionTime =", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeNotEqualTo(Integer value) {
            addCriterion("mondayAttentionTime <>", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeGreaterThan(Integer value) {
            addCriterion("mondayAttentionTime >", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mondayAttentionTime >=", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeLessThan(Integer value) {
            addCriterion("mondayAttentionTime <", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("mondayAttentionTime <=", value, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeIn(List<Integer> values) {
            addCriterion("mondayAttentionTime in", values, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeNotIn(List<Integer> values) {
            addCriterion("mondayAttentionTime not in", values, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("mondayAttentionTime between", value1, value2, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andMondayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("mondayAttentionTime not between", value1, value2, "mondayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeIsNull() {
            addCriterion("tuesDayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeIsNotNull() {
            addCriterion("tuesDayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeEqualTo(Integer value) {
            addCriterion("tuesDayTotalTime =", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeNotEqualTo(Integer value) {
            addCriterion("tuesDayTotalTime <>", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeGreaterThan(Integer value) {
            addCriterion("tuesDayTotalTime >", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesDayTotalTime >=", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeLessThan(Integer value) {
            addCriterion("tuesDayTotalTime <", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("tuesDayTotalTime <=", value, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeIn(List<Integer> values) {
            addCriterion("tuesDayTotalTime in", values, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeNotIn(List<Integer> values) {
            addCriterion("tuesDayTotalTime not in", values, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("tuesDayTotalTime between", value1, value2, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesDayTotalTime not between", value1, value2, "tuesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeIsNull() {
            addCriterion("tuesDayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeIsNotNull() {
            addCriterion("tuesDayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeEqualTo(Integer value) {
            addCriterion("tuesDayAttentionTime =", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeNotEqualTo(Integer value) {
            addCriterion("tuesDayAttentionTime <>", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeGreaterThan(Integer value) {
            addCriterion("tuesDayAttentionTime >", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesDayAttentionTime >=", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeLessThan(Integer value) {
            addCriterion("tuesDayAttentionTime <", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("tuesDayAttentionTime <=", value, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeIn(List<Integer> values) {
            addCriterion("tuesDayAttentionTime in", values, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeNotIn(List<Integer> values) {
            addCriterion("tuesDayAttentionTime not in", values, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("tuesDayAttentionTime between", value1, value2, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andTuesdayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesDayAttentionTime not between", value1, value2, "tuesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeIsNull() {
            addCriterion("wednesdayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeIsNotNull() {
            addCriterion("wednesdayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeEqualTo(Integer value) {
            addCriterion("wednesdayTotalTime =", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeNotEqualTo(Integer value) {
            addCriterion("wednesdayTotalTime <>", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeGreaterThan(Integer value) {
            addCriterion("wednesdayTotalTime >", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wednesdayTotalTime >=", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeLessThan(Integer value) {
            addCriterion("wednesdayTotalTime <", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("wednesdayTotalTime <=", value, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeIn(List<Integer> values) {
            addCriterion("wednesdayTotalTime in", values, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeNotIn(List<Integer> values) {
            addCriterion("wednesdayTotalTime not in", values, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("wednesdayTotalTime between", value1, value2, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("wednesdayTotalTime not between", value1, value2, "wednesdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeIsNull() {
            addCriterion("wednesdayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeIsNotNull() {
            addCriterion("wednesdayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeEqualTo(Integer value) {
            addCriterion("wednesdayAttentionTime =", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeNotEqualTo(Integer value) {
            addCriterion("wednesdayAttentionTime <>", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeGreaterThan(Integer value) {
            addCriterion("wednesdayAttentionTime >", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wednesdayAttentionTime >=", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeLessThan(Integer value) {
            addCriterion("wednesdayAttentionTime <", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("wednesdayAttentionTime <=", value, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeIn(List<Integer> values) {
            addCriterion("wednesdayAttentionTime in", values, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeNotIn(List<Integer> values) {
            addCriterion("wednesdayAttentionTime not in", values, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("wednesdayAttentionTime between", value1, value2, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andWednesdayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("wednesdayAttentionTime not between", value1, value2, "wednesdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeIsNull() {
            addCriterion("thursdayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeIsNotNull() {
            addCriterion("thursdayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeEqualTo(Integer value) {
            addCriterion("thursdayTotalTime =", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeNotEqualTo(Integer value) {
            addCriterion("thursdayTotalTime <>", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeGreaterThan(Integer value) {
            addCriterion("thursdayTotalTime >", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("thursdayTotalTime >=", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeLessThan(Integer value) {
            addCriterion("thursdayTotalTime <", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("thursdayTotalTime <=", value, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeIn(List<Integer> values) {
            addCriterion("thursdayTotalTime in", values, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeNotIn(List<Integer> values) {
            addCriterion("thursdayTotalTime not in", values, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("thursdayTotalTime between", value1, value2, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("thursdayTotalTime not between", value1, value2, "thursdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeIsNull() {
            addCriterion("thursdayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeIsNotNull() {
            addCriterion("thursdayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeEqualTo(Integer value) {
            addCriterion("thursdayAttentionTime =", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeNotEqualTo(Integer value) {
            addCriterion("thursdayAttentionTime <>", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeGreaterThan(Integer value) {
            addCriterion("thursdayAttentionTime >", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("thursdayAttentionTime >=", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeLessThan(Integer value) {
            addCriterion("thursdayAttentionTime <", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("thursdayAttentionTime <=", value, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeIn(List<Integer> values) {
            addCriterion("thursdayAttentionTime in", values, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeNotIn(List<Integer> values) {
            addCriterion("thursdayAttentionTime not in", values, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("thursdayAttentionTime between", value1, value2, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andThursdayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("thursdayAttentionTime not between", value1, value2, "thursdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeIsNull() {
            addCriterion("fridayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeIsNotNull() {
            addCriterion("fridayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeEqualTo(Integer value) {
            addCriterion("fridayTotalTime =", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeNotEqualTo(Integer value) {
            addCriterion("fridayTotalTime <>", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeGreaterThan(Integer value) {
            addCriterion("fridayTotalTime >", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fridayTotalTime >=", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeLessThan(Integer value) {
            addCriterion("fridayTotalTime <", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("fridayTotalTime <=", value, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeIn(List<Integer> values) {
            addCriterion("fridayTotalTime in", values, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeNotIn(List<Integer> values) {
            addCriterion("fridayTotalTime not in", values, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("fridayTotalTime between", value1, value2, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("fridayTotalTime not between", value1, value2, "fridaytotaltime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeIsNull() {
            addCriterion("fridayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeIsNotNull() {
            addCriterion("fridayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeEqualTo(Integer value) {
            addCriterion("fridayAttentionTime =", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeNotEqualTo(Integer value) {
            addCriterion("fridayAttentionTime <>", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeGreaterThan(Integer value) {
            addCriterion("fridayAttentionTime >", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fridayAttentionTime >=", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeLessThan(Integer value) {
            addCriterion("fridayAttentionTime <", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("fridayAttentionTime <=", value, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeIn(List<Integer> values) {
            addCriterion("fridayAttentionTime in", values, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeNotIn(List<Integer> values) {
            addCriterion("fridayAttentionTime not in", values, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("fridayAttentionTime between", value1, value2, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andFridayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("fridayAttentionTime not between", value1, value2, "fridayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeIsNull() {
            addCriterion("saturdayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeIsNotNull() {
            addCriterion("saturdayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeEqualTo(Integer value) {
            addCriterion("saturdayTotalTime =", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeNotEqualTo(Integer value) {
            addCriterion("saturdayTotalTime <>", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeGreaterThan(Integer value) {
            addCriterion("saturdayTotalTime >", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("saturdayTotalTime >=", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeLessThan(Integer value) {
            addCriterion("saturdayTotalTime <", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("saturdayTotalTime <=", value, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeIn(List<Integer> values) {
            addCriterion("saturdayTotalTime in", values, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeNotIn(List<Integer> values) {
            addCriterion("saturdayTotalTime not in", values, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("saturdayTotalTime between", value1, value2, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("saturdayTotalTime not between", value1, value2, "saturdaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeIsNull() {
            addCriterion("saturdayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeIsNotNull() {
            addCriterion("saturdayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeEqualTo(Integer value) {
            addCriterion("saturdayAttentionTime =", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeNotEqualTo(Integer value) {
            addCriterion("saturdayAttentionTime <>", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeGreaterThan(Integer value) {
            addCriterion("saturdayAttentionTime >", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("saturdayAttentionTime >=", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeLessThan(Integer value) {
            addCriterion("saturdayAttentionTime <", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("saturdayAttentionTime <=", value, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeIn(List<Integer> values) {
            addCriterion("saturdayAttentionTime in", values, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeNotIn(List<Integer> values) {
            addCriterion("saturdayAttentionTime not in", values, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("saturdayAttentionTime between", value1, value2, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSaturdayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("saturdayAttentionTime not between", value1, value2, "saturdayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeIsNull() {
            addCriterion("sunDayTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeIsNotNull() {
            addCriterion("sunDayTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeEqualTo(Integer value) {
            addCriterion("sunDayTotalTime =", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeNotEqualTo(Integer value) {
            addCriterion("sunDayTotalTime <>", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeGreaterThan(Integer value) {
            addCriterion("sunDayTotalTime >", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sunDayTotalTime >=", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeLessThan(Integer value) {
            addCriterion("sunDayTotalTime <", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("sunDayTotalTime <=", value, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeIn(List<Integer> values) {
            addCriterion("sunDayTotalTime in", values, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeNotIn(List<Integer> values) {
            addCriterion("sunDayTotalTime not in", values, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeBetween(Integer value1, Integer value2) {
            addCriterion("sunDayTotalTime between", value1, value2, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundaytotaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sunDayTotalTime not between", value1, value2, "sundaytotaltime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeIsNull() {
            addCriterion("sundayAttentionTime is null");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeIsNotNull() {
            addCriterion("sundayAttentionTime is not null");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeEqualTo(Integer value) {
            addCriterion("sundayAttentionTime =", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeNotEqualTo(Integer value) {
            addCriterion("sundayAttentionTime <>", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeGreaterThan(Integer value) {
            addCriterion("sundayAttentionTime >", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sundayAttentionTime >=", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeLessThan(Integer value) {
            addCriterion("sundayAttentionTime <", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeLessThanOrEqualTo(Integer value) {
            addCriterion("sundayAttentionTime <=", value, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeIn(List<Integer> values) {
            addCriterion("sundayAttentionTime in", values, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeNotIn(List<Integer> values) {
            addCriterion("sundayAttentionTime not in", values, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeBetween(Integer value1, Integer value2) {
            addCriterion("sundayAttentionTime between", value1, value2, "sundayattentiontime");
            return (Criteria) this;
        }

        public Criteria andSundayattentiontimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sundayAttentionTime not between", value1, value2, "sundayattentiontime");
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