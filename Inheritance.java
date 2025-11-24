public class Inheritance {
    public static void main(String[] args) {

        System.out.println("=== Dog ===");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.breathe();

        System.out.println("\n=== Puppy ===");
        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();
        puppy.breathe();

        System.out.println("\n=== Baby Puppy (Hybrid) ===");
        BabyPuppy bp = new BabyPuppy();
        bp.weep();
        bp.bark();
        bp.eat();
        bp.breathe();
        bp.flyLikeBird(); // hybrid behaviour
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("This animal eats food.");
    }

    void breathe() {
        System.out.println("This animal breathes air.");
    }
}

// hierarchical inheritance
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("This mammal walks on " + legs + " legs.");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("This fish swims with " + fins + " fins.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("The bird flies in the sky.");
    }
}

// single inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// multilevel inheritance
class Puppy extends Dog {
    String breed;

    void weep() {
        System.out.println("The puppy weeps.");
    }
}

// HYBRID using composition + multilevel
class BabyPuppy extends Puppy {
    Bird helperBird = new Bird(); // hybrid concept using HAS-A

    void flyLikeBird() {
        helperBird.fly();
    }
}
