package 算法训练.数组去重;

import java.util.Scanner;

/**
 * ClassName: 数组去重
 * Package: 算法训练
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/5 - 19:05
 * @Version: v1.0
 *
 */
public class 数组去重 {
    /*
    给你一个数组nums和一个值val，你需要删除所有数值等于val的元素举例1:
    输入: nums = [3,2,2,3] val = 3
    输出：nums=[2,2] 剩余2个元素举例1:

    输入: nums = [0,1,2,2,3,0,4,2]
    val = 2输出：nums =[0,1,3,0,4] 剩余5个元素
    */
    public static void main (String[] args){
        //用户需要输入数组和指定元素
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n=sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数组元素：");
            while ( true){
                int num=sc.nextInt();
                //判断输入的数字是否合法
                if(num<=100 && num>=0){
                    nums[i]=num;
                    break;
                }else{
                    System.out.println("输入的数字有误，请重新输入：");
                }
            }
        }
        System.out.println("请输入需要删除的元素：");
        int val = sc.nextInt();
        //开始数据 去重
        nums = removeElement(nums,val);
        System.out.println("去重后的数组为：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }
    //定义方法 移除数组 中 的指定元素
    public static int[] removeElement(int[] nums, int val) {
        int[] newNums = new int[nums.length];
        int j = 0;
        //记录删除数据的数量
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                newNums[j] = nums[i];
                j++;
            }else {
                count++;
            }
        }
        nums = new int[nums.length-count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
        return nums;
    }
}
