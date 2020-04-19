package com.amsidh.criteria.impl;

import java.util.List;

import com.amsidh.criteria.CriteriaFilter;
import com.amsidh.dto.Person;

public class ORCriteria implements CriteriaFilter {

	private CriteriaFilter firstCriteria;
	private CriteriaFilter secondCriteria;

	public ORCriteria(CriteriaFilter firstCriteria, CriteriaFilter secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> applyCriteria(List<Person> persons) {

		List<Person> firstList = firstCriteria.applyCriteria(persons);
		List<Person> secondList = secondCriteria.applyCriteria(persons);
		for (Person secondPerson : secondList) {
			if (!firstList.contains(secondPerson)) {
				firstList.add(secondPerson);
			}
		}

		return firstList;
	}

}
