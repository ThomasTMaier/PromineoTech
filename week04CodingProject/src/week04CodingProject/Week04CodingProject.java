package week04CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//List created and populated
	
		System.out.println(difference(ages));
		//created a method to find the difference between the first and last integer in an array
		int[] intList2 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		System.out.println(difference(intList2));
		// Tested the method to ensure it works with a second array
		int sum = 0; 
		
		for(int counter = 0; counter <ages.length; counter++) {
			sum += ages[counter]; 
		}
		int result = sum/ages.length; 
		System.out.println(result);
		
		//-----------------------------------------------------------------
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//creates an array of Strings
		int sum2 = 0; 
		for(String i :names) {
			sum2 = sum2 + i.length();
		}
		int result2 = sum2/names.length; 
		System.out.println(result2);
		
		//finds the average length of each string in the array, 
		//using a for each loop and two variable to find the average,
		//does cut off some as the average is closer to 4, but the variables are ints. 
		
		String allNames = new String();
		for(int counter = 0; counter<names.length; counter++) {
			allNames = (allNames + " " + names[counter]);
		}
		System.out.println(allNames);

	//**************************************************
	
	/*	3.		You can access the last element of any array by calling the name of the array followed by 
	*	.length - 1, this takes the length of the array minus one to find the last index of the 
	*	array. It's this way because array indexes start at 0, rather than 1. 
	*
	*	4.		To acces the first element of any array simply call the name of the array, followed 		
	*	by [0]. This tells the array to go to index 0, which will always be the first element in the 
	*	array. 
	*
	*
	*
	*/
		//------------------------------------------------------
		//finds the lengths of names/strings in an array of strings
		List <Integer> namesLength = new ArrayList<>();
		for(String i : names) {
			namesLength.add(i.length());
		
		}
		System.out.println(namesLength);
		//takes an array of int and finds the total of all elements. 
		int sum3 = 0; 
		for(int i : namesLength) {
			sum3 +=i;
		}	
		System.out.println(sum3);
		
		
		//print statements to test methods
		System.out.println(ConcatSelf("Hello", 3));
		System.out.println(fullName("Thomas","Maier"));
		System.out.println(moreThan(ages, 1000));
		//arrays for testing. 
		double[] prices = {2.2, 3.99, 4.85};
		double[] prices2 = {1.1, 2.99, 3.99};
		System.out.println(averageDouble(prices));
		System.out.println(greaterAvg(prices, prices2));
		System.out.println(willBuyDrink(true, 10.50));
		budgeter(2500, 900, 1200, 300, 200, .20 );
		
	}
	
	//Takes a word and concatonates it to itself a number of times. 
	
	public static String ConcatSelf(String word, int n) {
		String ConWord = new String();
		for(int i =0; i<n; i++) {
			ConWord+=word;
		}
		return ConWord;
	}
	//Takes two strings that are names and combines them into a full name. 
	public static String fullName(String first, String last) {
		String fullName = first + " " + last;
		return fullName;
	}

	// finds the average from a array of double. 
	public static double averageDouble(double[] x) {
		double average = 0;
		for(int i = 0; i<x.length; i++) {
			average += x[i];
		}
		return average/x.length;
	}
	
	//Tells if someone should and is able to get a drink. 
	public static boolean willBuyDrink (boolean isHotOutside, double money) {
		if(isHotOutside && money>10.50) {
			return true;
		}else {
			return false;
		}
	}
	// takes two lists and finds if one average is greater than the other
	public static boolean greaterAvg(double[] x, double[] y) {
		double one = averageDouble(x);
		double two = averageDouble(y);
		if(one>two) {
			return true;
		}else {
			return false;
		}
	}
	
	//takes an array of int and finds the total of it and compares it to a number. 
	public static boolean moreThan(int[] x, int y) {
		int sum = 0;
		for(int i = 0; i<x.length; i++) {
			sum+=x[i];
		}
		if(sum>=y) {
			return true;
		}else {
			return false;
		}
	}
	//Finds the difference between the first and last number in an array of int. 
	public static int difference (int[] x) {
		int result1 = (x[x.length-1]-x[0]);
		return result1;
	}
	
	//Takes in expences and tells you how much you have left along with how much you wanted to save. 
	public static void budgeter(double income, double rent, double utilities, double otherExpences, double funMoney, double savingPercent) {
		double remainMon = income-(rent+utilities+otherExpences + funMoney);
		double wantedSavings = income*savingPercent; 
		if(remainMon>=0) {
		System.out.println("This is how much money you have left: " + remainMon);
		}else {
			System.out.println("This is how much money you need: " + remainMon);
		}
		System.out.println("This is how much you want to save: " + wantedSavings);
			
		
		
		
	}

}
