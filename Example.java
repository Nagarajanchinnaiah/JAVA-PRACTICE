class Animal {

    void eat() {
        System.out.println("Animals can eat...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog can bark...");
    }
}

public class Example {
    public static void main(String args[]) {
        Dog D = new Dog();
        D.eat();
        D.bark();
    }
}
