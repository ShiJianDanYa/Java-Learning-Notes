package ch03_课外作业;

import java.util.Scanner;

/**
 * ClassName: 评委评分
 * Package: 课外作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 15:59
 * @Version: v1.0
 *
 */
public class ch01_评委打分 {
    /*
    跳水比赛有五个评委打分，分数在0~100之间。
    最终得分会去掉一个最高分，去掉一个最低分，
    剩余的分数再求平均数，改平均数为选手最终得分。

    要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入要求2：定义方法分别求数组的最大值和最小值
    要求3：计算五名评委的总分
    要求4：总分－最大值－最小值，求选手最终平均分
    */
    public static void main(String[] args){
        //动态初始化数组
        int[] arr = new int[5];
        //用户输入评分
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length;++i) {
            System.out.println("请输入第"+(i+1)+"个评委的打分：");
            //判断 用户输入数据合法性
            /*if(score>=0 && score<=100){
                arr[i] = score;
                ++i;
            }else {
                System.out.println("输入数据不合法，请重新输入！合法范围是0~100之间");
            }*/
            //判断输入是否合法
            while(true){
                int score = sc.nextInt();
                if(score>=0 && score<=100) {
                    arr[i] = score;
                    break;
                }else {
                    System.out.println("输入数据不合法，请重新输入！合法范围是0~100之间");
                }
            }
        }
        //总分方法
        int sum = sum(arr);
        System.out.println("总分是："+sum);
        //最大 最小 值方法
        System.out.println("最大值是："+max(arr));
        System.out.println("最小值是："+min(arr));
        //最终平均分
        System.out.println("最终平均分是："+avg(arr));
    }

    //总分方法
    public static int sum(int[] arr){
        //记录总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
      return sum;
    }
    //最值方法
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    //平均数
    public static double avg(int[] arr){
        int sum = sum(arr);
        return (double) (sum - (max(arr) + min(arr))) /(arr.length-2);
    }
    }
