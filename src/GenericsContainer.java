import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsContainer <T>{

    //Container
    private List<T> items;

    //Constructor
    public GenericsContainer(){
        items = new ArrayList<>();
    }

    //Method to add item
    public void add(T item){
        items.add(item);
        System.out.println(item + " added.");
    }

    //Method to remove item
    public void remove(T item){
        items.remove(item);
        System.out.println(item + " removed.");
    }

    //Method to retrieve item by index number
    public void retrieve(GenericsContainer<T> container, int index) {
        if (index >= 0 && index < container.items.size()) {
            System.out.println("At index " + index + " in " + container.items.get(index));
        } else {
            System.out.println("There's no index " + index);
        }
    }

    //Method to determine the container size
    public void size(GenericsContainer<T> container){
        System.out.println("The size of the container for " + container.items.get(0).getClass().getTypeName() + " is " + container.items.size());
    }

    //Method to sort items
    public void sortByCustomComparator(Comparator<T> comparator){
        Collections.sort(items, comparator);
    }

    //Method to reverse sort items
    public void sortByReverseOrder(Comparator<T> comparator){
        Collections.sort(items, Collections.reverseOrder(comparator));
    }

    //toString method for printing container contents
    @Override
    public String toString(){
        return  "Container contents: " + items;
    }
}