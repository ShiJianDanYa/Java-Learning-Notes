package 练习.数组.数组求和01;

/**
 * ClassName: Sum_of_an_rray
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3120:03
 * @Version1.0
 */

/*
要求 遍历数组求和
课堂.数组 1，2，3，4，5
求和
 */
public class Sum_of_an_rray {
    public static void main(String[] args) {
        int num=0;
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        System.out.println("数组的和为"+num);
        System.out.println("程序结束");
    }
}
