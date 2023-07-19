import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    
    private List<T> fruitsList;

    public FruitBox() {
        fruitsList = new ArrayList<>();
    }
    
    public void add (T fruit) {
        fruitsList.add(fruit);
    }

    public int getWeight() {
        int weight = 0;
        for (T fruit : fruitsList) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(FruitBox<? super T> destinationBox) {
        destinationBox.fruitsList.addAll(this.fruitsList);
        this.fruitsList.clear();
    }
}
