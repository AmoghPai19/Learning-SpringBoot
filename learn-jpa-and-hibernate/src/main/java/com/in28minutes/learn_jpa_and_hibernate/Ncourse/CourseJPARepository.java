package com.in28minutes.learn_jpa_and_hibernate.Ncourse;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @Autowired
    EntityManager entityManager;
    public void insert(course coursee){
        entityManager.merge(coursee);
    }
    public course findById(long id){
        return entityManager.find(course.class,id);
    }
    public void deleteByID(long id){
        course coursee=entityManager.find(course.class,id);
        entityManager.remove(coursee);
    }
}
