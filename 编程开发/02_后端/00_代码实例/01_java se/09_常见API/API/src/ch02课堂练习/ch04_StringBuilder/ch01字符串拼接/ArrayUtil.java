package ch02课堂练习.ch04_StringBuilder.ch01字符串拼接;

/**
 * ClassName: ArrayUtil
 * Package: ch02课堂练习.ch04_StringBuilder.ch01字符串拼接
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 10:35
 * @Version: v1.0
 *
 */
public class ArrayUtil {
	//空参构造
	public ArrayUtil() {}
	//方法
	public static String toString(int[] arr) {
		//对象
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < arr.length-1; i++) {
			sb.append(arr[i]).append(",");
		}
		sb.append(arr[arr.length-1]).append("]");
		//转为字符串
		String str = sb.toString();
		return str;
	}
}
