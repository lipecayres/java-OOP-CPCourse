import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

      // array of courses
  Course[] coursesList = new Course[5];

    // courses
    coursesList[0] = new Course(0, "MATH1020", "#abc123");
    coursesList[1] = new Course(0, "PHIS1020", "#abc124");
    coursesList[2] = new Course(0, "CHEM1020", "#abc125");
    coursesList[3] = new Course(0, "HIST1020", "#abc126");
    coursesList[4] = new Course(0, "BIOL1020", "#abc127");
  

  // array of students
  ArrayList<Students> studentsList = new ArrayList<>();
  
  // course and laptop
  Course course = new Course();
  Laptop laptop = new Laptop();
  Students student = new Students();

  // student 1
      Students student1 = new Students();
  student1.setStudentName("Felipe Cayres");
  student1.setStudentID("2023011234");
    
  coursesList[0].setCredits(9);
  coursesList[1].setCredits(8);
  coursesList[2].setCredits(8.5);
  coursesList[3].setCredits(9.4);
  coursesList[4].setCredits(7.9);
  
  laptop.setIdNumber("17");
  laptop.setBrand("DELL");
  laptop.setModel("VOSTRO");
  
  studentsList.add(student1);
  
        // student 2
    Students student2 = new Students();
  student2.setStudentName("Peter Parker");
  student2.setStudentID("2023011020");

  coursesList[0].setCredits(8.5);
  coursesList[1].setCredits(8.3);
  coursesList[2].setCredits(9);
  coursesList[3].setCredits(7.4);
  coursesList[4].setCredits(6.9);
  
  laptop.setIdNumber("18");
  laptop.setBrand("DELL");
  laptop.setModel("INSPIRON");

  studentsList.add(student2);
    
        // student 3
        Students student3 = new Students();
  student3.setStudentName("Mary Jane");
  student3.setStudentID("2023014050");

  coursesList[0].setCredits(9.5);
  coursesList[1].setCredits(6.8);
  coursesList[2].setCredits(8.1);
  coursesList[3].setCredits(9.5);
  coursesList[4].setCredits(8.8);
  
  laptop.setIdNumber("20");
  laptop.setBrand("APPLE");
  laptop.setModel("MACBOOK");

  studentsList.add(student3);

    for (Students st: studentsList){
      double marks, averageMarks;
    
      Course[] temp = st.getCourses();
      int[] scores=st.getMarks();
      
      for(i: temp) {
        marks+= temp.getCredits(); 
        marks = marks/5;
      }
    
          System.out.println(st.getStudentName());
    }


    
  }
}