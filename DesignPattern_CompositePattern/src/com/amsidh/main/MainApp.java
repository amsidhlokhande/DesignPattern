package com.amsidh.main;

import com.amsidh.dto.Employee;

public class MainApp {

	public static void main(String[] args) {

		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.getSubordinates().add(headSales);
		CEO.getSubordinates().add(headMarketing);

		headSales.getSubordinates().add(salesExecutive1);
		headSales.getSubordinates().add(salesExecutive2);
		headMarketing.getSubordinates().add(clerk1);
		headMarketing.getSubordinates().add(clerk2);

		System.out.println(CEO.toString());
		for (Employee employee : CEO.getSubordinates()) {
			System.out.println(employee.toString());
			for (Employee emp : employee.getSubordinates()) {
				System.out.println(emp.toString());
			}
		}
	}

}
