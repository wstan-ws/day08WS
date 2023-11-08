import java.io.Console;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Console cons = System.console();
        String line = cons.readLine("> ");

        List<Integer> nums = Arrays.asList(line.replaceAll("\\s+", " ").split(" "))
            .stream()
            .map(w -> Integer.parseInt(w))
            .toList();
        
        BinaryTree bt = new BinaryTree(nums.get(0));
        for (int i = 0; i < nums.size(); i++) {
            bt.add(nums.get(i));
        }

        bt.traverseTreeWithRecursion();
    }
}