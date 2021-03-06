package com.ssm.bean;

import java.util.Date;

public class Follow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_follow.followId
     *
     * @mbg.generated
     */
    private String followid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_follow.followTime
     *
     * @mbg.generated
     */
    private Date followtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_follow.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_follow.staffId
     *
     * @mbg.generated
     */
    private String staffid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_follow.referId
     *
     * @mbg.generated
     */
    private String referid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_follow.followId
     *
     * @return the value of crm_follow.followId
     *
     * @mbg.generated
     */
    public String getFollowid() {
        return followid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_follow.followId
     *
     * @param followid the value for crm_follow.followId
     *
     * @mbg.generated
     */
    public void setFollowid(String followid) {
        this.followid = followid == null ? null : followid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_follow.followTime
     *
     * @return the value of crm_follow.followTime
     *
     * @mbg.generated
     */
    public Date getFollowtime() {
        return followtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_follow.followTime
     *
     * @param followtime the value for crm_follow.followTime
     *
     * @mbg.generated
     */
    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_follow.content
     *
     * @return the value of crm_follow.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_follow.content
     *
     * @param content the value for crm_follow.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_follow.staffId
     *
     * @return the value of crm_follow.staffId
     *
     * @mbg.generated
     */
    public String getStaffid() {
        return staffid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_follow.staffId
     *
     * @param staffid the value for crm_follow.staffId
     *
     * @mbg.generated
     */
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_follow.referId
     *
     * @return the value of crm_follow.referId
     *
     * @mbg.generated
     */
    public String getReferid() {
        return referid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_follow.referId
     *
     * @param referid the value for crm_follow.referId
     *
     * @mbg.generated
     */
    public void setReferid(String referid) {
        this.referid = referid == null ? null : referid.trim();
    }
}