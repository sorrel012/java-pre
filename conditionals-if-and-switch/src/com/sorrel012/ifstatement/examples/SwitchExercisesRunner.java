package com.sorrel012.ifstatement.examples;

public class SwitchExercisesRunner {
	public static void main(String[] args) {
		System.out.println(determineNameOfDay(1));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		default:
			return "Saturday";
		}
	}

}
