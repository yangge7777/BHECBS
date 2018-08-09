package com.yang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tb_adminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_adminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPswdIsNull() {
            addCriterion("admin_pswd is null");
            return (Criteria) this;
        }

        public Criteria andAdminPswdIsNotNull() {
            addCriterion("admin_pswd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPswdEqualTo(String value) {
            addCriterion("admin_pswd =", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdNotEqualTo(String value) {
            addCriterion("admin_pswd <>", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdGreaterThan(String value) {
            addCriterion("admin_pswd >", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_pswd >=", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdLessThan(String value) {
            addCriterion("admin_pswd <", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdLessThanOrEqualTo(String value) {
            addCriterion("admin_pswd <=", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdLike(String value) {
            addCriterion("admin_pswd like", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdNotLike(String value) {
            addCriterion("admin_pswd not like", value, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdIn(List<String> values) {
            addCriterion("admin_pswd in", values, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdNotIn(List<String> values) {
            addCriterion("admin_pswd not in", values, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdBetween(String value1, String value2) {
            addCriterion("admin_pswd between", value1, value2, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminPswdNotBetween(String value1, String value2) {
            addCriterion("admin_pswd not between", value1, value2, "adminPswd");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneIsNull() {
            addCriterion("admin_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneIsNotNull() {
            addCriterion("admin_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneEqualTo(String value) {
            addCriterion("admin_telephone =", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneNotEqualTo(String value) {
            addCriterion("admin_telephone <>", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneGreaterThan(String value) {
            addCriterion("admin_telephone >", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_telephone >=", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneLessThan(String value) {
            addCriterion("admin_telephone <", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneLessThanOrEqualTo(String value) {
            addCriterion("admin_telephone <=", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneLike(String value) {
            addCriterion("admin_telephone like", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneNotLike(String value) {
            addCriterion("admin_telephone not like", value, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneIn(List<String> values) {
            addCriterion("admin_telephone in", values, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneNotIn(List<String> values) {
            addCriterion("admin_telephone not in", values, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneBetween(String value1, String value2) {
            addCriterion("admin_telephone between", value1, value2, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminTelephoneNotBetween(String value1, String value2) {
            addCriterion("admin_telephone not between", value1, value2, "adminTelephone");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andImpowerDateIsNull() {
            addCriterion("impower_date is null");
            return (Criteria) this;
        }

        public Criteria andImpowerDateIsNotNull() {
            addCriterion("impower_date is not null");
            return (Criteria) this;
        }

        public Criteria andImpowerDateEqualTo(Date value) {
            addCriterionForJDBCDate("impower_date =", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("impower_date <>", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateGreaterThan(Date value) {
            addCriterionForJDBCDate("impower_date >", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("impower_date >=", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateLessThan(Date value) {
            addCriterionForJDBCDate("impower_date <", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("impower_date <=", value, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateIn(List<Date> values) {
            addCriterionForJDBCDate("impower_date in", values, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("impower_date not in", values, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("impower_date between", value1, value2, "impowerDate");
            return (Criteria) this;
        }

        public Criteria andImpowerDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("impower_date not between", value1, value2, "impowerDate");
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