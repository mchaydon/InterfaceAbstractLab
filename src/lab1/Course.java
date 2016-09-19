/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Mike
 */
public abstract class Course {
    public String courseName;
    public String courseNumber;
    public double credits;
       
    public abstract void setCredits(double credits);
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCourseName(String courseName);
    
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
}
