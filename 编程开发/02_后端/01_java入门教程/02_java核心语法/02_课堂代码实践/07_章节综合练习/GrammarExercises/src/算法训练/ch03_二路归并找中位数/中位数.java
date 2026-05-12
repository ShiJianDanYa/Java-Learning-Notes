package 算法训练.ch03_二路归并找中位数;

/**
 * ClassName: 中位数
 * Package: 算法训练.ch03_二路归并找中位数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/1 - 17:50
 * @Version: v1.0
 *
 */
public class 中位数 {
	public static void main(String[] args){
		/*
		给定两个正序数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数。举例:
		1 2 3 4 5 6 7 8 9
		中位数：5
		1 2 3 4 5 6
		中位数：（3+4）/ 2
		*/
		//定义两个数组
		int[] arr1 = new int[] {1,3,5,7,9};
		int[] arr2 = {2,4,5,6};
		//合并方法
		int[] arr3 = merge(arr1,arr2);
		//打印数组
		traverseTheArray(arr3);
		//求中位数方法
		System.out.println("中位数="+findMedian(arr3));


	}

	private static double findMedian(int[] arr3) {
		int length = arr3.length;
		if(length%2==0){
			//数组索引和实际的索引关系为：索引和实际索引的差为1
			return (double)(arr3[length/2]+arr3[length/2-1])/2;
		}else {
			return (double)arr3[length/2];
		}
	}

	//合并有序数组
	public static int[] merge(int[] arr1,int[] arr2){
		//创建新数组,用来存储两个数组的数据
		int[] arr3 = new int[arr1.length+arr2.length];
		//创建三指针
		int pointer1 = 0,pointer2 = 0,pointer3 = 0;
		//循环遍历数组
		//while循环  是 循环条件为true就继续循环
		while(pointer1 < arr1.length || pointer2 < arr2.length){
			//if 如果范围有重复部分那就是范围大的写在前面,范围小的写在后面
			if(pointer1 >= arr1.length && pointer2< arr2.length) {
				arr3[pointer3++] = arr2[pointer2++];
			}else if (pointer2 >= arr2.length && pointer1< arr1.length) {
				arr3[pointer3++] = arr1[pointer1++];
			} else if (arr1[pointer1]>arr2[pointer2]){
				arr3[pointer3++] = arr2[pointer2++];
			} else if (arr1[pointer1]<arr2[pointer2]) {
				arr3[pointer3++]= arr1[pointer1++];
			} else if (arr1[pointer1]==arr2[pointer2]) {
				arr3[pointer3++]= arr1[pointer1++];
				pointer2++;
			}
		}
		//返回数组
		return arr3;
	}

	public static void traverseTheArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
