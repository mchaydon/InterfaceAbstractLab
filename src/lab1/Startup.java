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
        
        System.out.println(p3.getCredits());
        System.out.println(p1.getCredits());
    }
}
