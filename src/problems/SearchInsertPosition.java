package problems;

import java.lang.module.FindException;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length - 1, target);
    }

    public static int BinarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return left;
        }
        int midIndex = left + (right - left) / 2;
        int midValue = nums[midIndex];
        if (midValue == target) {
            return midIndex;
        } else if (midValue > target) {
            return BinarySearch(nums, left, midIndex - 1, target);
        } else {
            return BinarySearch(nums, midIndex + 1, right, target);
        }

    }
}
