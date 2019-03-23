package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {

@Autowired
LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}
