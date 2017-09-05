package com.jwang.test;

import com.google.gson.Gson;

/**
 * Uses the vanilla Gson dependency v2.3.1
 */
public class OtherMain {
	
	private class Car {
		public String brand = null;
		public int doors = 0;
	}

	public static void main() {
		Gson gson = new Gson();
		String jsonStr = "{\"brand\": \"Jeep\", \"doors\": 3}";
		Car myCar = gson.fromJson(jsonStr, Car.class);

		System.out.println("hello world: " + myCar.brand);
	}	
}
