package 算法训练.ch03_二路归并找中位数;

/**
 * ClassName: 中位数_标准解法
 * Package: 算法训练.ch03_二路归并找中位数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/4 - 15:30
 * @Version: v1.0
 *
 */
public class 中位数_标准解法 {
	public static void main(String[] args){
		/*
		给定两个正序数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数。举例:
		1 2 3 4 5 6 7 8 9
		中位数：5
		1 2 3 4 5 6
		中位数：（3+4）/ 2
		*/
		//首先定义两个数组
		int[] arr1 = new int[] {1,3,5,7,9};
		int[] arr2 = {2,4,6};
		//合并方法
		int[] arr3 = merge(arr1,arr2);
		//打印数组
		traverseTheArray(arr3);
		//求中位数方法
		System.out.println("中位数="+findMedian(arr3));

	}
	//定义方法遍历数组
	public static void traverseTheArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//定义方法合并数组
	public static int[] merge(int[] arr1,int[] arr2){
		//变量存储数组的长度
		int length1 = arr1.length,length2 = arr2.length,length = length1+length2;
		int[] arr3 = new int[length];
		//定义指针
		int index1 = 0,index2 = 0;
		for (int i = 0; i < length; i++) {
			//如果数组1已经遍历完
			if(index1==length1){
				arr3[i] = arr2[index2];
				index2++;
				continue;
			}
			//如果数组2已经遍历完
			if(index2==length2){
				arr3[i] = arr1[index1];
				index1++;
				continue;
			}
			//判断数组1和数组2的元素大小
			if(arr1[index1]<arr2[index2]){
				//数组1的元素小
				arr3[i] = arr1[index1];
				index1++;
			}else{
				//数组2的元素小
				arr3[i] = arr2[index2];
				index2++;
			}
		}
		//返回数组
		return arr3;
	}
	//定义方法求中位数
	public static double findMedian(int[] arr3) {
		int length = arr3.length;
		if(length%2==0){
			//数组索引和实际的索引关系为：索引和实际索引的差为1
			return (arr3[length/2]+arr3[length/2-1])/2.0;
		}else {
			return arr3[length/2]/1.0;
		}
	}
}
