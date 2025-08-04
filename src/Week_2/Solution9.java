package Week_2;

public class Solution9 {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int n){
        if(n ==0 ){
            return 0;
        } else{
            return (n%10)+sumDigits(n/10);
        }
    }
}
//function sumDigits(n)
// if n == 0
// return 0
// return (n mod 10) + sumDigits(n div 10)
//print(sumDigits(1234))