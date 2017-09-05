package com.jwang.test;

import com.jwang.test.gson.Gson;

/**
 * Uses the shadowed / relocated Gson dependency v2.6.2
 */
public class Main {
	
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
