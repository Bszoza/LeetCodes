package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTree {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            result.add(new ArrayList<>());
            result.get(i).add(1);
            for (int j = 1; j < i-1; j++) {

            }result.get(i).add(1);
        }
        return result;
    }
}
