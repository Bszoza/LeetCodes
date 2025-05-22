public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = twoSum.twoSum(new int[]{2,7,11,15}, 9);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}