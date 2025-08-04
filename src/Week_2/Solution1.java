package Week_2;

public class Solution1 {
    public static void main(String[] args){
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
//function sum(n)
// if n == 1
// return 1
// return n + sum(n - 1)
//print(sum(5))