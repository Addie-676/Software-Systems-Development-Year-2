package JavaExperiments;
import java.util.ArrayList;

public class ListsTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");//tried adding duplicates in a list
        colors.add("Yellow");

        System.out.println("ArrayList contents:");
        System.out.println(colors);

        System.out.println("\nElement at index 0: " + colors.get(0));
        System.out.println("Element at index 2: " + colors.get(2));

        System.out.println("\nTotal elements: " + colors.size());
    }
}
