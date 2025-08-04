package Week_2;

public class    Solution4 {
    public static void fun(int x) {
        if (x == 0) {
            return;
        }
        fun(x - 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        fun(3);
    }
}

//function fun(x)
// if x == 0
// return
// fun(x - 1)
// print(x)
//fun(3)