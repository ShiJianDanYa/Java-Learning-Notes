package 课外作业;

import java.util.Scanner;

/**
 * ClassName: 计算班级分数
 * Package: 课外作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 16:41
 * @Version: v1.0
 *
 */
public class 计算班级分数 {
    /*
    班主任需要统计10名学生的数学成绩（0-100分），计算及格率，平均分，并找出最高分。

    要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
    要求2：定义方法，求及格人数，根据及格人数，求及格率。
    要求3：定义方法求总分，根据总分求平均分
    要求4：定义方法求最大值。
    */
    public static void main(String[] args) {
        int[] arr = new int[5];
        //判断输入是否合法
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            while( true){
                int score = sc.nextInt();
                if(score >= 0 && score <= 100){
                    arr[i] = score;
                    break;
                }else{
                    System.out.println("输入数据不合法，请重新输入！");
                }
                }
            }
         //求及格人数  大于75
        int count = getCount(arr);
        System.out.println("及格人数为："+count);
        //利用*隐式转化 自动为 double
        System.out.println("及格率："+count*1.0/arr.length);
        System.out.println("总分："+getSum(arr));
        System.out.println("平均分："+(getSum(arr)/arr.length)*1.0);
        System.out.println("最大值："+getMax(arr));

        }

    //方法求及格人数
    public static int getCount(int[] arr){
        //记录及格 人数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=75){
                count++;
            }
        }
        return count;
    }
        //总分方法
    public static int getSum(int[] arr){
        //变量 存储总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //最大值方法
    public static int getMax(int[] arr){
        //存储最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    }


