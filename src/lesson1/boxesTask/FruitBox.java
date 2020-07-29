package lesson1.boxesTask;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {
    ArrayList<T> box;

    public FruitBox() {
        box = new ArrayList<>();
    }

    public int getWeight() {
        var out = 0;
        for(var fruit : box){
            out += fruit.weight;
        }
        return out;
    }

    public boolean isEquals(FruitBox<?> otherBox){
        return getWeight() == otherBox.getWeight();
    }

    public void moveFruitsToOtherBox(FruitBox<T> otherBox){
        for(var fruit : this.box){
            otherBox.putFruit(fruit);
        }

        box.clear();
        System.out.println("Все фрукты из коробки успешно пересыпаны.");
    }

    public void putFruit(T fruit){box.add(fruit);}
}
