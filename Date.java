import java.util.Scanner;
public class Date
{
	//instance attributes
	int month;
	int day;
	int year;

	//constructor not taking arguments
	public Date()
	{
		month = 1;
		day = 1;
		year = 2000;
	}
	//contructor that assigns non-default values to our variables
	public Date(int month, int day, int year)
	{
		//specifically this object's month variable (12/11/2000)
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void display()
	{
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}

	public static void main(String[] args)
	{
		//creating object(date) in class(Date)
		Date date = new Date();//creating one instance of class Date using dafault constructor
		Date date2  = new Date(12,11,2000);//using non-default cnstructor
		//System.out.println(date.month + "/" + date.day + "/" + date2.year);

		date.display();
		date2.display();
	}
}