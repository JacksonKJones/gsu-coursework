package assignment01;

import java.util.Scanner;

public class E2_8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT:");
		int timeOffset = input.nextInt();
		
		long millisecondsGMT = System.currentTimeMillis();
		long secondsGMT = millisecondsGMT / 1000;
		long minutesGMT = secondsGMT / 60;
		long hoursGMT = minutesGMT / 60;
		
		long currentSecond = secondsGMT % 60;
		long currentMinute = minutesGMT % 60;
		long currentHour = (hoursGMT + timeOffset) % 24;
		
		System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond);
		
		input.close();

	}
}
