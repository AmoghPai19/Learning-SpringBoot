package com.in28minutes.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.learn_jpa_and_hibernate.Ncourse.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY=
            """
               insert into course(id,name,author)
                      values(?,?,?);    
                    
             """;
    private static String DELETE_QUERY=
            """
               delete from course where id=?;    
                    
             """;
    private static String SELECT_QUERY=
            """
               select * from course where id=?;    
                    
             """;

    public void insert(course coursee){

        springJdbcTemplate.update(INSERT_QUERY,coursee.getId(),coursee.getName(),coursee.getAuthor());
    }
    public void deleteById(long id){

        springJdbcTemplate.update(DELETE_QUERY,id);
    }
    public course findtById(long id){

        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(course.class),id);
    }
}
