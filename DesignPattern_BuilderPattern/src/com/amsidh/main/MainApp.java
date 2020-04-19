package com.amsidh.main;

import com.amsidh.builder.MealBuilder;
import com.amsidh.jevan.Meal;

public class MainApp {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal prepareVegMeal = mealBuilder.prepareVegMeal();
		prepareVegMeal.showItems();
		System.out.println(prepareVegMeal.getCost());

		Meal prepareNonVegMeal = mealBuilder.prepareNonVegMeal();
		prepareNonVegMeal.showItems();
		System.out.println(prepareNonVegMeal.getCost());

	}

}
