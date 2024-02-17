package com.venturenix.cmc.models;
import java.util.Optional;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.annotations.NaturalId;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
@Entity
@Table(name = "groups")
public class Group {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinTable(name = "EventGroup",
          joinColumns = @JoinColumn(name = "group_id"),
          inverseJoinColumns = @JoinColumn(name = "event_id"))
  private Event event;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinTable(name = "GroupUser",
          joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "group_id"))
  private User user;

  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;

  public Group(String name, String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.name = name;
    this.status = status;
    this.createddate = createddate;
    this.createdby = createdby;
    this.updateddate = updateddate;
    this.updatedby = updatedby;
    
  }

  public Group(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Event getEvent() {
      return event;
  }

  public void setEvent(Event event) {
      this.event = event;
  }

  public User getUser() {
      return user;
  }

  public void setUser(User user) {
      this.user = user;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getCreatedBy() {
    return createdby;
  }

  public void setCreatedBy(Integer createdby) {
    this.createdby = createdby;
  }  

  public LocalDateTime getCreatedDate() {
    return createddate;
  }

  public void setCreateddate(LocalDateTime createddate) {
    this.createddate = createddate;
  }  

  public Integer getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(Integer updatedby) {
    this.updatedby = updatedby;
  }   

  public LocalDateTime getUpdateddate() {
    return updateddate;
  }

  public void setUpdateddate(LocalDateTime updateddate) {
    this.updateddate = updateddate;
  }  

  @Override
  public boolean equals(Object g) {
      if (this == g) return true;
      if (g == null || getClass() != g.getClass()) return false;
      Group group = (Group) g;
      return Objects.equals(id, group.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  } 

}