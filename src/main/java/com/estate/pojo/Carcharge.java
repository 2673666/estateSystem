package com.estate.pojo;

import java.util.Date;

public class Carcharge {
    private Integer id;

    private Date payDate;

    private String endDate;

    private Double money;

    private Integer status;

    private Integer ownerId;

    private String remarks;

    private String type;

    private Integer parkId;

    private Parking parking;

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    @Override
    public String toString() {
        return "Carcharge{" +
                "id=" + id +
                ", payDate=" + payDate +
                ", endDate='" + endDate + '\'' +
                ", money=" + money +
                ", status=" + status +
                ", ownerId=" + ownerId +
                ", remarks='" + remarks + '\'' +
                ", type='" + type + '\'' +
                ", parkId=" + parkId +
                ",number=" + parking.getNumbers()+
                '}';
    }
}