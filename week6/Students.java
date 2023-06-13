public class Students {

  private String studentName, studentID; 
  private Course[] courses;  
  private Laptop studentLaptop;
  
  private int[] marks;
  public static int gymUsers = 0;

  // empty constructor
  public Students  () {};

  //  constructor
    public Students  (String studentName, String studentID, Course[] courses, Laptop studentLaptop) {
      this.studentName = studentName;
      this.studentID = studentID;   
      this.courses = courses;
      this.studentLaptop = studentLaptop;
    }

        // Getters and Setters -> Student Name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

        // Getters and Setters -> Student ID
   public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID(){
        return studentID;
    }
    
  // Getters and Setters -> Courses
    public void setCourses(Course[] courses) {
      this.courses = courses;
  }
  
  public Course[] getCourses() {
    return courses;
  }

    // Getters and Setters -> Laptop
  public void setStudentLaptop(Laptop studentLaptop) {
    this.studentLaptop = studentLaptop;
  }
  
  public Laptop getStudentLaptop() {
    return studentLaptop;
  }

    // Getters and Setters -> Marks
    public void setMarks(int[] marks) {
      this.marks = marks;
  }
  
  public int[] marks() {
    return marks;
  }
  
  // enterGym validation
  public void enterGym () {
    if(Students.gymUsers <=10){
      Students.gymUsers++;
      System.out.println("Access OK");
    } else {
      System.out.println("Please check after sometime");
    }
  }
  
// data validation
  public boolean validateData () {
    if (!studentName.matches("^[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*$")){
      return false;
    }

    if (!studentID.matches("^\\d{10}*$")){
      return false;
    }

    for (Course course : courses) {
      if (!course.getCourseName().matches("^[A-Z][A-Z][A-Z][A-Z]\\d{4}*$")) {
        return false;
      }
    }
    
    return true;
  
  
  }

  
}