package 练习.数组.变化数组02;

/**
 * ClassName: change
 * Package: 练习.课堂.数组.变化数组02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3120:12
 * @Version1.0
 */

/*
定义一个数组，初始值为{1,2,3,4,5,6,7,8,9,10}，
遍历数组的元素
要求：
1. 奇数扩大2倍
2. 偶数变为2分只1
 */
public class change {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("-----------------");
        //一个循环尽量只做一件事情
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("程序结束");
    }
}
