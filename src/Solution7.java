public class Solution7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}

//um = 0
//for i from 1 to 3:
//    for j from 1 to i:
//        sum = sum + j
//    end for
//end for
//Print sum
//```
//**Options:**
//- a) 6
//- b) 10
//- c) 12
//- d) 9
//
//**Answer:** b