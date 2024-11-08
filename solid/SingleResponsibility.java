package solid;

class SingleResponsibility {

    public static void main(String[] args) {
        // bad implementation!
        GodChef godChef = new GodChef();
        godChef.takeOrder();
        godChef.prepIngredients();
        godChef.cookOrder();
        godChef.deliverOrder();

        // correct implementation!
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        waiter.takeOrder();

        chef.prepIngredients();
        chef.cookOrder();

        waiter.deliverOrder();

    }
}

// responsible for cooking orders and taking orders
// not good because this class has many reasons to change (cooking method changes, 
// order taking method changes, order delivery method changes, etc..)
class GodChef {

    void prepIngredients() {
        System.out.println("ingredients prepped!");
    }

    void cookOrder() {
        System.out.println("dish cooked!");
    }

    void takeOrder() {
        System.out.println("order taken!");
    }

    void deliverOrder() {
        System.out.println("order delivered!");
    }
}

// responsible for cooking orders
class Chef {

    void prepIngredients() {
        System.out.println("ingredients prepped!");
    }

    void cookOrder() {
        System.out.println("dish cooked!");
    }
}

// Responsible for taking and delivering orders.
class Waiter {

    void takeOrder() {
        System.out.println("order taken!");
    }

    ;
    void deliverOrder() {
        System.out.println("order delivered!");
    }
;
}
