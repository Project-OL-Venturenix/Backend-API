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
@Table(name = "groupscores")
public class GroupScore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @OneToOne(fetch = FetchType.LAZY)
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

  private Integer testcase_total;
  private Integer testcase_pass_total;
  private Double testcase_score_total;
  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;

  public GroupScore(Event event, Group group, Question question, Integer testcase_total, Integer testcase_pass_total, Double testcase_score_total,String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.event = event;
    this.group = group;
    this.question = question;
    this.testcase_total = testcase_total;
    this.testcase_pass_total = testcase_pass_total;
    this.testcase_score_total = testcase_score_total;
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

  public Integer getTestcasetotal() {
    return testcase_total;
  }

  public void setTestcasetotal(Integer testcase_total) {
    this.testcase_total = testcase_total;
  }  

  public Integer getTestcasepasstotal() {
    return testcase_pass_total;
  }

  public void setTestCasePassTotal(Integer testcase_pass_total) {
    this.testcase_pass_total = testcase_pass_total;
  } 

  public Double getTestcasescoretotal() {
    return testcase_score_total;
  }

  public void setTestcasescoretotal(Double testcase_score_total) {
    this.testcase_score_total = testcase_score_total;
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
  public boolean equals(Object gs) {
      if (this == gs) return true;
      if (gs == null || getClass() != gs.getClass()) return false;
      GroupScore groupscore = (GroupScore) gs;
      return Objects.equals(id, groupscore.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }
}