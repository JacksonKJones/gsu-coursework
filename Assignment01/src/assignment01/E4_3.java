package assignment01;

public class E4_3 {

	public static double distance(double a, double b, double c, double d) {
		
		double earthRad = 6371.01;
		
		double e = earthRad * Math.acos(Math.sin(Math.toRadians(a)) * Math.sin(Math.toRadians(b)) + 
		           Math.cos(Math.toRadians(a)) * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(c - d)));
		
		return e;
	}
	
	public static double triArea(double a, double b, double c) {
		
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		return area;
	}
	
	public static void main(String[] args) {
		
		double atlLat = 33.7489924;
		double atlLong = -84.3902644;
		double orlLat = 28.5421109;
		double orlLong = -81.3790304;
		double chaLat = 35.2272086;
		double chaLong = -80.8430827;
		double savLat = 32.0564572;
		double savLong = -81.0951271;
		
		double atlOrl = distance(atlLat, orlLat, atlLong, orlLong);
		double atlCha = distance(atlLat, chaLat, atlLong, chaLong);
		double atlSav = distance(atlLat, savLat, atlLong, savLong);
		double savOrl = distance(savLat, orlLat, savLong, orlLong);
		double savCha = distance(savLat, chaLat, savLong, chaLong);
		
		double atlSavOrl = triArea(atlSav, atlOrl, savOrl);
		double atlSavCha = triArea(atlSav, atlCha, savCha);
		
		double area = atlSavOrl + atlSavCha;
		
		System.out.println("The area enclosed by Atlanta, Charlotte, Savannah, and Orlando is " + area);
		
	}
	
}
