package org.gopal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Student student(){
        return new Student();
    }
    @Bean
    DemoStudent demoStudent(){
        return new DemoStudent();
    }
    @Bean
    App app(){
        return new App();
    }
    @Bean
    Emp emp(){
        return new Emp();
    }
}
