import java.util.Scanner;
public class Person{

  //intializing attributes
  String lastname;
  String firstname;
  String zipcode;

  //default constructor
  public Person()
  {
    lastname = "X";
    firstname = "X";
    zipcode = "X";
  }

  //non-default constructor
  public Person(String lastname, String firstname, String zipcode)
  {
    this.lastname = lastname;
    this.firstname = firstname;
    this.zipcode = zipcode;
  }


  //main function
  public static void main(String[] args)
  {
    Person a = new Person();
    Person b = new Person("George","Sir","37221");

    a.Display();
    b.Display();
  }

  //display function
  public void Display(){
    System.out.println(this.lastname+","+this.firstname+" "+this.zipcode);
  }
}
