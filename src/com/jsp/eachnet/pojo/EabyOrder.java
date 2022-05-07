package com.jsp.eachnet.pojo;

import lombok.ToString;

@ToString
public class EabyOrder {

  private long id;
  private long userId;
  private String loginName;
  private String userAddress;
  private java.sql.Timestamp createTime;
  private double sunPrice;
  private String status;
  private String serialNumber;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public double getSunPrice() {
    return sunPrice;
  }

  public void setSunPrice(double sunPrice) {
    this.sunPrice = sunPrice;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

}
