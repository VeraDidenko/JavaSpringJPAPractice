package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Lecture;

public interface LecturesDao {

Lecture addLecture(Lecture lecture);

Lecture getLecture(int id);

void saveLecture(Lecture lecture);

}