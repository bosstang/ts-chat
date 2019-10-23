package Tchat.domain;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFaceImgIsNull() {
            addCriterion("face_img is null");
            return (Criteria) this;
        }

        public Criteria andFaceImgIsNotNull() {
            addCriterion("face_img is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImgEqualTo(String value) {
            addCriterion("face_img =", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotEqualTo(String value) {
            addCriterion("face_img <>", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgGreaterThan(String value) {
            addCriterion("face_img >", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgGreaterThanOrEqualTo(String value) {
            addCriterion("face_img >=", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLessThan(String value) {
            addCriterion("face_img <", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLessThanOrEqualTo(String value) {
            addCriterion("face_img <=", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgLike(String value) {
            addCriterion("face_img like", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotLike(String value) {
            addCriterion("face_img not like", value, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgIn(List<String> values) {
            addCriterion("face_img in", values, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotIn(List<String> values) {
            addCriterion("face_img not in", values, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgBetween(String value1, String value2) {
            addCriterion("face_img between", value1, value2, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgNotBetween(String value1, String value2) {
            addCriterion("face_img not between", value1, value2, "faceImg");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigIsNull() {
            addCriterion("face_img_big is null");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigIsNotNull() {
            addCriterion("face_img_big is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigEqualTo(String value) {
            addCriterion("face_img_big =", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigNotEqualTo(String value) {
            addCriterion("face_img_big <>", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigGreaterThan(String value) {
            addCriterion("face_img_big >", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigGreaterThanOrEqualTo(String value) {
            addCriterion("face_img_big >=", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigLessThan(String value) {
            addCriterion("face_img_big <", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigLessThanOrEqualTo(String value) {
            addCriterion("face_img_big <=", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigLike(String value) {
            addCriterion("face_img_big like", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigNotLike(String value) {
            addCriterion("face_img_big not like", value, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigIn(List<String> values) {
            addCriterion("face_img_big in", values, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigNotIn(List<String> values) {
            addCriterion("face_img_big not in", values, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigBetween(String value1, String value2) {
            addCriterion("face_img_big between", value1, value2, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andFaceImgBigNotBetween(String value1, String value2) {
            addCriterion("face_img_big not between", value1, value2, "faceImgBig");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andQrcordIsNull() {
            addCriterion("qrcord is null");
            return (Criteria) this;
        }

        public Criteria andQrcordIsNotNull() {
            addCriterion("qrcord is not null");
            return (Criteria) this;
        }

        public Criteria andQrcordEqualTo(String value) {
            addCriterion("qrcord =", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordNotEqualTo(String value) {
            addCriterion("qrcord <>", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordGreaterThan(String value) {
            addCriterion("qrcord >", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordGreaterThanOrEqualTo(String value) {
            addCriterion("qrcord >=", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordLessThan(String value) {
            addCriterion("qrcord <", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordLessThanOrEqualTo(String value) {
            addCriterion("qrcord <=", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordLike(String value) {
            addCriterion("qrcord like", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordNotLike(String value) {
            addCriterion("qrcord not like", value, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordIn(List<String> values) {
            addCriterion("qrcord in", values, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordNotIn(List<String> values) {
            addCriterion("qrcord not in", values, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordBetween(String value1, String value2) {
            addCriterion("qrcord between", value1, value2, "qrcord");
            return (Criteria) this;
        }

        public Criteria andQrcordNotBetween(String value1, String value2) {
            addCriterion("qrcord not between", value1, value2, "qrcord");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
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