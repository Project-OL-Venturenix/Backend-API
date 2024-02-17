package com.venturenix.cmc.payload.response;

import java.util.List;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String email;
  private String mobile;
  private String company;
  private String title;
  private Long py_experience;
  private Long jv_experience;
  private Long js_experience;
  private Long cs_experience;
  private Long sa_experience;
  private String status;
  private List<String> roles;

  public JwtResponse(String accessToken, Long id, String username, String email, String mobile, String company, String title, Long py_experience, Long jv_experience, Long js_experience, Long cs_experience, Long sa_experience, String status, List<String> roles) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.email = email;
    this.mobile = mobile;
    this.company = company;
    this.title = title;
    this.py_experience = py_experience;
    this.jv_experience = jv_experience;
    this.js_experience = js_experience;
    this.cs_experience = cs_experience;
    this.sa_experience = sa_experience;
    this.status = status;
    this.roles = roles;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getPy_experience() {
    return py_experience;
  }

  public void setPy_experience(Long py_experience) {
    this.py_experience = py_experience;
  }

  public Long getJv_experience() {
    return jv_experience;
  }

  public void setJv_experience(Long jv_experience) {
    this.jv_experience = jv_experience;
  }
  
  public Long getJs_experience() {
    return js_experience;
  }

  public void setJs_experience(Long js_experience) {
    this.js_experience = js_experience;
  }
  
  public Long getCs_experience() {
    return cs_experience;
  }

  public void setCs_experience(Long cs_experience) {
    this.cs_experience = cs_experience;
  }
  
  public Long getSa_experience() {
    return sa_experience;
  }

  public void setSa_experience(Long sa_experience) {
    this.sa_experience = sa_experience;
  }  

  public List<String> getRoles() {
    return roles;
  }
}
