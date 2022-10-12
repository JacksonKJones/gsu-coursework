package chapter01;

public class E1_11 {
	
	public static void main(String[] args) {
		
		double birthInSeconds = 7.0;
		double deathInSeconds = 13.0;
		double immigrantInSeconds = 45.0;

		double currentPopulation = 312032486.0;
		double yearInSeconds = 60 * 60 * 24 * 365;
		
		double birthsInYear = yearInSeconds / birthInSeconds;
		double deathsInYear = yearInSeconds / deathInSeconds;
		double immigrantsInYear = yearInSeconds / immigrantInSeconds;
		
		double populationChangeInYear = birthsInYear - deathsInYear + immigrantsInYear;
		
		for (int i = 1; i <= 5; i++) {
			currentPopulation += populationChangeInYear;
			System.out.println("Population is " + (int)currentPopulation + " in year " + i);
		}
	}
	
}
