package classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static List<DishClass> filterByCalories(List<DishClass> array,int calories) {
		
		ArrayList<DishClass> newList = new ArrayList<DishClass>();
		
		for (DishClass dishClass : array) {
			
			if(dishClass.getCalories()>calories) {
				newList.add(dishClass);
			}	
		}
		return newList;
	}
	
	
	public static List<DishClass> filterByMealType(List<DishClass> array) {
		
		ArrayList<DishClass> newList = new ArrayList<DishClass>();
		
		for (DishClass dishClass : array) {
			
			if(dishClass.isVegetarian() == true) {
				newList.add(dishClass);
			}	
		}
		return newList;
	}
	
	
	
	public static List<DishClass> filterByMeatAndCalories(List<DishClass> array,int calories) {
		
		ArrayList<DishClass> newList = new ArrayList<DishClass>();
		
		for (DishClass dishClass : array) {
			
			if(dishClass.getCalories()>calories && dishClass.getDishType() == MealType.Meat) {
				newList.add(dishClass);
			}	
		}
		return newList;
	}
	
	

	
	
	public static void main(String[] args) {
		
		ArrayList<DishClass> Dishes = new ArrayList<DishClass>();
		Dishes.add(new DishClass("Pork Fry",false,800,MealType.Meat));
		Dishes.add(new DishClass("Pepper Chicken",false,700,MealType.Meat));
		Dishes.add(new DishClass("BBQ Ribs",false,600,MealType.Meat));
		Dishes.add(new DishClass("French Fries",true,500,MealType.Others));
		Dishes.add(new DishClass("Double Cheese Pizza",true,400,MealType.Others));
		Dishes.add(new DishClass("Seasoned Fruits",true,120,MealType.Others));
		Dishes.add(new DishClass("Salmon",false,500,MealType.Fish));
		Dishes.add(new DishClass("Prawns",false,300,MealType.Fish));
		Dishes.add(new DishClass("Rice Puddin",true,200,MealType.Others));
		Dishes.add(new DishClass("Milk Shake",true,150,MealType.Others));
		
		//List<DishClass> sorted = filterByCalories(Dishes,300);
		//List<DishClass> sorted = filterByMealType(Dishes);
		
		List<DishClass> sorted = filterByMeatAndCalories(Dishes,300);
		
		Collections.sort(sorted);
		 for (DishClass dishes : sorted) {
			System.out.println("Name: " + dishes.getName());
			if (dishes.vegetarian == true)
			{
				System.out.println("Vegetarian: True" );	
			}
			else
			{
				System.out.println("Vegetarian: False" );	
			}
			System.out.println("Calories: " + dishes.getCalories());
			System.out.println("Meal Type: " + dishes.getDishType());		
			System.out.println("");
		}

	}

}
