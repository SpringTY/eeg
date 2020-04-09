package com.spring.eeg.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class FriendsarticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendsarticleExample() {
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

        public Criteria andArticlenameIsNull() {
            addCriterion("articleName is null");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNotNull() {
            addCriterion("articleName is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenameEqualTo(String value) {
            addCriterion("articleName =", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotEqualTo(String value) {
            addCriterion("articleName <>", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThan(String value) {
            addCriterion("articleName >", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThanOrEqualTo(String value) {
            addCriterion("articleName >=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThan(String value) {
            addCriterion("articleName <", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThanOrEqualTo(String value) {
            addCriterion("articleName <=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLike(String value) {
            addCriterion("articleName like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotLike(String value) {
            addCriterion("articleName not like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameIn(List<String> values) {
            addCriterion("articleName in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotIn(List<String> values) {
            addCriterion("articleName not in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameBetween(String value1, String value2) {
            addCriterion("articleName between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotBetween(String value1, String value2) {
            addCriterion("articleName not between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlepathIsNull() {
            addCriterion("articlePath is null");
            return (Criteria) this;
        }

        public Criteria andArticlepathIsNotNull() {
            addCriterion("articlePath is not null");
            return (Criteria) this;
        }

        public Criteria andArticlepathEqualTo(String value) {
            addCriterion("articlePath =", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathNotEqualTo(String value) {
            addCriterion("articlePath <>", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathGreaterThan(String value) {
            addCriterion("articlePath >", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathGreaterThanOrEqualTo(String value) {
            addCriterion("articlePath >=", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathLessThan(String value) {
            addCriterion("articlePath <", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathLessThanOrEqualTo(String value) {
            addCriterion("articlePath <=", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathLike(String value) {
            addCriterion("articlePath like", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathNotLike(String value) {
            addCriterion("articlePath not like", value, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathIn(List<String> values) {
            addCriterion("articlePath in", values, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathNotIn(List<String> values) {
            addCriterion("articlePath not in", values, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathBetween(String value1, String value2) {
            addCriterion("articlePath between", value1, value2, "articlepath");
            return (Criteria) this;
        }

        public Criteria andArticlepathNotBetween(String value1, String value2) {
            addCriterion("articlePath not between", value1, value2, "articlepath");
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
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