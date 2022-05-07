package com.jsp.eachnet.pojo;


public class EabyUser {

  private long id;
  private String loginName;
  private String userName;
  private String password;
  private long sex;
  private String identityCode;
  private String email;
  private String mobile;
  private long type;
  private String tp;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public String getIdentityCode() {
    return identityCode;
  }

  public void setIdentityCode(String identityCode) {
    this.identityCode = identityCode;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getTp() {
    return tp;
  }

  public void setTp(String tp) {
    this.tp = tp;
  }

  @Override
  public String toString() {
    return "EabyUser{" +
            "id=" + id +
            ", loginName='" + loginName + '\'' +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", sex=" + sex +
            ", identityCode='" + identityCode + '\'' +
            ", email='" + email + '\'' +
            ", mobile='" + mobile + '\'' +
            ", type=" + type +
            ", tp='" + tp + '\'' +
            '}';
  }
}
