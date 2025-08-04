package Week_2;

public class Solution5 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else{
            return n*(fact(n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
//function fact(n)
// if n == 0
// return 1
// return n * fact(n - 1)
//print(fact(4))