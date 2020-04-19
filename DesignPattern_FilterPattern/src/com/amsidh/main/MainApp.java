package com.amsidh.main;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.criteria.CriteriaFilter;
import com.amsidh.criteria.impl.AndCriteria;
import com.amsidh.criteria.impl.FemaleCriteria;
import com.amsidh.criteria.impl.MaleCriteria;
import com.amsidh.criteria.impl.ORCriteria;
import com.amsidh.criteria.impl.SingleCriteria;
import com.amsidh.dto.Person;

public class MainApp {

	public static void main(String[] args) {

		CriteriaFilter maleCriteria = new MaleCriteria();

		System.out.println("Male List:");
		for (Person person : maleCriteria.applyCriteria(loadPersonData())) {
			System.out.println(person.toString());
		}

		System.out.println("Female List:");

		CriteriaFilter femaleCriteria = new FemaleCriteria();
		for (Person person : femaleCriteria.applyCriteria(loadPersonData())) {
			System.out.println(person.toString());
		}
		System.out.println("Male And Single List:");
		CriteriaFilter andCriteria = new AndCriteria(maleCriteria, new SingleCriteria());
		for (Person person : andCriteria.applyCriteria(loadPersonData())) {
			System.out.println(person.toString());
		}

		System.out.println("Female And Single List:");
		andCriteria = new AndCriteria(femaleCriteria, new SingleCriteria());
		for (Person person : andCriteria.applyCriteria(loadPersonData())) {
			System.out.println(person.toString());
		}
		System.out.println("Male OR Female List:");
		CriteriaFilter orCriteria = new ORCriteria(maleCriteria, femaleCriteria);
		for (Person person : orCriteria.applyCriteria(loadPersonData())) {
			System.out.println(person.toString());
		}
	}

	private static List<Person> loadPersonData() {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Amsidh", "Male", "Married"));
		persons.add(new Person("Anush", "Male", "Single"));
		persons.add(new Person("Adity", "Male", "Single"));
		persons.add(new Person("Anjali", "Female", "Married"));
		persons.add(new Person("Raju", "Male", "Married"));
		persons.add(new Person("Sanju", "Male", "Married"));
		persons.add(new Person("********", "Male", "Married"));
		persons.add(new Person("Adithi", "Female", "Single"));
		persons.add(new Person("Yuvraj", "Male", "Single"));
		persons.add(new Person("Minkashi", "Female", "Single"));
		return persons;
	}
}
