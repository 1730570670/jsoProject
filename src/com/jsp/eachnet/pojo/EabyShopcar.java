package com.jsp.eachnet.pojo;


import lombok.ToString;

@ToString
public class EabyShopcar {

  private long proid;
  private String proname;
  private long count;
  private double price;
  private long userid;
  private String fileName;


  public long getProid() {
    return proid;
  }

  public void setProid(long proid) {
    this.proid = proid;
  }


  public String getProname() {
    return proname;
  }

  public void setProname(String proname) {
    this.proname = proname;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public String toString() {
    return "EabyShopcar{" +
            "proid=" + proid +
            ", proname='" + proname + '\'' +
            ", count=" + count +
            ", price=" + price +
            ", userid=" + userid +
            ", fileName='" + fileName + '\'' +
            '}';
  }
}
