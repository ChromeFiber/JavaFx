package sample.classes;

import java.util.Date;

public class Student extends Person implements SchoolManagement{
  private int studNr;
  private static int nextStudId = 1;
  private Date enrolled;

  public Student(String firstName, String lastName, String phoneNr, String dateOfBirth) {
    super(firstName, lastName, phoneNr, dateOfBirth);
    this.studNr = nextStudId++;
    enrolled = new Date();
  }

  public int getStudNr() {
    return studNr;
  }

  public void setStudNr(int studNr) {
    this.studNr = studNr;
  }

  public static int getNextStudId() {
    return nextStudId;
  }

  public Date getEnrolled() {
    return enrolled;
  }

  public void setEnRolled(Date enrolled) {
    this.enrolled = enrolled;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studNr=" + studNr +
            ", enrolled=" + enrolled +
            ", firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            ", phoneNr='" + getPhoneNr() + '\'' +
            ", dateOfBirth='" + getDateOfBirth() + '\'' +
            '}';
  }
}
