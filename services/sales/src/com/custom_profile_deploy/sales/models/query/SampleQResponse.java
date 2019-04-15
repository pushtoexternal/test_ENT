/*Copyright (c) 2016-2017 profiles.com All Rights Reserved.
 This software is the confidential and proprietary information of profiles.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with profiles.com*/
package com.custom_profile_deploy.sales.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SampleQResponse implements Serializable {


    @ColumnAlias("product_id")
    private Integer productId;

    @ColumnAlias("planCode")
    private String planCode;

    @ColumnAlias("unitedHealthCarePlan")
    private String unitedHealthCarePlan;

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPlanCode() {
        return this.planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getUnitedHealthCarePlan() {
        return this.unitedHealthCarePlan;
    }

    public void setUnitedHealthCarePlan(String unitedHealthCarePlan) {
        this.unitedHealthCarePlan = unitedHealthCarePlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SampleQResponse)) return false;
        final SampleQResponse sampleQresponse = (SampleQResponse) o;
        return Objects.equals(getProductId(), sampleQresponse.getProductId()) &&
                Objects.equals(getPlanCode(), sampleQresponse.getPlanCode()) &&
                Objects.equals(getUnitedHealthCarePlan(), sampleQresponse.getUnitedHealthCarePlan());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(),
                getPlanCode(),
                getUnitedHealthCarePlan());
    }
}