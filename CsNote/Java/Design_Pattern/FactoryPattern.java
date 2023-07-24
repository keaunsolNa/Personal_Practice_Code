package Java.Design_Pattern;

abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi this coffe is " + this.getPrice();
    }
}

class CoffeeFactory {
    public static Coffee getCoffe(String type, int price) {
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);

        else {
            return new DefaultCoffe();
        }
    }
}

class DefaultCoffe extends Coffee {
    private int price;

    public DefaultCoffe() {
        this.price -= 1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee {
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends Coffee {
    private int price;

    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

public class FactoryPattern {
    
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffe("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffe("Americano", 3000);
        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory ame :: " + ame);
    }
}


/* 
    Factory latte ::Hi this coffe is 4000
    Factory ame :: Hi this coffe is 3000
*/