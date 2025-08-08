package problems;

public class FindTheIndexOfTheFirstOccurance {
    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder(haystack);
        if (str.indexOf(needle) == -1) return -1;
        else return str.indexOf(needle);
    }
}
