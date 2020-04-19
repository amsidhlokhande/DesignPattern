package com.amsidh.criteria;

import java.util.List;

import com.amsidh.dto.Person;

public interface CriteriaFilter {

	public List<Person> applyCriteria(List<Person> persons);
}
