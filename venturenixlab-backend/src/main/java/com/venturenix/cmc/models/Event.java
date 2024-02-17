package com.venturenix.cmc.models;

import java.util.Optional;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.NaturalId;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

@Entity
@Table(name = "events")
public class Event {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(min = 1, max = 20)
  private String name;

  @Size(min = 1, max = 20)
  private String status;

  
  private LocalDateTime createddate;

  @Size(min = 1, max = 20)
  private String createdby;

  
  private LocalDateTime updateddate;

  @Size(min = 1, max = 20)
  private String updatedby;

  public Event() {

  }

  public Event(String name, String status, LocalDateTime createddate, String createdby, LocalDateTime updateddate, String updatedby) {
    this.name = name;
    this.status = status;
    this.createddate = createddate;
    this.createdby = createdby;
    this.updateddate = updateddate;
    this.updatedby = updatedby;
    
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public LocalDateTime getCreateddate() {
    return createddate;
  }

  public void setCreateddate(LocalDateTime createddate) {
    this.createddate = createddate;
  }

   public String getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }

  public LocalDateTime getUpdateddate() {
    return updateddate;
  }

  public void setUpdateddate(LocalDateTime updateddate) {
    this.updateddate = updateddate;
  }

  @Override
  public String toString() {
    return "Event [id=" + id + ", name=" + name + ", status=" + status + ", createddate=" + createddate + ", createdby=" + createdby + ", updateddate=" + updateddate + ", updatedby" + updatedby + "]";
  }

}