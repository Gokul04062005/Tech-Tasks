import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // LinkedHashSet keeps the order and removes duplicates
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new ArrayList<>(java.util.Arrays.asList(1, 2, 2, 3, 3, 4))));
       
        System.out.println(removeDuplicates(new ArrayList<>(java.util.Arrays.asList(5, 5, 5, 5))));
        
        System.out.println(removeDuplicates(new ArrayList<>(java.util.Arrays.asList(1, 1, 1, 1, 1))));
        
    }
}
