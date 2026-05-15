package ch02_课堂练习;

import java.util.Random;

/**
 * ClassName: 去除重复_2
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 19:37
 * @Version: v1.0
 *
 */
public class ch04_去除重复_2 {
    /*需求：先获取10个0-100之间的随机数并存入到数组当中，要求保证数据是唯一的*/
    public static void main(String[] args){
        //动态初始化
        int[] arr = new int[10];
        //随机数生成
        Random random = new Random();
        for (int i = 0; i < arr.length;) {
            int data = random.nextInt(101);
            // flag判断是否有重复数据
            boolean flag = true;
            //循环遍历 已有数据 是否与添加数据 重复
            //j<arr.length 对比的是数值中的所有元素 已经添加元素和默认值0
            //j<i          对比的是已经添加的元素,自然就不需要考虑默认值0的问题了
            for(int j = 0; j < i; j++)
            {
                if(arr[j] == data ){
                    flag = false;
                    break;
                }
            }
            //只有当没有重复时才会添加
            if(flag){
                arr[i] = data;
                //只有生成一个满足要求的随机数，索引才会自增
                i++;
            }
            System.out.println("随机的元素是"+data);
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
