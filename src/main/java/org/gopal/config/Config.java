package org.gopal.config;

import org.gopal.dao.StudentDao;
import org.gopal.dao.impl.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/practice");
        dataSource.setPassword("gopal");
        return dataSource;
    }
    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    @Bean
    StudentDao studentDao(JdbcTemplate jdbcTemplate){
        return new StudentDaoImpl(jdbcTemplate);
    }
}
