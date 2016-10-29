import java.util.Scanner;
public class Time
{
	int hours;
	int minutes;

	public Time()
	{
		hours = 0;
		minutes = 0;
	}
	//takes just hours
	 public Time(int hours)
	 {
	 	this.hours = hours;
	 	this.minutes = 0;
	 }
	 //takes hours and minutes
	 public Time(int hours, int minutes)
	 {
	 	if (hours > 23 || minutes > 59)
	 	{
	 		hours = hours%24;
	 		minutes = minutes%60;
	 	}
	 	else 
	 	{
	 		this.hours = hours;
	 		this.minutes = minutes;
	 	}
	 	
	 }
	//the add function
	 public void add(int minutes)//
	 {
	 	this.minutes += minutes;
	 	if (this.minutes >= 60)
	 		hours += this.minutes/60;//adds the extra minutes to our hours
	 		this.minutes = this.minutes%60;//the remaining minutes 
	 }
	//creating the display function
	public void display()
	{
		if (minutes < 10)
		{
			System.out.println(hours+":0"+minutes); 
		}
		else
		{
			System.out.println(hours+":"+minutes);
		}
	}
	//creating the main function
	public static void main(String[] args) 
	{
		Time[] time = new Time[4];//creating array to display our values
		//creating instances of class Time
		Time time1 = new Time();
		Time time2 = new Time(10);
		Time time3 = new Time(12,30);
		Time time4 = new Time(10,05);
		//adding to our array time
		time[0] = time1;
		time[1] = time2;
		time[2] = time3;
		time[3] = time4;
		
		//checking if our Add function works
		time[3].add(56);
		time[0].add(121);

		//displaying our values
		time[0].display();
		time[1].display();
		time[2].display();
		time[3].display();


	}

}
