package JavaExperiments;

import java.util.HashSet;

public class SetsTest {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();


        colors.add("Blue");
        colors.add("Blue");//Tried to adding duplicates in a set
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");

        System.out.println("HashSet contents:");
        System.out.println(colors);

        System.out.println("\nTotal elements: " + colors.size());
    }
}