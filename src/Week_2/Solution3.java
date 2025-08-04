package Week_2;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(f(6));
    }

    public static int f(int n) {
        if (n == 0)
            return 0;
        else {
            return n + f(n - 2);
        }
    }
}
//function f(n)
// if n == 0
// return 0
// else
// return n + f(n - 2)
//print(f(6))