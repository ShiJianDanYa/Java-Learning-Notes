package 专题综合练习.案例05评委打分;

import java.util.Random;

/**
 * ClassName: score
 * Package: 专题综合练习.案例05评委打分
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/411:06
 * @Version1.0
 */

/*
要求：在歌唱比赛中，有5名评委给选手打分，
分数范围是0-100，
选手最终得分为去掉最高分和最低分后，
其余4个分数的平均值。

 */
public class score {
    public static void main(String[] args) {
        //评委打分
        //平均分
        System.out.println(p());
    }
    public static int p() {
        int max=-1, min=999;
        int arr[] = new int[6];
        ergodic(arr);
        //求最大值
        max=getMax(arr);
        //求最小值
        min=getMin(arr);

        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        //平均分 =（总和 -（最高，最低））-4
        //最好不要写死，评委人数要改变，就需要修改代码
        int avg =(getAvg(arr)-(max+min))/(arr.length-2);
        return avg;
    }
    public static int getScore() {
        Random r = new Random();
        int sj = r.nextInt(101);
        return sj;
    }
    //方法6个评委打分
    public static void ergodic(int[] arr) {
        for(int i=0;i<=5;i++){
            arr[i] = getScore();
            System.out.println("第"+(i+1)+"个评委的分数为："+arr[i]);
        }
    }
    //求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //求最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    //求平均值
    public static int getAvg(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
