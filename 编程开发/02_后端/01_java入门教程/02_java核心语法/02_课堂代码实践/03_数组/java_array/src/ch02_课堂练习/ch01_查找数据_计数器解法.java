package ch02_课堂练习;

import java.util.Scanner;

/**
 * ClassName: ch01_查找数据_计数器解法
 * Package: ch02_课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/28 - 08:40
 * @Version: v1.0
 *
 */
public class ch01_查找数据_计数器解法 {
	public static void main(String[] args){
		//创建数组
		int[] arr = {33,5,22,44,55,33};
		//接收用户输入
		System.out.println("请输入查找数据");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		//计数器 用来记录数据出现的次数
		int count = 0;
		//开始判断
		//循环遍历对比数组元素
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value){
				System.out.println("数据在数组中的索引是：" + i);
				count++;
				//结束循环
				break;
			}
		}
		//判断是否在数组中
		if(count == 0){
			System.out.println("数据不存在");
		}

	}
}
