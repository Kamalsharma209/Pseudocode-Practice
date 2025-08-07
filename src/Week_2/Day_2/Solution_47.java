package Week_2.Day_2;

public class Solution_47 {
    public static int f(int a) {
        return a + 1;
    }
    public static int g(int a) {
        return f(a) * 2;
    }
    public static void main(String[] args) {
        System.out.println(g(3));
    }
}

// Answer = 8
