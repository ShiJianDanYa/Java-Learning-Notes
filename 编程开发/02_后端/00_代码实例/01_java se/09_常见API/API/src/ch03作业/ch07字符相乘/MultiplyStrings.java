package ch03作业.ch07字符相乘;

import java.util.Scanner;

/**
 * ClassName: MultiplyStrings
 * Package: ch03作业.ch07字符相乘
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 14:06
 * @Version: v1.0
 *
 */
public class MultiplyStrings {
	/*键盘输入两个字符串表示的非负整数，求它们的乘积。
	注意：需要考虑键盘录入的数据过大，超出int取值范围的*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入第一个非负整数字符串: ");
		String num1 = scanner.next();

		System.out.print("请输入第二个非负整数字符串: ");
		String num2 = scanner.next();

		String result = multiply(num1, num2);
		System.out.println("它们的乘积为: " + result);

		scanner.close();
	}

	/**
	 * 计算两个字符串表示的非负整数的乘积
	 * @param num1 第一个数字字符串
	 * @param num2 第二个数字字符串
	 * @return 乘积的字符串表示
	 */
	public static String multiply(String num1, String num2) {
		// 边界情况：如果任意一个数为 "0"，乘积直接为 "0"
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		//例子 123 * 123

		int m = num1.length();  //3
		int n = num2.length();  //3

		// 两个长度分别为 m 和 n 的数相乘，结果的最大长度为 m + n
		int[] res = new int[m + n];   //长度为6 是从 0 到 5

		// 从右向左遍历两个字符串（即从个位开始相乘）
		for (int i = m - 1; i >= 0; i--) {  //2
			int n1 = num1.charAt(i) - '0'; // 获取当前位的数字
			for (int j = n - 1; j >= 0; j--) {  //2
				int n2 = num2.charAt(j) - '0'; // 获取当前位的数字

				// 乘积加上之前该位置可能已经存在的值（进位）
				int sum = n1 * n2 + res[i + j + 1];

				// 当前位保留个位数
				res[i + j + 1] = sum % 10; //2+2+1=5
				// 进位加到前一位
				res[i + j] += sum / 10;   //2+2=4
			}
		}

		// 将结果数组转换为字符串，并跳过可能的前导零
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < res.length; i++) {
			// 如果最高位是 0，则跳过
			// （因为前面已经排除了 "0" 的情况，所以最多只有一个前导零）
			// 3位数 * 3位数
			//最大 999*999 = 998001  6位
			//最小 100*100 = 10000   5位
			//也就是 最大 是 m+n 6  最小是m+n-1  5
			//而此时 去掉前面 两个数中有一个是 0 的情况
			//所以 只有最高位才有可能 是 0 这一种情况
			if (i == 0 && res[i] == 0) {
				continue;
			}
			sb.append(res[i]);
		}
		return sb.toString();
	}
}
