package com.mvn.cn.entity.authorization;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_ROLE.ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_ROLE.USER_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_ROLE.ID
     *
     * @return the value of T_USER_ROLE.ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_ROLE.ID
     *
     * @param id the value for T_USER_ROLE.ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_ROLE.USER_ID
     *
     * @return the value of T_USER_ROLE.USER_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_ROLE.USER_ID
     *
     * @param userId the value for T_USER_ROLE.USER_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER_ROLE.ROLE_ID
     *
     * @return the value of T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER_ROLE.ROLE_ID
     *
     * @param roleId the value for T_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Fri Jan 12 10:33:26 CST 2018
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}