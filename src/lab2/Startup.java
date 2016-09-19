/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Mike
 */
public class Startup {
    public static void main(String[] args) {
        Course p1 = new IntroToProgrammingCourse("Intro to Programming", "152-107");
        Course p2 = new IntroJavaCourse("Intro to Java", "152-134");
        Course p3 = new AdvancedJavaCourse("Advanced Java", "152-135");
        
        System.out.printf("Courses\t\t\tClass Number\tCredits\n--------------------\t------------\t-------\n");
        System.out.printf("%s\t%s\t\t%f\n", p1.getCourseName(), p1.getCourseNumber(), p1.getCredits());
        System.out.printf("%s\t\t%s\t\t%f\n", p2.getCourseName(), p2.getCourseNumber(), p2.getCredits());
        System.out.printf("%s\t\t%s\t\t%f\n", p3.getCourseName(), p2.getCourseNumber(), p3.getCredits());
        
    }
}

//This method appears to be a bit easier to work with. Nothing is forced to be a property or method in the children
//so there is no trying to remember which classes had which things inherited automatically. 
//However I am again unable to call for instance p3.getPrerequisites(). Is there any way to call these when using
//the parent datatype that does not have these methods defined?