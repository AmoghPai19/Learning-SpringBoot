package com.in28minutes.learn_jpa_and_hibernate.Ncourse;

import com.in28minutes.learn_jpa_and_hibernate.course.jdbc.CourseJDBCRepository;
import com.in28minutes.learn_jpa_and_hibernate.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJDBCRepository  repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;



    @Override
    public void run(String... args) throws Exception {
        repository.save(new course(1,"Learn AWS now!!","in28minutes"));
        repository.save(new course(2,"Learn Azure now!!","in28minutess"));
        repository.save(new course(3,"Learn Docker now!!","in28minutes"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn Azure now!!"));
    }
}
