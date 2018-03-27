package org.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CnRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonIsNull() {
            addCriterion("role_delete_reason is null");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonIsNotNull() {
            addCriterion("role_delete_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonEqualTo(String value) {
            addCriterion("role_delete_reason =", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonNotEqualTo(String value) {
            addCriterion("role_delete_reason <>", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonGreaterThan(String value) {
            addCriterion("role_delete_reason >", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonGreaterThanOrEqualTo(String value) {
            addCriterion("role_delete_reason >=", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonLessThan(String value) {
            addCriterion("role_delete_reason <", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonLessThanOrEqualTo(String value) {
            addCriterion("role_delete_reason <=", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonLike(String value) {
            addCriterion("role_delete_reason like", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonNotLike(String value) {
            addCriterion("role_delete_reason not like", value, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonIn(List<String> values) {
            addCriterion("role_delete_reason in", values, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonNotIn(List<String> values) {
            addCriterion("role_delete_reason not in", values, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonBetween(String value1, String value2) {
            addCriterion("role_delete_reason between", value1, value2, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleDeleteReasonNotBetween(String value1, String value2) {
            addCriterion("role_delete_reason not between", value1, value2, "roleDeleteReason");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateIsNull() {
            addCriterion("role_createdate is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateIsNotNull() {
            addCriterion("role_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateEqualTo(Date value) {
            addCriterion("role_createdate =", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateNotEqualTo(Date value) {
            addCriterion("role_createdate <>", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateGreaterThan(Date value) {
            addCriterion("role_createdate >", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("role_createdate >=", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateLessThan(Date value) {
            addCriterion("role_createdate <", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("role_createdate <=", value, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateIn(List<Date> values) {
            addCriterion("role_createdate in", values, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateNotIn(List<Date> values) {
            addCriterion("role_createdate not in", values, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateBetween(Date value1, Date value2) {
            addCriterion("role_createdate between", value1, value2, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("role_createdate not between", value1, value2, "roleCreatedate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateIsNull() {
            addCriterion("role_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateIsNotNull() {
            addCriterion("role_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateEqualTo(Date value) {
            addCriterion("role_modifydate =", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateNotEqualTo(Date value) {
            addCriterion("role_modifydate <>", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateGreaterThan(Date value) {
            addCriterion("role_modifydate >", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("role_modifydate >=", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateLessThan(Date value) {
            addCriterion("role_modifydate <", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateLessThanOrEqualTo(Date value) {
            addCriterion("role_modifydate <=", value, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateIn(List<Date> values) {
            addCriterion("role_modifydate in", values, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateNotIn(List<Date> values) {
            addCriterion("role_modifydate not in", values, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateBetween(Date value1, Date value2) {
            addCriterion("role_modifydate between", value1, value2, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleModifydateNotBetween(Date value1, Date value2) {
            addCriterion("role_modifydate not between", value1, value2, "roleModifydate");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedIsNull() {
            addCriterion("role_deleted is null");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedIsNotNull() {
            addCriterion("role_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedEqualTo(String value) {
            addCriterion("role_deleted =", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedNotEqualTo(String value) {
            addCriterion("role_deleted <>", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedGreaterThan(String value) {
            addCriterion("role_deleted >", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("role_deleted >=", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedLessThan(String value) {
            addCriterion("role_deleted <", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedLessThanOrEqualTo(String value) {
            addCriterion("role_deleted <=", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedLike(String value) {
            addCriterion("role_deleted like", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedNotLike(String value) {
            addCriterion("role_deleted not like", value, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedIn(List<String> values) {
            addCriterion("role_deleted in", values, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedNotIn(List<String> values) {
            addCriterion("role_deleted not in", values, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedBetween(String value1, String value2) {
            addCriterion("role_deleted between", value1, value2, "roleDeleted");
            return (Criteria) this;
        }

        public Criteria andRoleDeletedNotBetween(String value1, String value2) {
            addCriterion("role_deleted not between", value1, value2, "roleDeleted");
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