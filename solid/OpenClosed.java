package solid;

public class OpenClosed {

    public static void main(String[] args) {
        // bad chef example
        BadChef badChef = new BadChef();
        badChef.cookBeef();
        badChef.cookChicken();

        // good chef example (open-closed)
        Chef chef = new Chef();
        Dish chicken = new Dish("chicken");
        Dish beef = new Dish("beef");

        chef.cookDish(beef);
        chef.cookDish(chicken);

    }
}

class BadChef {

    void cookChicken() {
        System.out.println("Chicken cooked!");
    }

    void cookBeef() {
        System.out.println("Beef cooked!");
    }

    // any new item to cook will require modification to the class.
}

class Chef {

    void cookDish(Dish dish) {
        System.out.println(String.format("%s cooked!", dish.name));
    }
}

class Dish {

    String name;
    String[] ingredients;

    Dish(String name) {
        this.name = name;
    }
}
