package com.ssm.bean;

import java.util.Date;

public class Station {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.stationId
     *
     * @mbg.generated
     */
    private String stationid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.studentId
     *
     * @mbg.generated
     */
    private String studentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.flag
     *
     * @mbg.generated
     */
    private String flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.staffId
     *
     * @mbg.generated
     */
    private String staffid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.createDate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.beforeClassId
     *
     * @mbg.generated
     */
    private String beforeclassid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_station.afterClassId
     *
     * @mbg.generated
     */
    private String afterclassid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.stationId
     *
     * @return the value of crm_station.stationId
     *
     * @mbg.generated
     */
    public String getStationid() {
        return stationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.stationId
     *
     * @param stationid the value for crm_station.stationId
     *
     * @mbg.generated
     */
    public void setStationid(String stationid) {
        this.stationid = stationid == null ? null : stationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.studentId
     *
     * @return the value of crm_station.studentId
     *
     * @mbg.generated
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.studentId
     *
     * @param studentid the value for crm_station.studentId
     *
     * @mbg.generated
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.flag
     *
     * @return the value of crm_station.flag
     *
     * @mbg.generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.flag
     *
     * @param flag the value for crm_station.flag
     *
     * @mbg.generated
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.staffId
     *
     * @return the value of crm_station.staffId
     *
     * @mbg.generated
     */
    public String getStaffid() {
        return staffid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.staffId
     *
     * @param staffid the value for crm_station.staffId
     *
     * @mbg.generated
     */
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.createDate
     *
     * @return the value of crm_station.createDate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.createDate
     *
     * @param createdate the value for crm_station.createDate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.beforeClassId
     *
     * @return the value of crm_station.beforeClassId
     *
     * @mbg.generated
     */
    public String getBeforeclassid() {
        return beforeclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.beforeClassId
     *
     * @param beforeclassid the value for crm_station.beforeClassId
     *
     * @mbg.generated
     */
    public void setBeforeclassid(String beforeclassid) {
        this.beforeclassid = beforeclassid == null ? null : beforeclassid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_station.afterClassId
     *
     * @return the value of crm_station.afterClassId
     *
     * @mbg.generated
     */
    public String getAfterclassid() {
        return afterclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_station.afterClassId
     *
     * @param afterclassid the value for crm_station.afterClassId
     *
     * @mbg.generated
     */
    public void setAfterclassid(String afterclassid) {
        this.afterclassid = afterclassid == null ? null : afterclassid.trim();
    }
}