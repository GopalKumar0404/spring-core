package org.gopal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    @Autowired
    Emp emp2;
    @Autowired
    Student student2;

    public Emp getEmp2() {
        return emp2;
    }

    public void setEmp2(Emp emp2) {
        this.emp2 = emp2;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public static void main(String[] args )
    {
        

        File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config.xml");
        System.out.println(file.exists());
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(System.getProperty("user.dir")+"\\src\\main\\resources\\config.xml");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        System.out.println( "Hello World!" );
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
//        System.out.println(emp2);
//        System.out.println("Student " + student2);
        DemoStudent demoStudent = applicationContext.getBean("demoStudent", DemoStudent.class);
        System.out.println( demoStudent);
        App app = applicationContext.getBean("app", App.class);
        app.run();
    }

//    @Override
    public void run() {
        System.out.println("Run method working");
        System.out.println("emp "+emp2);
        System.out.println("student2 "+ student2);
    }
}
