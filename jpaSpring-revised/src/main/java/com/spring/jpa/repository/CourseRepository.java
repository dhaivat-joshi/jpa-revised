package com.spring.jpa.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.jpa.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {
	private final static Logger log = LoggerFactory.getLogger(CourseRepository.class);
	private final EntityManager entityManager;
	
	public CourseRepository(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	public void addCourse() {
		Course course = new Course();
		course.setCourseName("Jpa revised");
		entityManager.persist(course);
//		entityManager.detach(course);
		
		
		Course course1 = new Course();
		course1.setCourseName("mastercard");
		entityManager.persist(course1);
		entityManager.flush();
		course.setCourseName("jpa revised -updated");
		course1.setCourseName("hcl");
		entityManager.refresh(course);
		log.info("refresh course detail ->{}",course1);
		
		
	}

}
