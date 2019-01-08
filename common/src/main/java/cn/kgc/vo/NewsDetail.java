package cn.kgc.vo;


import java.io.Serializable;

public class NewsDetail implements Serializable {

  private Integer id;
  private Integer categoryId;
  private String title;
  private String summary;
  private String author;
  private String creataDate;
  private String updateDate;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCreataDate() {
    return creataDate;
  }

  public void setCreataDate(String creataDate) {
    this.creataDate = creataDate;
  }

  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }
}
