import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> output = new ArrayList<>();
        for (int number : intList) {
            if (number <= 0) {
                continue;
            } else if (number % 2 != 0) {
                continue;
            } else {
                output.add(number);
            }
        }
        Collections.sort(output);
        System.out.print(output);
    }
}
