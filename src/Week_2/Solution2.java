package Week_2;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(mystery(3,4));
    }
    public static int mystery(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a+mystery(a,b-1);
        }
    }
}
//function mystery(a, b)
// if b == 0
// return 0
// return a + mystery(a, b - 1)
//print(mystery(3, 4))