package ch02课堂练习.ch03_字符串成员方法.ch02遍历.ch02拼接字符串;

/**
 * ClassName: ArrayUtil
 * Package: ch02课堂练习.ch03字符串成员方法.ch02遍历.ch02拼接字符串
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 19:46
 * @Version: v1.0
 *
 */
public class ArrayUtil {
	//私有构造方法
	private ArrayUtil(){}
	//方法 数组变为字符串
	public static String toString(int[] arr){
		String str = "[";
		for (int i = 0; i < arr.length-1; i++) {
			str += arr[i]+",";
		}
		str += arr[arr.length-1]+"]";
		return str;
	}
}
