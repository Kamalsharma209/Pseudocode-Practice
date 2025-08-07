package Week_2.Day_2;

public class Solution_44 {
    public static int call(int x) {
        return x + 2;
    }
    public static void main(String[] args) {
        int result = call(call(call(0)));
        System.out.println(result);
    }
}

// Answer = 6
