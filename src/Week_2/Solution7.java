package Week_2;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }
    public static int fun(int n){
        if (n <= 1) {
            return n;
        }else{
            return fun(n-1)+fun(n-3);
        }
    }
}
//function fun(n)
// if n <= 1
// return n
// return fun(n - 1) + fun(n - 3)
//print(fun(5))