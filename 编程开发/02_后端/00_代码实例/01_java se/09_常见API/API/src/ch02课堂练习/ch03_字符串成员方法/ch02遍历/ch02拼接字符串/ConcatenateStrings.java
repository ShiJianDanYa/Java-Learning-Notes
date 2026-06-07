package ch02课堂练习.ch03_字符串成员方法.ch02遍历.ch02拼接字符串;

/**
 * ClassName: ConcatenateStrings
 * Package: ch02课堂练习.ch03字符串成员方法.ch02遍历.ch02拼接字符串
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 19:31
 * @Version: v1.0
 *
 */
public class ConcatenateStrings {
	/*
	定义一个方法，把int 数组中的数据按照指定的格式拼接成一个字符串返回，
	调用该方法，并在控制台输出结果。
	例如:
		数组为int[] arr = {1,2,3};
		执行方法后的输出结果为：[1，2，3]
	*/
	static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		//调用方法
		String s = ArrayUtil.toString(arr);
		System.out.println(s);
	}
}
