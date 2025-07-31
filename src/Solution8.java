public class Solution8 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            if(i==3) {
                continue;
            }
                System.out.println(i);
        }
    }
}

//### Question 8
//```
//for i from 1 to 5:
//    if i == 3 then
//        ____
//    end if
//    Print i
//end for
//
//Output: 1 2 4 5
//```
//**Options:**
//- a) break
//- b) continue
//- c) exit loop
//- d) skip loop
//
//**Answer:** b