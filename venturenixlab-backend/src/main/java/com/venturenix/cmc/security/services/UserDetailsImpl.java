package com.venturenix.cmc.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.venturenix.cmc.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;

  private String username;

  private String email;

  @JsonIgnore
  private String password;

  @JsonIgnore
  private String mobile;

  @JsonIgnore
  private String company;

  @JsonIgnore
  private String title;

  @JsonIgnore
  private Long py_experience;

  @JsonIgnore
  private Long jv_experience;

  @JsonIgnore
  private Long js_experience;

  @JsonIgnore
  private Long cs_experience;

  @JsonIgnore
  private Long sa_experience;

  @JsonIgnore
  private String status;

  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id, String username, String email, String password, String mobile, String company, String title, Long py_experience, Long jv_experience, Long js_experience, Long cs_experience, Long sa_experience, String status, Collection<? extends GrantedAuthority> authorities) {
    this.id = id;
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
    this.status = status;
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(User user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getId(), 
        user.getUsername(), 
        user.getEmail(),
        user.getPassword(), 
        user.getMobile(), 
        user.getCompany(), 
        user.getTitle(), 
        user.getPy_experience(), 
        user.getJv_experience(), 
        user.getJs_experience(), 
        user.getCs_experience(), 
        user.getSa_experience(), 
        user.getStatus(), 
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  
  
  public String getMobile() {
    return mobile;
  }

  
  public String getCompany() {
    return company;
  }

  
  
  public String getTitle() {
    return title;
  }

  
  public Long getPy_experience() {
    return py_experience;
  }

  
  
  public Long getJv_experience() {
    return jv_experience;
  }

  
  public Long getJs_experience() {
    return js_experience;
  }

  
  
  public Long getCs_experience() {
    return cs_experience;
  }

  
  public Long getSa_experience() {
    return sa_experience;
  }

  
  public String getStatus() {
    return status;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
