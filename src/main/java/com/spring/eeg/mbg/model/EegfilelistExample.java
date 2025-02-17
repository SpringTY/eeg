package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EegfilelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EegfilelistExample() {
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

        public Criteria andFileidIsNull() {
            addCriterion("fileId is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("fileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(Integer value) {
            addCriterion("fileId =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(Integer value) {
            addCriterion("fileId <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(Integer value) {
            addCriterion("fileId >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileId >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(Integer value) {
            addCriterion("fileId <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(Integer value) {
            addCriterion("fileId <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<Integer> values) {
            addCriterion("fileId in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<Integer> values) {
            addCriterion("fileId not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(Integer value1, Integer value2) {
            addCriterion("fileId between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("fileId not between", value1, value2, "fileid");
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

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNull() {
            addCriterion("uploadDate is null");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNotNull() {
            addCriterion("uploadDate is not null");
            return (Criteria) this;
        }

        public Criteria andUploaddateEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate =", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate <>", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThan(Date value) {
            addCriterionForJDBCDate("uploadDate >", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate >=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThan(Date value) {
            addCriterionForJDBCDate("uploadDate <", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate <=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateIn(List<Date> values) {
            addCriterionForJDBCDate("uploadDate in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("uploadDate not in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadDate between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadDate not between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andAnalysisedIsNull() {
            addCriterion("analysised is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisedIsNotNull() {
            addCriterion("analysised is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisedEqualTo(Integer value) {
            addCriterion("analysised =", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedNotEqualTo(Integer value) {
            addCriterion("analysised <>", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedGreaterThan(Integer value) {
            addCriterion("analysised >", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedGreaterThanOrEqualTo(Integer value) {
            addCriterion("analysised >=", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedLessThan(Integer value) {
            addCriterion("analysised <", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedLessThanOrEqualTo(Integer value) {
            addCriterion("analysised <=", value, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedIn(List<Integer> values) {
            addCriterion("analysised in", values, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedNotIn(List<Integer> values) {
            addCriterion("analysised not in", values, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedBetween(Integer value1, Integer value2) {
            addCriterion("analysised between", value1, value2, "analysised");
            return (Criteria) this;
        }

        public Criteria andAnalysisedNotBetween(Integer value1, Integer value2) {
            addCriterion("analysised not between", value1, value2, "analysised");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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