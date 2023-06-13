
public class Course {
  private String courseID, courseName;
  private double credits;

  // empty constructor
  public Course (){}

  public Course(double credits, String courseName, String courseID) {
        this.credits = credits;
        this.courseName = courseName;
        this.courseID = courseID;
    }
  
    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getCredits() {
        return credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseId(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseId() {
        return courseID;
    }




  
}