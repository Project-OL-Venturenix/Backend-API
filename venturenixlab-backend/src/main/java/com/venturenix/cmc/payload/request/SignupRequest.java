package com.venturenix.cmc.payload.request;

import java.util.Set;
import com.venturenix.cmc.models.Event;
import com.venturenix.cmc.models.Group;
import jakarta.validation.constraints.*;

public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  private Set<String> role;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;

  @NotBlank
  @Size(min = 6, max = 40)
  private String mobile;

  @NotBlank
  @Size(min = 1, max = 40)
  private String company;

  @NotBlank
  @Size(min = 1, max = 40)
  private String title;

  
  private Long py_experience;

  
  private Long jv_experience;

  
  private Long js_experience;

  
  private Long cs_experience;

  
  private Long sa_experience;

  private Group group;

  private Event event;

  @NotBlank
  @Size(min = 1, max = 20)
  private String status;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }  

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }  


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }  

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
