class LiskovSubstitution {
    public static void main(String[] args) {
        Product lifeInsurance = new LifeInsurance();
        Product annuity = new Annuity();

        lifeInsurance.printName();
        annuity.printName();

        lifeInsurance.printMarket();
        annuity.printMarket();

    }
}


abstract class Product {
    String name;
    String market;

    void printName() {
        System.out.println(this.name);
    }

    void printMarket() {
        System.out.println(this.market);
    }
}

class LifeInsurance extends Product {
    LifeInsurance() {
        this.name = "Life Insurance";
        this.market = "Risk Management";
    }
}

class Annuity extends Product {
    Annuity() {
        this.name = "Term Insurance";
        this.market = "Risk Management";
    }
}

