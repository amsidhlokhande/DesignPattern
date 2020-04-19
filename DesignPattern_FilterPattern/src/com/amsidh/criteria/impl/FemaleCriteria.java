package com.amsidh.criteria.impl;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.criteria.CriteriaFilter;
import com.amsidh.dto.Person;

public class FemaleCriteria implements CriteriaFilter{

	@Override
	public List<Person> applyCriteria(List<Person> persons) {

		List<Person> femalePersons = new ArrayList<Person>();
		for (Person p : persons) {
			if (p != null && p.getGender().equalsIgnoreCase("female")) {
				femalePersons.add(p);
			}
		}
		return femalePersons;
	}
}
