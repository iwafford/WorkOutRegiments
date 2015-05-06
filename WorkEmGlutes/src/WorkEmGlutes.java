import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

// WorkEmGlutes Assignment
// Author: Jordan Peterson
// Date: May 5, 2015
// Class: CS160
// Email: jordan.typeterson@gmail.com

public class WorkEmGlutes {
	private static Random rand = new Random(System.currentTimeMillis());
	private static String[] days = {"Upper", "Lower", "Core", "Cardio", "Rest","yomam", "shesagirl"};
	private static String[] categories = {"Upper", "Lower", "Core", "Cardio", "Rest"};
	private static String[][] workOut;
	private static String[] tasks;
	private static int numDays = 0;
	private static String response;
	private static int y = 9;
	private static String[] difficulty = {"Easy", "Medium", "Hard"};
	private static int weight;
	private static int reps;
	private static String eventName;
	private static int sets;
	private static int restTime;
	private static int describeNum;
	private static String[] describe;
	private static String[] eventArray;
	private static String[] daySchedule;
	

	public static void main(String[] args) {
		readDay(args[0]);
		ask();
		whichDays();
		createWeekly(eventArray,days);
		

	}
	
	public static void categoryDay(){
		
	}
	
	public static String[] createWeekly(String [] eventArray, String [] days ){
		daySchedule = new String[numDays];
		for(int i = 0; i < numDays;i++){
			daySchedule[i] = days[i];
			System.out.println("\n -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \n" + daySchedule[i] + ":");
			for(int j = 0; j< 5; j++){
				int rand1 = rand.nextInt(eventArray.length);
				int rand2 = rand.nextInt(eventArray.length);
					while(rand2 == rand1){
					rand2 = rand.nextInt(eventArray.length);
				}
				int rand3 = rand.nextInt(eventArray.length);
					while(rand3 == rand2 || rand3 == rand1){
					rand3 = rand.nextInt(eventArray.length);
				}
				int rand4 = rand.nextInt(eventArray.length);
					while(rand4 == rand1 || rand4 == rand2 || rand4 == rand3){
					rand4 = rand.nextInt(eventArray.length);
				}
				int rand5 = rand.nextInt(eventArray.length);
					while(rand5 == rand1 || rand5 == rand2 ||rand5 == rand3 || rand5 == rand4){
						rand5 = rand.nextInt(eventArray.length);
				}
					if(j == 0){
						System.out.println("Work Out " + (j+1) + ": " + eventArray[rand1]+ "\n");
					}
					if(j == 1){
						System.out.println("Work Out " + (j+1) + ": " + eventArray[rand2]+ "\n");
					}
					if(j == 2){
						System.out.println("Work Out " + (j+1) + ": " + eventArray[rand3]+ "\n");
					}
					if(j == 3){
						System.out.println("Work Out " + (j+1) + ": " + eventArray[rand4]+ "\n");
					}
					if(j == 4){
						System.out.println("Work Out " + (j+1) + ": " + eventArray[rand5]+ "\n");
			}
		}
		
		}
		return daySchedule;
	}
	
	public static void readDay(String inputFile){
		try{
			Scanner scnr = new Scanner(new File(inputFile));
			
			while(scnr.hasNextLine()){
				int Numworkouts = scnr.nextInt();
				scnr.nextLine();
				eventArray = new String[Numworkouts];
				for(int i = 0; i < Numworkouts; i++){
					eventName = scnr.nextLine();
					weight = scnr.nextInt();
					reps = scnr.nextInt();
					sets = scnr.nextInt();
					restTime = scnr.nextInt();
					describeNum = scnr.nextInt();
					scnr.nextLine();
					describe = new String[describeNum];
					for(int j = 0; j < describeNum;j++){
						describe[j] = scnr.nextLine();
					}
					eventArray[i] =(eventName + "\nWeight: " + weight +" lbs"+ "\nReps: " + reps + "\nSets: " + sets + "\nRest-Time: " + restTime + "\nHow To: " + Arrays.toString(describe) + "\n_+_+_+_" );
					
				}
				
			}
			
			
			
		}
		catch(FileNotFoundException e){
			System.out.println("Cannot Read File");
			System.exit(0);
		}
		catch(NoSuchElementException e){
			
		}
	}
	
	public static String[][] Organizer(){
		
		return workOut;
	}
	
	public static String[] whichDays(){
		int count = 0;
		Scanner scnr = new Scanner(System.in);
		String response = null;
		String[] check = new String[numDays]; 
	System.out.println("Which " + numDays + " Would You Like To Work Out");
	for(int i = 0; i < numDays;i++){
		System.out.println("Day " + (i+1) + ": ");
		response = scnr.nextLine().toLowerCase();
		switch(response){
		
		case "monday": 
				if( i == 0){
					days[i] = response;
				}
				for(int j =0; j<i;j++){
					if(days[j].equals("monday")){
						System.out.println("That Day is Already Scheduled.");
						i-=1;
						break;
					}
					else{
						days[i] = response;
					}
			}
			break;
		case "tuesday": 
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("tuesday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;
					break;
			}
				else{
					days[i] = response;
				}
		}
			break;
		case "wednesday":
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("wednesday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;
					break;
			}
				else{
					days[i] = response;
				}
			}
			break;
		case "thursday": 
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("thursday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;
					break;
			}
				else{
					days[i] = response;
				}
		}
			break;
		case "friday":
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("friday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;
					break;
			}
				else{
					days[i] = response;
				}
		}
			break;
		case "saturday":
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("saturday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;
					break;
			}
				else{
					days[i] = response;
				}
		}
			break;
		case "sunday": 
			if( i == 0){
				days[i] = response;
			}
			for(int j =0; j<i;j++){
				if(days[j].equals("sunday")){
					System.out.println("That Day is Already Scheduled.");
					i-=1;break;
			}
				else{
					days[i] = response;
				}
		}
			break;
		default:
				System.out.println("That is an Invalid Response!");
				i-=1;
		}
	}
	return days;
	}
	
	
	public static void ask(){
		//allocate number of days
		try{
			Scanner scnr = new Scanner(System.in);
			System.out.println("How Many Days Do You Wish To Work Out?");
			numDays = scnr.nextInt();
			scnr.nextLine();
			if(numDays < 8 && numDays > 0){
				
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
				System.out.println(response + " Is Not An Option.");
			}
			}
			}
			else{
				System.out.println("That is an Invalid Response!");
				ask();
			}
			
		}
		
			catch(InputMismatchException e){
				System.out.println("That is an Invalid Response!");
				ask();
		}
		
			
	}
	
	public static String choices(String[] days){
		String choiceOut;
		choiceOut = ("Your Chosen Days Are: " + Arrays.toString(days));
		
		return choiceOut;
	}

}
