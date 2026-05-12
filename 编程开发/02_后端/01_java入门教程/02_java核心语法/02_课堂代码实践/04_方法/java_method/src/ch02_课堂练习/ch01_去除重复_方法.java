package ch02_课堂练习;

import java.util.Random;

/**
 * ClassName: 去除重复_方法
 * Package: 课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 10:45
 * @Version: v1.0
 *
 */
public class ch01_去除重复_方法 {
    public static void main(String[] args) {
        //动态初始化
        int[] arr = new int[10];
        //随机数
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            //随机数生成
            int data = random.nextInt(10) + 1;
            // flag判断是否有重复数据
            //只有当没有重复时才会添加
            if (removeRepeat(data,arr,i)) {
                arr[i] = data;
                //只有生成一个满足要求的随机数，索引才会自增
                i++;
            }
        }
        //打印遍历数组
        traversethearray(arr);
    }
    //去除重复代码
    public static boolean removeRepeat(int num,int[] newArr,int size){
            //循环遍历 已有数据 是否与添加数据 重复
            for(int j = 0; j <size; j++)
            {
                if(newArr[j] == num){
                    return false;
                }
            }
        return true;
    }
    //遍历数组算法
    public static void traversethearray(int[] arr){
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
