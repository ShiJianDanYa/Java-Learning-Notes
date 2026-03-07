package 数组的课外练习;

import java.util.Random;

/**
 * ClassName: 打乱数组
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 22:16
 * @Version: v1.0
 *
 */
public class 打乱数组 {
    /*需求：已知数组元素为{1,2,3,4,5,6,7,8,9,10}
    要求：打乱数组中的数据

    细节1：
    如何交换两个位置上的数据
    细节2:
    如何获取一个随机的索引
    */
    public static void main(String[] args) {
        //数组静态输初始化
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //
        Random random = new Random();

        //遍历数组 随机交换
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    
    }
}
