
class Animal {

    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Encapsulation {

    public static void main(String[] args) {
        Animal dog = new Animal("puppo", "black");
        System.out.println(dog.getName());

        dog.setName("fooppo");
        System.out.println(dog.getName());
    }
}
