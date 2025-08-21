package com.in28minutes.learn_jpa_and_hibernate.springdatajpa;

import com.in28minutes.learn_jpa_and_hibernate.Ncourse.course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<course,Long> {
    List<course> findByAuthor(String auther);
    List<course> findByName(String name);
}
