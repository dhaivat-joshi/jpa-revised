package com.spring.jpa.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String courseName;
	
	@CreationTimestamp(source = SourceType.DB)
	private LocalDateTime createtionDate;
	
	@UpdateTimestamp(source = SourceType.DB)
	private LocalDateTime UpdattionDate;
	
	public Course() {}
	
	public Integer getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

	public LocalDateTime getCreatetionDate() {
		return createtionDate;
	}

	public LocalDateTime getUpdattionDate() {
		return UpdattionDate;
	}

	public void setCreatetionDate(LocalDateTime createtionDate) {
		this.createtionDate = createtionDate;
	}

	public void setUpdattionDate(LocalDateTime updattionDate) {
		UpdattionDate = updattionDate;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}
	
	

}
