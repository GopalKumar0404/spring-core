package org.gopal;

import org.gopal.dao.StudentDao;
import org.gopal.dao.impl.StudentDaoImpl;
import org.gopal.entites.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student = new Student(4,"Shyam","Patna");
        StudentDao studentDao = applicationContext.getBean(StudentDaoImpl.class);
        int result = studentDao.update(student);
        System.out.println("Created Student Count : " + result);
        int deleteResponse = studentDao.delete(2);
        System.out.println("Deleted Student count : "+deleteResponse);
        Student student1 = studentDao.getStudent(1);
        System.out.println(student1);
        List<Student> allStudent = studentDao.getAllStudent();
        for(Student s : allStudent){
            System.out.println(s);
        }



    }


}
