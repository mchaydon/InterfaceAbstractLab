package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    public String courseName;
    public String courseNumber;
    public double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
        setPrerequisites(prerequisites);
    }

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }
    
}
