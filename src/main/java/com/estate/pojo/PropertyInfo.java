package com.estate.pojo;

import java.util.Date;

public class PropertyInfo {
    private Integer id;

    private Integer typeId;

    private Double money;

    private Date startDate;

    private Date endDate;

    private Integer status;

    private Integer houseId;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return "PropertyInfo{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", money=" + money +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", houseId=" + houseId +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}