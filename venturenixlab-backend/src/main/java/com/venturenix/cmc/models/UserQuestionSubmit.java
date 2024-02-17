package com.venturenix.cmc.models;
import java.util.Optional;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;
import org.hibernate.annotations.NaturalId;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "userquestionsubmit")
public class UserQuestionSubmit {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;


  @OneToOne(fetch = FetchType.LAZY )
  @JoinColumn(name = "event_id", nullable = false)
  private Event event;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "group_id", nullable = false)
  private Group group;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "question_id", nullable = false)
  private Question question;

  private LocalDateTime submit_time;
  private Double run_time_by_sec;
  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;

  public UserQuestionSubmit(Event event, User user, Group group, Question question, LocalDateTime submit_time, Double run_time_by_sec, String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.event = event;
    this.user = user;
    this.group = group;
    this.question = question;
    this.submit_time = submit_time;
    this.run_time_by_sec = run_time_by_sec;
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

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }  

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public LocalDateTime getSubmitime() {
    return submit_time;
  }  

  public void setSubmittime(LocalDateTime submit_time) {
    this.submit_time = submit_time;
  }  

  public Double getRuntimebysec() {
    return run_time_by_sec;
  }  

  public void setRuntimebysec(Double run_time_by_sec) {
    this.run_time_by_sec = run_time_by_sec;
  }  


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Integer createdby) {
    this.createdby = createdby;
  }  

  public LocalDateTime getCreateddate() {
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
  public boolean equals(Object uqs) {
      if (this == uqs) return true;
      if (uqs == null || getClass() != uqs.getClass()) return false;
      UserQuestionSubmit userquestionsubmit = (UserQuestionSubmit) uqs;
      return Objects.equals(id, userquestionsubmit.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }

}
