package 数组的作业;

import java.util.Scanner;

/**
 * ClassName: 第三题
 * Package: 数组的作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/3 - 16:49
 * @Version: v1.0
 *
 */
public class 第三题 {
    /*
    给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引l。
    如果目标值不存在于数组中，打印应插入的位置举例1:
    数据： nums =[1,3,5,6];    target = 5
    输出：2

    举例2:
    数据: nums = [1,3,5,6], target = 2
    输出：1

    举例3:
    数据: nums = [1,3,5,6], target = 7
    输出：4

   分析开始 有两个要求
    1.找到目标值所在位置
    2.目标值不存在，返回插入位置
    */
    public static void main(String[] args){
        int[] arr={1,3,5,6};
        //定义变量记录位置
        int index=0;
        //记录是否存在
        boolean flag = false;

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入target的值");
        int target=scanner.nextInt();
        //开始循环位置
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                flag = true;
                index = i;
                System.out.println("i="+index);
            }
            if(target != arr[i] && target>arr[i])
            {
                index++;
            }
        }
        if(!flag){
            System.out.println("数据不存在 ,插入位置为："+index);
        }
    }

}








