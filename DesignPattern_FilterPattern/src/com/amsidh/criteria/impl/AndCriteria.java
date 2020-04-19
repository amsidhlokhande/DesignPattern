package com.amsidh.criteria.impl;

import java.util.List;

import com.amsidh.criteria.CriteriaFilter;
import com.amsidh.dto.Person;

public class AndCriteria implements CriteriaFilter{

	private CriteriaFilter firstCriteria;
	private CriteriaFilter secondCriteria;
	
	
	public AndCriteria(CriteriaFilter firstCriteria, CriteriaFilter secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}


	@Override
	public List<Person> applyCriteria(List<Person> persons) {
		List<Person> firstList = firstCriteria.applyCriteria(persons);
		return secondCriteria.applyCriteria(firstList);
	}
	
	
	
}
