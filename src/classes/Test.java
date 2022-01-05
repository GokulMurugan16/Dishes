package classes;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

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
		
		Collections.sort(Dishes);
		
		 for (DishClass dishes : Dishes) {
			 
			
			System.out.println(dishes.getName());
			
			
		}

	}

}
