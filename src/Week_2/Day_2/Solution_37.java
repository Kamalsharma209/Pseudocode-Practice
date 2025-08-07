package Week_2.Day_2;

public class Solution_37 {
    public static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        int res = square(square(2));
        System.out.println(res);
    }
}

// Answer = 16
