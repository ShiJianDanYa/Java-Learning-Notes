package 练习.数组.打乱数组06;

import java.util.Random;

/**
 * ClassName: disorganize
 * Package: 练习.课堂.数组.打乱数组06
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/108:43
 * @Version1.0
 */

/*
定义一个数组，要求打乱数组中的元素，并输出。
课堂.数组 {1，2，3，4，5}
 */
public class disorganize {
    public static void main(String[] args) {
        //思路 利用随机数 随机生成一个下标，
        //循环遍历数组，将该下标对应的元素与数组中的元素交换
        // 最后完全打乱
        int[] arr = {1,2,3,4,5};
        //遍历数组
        for(int i = 0; i < arr.length; i++){
            System.out.println("["+arr[i]+"]");
        }
        for(int i = 0; i < arr.length; i++){
            Random random = new Random();
            int index = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("打乱后的数组");
        //打印数组
        for(int i = 0; i < arr.length; i++){
            System.out.println("["+arr[i]+"]");
        }
        System.out.println("程序结束");
    }
}
