package Java.ProgrammingParadigm;

class Animal {
    public void bark() {
        System.out.println("mumu! mumu!");
    }
}

class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("wal!! wal!!!!");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}

/*
wal!! wal!!!!
 */