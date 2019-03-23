package com.practicejdbc.jdbc;

import com.practicejdbc.jdbc.dao.LecturesWorker;
import com.practicejdbc.jdbc.model.Lecture;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApplication {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);

        context.close();


    }

}
