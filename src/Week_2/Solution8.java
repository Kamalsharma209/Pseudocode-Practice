package Week_2;

public class Solution8 {
        public static void fun(int n) {
            if (n == 0) {
                return;
            }
            fun(n - 1);
            fun(n - 1);
        }

        public static void main(String[] args) {
            fun(3);
        }


}
//function fun(n)
// if n == 0
// return
// fun(n - 1)
// fun(n - 1)