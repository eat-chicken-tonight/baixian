package com.baixian.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BxAttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BxAttentionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNull() {
            addCriterion("download_num is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNotNull() {
            addCriterion("download_num is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumEqualTo(Integer value) {
            addCriterion("download_num =", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotEqualTo(Integer value) {
            addCriterion("download_num <>", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThan(Integer value) {
            addCriterion("download_num >", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_num >=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThan(Integer value) {
            addCriterion("download_num <", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("download_num <=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIn(List<Integer> values) {
            addCriterion("download_num in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotIn(List<Integer> values) {
            addCriterion("download_num not in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumBetween(Integer value1, Integer value2) {
            addCriterion("download_num between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("download_num not between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDescritionIsNull() {
            addCriterion("descrition is null");
            return (Criteria) this;
        }

        public Criteria andDescritionIsNotNull() {
            addCriterion("descrition is not null");
            return (Criteria) this;
        }

        public Criteria andDescritionEqualTo(String value) {
            addCriterion("descrition =", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionNotEqualTo(String value) {
            addCriterion("descrition <>", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionGreaterThan(String value) {
            addCriterion("descrition >", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionGreaterThanOrEqualTo(String value) {
            addCriterion("descrition >=", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionLessThan(String value) {
            addCriterion("descrition <", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionLessThanOrEqualTo(String value) {
            addCriterion("descrition <=", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionLike(String value) {
            addCriterion("descrition like", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionNotLike(String value) {
            addCriterion("descrition not like", value, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionIn(List<String> values) {
            addCriterion("descrition in", values, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionNotIn(List<String> values) {
            addCriterion("descrition not in", values, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionBetween(String value1, String value2) {
            addCriterion("descrition between", value1, value2, "descrition");
            return (Criteria) this;
        }

        public Criteria andDescritionNotBetween(String value1, String value2) {
            addCriterion("descrition not between", value1, value2, "descrition");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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