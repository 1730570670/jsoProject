package com.jsp.eachnet.pojo;

import lombok.ToString;

@ToString
public class EabyProduct {

  private long id;
  private String name;
  private String description;
  private double price;
  private long stock;
  private long categoryLevel1Id;
  private long categoryLevel2Id;
  private long categoryLevel3Id;
  private String fileName;
  private long isDelete;
  private long isHot;
  private long isSale;
  private String xiangqing;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getCategoryLevel1Id() {
    return categoryLevel1Id;
  }

  public void setCategoryLevel1Id(long categoryLevel1Id) {
    this.categoryLevel1Id = categoryLevel1Id;
  }


  public long getCategoryLevel2Id() {
    return categoryLevel2Id;
  }

  public void setCategoryLevel2Id(long categoryLevel2Id) {
    this.categoryLevel2Id = categoryLevel2Id;
  }


  public long getCategoryLevel3Id() {
    return categoryLevel3Id;
  }

  public void setCategoryLevel3Id(long categoryLevel3Id) {
    this.categoryLevel3Id = categoryLevel3Id;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public long getIsSale() {
    return isSale;
  }

  public void setIsSale(long isSale) {
    this.isSale = isSale;
  }


  public String getXiangqing() {
    return xiangqing;
  }

  public void setXiangqing(String xiangqing) {
    this.xiangqing = xiangqing;
  }

}
