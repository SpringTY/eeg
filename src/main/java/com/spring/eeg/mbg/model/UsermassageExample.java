package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsermassageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsermassageExample() {
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

        public Criteria andMassageidIsNull() {
            addCriterion("massageId is null");
            return (Criteria) this;
        }

        public Criteria andMassageidIsNotNull() {
            addCriterion("massageId is not null");
            return (Criteria) this;
        }

        public Criteria andMassageidEqualTo(Integer value) {
            addCriterion("massageId =", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidNotEqualTo(Integer value) {
            addCriterion("massageId <>", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidGreaterThan(Integer value) {
            addCriterion("massageId >", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("massageId >=", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidLessThan(Integer value) {
            addCriterion("massageId <", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidLessThanOrEqualTo(Integer value) {
            addCriterion("massageId <=", value, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidIn(List<Integer> values) {
            addCriterion("massageId in", values, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidNotIn(List<Integer> values) {
            addCriterion("massageId not in", values, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidBetween(Integer value1, Integer value2) {
            addCriterion("massageId between", value1, value2, "massageid");
            return (Criteria) this;
        }

        public Criteria andMassageidNotBetween(Integer value1, Integer value2) {
            addCriterion("massageId not between", value1, value2, "massageid");
            return (Criteria) this;
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

        public Criteria andUsermassageIsNull() {
            addCriterion("userMassage is null");
            return (Criteria) this;
        }

        public Criteria andUsermassageIsNotNull() {
            addCriterion("userMassage is not null");
            return (Criteria) this;
        }

        public Criteria andUsermassageEqualTo(String value) {
            addCriterion("userMassage =", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageNotEqualTo(String value) {
            addCriterion("userMassage <>", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageGreaterThan(String value) {
            addCriterion("userMassage >", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageGreaterThanOrEqualTo(String value) {
            addCriterion("userMassage >=", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageLessThan(String value) {
            addCriterion("userMassage <", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageLessThanOrEqualTo(String value) {
            addCriterion("userMassage <=", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageLike(String value) {
            addCriterion("userMassage like", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageNotLike(String value) {
            addCriterion("userMassage not like", value, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageIn(List<String> values) {
            addCriterion("userMassage in", values, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageNotIn(List<String> values) {
            addCriterion("userMassage not in", values, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageBetween(String value1, String value2) {
            addCriterion("userMassage between", value1, value2, "usermassage");
            return (Criteria) this;
        }

        public Criteria andUsermassageNotBetween(String value1, String value2) {
            addCriterion("userMassage not between", value1, value2, "usermassage");
            return (Criteria) this;
        }

        public Criteria andReadedIsNull() {
            addCriterion("readed is null");
            return (Criteria) this;
        }

        public Criteria andReadedIsNotNull() {
            addCriterion("readed is not null");
            return (Criteria) this;
        }

        public Criteria andReadedEqualTo(Integer value) {
            addCriterion("readed =", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotEqualTo(Integer value) {
            addCriterion("readed <>", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThan(Integer value) {
            addCriterion("readed >", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThanOrEqualTo(Integer value) {
            addCriterion("readed >=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThan(Integer value) {
            addCriterion("readed <", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThanOrEqualTo(Integer value) {
            addCriterion("readed <=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedIn(List<Integer> values) {
            addCriterion("readed in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotIn(List<Integer> values) {
            addCriterion("readed not in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedBetween(Integer value1, Integer value2) {
            addCriterion("readed between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotBetween(Integer value1, Integer value2) {
            addCriterion("readed not between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterionForJDBCDate("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sendTime not between", value1, value2, "sendtime");
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