package ch02课堂练习.ch04_StringBuilder.ch05字符串计算;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch04_StringBuilder.ch05字符串计算
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 15:54
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*
		定义两个字符串，记录为非负整数，求它们的和。
		输入："12395"和“133”，输出："12528"
		注意：需要数据过大，超出int取值范围的情况
		*/
		//接收用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个字符串：");
		String str1,str2;
		//判断输入数据合法性
		while(true){
			System.out.println("请输入第一个字符串：");
			str1 = sc.next();
			System.out.println("请输入第二个字符串：");
			str2 = sc.next();
			//循环截取字符
			//定义变量 判断是否为数字
			boolean flag1 = true;
			boolean flag2 = true;
			//判断字符1是否为数字
			for(int i = 0;i < str1.length();i++){
				char c = str1.charAt(i);
				if(c < '0' || c > '9'){
					System.out.println("字符一,输入数据不合法！");
					flag1 = false;
					break;
				}
			}
			//判断字符2是否为数字
			for(int i = 0;i < str2.length();i++){
				char c = str2.charAt(i);
				if(c < '0' || c > '9'){
					System.out.println("字符二,输入数据不合法！");
					flag2 = false;
					break;
				}
			}
			//数据合法,跳出循环
			if(flag1 && flag2){
				break;
			}
		}

		//打印字符
		System.out.println("字符一：" + str1);
		System.out.println("字符二：" + str2);
		//求最大值
		int max = str1.length() > str2.length() ? str1.length() : str2.length();
		//转换为int数组
		int[] arr1 = copyData(str1, max);
		int[] arr2 = copyData(str2, max);
		//构建第三个数组 计算结果 长度为最大数组+1
		int[] arr3 = new int[max+1];
		//定义变量表示进位
		int num = 0;
		//核心：遍历数组，从个位（最大索引）位置开始计算
		//arr1[i] + arr2[2] + 进位 = 结果
		//结果的个位   sum数组当中
		//结果的十位   进位num
		for (int i = max-1; i >= 0; i--) {
			//arr1[i] + arr2[2] + 进位 = 结果
			int temp = arr1[i] + arr2[i] + num;
			//结果的个位---sum数组当中
			//arr3的长度是max+1
			//所以接收的位置是i+1 才对
			//栗子
			//arr1 = 123  3位
			//arr2 = 321  3位
			//arr3是4位
			//如果是i 那就是i=3 arr3[3]
			//4 就被浪费了
			arr3[i+1] = temp % 10;
			//进位
			num = temp / 10;
		}
		//最终结果
		arr3[0] = num;
		//转为字符串
		StringBuffer sb = new StringBuffer();
		//判断0索引中是否有数字
		if(arr3[0] != 0){
			sb.append(arr3[0]);
		}
		for (int i = 1; i < arr3.length; i++) {
			sb.append(arr3[i]);
		}
		System.out.println(sb.toString());

	}

	//把字符串中的数据，放入到int类型的数组当中
	public static int[] copyData(String str, int len){
		//定义数组长度为 len
		int[] arr = new int[len];
		//char 变为数字就是 数字减去 '0' 就是48
		//比如 ascii 码 '1' = 49  '0' = 48
		// 49 - 48  = 1
		//为什么是这种 int length = str.length()
		//而不是 int i = 0
		//以 133 为例子 假设数组最长为5
		//int i = 0,是从左边开始  结果为13300

		//定义数组长度
		int index = arr.length-1;
		//从右边开始
		for (int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			int num = c - '0';
			arr[index] = num;
			index--;
		}
		return arr;
	}

}
