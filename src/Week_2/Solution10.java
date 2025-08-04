package Week_2;

public class Solution10 {
    public static void main(String[] args) {
    }
    public int reversePrint(int n){
        if(n ==0){
            return 0;
        }
        System.out.println(n);
        reversePrint(n-1);
        return reversePrint(3);
    }
}
//unction reversePrint(n)
// if n == 0
// return
// print(n)
// reversePrint(n - 1)
//reversePrint(3)
