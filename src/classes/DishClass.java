package classes;

import java.util.Comparator;
import java.util.Objects;

public class DishClass implements Comparable<DishClass>, Comparator<DishClass> {

	
	String name;
	boolean vegetarian;
	int calories;
	MealType DishType;
	
	public DishClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DishClass(String name, boolean vegetarian, int calories, MealType dishType) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		DishType = dishType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public MealType getDishType() {
		return DishType;
	}


	public void setDishType(MealType dishType) {
		DishType = dishType;
	}


	@Override
	public int compareTo(DishClass o) {
		return this.name.compareTo(o.name);
	}


	@Override
	public int compare(DishClass o1, DishClass o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		return Objects.hash(DishType, calories, name, vegetarian);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DishClass other = (DishClass) obj;
		return DishType == other.DishType && calories == other.calories && Objects.equals(name, other.name)
				&& vegetarian == other.vegetarian;
	}


	@Override
	public String toString() {
		return "DishClass [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", DishType="
				+ DishType + "]";
	}
	
	
	
	
	
}
