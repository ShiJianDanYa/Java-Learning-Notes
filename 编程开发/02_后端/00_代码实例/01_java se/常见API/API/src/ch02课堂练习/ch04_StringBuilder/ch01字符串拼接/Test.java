package ch02课堂练习.ch04_StringBuilder.ch01字符串拼接;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch04_StringBuilder.ch01字符串拼接
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 10:27
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回，
		调用该方法，并在控制台输出结果。
		例如:
		数组为int[] arr = {1，2,3};
		执行方法后的输出结果为：[1，2，3]*/
		//定义数组
		int[] arr = {1,2,3};
		//调用方法
		String s = ArrayUtil.toString(arr);
		System.out.println(s);
	}
}
