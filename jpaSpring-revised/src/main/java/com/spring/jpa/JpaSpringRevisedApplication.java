package com.spring.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jpa.repository.CourseRepository;

@SpringBootApplication
public class JpaSpringRevisedApplication implements CommandLineRunner{
	private final CourseRepository courseRepository;
	public JpaSpringRevisedApplication(CourseRepository courseRepository) {
		this.courseRepository=courseRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		courseRepository.addCourse();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaSpringRevisedApplication.class, args);
	}

}
