/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class EmployeeDepartmentHistoryId implements Serializable {

    private Date startDate;
    private Integer businessEntityId;
    private Short shiftId;
    private Short departmentId;

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public Short getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(Short shiftId) {
        this.shiftId = shiftId;
    }

    public Short getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDepartmentHistory)) return false;
        final EmployeeDepartmentHistory employeeDepartmentHistory = (EmployeeDepartmentHistory) o;
        return Objects.equals(getStartDate(), employeeDepartmentHistory.getStartDate()) &&
                Objects.equals(getBusinessEntityId(), employeeDepartmentHistory.getBusinessEntityId()) &&
                Objects.equals(getShiftId(), employeeDepartmentHistory.getShiftId()) &&
                Objects.equals(getDepartmentId(), employeeDepartmentHistory.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartDate(),
                getBusinessEntityId(),
                getShiftId(),
                getDepartmentId());
    }
}