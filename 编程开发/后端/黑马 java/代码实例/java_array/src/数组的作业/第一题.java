package 数组的作业;

import java.util.Scanner;

/**
 * ClassName: 第一题
 * Package: 数组的作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/3 - 11:16
 * @Version: v1.0
 *
 */
public class 第一题 {
    /*给定一个 整数数组nums 和一个 整数目标值 target，
    请你在 该数组 中 找出 和 为 目标值target的那两个整数，并输出它们的数组索引。
    提示：先不用考虑效率问题，两层循环即可完成
    要求1：只要输出第一对满足要求的情况
    要求2：输出所有满足要求的情况*/
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入target的值");
        int target=scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]+arr[j]==target){
                    System.out.println("i="+arr[i]+"j="+arr[j]);
                    //break;
                    return;
                }
                //这个 break
                //导致内层循环每次都只执行一次就退出了
                //根本没有遍历所有的组合！
                //break;
            }
        }

    }
}
