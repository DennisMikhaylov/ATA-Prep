public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addMeal("Apple");
        menu.addMeal("Banana");
        menu.addMeal("Cherry");

        menu.printMeals();

        menu.clearMenu();
        menu.addMeal("Dairy");

        menu.printMeals();
    }
}