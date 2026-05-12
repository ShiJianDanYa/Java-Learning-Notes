package ch01_课堂代码.ch06_数组的常见问题;

/**
 * ClassName: 索引越界
 * Package: 数组的练习.数组常见问题
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 17:12
 * @Version: v1.0
 *
 */
public class 索引越界 {
    public static void main(String[] args) {
        /*
         * 数组常见问题
         * 数组索引越界
         *
         * 针对于任意一个数组而言，索引的范围：0~长度-1
         * */
        int[] arr = {1, 2, 3, 4, 5};

        // 修复：访问有效的数组元素，索引范围应该是0-4
        System.out.println(arr[5]); // 访问最后一个元素

        // 或者添加边界检查
        int index = 5;
        if (index >= 0 && index < arr.length) {
            System.out.println("安全访问: " + arr[index]);
        } else {
            System.out.println("索引 " + index + " 超出数组边界，数组长度为: " + arr.length);
        }

        // 正确遍历数组的方式
        System.out.println("正确遍历数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
