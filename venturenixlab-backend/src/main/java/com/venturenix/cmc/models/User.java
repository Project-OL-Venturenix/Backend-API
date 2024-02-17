package com.venturenix.cmc.models;

import java.util.HashSet;
import java.util.Set;
import java.util.Optional;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.NaturalId;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

@Entity
@Table(name = "users", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "username"),
      @UniqueConstraint(columnNames = "email") 
    })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  @NotBlank
  @Size(max = 120)
  private String mobile;

  @NotBlank
  @Size(max = 120)
  private String company;

  @NotBlank
  @Size(max = 120)
  private String title;

  
  private Long py_experience;

  
  private Long jv_experience;

  
  private Long js_experience;

  
  private Long cs_experience;

  
  private Long sa_experience;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "group_id", nullable = false)
  private Group group;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "EventUser",
          joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "event_id"))
  private Event event;    

  @NotBlank
  @Size(max = 20)
  private String status;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password, String mobile, String company, String title, Long py_experience, Long jv_experience, Long js_experience, Long cs_experience, Long sa_experience, Group group, Event event, String status) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.mobile = mobile;
    this.company = company;
    this.title = title;
    this.py_experience = py_experience;
    this.jv_experience = jv_experience;
    this.js_experience = js_experience;
    this.cs_experience = cs_experience;
    this.sa_experience = sa_experience;
    this.group = group;
    this.event = event;
    this.status = status;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public String getStatus() {
    return status;
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

  public void setStatus(String status) {
    this.status = status;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object u) {
      if (this == u) return true;
      if (u == null || getClass() != u.getClass()) return false;
      User user = (User) u;
      return Objects.equals(id, user.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }

}
