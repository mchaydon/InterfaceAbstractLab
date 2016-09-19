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
public class Startup {
    public static void main(String[] args) {
        Course p1 = new IntroToProgrammingCourse("Intro to Programming", "152-107", 2);
        Course p2 = new IntroJavaCourse("Intro to Java", "152-134", 4, "Intro to Programming");
        Course p3 = new AdvancedJavaCourse("Advanced Java", "152-135", 4, "Intro to Java");
        
        System.out.printf("Courses\t\t\tClass Number\tCredits\n--------------------\t------------\t-------\n");
        System.out.printf("%s\t%s\t\t%f\n", p1.getCourseName(), p1.getCourseNumber(), p1.getCredits());
        System.out.printf("%s\t\t%s\t\t%f\n", p2.getCourseName(), p2.getCourseNumber(), p2.getCredits());
        System.out.printf("%s\t\t%s\t\t%f\n", p3.getCourseName(), p2.getCourseNumber(), p3.getCredits());
        
    }
}

//This method words well if you want all objects to have the same properties and methods.
//However, I do not like that I can not call the methods that just the classes have when calling them by their 
//parent class datatype.
