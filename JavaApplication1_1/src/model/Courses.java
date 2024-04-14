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
public class Courses implements Serializable{
    private String id, name, teacher ,day, hour;

    public Courses() {
    }

    public Courses(String id, String name, String teacher, String day, String hour) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.day = day;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    
    public Object[] toOblect() {
        return new Object[]{
            id, name, teacher,day, hour
        };
    }
}
