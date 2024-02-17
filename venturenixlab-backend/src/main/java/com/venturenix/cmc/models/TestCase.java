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
@Table(name = "testcases")
public class TestCase {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinTable(name = "QuestionTestCase",
          joinColumns = @JoinColumn(name = "question_id"),
          inverseJoinColumns = @JoinColumn(name = "testcase_id"))
  private Question question;  

  private String testcase_text;
  private String testcase_result;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinTable(name = "TestCaseScore",
          joinColumns = @JoinColumn(name = "testcase_score_id"),
          inverseJoinColumns = @JoinColumn(name = "testcase_id"))
  private TestCaseScore testcasescore;  
  
  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;  

  public TestCase(Question question, String question_text, String testcase_text, String testcase_result, TestCaseScore testcasescore, String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.question = question;
    this.testcase_text = testcase_text;
    this.testcase_result = testcase_result;
    this.testcasescore = testcasescore;
    this.status = status;
    this.createddate = createddate;
    this.createdby = createdby;
    this.updateddate = updateddate;
    this.updatedby = updatedby;
    
  }

  public TestCase(String testcase_text) {
    this.testcase_text = testcase_text;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Question getQuestion() {
      return question;
  }

  public void setQuestion(Question question) {
      this.question = question;
  }

  public String getTestcase_text() {
    return testcase_text;
  }

  public void setTestcase_text(String testcase_text) {
    this.testcase_text = testcase_text;
  }

  public String getTestcase_result() {
    return testcase_result;
  }

  public void setTestcase_result(String testcase_result) {
    this.testcase_result = testcase_result;
  }

  public TestCaseScore getTestcasescore() {
      return testcasescore;
  }

  public void setTestcasescore(TestCaseScore testcasescore) {
      this.testcasescore = testcasescore;
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
  public boolean equals(Object tc) {
      if (this == tc) return true;
      if (tc == null || getClass() != tc.getClass()) return false;
      TestCase testcase = (TestCase) tc;
      return Objects.equals(id, testcase.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }


}