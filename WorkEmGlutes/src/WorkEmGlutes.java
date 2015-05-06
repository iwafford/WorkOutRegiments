import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// WorkEmGlutes Assignment
// Author: Jordan Peterson
// Date: May 5, 2015
// Class: CS160
// Email: jordan.typeterson@gmail.com

public class WorkEmGlutes {
	private static String[] days;
	private static String[] categories = {"Upper", "Lower", "Core", "Cardio", "Rest"};
	private static String[][] workOut;
	private static String[] tasks;
	private static int numDays = 0;
	private static String response;
	private static int y = 9;
	

	public static void main(String[] args) {
		ask();
		System.out.println("Yous a hoe");
		system.out.println("no you is");

	}
	
	public static String[][] Organizer(){
		System.out.println("yoyo");
		return workOut;
	}
	
	public static String[] whichDays(){
		Scanner scnr = new Scanner(System.in);
		String response = null;
	System.out.println("Which " + numDays + " Would You Like To Work Out");
	for(int i = 0; i < numDays;i++){
		response = scnr.nextLine().toLowerCase();
		switch(response){
		
		case "monday":
			days[i] = response;
		case "tuesday":
			days[i] = response;
		case "wednesday":
			days[i] = response;
		case "thursday":
			days[i] = response;
		case "friday":
			days[i] = response;
		case "saturday":
			days[i] = response;
		case "sunday":
			days[i] = response;
			default:
				System.out.println("That is an Invalid Response!");
				whichDays();
				
		}
	}
	System.out.println(Arrays.toString(days));
	return days;
	}
	
	
	public static void ask(){
		//allocate number of days
		try{
			Scanner scnr = new Scanner(System.in);
			System.out.println("How Many Days Do You Wish To Work Out?");
			numDays = scnr.nextInt();
			scnr.nextLine();
			while(y == 9){
				System.out.println("You Chose To Work Out " + numDays + " Days. Is This Correct? (Yes/No)");
				response = scnr.nextLine();
			if(response.toLowerCase().equals("yes")){
				days = new String[numDays];
				break;
			}
			else if(response.toLowerCase().equals("no")){
				System.out.println("How Many Days Do You Wish To Work Out?");
				numDays = scnr.nextInt();
				scnr.nextLine();
			}
			else{
				System.out.println("That is an Invalid Response!");
			}
		}
		}
			catch(InputMismatchException e){
				System.out.println("That is an Invalid Response!");
				ask();
		}
		whichDays();
		
		
		
			
			
	}

}
