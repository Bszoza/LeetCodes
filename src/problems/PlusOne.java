package problems;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean addOne = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[i] == 9) {
                digits[i] = 0;
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                arr[1] = 0;
                if (digits.length > 1) {
                    for (int j = 1; j < digits.length; j++) {
                        arr[j + 1] = digits[j];
                    }
                }
                return arr;
            } else if (digits[i] == 9) {
                digits[i] = 0;
                addOne = true;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}
