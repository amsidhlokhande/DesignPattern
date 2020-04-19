package com.amsidh.criteria.impl;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.criteria.CriteriaFilter;
import com.amsidh.dto.Person;

public class SingleCriteria implements CriteriaFilter{

	@Override
	public List<Person> applyCriteria(List<Person> persons) {

		List<Person> singlePersons = new ArrayList<Person>();
		for (Person p : persons) {
			if (p != null && p.getMaritalStatus().equalsIgnoreCase("single")) {
				singlePersons.add(p);
			}
		}
		return singlePersons;
	}
	
	
	
}
