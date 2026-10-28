// Базовый класс
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Класс-наследник Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
}

// Класс-наследник Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает: Мяу-мяу!");
    }
}

// Главный класс для запуска
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Мурка");

        dog.makeSound();
        cat.makeSound();
    }
}
