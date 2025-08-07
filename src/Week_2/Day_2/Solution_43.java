package Week_2.Day_2;

public class Solution_43 {
    public static int process(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        int x = 3;
        int y = process(process(x));
        System.out.println(y);
    }
}

// Answer = 12
