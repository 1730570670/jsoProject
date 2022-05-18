package com.jsp.eachnet.pojo;

import lombok.Data;
import lombok.ToString;

import java.sql.Time;

@Data
public class EabyOrder {

  private long id;
  private long userId;
  private String loginName;
  private String userAddress;
  private java.sql.Timestamp createTime;
  private double sunPrice;
  private String status;
  private String serialNumber;

}
