package sample.classes;

public abstract class Person {
  protected String firstName;
  protected String lastName;
  protected String phoneNr;
  protected String dateOfBirth;

  public Person(String firstName, String lastName, String phoneNr, String dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNr = phoneNr;
    this.dateOfBirth = dateOfBirth;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNr() {
    return phoneNr;
  }

  public void setPhoneNr(String phoneNr) {
    this.phoneNr = phoneNr;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
