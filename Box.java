import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    
    private List<T> fruitsList;

    public Box() {
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

    public void moveTo(Box<? super T> destinationBox) {
        destinationBox.fruitsList.addAll(this.fruitsList);
        this.fruitsList.clear();
    }
}
