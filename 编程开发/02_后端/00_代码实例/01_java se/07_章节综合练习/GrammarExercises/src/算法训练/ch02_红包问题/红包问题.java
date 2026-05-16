package 算法训练.ch02_红包问题;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: 红包问题
 * Package: 算法训练.红包问题
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/6 - 18:26
 * @Version: v1.0
 *
 */
public class 红包问题 {
    /*
    给你两个整数M和N，M表示红包的总额，N表示红包的个数
    现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
    */
    public static void main(String[] args) {
        int m,n;
        //用户输入指定的红包总额和红包个数
        System.out.println("请输入红包总额：");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.println("请输入红包个数：");
        n = sc.nextInt();
        //调用方法
        int[] arr =  print(m,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"个人抢到红包："+arr[i]);
        }
    }
    //随机红包方法
    public static int[] print(int m,int n){
        int[] arr = new int[n];
        //平均红包金额
        int avg = m/n;
        for (int i = 0; i < n; i++) {
            arr[i] = avg;
        }
        //开始打乱数据
        //随机数
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            //随机金额
            int index = random.nextInt(avg);
            //随机位置
            int temp = random.nextInt(n);
            arr[i] = arr[i] - index;
            arr[ temp] = arr[temp] + index;
        }
        return arr;
    }
}
