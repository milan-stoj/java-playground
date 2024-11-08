
class Polymorphism {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // compile-time polymorphism - method overloading
        System.out.println(add(1, 2)); // 3
        System.out.println(add(1, 2, 3)); // 6

        // run-time polymorphism - method overriding
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.eat();
        animal.eat();
        dog.eatAsAnimal();
    }
}

class Animal {

    void eat() {
        System.out.println("I am an animal that eats");
    }

}

class Dog extends Animal {

    @java.lang.Override
    void eat() {
        System.out.println("I am a dog that eats.");
    }

    void eatAsAnimal() {
        super.eat();
    }
}
