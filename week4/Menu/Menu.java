/*
* Another file Main.java used to support Menu.java looks like this:
*
public class Main {
    public static void main(String[] args) {
         Menu exactum = new Menu();

         exactum.addMeal("Fish fingers with sour cream sauce");
         exactum.addMeal("Vegetable casserole with salad cheese");
         exactum.addMeal("Chicken and nacho salad");

         exactum.printMeals();

         exactum.clearMenu();
         exactum.printMeals();
    }
}
*
*/


import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
