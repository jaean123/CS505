public class TestEditable {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (Object obj : objects) {
            if (obj instanceof Editable) {
                System.out.println(((Editable)obj).howToEat());
            }
            if (obj instanceof  Animal) {
                System.out.println(((Animal)obj).sound());
            }
        }
    }

}

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();
}

class Chicken extends Animal implements Editable {

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROAARRR!";
    }
}

abstract class Fruit implements Editable {

}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make Apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
