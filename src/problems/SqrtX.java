package problems;

public class SqrtX {
    public int mySqrt(int x) {
        int counter = 0;
        int oddNumb = 1;
        int xMinus=x;
        while (xMinus > 0) {
            xMinus -= oddNumb;
            oddNumb += 2;
            counter++;
        }
        if(counter*counter != x){
            return counter-1;
        }
        return counter;
    }
}
