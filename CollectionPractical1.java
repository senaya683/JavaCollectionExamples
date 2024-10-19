import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {

    public CollectionPractical1() {
        Collection<Integer> c = new LinkedList<>();

        c.add(5);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(8);
        c.remove(5);

        // Print the remaining elements
        System.out.println(c);
    }

    public static void main(String[] args) {
        new CollectionPractical1();  
}
