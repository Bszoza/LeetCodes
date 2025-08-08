package problems;

import java.util.*;

public class RemoveDeuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        LinkedHashSet <Integer> set = new LinkedHashSet<>(list);
        Integer [] nums2 = new Integer[set.size()];
        set.toArray(nums2);
        for(int i=0;i<nums2.length;i++){
            nums[i]=nums2[i];
        }
        return set.size();
    }
}
