/*
Composite lets you treat individual objects and groups of objects in the same way.
Restaurant Menu
│
├── Burger              ← MenuItem
├── Pizza               ← MenuItem
│
├── Drinks              ← Menu
│   ├── Coke            ← MenuItem
│   ├── Coffee          ← MenuItem
│   └── Orange Juice    ← MenuItem
│
└── Desserts            ← Menu
    ├── Ice Cream        ← MenuItem
    └── Chocolate Cake   ← MenuItem
*/


package Structural;
import java.util.ArrayList;
import java.util.List;


// ===============================
// Component
// ===============================



interface MenuComponent {

    void show();
}


// ===============================
// Leaf
// ===============================

class MenuItem implements MenuComponent {

    private String name;
    private double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void show() {
        System.out.println(name + " - $" + price);
    }
}


// ===============================
// Composite
// ===============================

class Menu implements MenuComponent {

    private String name;

    private List<MenuComponent> components = new ArrayList<>();

    Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void show() {

        System.out.println("\n=== " + name + " ===");

        for (MenuComponent component : components) {
            component.show();
        }
    }
}


// ===============================
// Client
// ===============================

public class Composite {

    public static void main(String[] args) {

        // =====================================
        // Create Main Restaurant Menu
        // =====================================

        Menu restaurantMenu = new Menu("Restaurant Menu");


        // =====================================
        // Create Main Menu Items
        // =====================================

        MenuItem burger = new MenuItem("Burger", 8.0);

        MenuItem pizza = new MenuItem("Pizza", 12.0);


        // =====================================
        // Create Drinks Menu
        // =====================================

        Menu drinksMenu = new Menu("Drinks");

        MenuItem coke = new MenuItem("Coke", 2.0);

        MenuItem coffee = new MenuItem("Coffee", 3.0);

        MenuItem juice = new MenuItem("Orange Juice", 4.0);


        // Add drinks to Drinks Menu

        drinksMenu.add(coke);

        drinksMenu.add(coffee);

        drinksMenu.add(juice);


        // =====================================
        // Create Dessert Menu
        // =====================================

        Menu dessertMenu = new Menu("Desserts");

        MenuItem iceCream = new MenuItem("Ice Cream", 5.0);

        MenuItem cake = new MenuItem("Chocolate Cake", 6.0);


        // Add desserts to Dessert Menu

        dessertMenu.add(iceCream);

        dessertMenu.add(cake);


        // =====================================
        // Add everything to Restaurant Menu
        // =====================================

        restaurantMenu.add(burger);

        restaurantMenu.add(pizza);

        restaurantMenu.add(drinksMenu);

        restaurantMenu.add(dessertMenu);


        // =====================================
        // Display complete menu
        // =====================================

        restaurantMenu.show();
    }
}