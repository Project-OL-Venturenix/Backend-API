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
@Table(name = "questions")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String question_text;
  private String answer_text;
  
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "EventQuestion",
          joinColumns = @JoinColumn(name = "question_id"),
          inverseJoinColumns = @JoinColumn(name = "event_id"))
  private Event event;  

  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;

  public Question(String question_text, String answer_text, String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.question_text = question_text;
    this.answer_text = answer_text;
    this.status = status;
    this.createddate = createddate;
    this.createdby = createdby;
    this.updateddate = updateddate;
    this.updatedby = updatedby;
    
  }

  public Question(String question_text) {
    this.question_text = question_text;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getQuestion_text() {
    return question_text;
  }

  public void setQuestion_text(String question_text) {
    this.question_text = question_text;
  }

  public String getAnswer_text() {
    return answer_text;
  }

  public void setAnswer_text(String answer_text) {
    this.answer_text = answer_text;
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

  public Integer getCreatedby() {
    return createdby;
  }

  public void setCreatedBy(Integer createdby) {
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
  public boolean equals(Object q) {
      if (this == q) return true;
      if (q == null || getClass() != q.getClass()) return false;
      Question question = (Question) q;
      return Objects.equals(id, question.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }


}