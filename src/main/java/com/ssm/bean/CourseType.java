package com.ssm.bean;

public class CourseType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_course_type.courseTypeId
     *
     * @mbg.generated
     */
    private String coursetypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_course_type.courseCost
     *
     * @mbg.generated
     */
    private Double coursecost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_course_type.total
     *
     * @mbg.generated
     */
    private Integer total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_course_type.courseName
     *
     * @mbg.generated
     */
    private String coursename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_course_type.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_course_type.courseTypeId
     *
     * @return the value of crm_course_type.courseTypeId
     *
     * @mbg.generated
     */
    public String getCoursetypeid() {
        return coursetypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_course_type.courseTypeId
     *
     * @param coursetypeid the value for crm_course_type.courseTypeId
     *
     * @mbg.generated
     */
    public void setCoursetypeid(String coursetypeid) {
        this.coursetypeid = coursetypeid == null ? null : coursetypeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_course_type.courseCost
     *
     * @return the value of crm_course_type.courseCost
     *
     * @mbg.generated
     */
    public Double getCoursecost() {
        return coursecost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_course_type.courseCost
     *
     * @param coursecost the value for crm_course_type.courseCost
     *
     * @mbg.generated
     */
    public void setCoursecost(Double coursecost) {
        this.coursecost = coursecost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_course_type.total
     *
     * @return the value of crm_course_type.total
     *
     * @mbg.generated
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_course_type.total
     *
     * @param total the value for crm_course_type.total
     *
     * @mbg.generated
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_course_type.courseName
     *
     * @return the value of crm_course_type.courseName
     *
     * @mbg.generated
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_course_type.courseName
     *
     * @param coursename the value for crm_course_type.courseName
     *
     * @mbg.generated
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_course_type.remark
     *
     * @return the value of crm_course_type.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_course_type.remark
     *
     * @param remark the value for crm_course_type.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}