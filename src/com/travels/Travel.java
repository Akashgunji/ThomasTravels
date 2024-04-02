package com.travels;

import java.util.ArrayList;

public class Travel {
	public static void main(String[] args) {
		Travel t = new Travel();
		System.out.println("iscardriver result is");
		boolean b1 = t.iscardriver("car");
		System.out.println(b1);
		System.out.println("----------------------");
		System.out.println("retrivebyDriverid result is");
		String z = t.retrivebyDriverid(101);
		System.out.println(z);
		System.out.println("----------------------");
		System.out.println("RetriveCountOfDriver result is ");
		RetriveCountOfDriver("bike");
		System.out.println("----------------------");
		System.out.println("RetriveDriver result is ");
		t.retriveDriver("car");
		System.out.println("----------------------");
		System.out.println("RetriveMaximumDistanceTravelledDriver result is ");
		RetriveMaximumDistanceTravelledDriver(157);
	}

	public boolean iscardriver(String category) {
		if ("car".equals(category)) {
			return true;
		}
		return false;
	}

	public static String retrivebyDriverid(int n) {
		ArrayList<Driver> a = new ArrayList<>();
		Driver d = new Driver("car", 101, "ramesh", 122.56);
		a.add(d);
		Driver e = new Driver("car", 102, "suresh", 122.57);
		Driver f = new Driver("lorry", 103, "naresh", 122.58);
		Driver g = new Driver("lorry", 104, "kamesh", 122.59);
		a.add(e);
		a.add(f);
		a.add(g);
		for (int i = 0; i < a.size(); i++) {
			if (n == a.get(i).getDriverno()) {
				System.out.println("drivername is " + "" + a.get(i).getDrivername() + "--" + "belonging category" + "-"
						+ a.get(i).getCategory() + " " + "driver travelled distance " + ""
						+ a.get(i).getTotaldistance());
			}
		}
		return "details completed";
	}

	public static String RetriveCountOfDriver(String name) {
		ArrayList<Driver> a = new ArrayList<>();
		Driver d = new Driver("car", 101, "ramesh", 122.56);
		Driver e = new Driver("car", 102, "suresh", 122.57);
		Driver f = new Driver("lorry", 103, "naresh", 122.58);
		Driver g = new Driver("lorry", 104, "kamesh", 122.59);
		Driver h = new Driver("bike", 105, "HANEESH", 125);
		a.add(d);
		a.add(e);
		a.add(f);
		a.add(g);
		a.add(h);
		int count = 0;
		for (int i = 0; i < a.size(); i++) {

			if (name == a.get(i).getCategory()) {
				System.out.println(a.get(i).getDrivername());
				count++;
			}

		}
		System.out.println("count is" + " " + count);

		return name;
	}

	public String retriveDriver(String value) {
		ArrayList<Driver> a = new ArrayList<>();
		Driver d = new Driver("car", 101, "ramesh", 122.56);
		Driver e = new Driver("car", 102, "suresh", 125);
		Driver f = new Driver("lorry", 103, "naresh", 157);
		Driver g = new Driver("lorry", 104, "kamesh", 130);
		a.add(d);
		a.add(e);
		a.add(f);
		a.add(g);
		for (int i = 0; i < a.size(); i++) {
			if (value == a.get(i).getCategory()) {
				System.out.println(a.get(i).getDrivername());
			}
		}
		return null;

	}

	public static Driver RetriveMaximumDistanceTravelledDriver(double num) {
		ArrayList<Driver> a = new ArrayList<>();
		Driver d = new Driver("car", 101, "ramesh", 122.56);
		Driver e = new Driver("car", 102, "suresh", 125);
		Driver f = new Driver("lorry", 103, "naresh", 157);
		Driver g = new Driver("lorry", 104, "kamesh", 130);
		a.add(d);
		a.add(e);
		a.add(f);
		a.add(g);
		for (int i = 0; i < a.size(); i++) {
			if (num > a.get(i).getTotaldistance()) {
				System.out.println("Drivername  is " + " " + a.get(i).getDrivername());
			}
		}
		return null;
	}
}