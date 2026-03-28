package 练习.数组.平均求和统计04;

import java.util.Random;

/**
 * ClassName: qh
 * Package: 练习.课堂.数组.平均求和统计04
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3123:25
 * @Version1.0
 */

/*
生成10个随机数（1到100）存入数组
要求
1.求平均值
2.求和
3.统计多少个数小于平均值
 */
public class qh {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
        }
        //打印数组
        for(int i = 0; i < arr.length; i++){
            System.out.print("["+arr[i]+"]");
        }
        // 和
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        // 平均值
        double avg = sum / arr.length;
        // 统计小于平均值的个数
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println();
        System.out.println("数组数据和为："+sum);
        System.out.println("数组平均值为："+avg);
        System.out.println("数组小于平均值的个数为："+count);
    }
}
