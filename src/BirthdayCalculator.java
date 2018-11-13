import java.util.Scanner;

public class BirthdayCalculator {

	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);	
    System.out.print("Please enter a month for a birthday ");
    String birthday1Str = keyboard.nextLine();
    int birthday1 = Integer.parseInt(birthday1Str);
    System.out.print("Please enter another birthday month ");
    String birthday2Str = keyboard.nextLine();
    int birthday2 = Integer.parseInt(birthday2Str);
    System.out.print("Please enter a day for the birthday ");
    String month1Str = keyboard.nextLine();
    int month1 = Integer.parseInt(month1Str);
    System.out.print("Please enter a day for the 2nd birthday ");
    String month2Str = keyboard.nextLine();
    int month2 = Integer.parseInt(month2Str);
    System.out.print("Please enter a year for the first birthday ");
    String year1Str = keyboard.nextLine();
    int year1 = Integer.parseInt(year1Str);
    System.out.print("Please enter a year for the 2nd birthday ");
    String year2Str = keyboard.nextLine();
    int year2 = Integer.parseInt(year2Str);
	
	
	if (birthday1>birthday2);
    System.out.print("The first person is older then the 2nd person ");
    
    elseif (birthday1<birthday2);
	System.out.print("Person 2 is older ");
	
	
	
	}

}
