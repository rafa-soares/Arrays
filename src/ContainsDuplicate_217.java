import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] duplicatedNumbers = {1, 2, 1};
        containsDuplicate(duplicatedNumbers);

        int[] differentNumbers = {1, 2, 3};
        containsDuplicate(differentNumbers);
    }

    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> duplicate = new HashSet<>();

        for (int num : numbers) {
            if (duplicate.contains(num)) {
                System.out.println(true);
                return true;
            }
            duplicate.add(num);
        }
        System.out.println(false);
        return false;
    }
}
