package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPlanidIsNull() {
            addCriterion("planId is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planId is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planId =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planId <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planId >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planId >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planId <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planId <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planId in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planId not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planId between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planId not between", value1, value2, "planid");
            return (Criteria) this;
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

        public Criteria andPlannameIsNull() {
            addCriterion("planName is null");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNotNull() {
            addCriterion("planName is not null");
            return (Criteria) this;
        }

        public Criteria andPlannameEqualTo(String value) {
            addCriterion("planName =", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotEqualTo(String value) {
            addCriterion("planName <>", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThan(String value) {
            addCriterion("planName >", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThanOrEqualTo(String value) {
            addCriterion("planName >=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThan(String value) {
            addCriterion("planName <", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThanOrEqualTo(String value) {
            addCriterion("planName <=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLike(String value) {
            addCriterion("planName like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotLike(String value) {
            addCriterion("planName not like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameIn(List<String> values) {
            addCriterion("planName in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotIn(List<String> values) {
            addCriterion("planName not in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameBetween(String value1, String value2) {
            addCriterion("planName between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotBetween(String value1, String value2) {
            addCriterion("planName not between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionIsNull() {
            addCriterion("planDescription is null");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionIsNotNull() {
            addCriterion("planDescription is not null");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionEqualTo(String value) {
            addCriterion("planDescription =", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionNotEqualTo(String value) {
            addCriterion("planDescription <>", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionGreaterThan(String value) {
            addCriterion("planDescription >", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("planDescription >=", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionLessThan(String value) {
            addCriterion("planDescription <", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionLessThanOrEqualTo(String value) {
            addCriterion("planDescription <=", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionLike(String value) {
            addCriterion("planDescription like", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionNotLike(String value) {
            addCriterion("planDescription not like", value, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionIn(List<String> values) {
            addCriterion("planDescription in", values, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionNotIn(List<String> values) {
            addCriterion("planDescription not in", values, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionBetween(String value1, String value2) {
            addCriterion("planDescription between", value1, value2, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlandescriptionNotBetween(String value1, String value2) {
            addCriterion("planDescription not between", value1, value2, "plandescription");
            return (Criteria) this;
        }

        public Criteria andPlantimeIsNull() {
            addCriterion("planTime is null");
            return (Criteria) this;
        }

        public Criteria andPlantimeIsNotNull() {
            addCriterion("planTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlantimeEqualTo(Integer value) {
            addCriterion("planTime =", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotEqualTo(Integer value) {
            addCriterion("planTime <>", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThan(Integer value) {
            addCriterion("planTime >", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("planTime >=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThan(Integer value) {
            addCriterion("planTime <", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThanOrEqualTo(Integer value) {
            addCriterion("planTime <=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeIn(List<Integer> values) {
            addCriterion("planTime in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotIn(List<Integer> values) {
            addCriterion("planTime not in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeBetween(Integer value1, Integer value2) {
            addCriterion("planTime between", value1, value2, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotBetween(Integer value1, Integer value2) {
            addCriterion("planTime not between", value1, value2, "plantime");
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

        public Criteria andRealtimeEqualTo(Integer value) {
            addCriterion("realTime =", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotEqualTo(Integer value) {
            addCriterion("realTime <>", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThan(Integer value) {
            addCriterion("realTime >", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("realTime >=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThan(Integer value) {
            addCriterion("realTime <", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThanOrEqualTo(Integer value) {
            addCriterion("realTime <=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIn(List<Integer> values) {
            addCriterion("realTime in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotIn(List<Integer> values) {
            addCriterion("realTime not in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeBetween(Integer value1, Integer value2) {
            addCriterion("realTime between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("realTime not between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andPlaninfoIsNull() {
            addCriterion("planInfo is null");
            return (Criteria) this;
        }

        public Criteria andPlaninfoIsNotNull() {
            addCriterion("planInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPlaninfoEqualTo(String value) {
            addCriterion("planInfo =", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoNotEqualTo(String value) {
            addCriterion("planInfo <>", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoGreaterThan(String value) {
            addCriterion("planInfo >", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoGreaterThanOrEqualTo(String value) {
            addCriterion("planInfo >=", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoLessThan(String value) {
            addCriterion("planInfo <", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoLessThanOrEqualTo(String value) {
            addCriterion("planInfo <=", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoLike(String value) {
            addCriterion("planInfo like", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoNotLike(String value) {
            addCriterion("planInfo not like", value, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoIn(List<String> values) {
            addCriterion("planInfo in", values, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoNotIn(List<String> values) {
            addCriterion("planInfo not in", values, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoBetween(String value1, String value2) {
            addCriterion("planInfo between", value1, value2, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlaninfoNotBetween(String value1, String value2) {
            addCriterion("planInfo not between", value1, value2, "planinfo");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("planDate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("planDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterionForJDBCDate("planDate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("planDate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterionForJDBCDate("planDate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planDate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterionForJDBCDate("planDate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planDate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterionForJDBCDate("planDate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("planDate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planDate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planDate not between", value1, value2, "plandate");
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

        public Criteria andFinishedEqualTo(String value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(String value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(String value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(String value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(String value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLike(String value) {
            addCriterion("finished like", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotLike(String value) {
            addCriterion("finished not like", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<String> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<String> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(String value1, String value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(String value1, String value2) {
            addCriterion("finished not between", value1, value2, "finished");
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

        public Criteria andTrashEqualTo(String value) {
            addCriterion("trash =", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotEqualTo(String value) {
            addCriterion("trash <>", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThan(String value) {
            addCriterion("trash >", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashGreaterThanOrEqualTo(String value) {
            addCriterion("trash >=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThan(String value) {
            addCriterion("trash <", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLessThanOrEqualTo(String value) {
            addCriterion("trash <=", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashLike(String value) {
            addCriterion("trash like", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotLike(String value) {
            addCriterion("trash not like", value, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashIn(List<String> values) {
            addCriterion("trash in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotIn(List<String> values) {
            addCriterion("trash not in", values, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashBetween(String value1, String value2) {
            addCriterion("trash between", value1, value2, "trash");
            return (Criteria) this;
        }

        public Criteria andTrashNotBetween(String value1, String value2) {
            addCriterion("trash not between", value1, value2, "trash");
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

        public Criteria andImportantEqualTo(String value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(String value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(String value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(String value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(String value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(String value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLike(String value) {
            addCriterion("important like", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotLike(String value) {
            addCriterion("important not like", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<String> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<String> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(String value1, String value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(String value1, String value2) {
            addCriterion("important not between", value1, value2, "important");
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