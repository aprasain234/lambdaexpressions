package com.ashishprasain;

public class LambdaExpressions {
	public static void main(String[] args) {

		// 1.
//		Cab cab = new Uberx();
//		cab.bookCab();

		// 2. Anonymous Class Implementation
//		Cab cab = new Cab() {
//			public void bookCab() {
//				System.out.println("Uber Booked, Arriving Soon!!!");
//			}
//		};
//		cab.bookCab();

		// 3. Lambda Expression   -------> It is for function interface only 
		Cab cab = (source, destination) -> {
			System.out.println("Uber is bookd from " + source + " to " + destination);
			return 765.98;
		};
		double fare = cab.bookCab("Irving", "Peak Restaurant");
		System.out.println("Fare is: " + fare);
	}
}
@FunctionalInterface
interface Cab {
	// void bookCab(String source, String destination);  ----->>> without parameters
	// void bookCab(String source, String destination);   // ---------->>>> with parameters
	double bookCab(String source, String destination);
	
}

/*
 * class Uberx implements Cab { public void bookCab() {
 * System.out.println("Uber Booked, Arriving Soon!!!"); } }
 */
