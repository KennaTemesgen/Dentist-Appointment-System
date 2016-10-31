import java.util.Scanner;
public class DentalAppointment{

  //Attributes
  Person person;
  Time time;
  Date date;
  int duration;
  Time end;

  //default constructor
  public DentalAppointment(){
    this.person = new Person();
    this.time = new Time();
    this.date = new Date();
    this.duration = 30;
    this.end = time;
    end.add(duration);
  }


  //non-default constructor
  public DentalAppointment(Person person, Time time, Date date, int duration){
    if (duration > 240){
      duration = 240;
    }
    this.person = person;
    this.time = time;
    this.date = date;
    this.duration = duration;
    this.end = new Time(this.time.getHour(), this.time.getMinute());
    end.add(duration);
  }

  public void Display(){
    person.Display();
    time.display();
    date.display();
    end.display();
  }

  //main function
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    //array list that each set of inputs is saved in
    DentalAppointment[] tempName = new DentalAppointment[3];

    //for loop
    for (int i = 0; i < 3; i++){
      System.out.println("First name: ");
      String firstname = sc.nextLine();
      System.out.println("Last name: ");
      String lastname = sc.nextLine();
      System.out.println("Zipcode: ");
      String zipcode = sc.nextLine();
      System.out.println("Month: ");
      int month = sc.nextInt();
      System.out.println("Day: ");
      int day = sc.nextInt();
      System.out.println("Year: ");
      int year = sc.nextInt();
      System.out.println("Hour: ");
      int hour = sc.nextInt();
      System.out.println("Minutes: ");
      int minutes = sc.nextInt();
      System.out.println("Duration: ");
      int duration = sc.nextInt();
      sc.nextLine();

      Person patient = new Person(firstname, lastname, zipcode);
      Date date = new Date(month, day, year);
      Time time = new Time(hour, minutes);


      DentalAppointment temp = new DentalAppointment(patient, time, date, duration);
      tempName[i] = temp;
    }
    tempName[0].Display();
    tempName[1].Display();
    tempName[2].Display();
  }

}
