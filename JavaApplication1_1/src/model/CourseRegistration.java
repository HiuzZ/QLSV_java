/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class CourseRegistration implements Serializable{
    private Student student;
    private Courses course;

    public CourseRegistration() {
    }

    public CourseRegistration(Student student, Courses course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
     public Object[] toOblect() {
        return new Object[]{
            student.getId(), student.getName(), course.getId(), course.getName()
        };
    }
}
