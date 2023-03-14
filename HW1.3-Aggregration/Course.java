public class Course {
  private String courseName;
  private Instructor instructor1;
  private Instructor instructor2;
  private Textbook textbook1;
  private Textbook textbook2;

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setInstructor1(Instructor instructor1) {
    this.instructor1 = instructor1;
  }

  public Instructor getInstructor1() {
    return instructor1;
  }
  
  public void setInstructor2(Instructor instructor2) {
    this.instructor2 = instructor2;
  }

  public Instructor getInstructor2() {
    return instructor2;
  }
  
  public void setTextbook1(Textbook textbook1) {
    this.textbook1 = textbook1;
  }

  public Textbook getTextbook1() {
    return textbook1;
  }

  public void setTextbook2(Textbook textbook2) {
    this.textbook2 = textbook2;
  }

  public Textbook getTextbook2() {
    return textbook2;
  }  

  public void printCourseInfo() {
    System.out.println("\nCourse Name: " + courseName);
    System.out.println("\n1.Instructor Name: " + instructor1.getInstructorFirstName() + " " + instructor1.getInstructorLastName());
    System.out.println("1.Office Number: " + instructor1.getOfficeNumber());
    System.out.println("\n2.Instructor Name: " + instructor2.getInstructorFirstName() + " " + instructor2.getInstructorLastName());
    System.out.println("2.Office Number: " + instructor2.getOfficeNumber());
    System.out.println("\n1.Textbook: " + textbook1.getTitle());
    System.out.println("1.Author: " + textbook1.getAuthor());
    System.out.println("1.Publisher: " + textbook1.getPublisher());
    System.out.println("\n2.Textbook: " + textbook2.getTitle());
    System.out.println("2.Author: " + textbook2.getAuthor());
    System.out.println("2.Publisher: " + textbook2.getPublisher());
  }

}