package 数组的作业;

/**
 * ClassName: 第二题
 * Package: 数组的作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/3 - 15:10
 * @Version: v1.0
 *
 */
public class 第二题 {
    /*
    给你两个有序数组arr1和arr2
    将两个数组中的数据合并到一个大数组中。要求：合并之后的大数组也是有序的举例1:
    arr1:13579
    arr2:246810
    arr3:12345678910
    */
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = new int[arr1.length + arr2.length];
        //双指针 对比
        int i = 0, j =0, k = 0;
        //循环结束条件是什么
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
               arr3[k] = arr2[j];
               j++;
            }
            k++;
        }
        // 处理 arr1 中剩余的元素
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // 处理 arr2 中剩余的元素
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        //输出数组三
        System.out.println("\n合并后的数组长度为：" + arr3.length); // 应该是 10
        for (int q = 0; q < arr3.length; q++) {
            System.out.print(arr3[q] + " ");
        }
        }
    }

