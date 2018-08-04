package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class ParkingTest {

	public static void main(String[] args) {
		Parked_CarOwner_Details car1 = new Parked_CarOwner_Details("ABC", "100", 1, 9000, "Mumbai");
		Parked_CarOwner_Details car2 = new Parked_CarOwner_Details("DEF", "101", 2, 8000, "Kolkata");
		Parked_CarOwner_Details car3 = new Parked_CarOwner_Details("PQR", "102", 3, 7000, "Delhi");

//Creating an object of Parked_CarOwnerList to call its methods
		Parked_CarOwnerList par = new Parked_CarOwnerList();

		par.add_new_car(car1);
		par.add_new_car(car2);
		par.add_new_car(car3);
		List<Parked_CarOwner_Details> al = new ArrayList<>();
		al = par.getAllDetails();

		for (Object o : al) { // Printing the movie list
			System.out.println(o + "\n");
		}

		par.remove_car(car2);

		al = par.getAllDetails();

		for (Object o : al) { // Printing the movie list
			System.out.println(o + "\n");
		}

		System.out.println(par.getParkedCarLocation(165));

	}

}
