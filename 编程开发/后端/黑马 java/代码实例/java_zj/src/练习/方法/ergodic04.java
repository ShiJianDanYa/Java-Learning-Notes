package 练习.方法;

/**
 * ClassName: ergodic04
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/116:13
 * @Version1.0
 */

/*
要求设计一个方法，用于遍历数组
要求结果是在一行上的
 */
public class ergodic04 {
    public static void main(String[] args) {
        System.out.println("程序结束");
        int[] arr = {1,2,3,4,5};
        ergodic(arr);
    }
    public static void ergodic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i] + "] ");
        }
    }
}
