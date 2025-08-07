package Week_2.Day_2;

public class Solution_38 {
    public static int foo(int x) {
        if (x == 0) return 1;
        return x * foo(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(foo(4));
    }
}

// Answer = 24
