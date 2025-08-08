import problems.FindTheIndexOfTheFirstOccurance;
import problems.RemoveDeuplicatesFromSortedArray;
import problems.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        SearchInsertPosition search = new SearchInsertPosition();
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        System.out.println(search.searchInsert(nums, 5));
    }
}