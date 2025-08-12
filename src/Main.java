import problems.PlusOne;


public class Main {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = new int[1];
        digits[0] = 9;
        digits = plusOne.plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
}