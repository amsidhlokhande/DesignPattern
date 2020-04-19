package com.amsidh.builder;

import com.amsidh.burger.NonVegBurger;
import com.amsidh.burger.VegBurger;
import com.amsidh.drinks.Coke;
import com.amsidh.drinks.Pepsi;
import com.amsidh.jevan.Meal;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Coke());
		vegMeal.addItem(new Pepsi());
		return vegMeal;
	}

	public Meal prepareNonVegMeal() {
		Meal nonVegMeal = new Meal();
		nonVegMeal.addItem(new NonVegBurger());
		nonVegMeal.addItem(new Coke());
		nonVegMeal.addItem(new Pepsi());
		nonVegMeal.addItem(new Pepsi());
		return nonVegMeal;
	}
}
