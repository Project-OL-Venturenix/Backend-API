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
@Table(name = "testcasescores")
public class TestCaseScore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String testcase_score_desc;
  private Double testcase_score;
  private String status;
  private LocalDateTime createddate;
  private Integer createdby;
  private LocalDateTime updateddate;
  private Integer updatedby;  

  public TestCaseScore(String testcase_score_desc, Double testcase_score, String status, LocalDateTime createddate, Integer createdby, LocalDateTime updateddate, Integer updatedby) {
    this.testcase_score_desc = testcase_score_desc;
    this.testcase_score = testcase_score;
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

  public String getTestcasescoredesc() {
    return testcase_score_desc;
  }

  public void setTestcasescoredesc(String testcase_score_desc) {
    this.testcase_score_desc = testcase_score_desc;
  }  

  public Double getTestcasescore() {
    return testcase_score;
  }

  public void setTestcasescore(Double testcase_score) {
    this.testcase_score = testcase_score;
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
  public boolean equals(Object tcs) {
      if (this == tcs) return true;
      if (tcs == null || getClass() != tcs.getClass()) return false;
      TestCaseScore testcasescore = (TestCaseScore) tcs;
      return Objects.equals(id, testcasescore.id);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id);
  }

}