package ch01课堂代码.ch09函数式编程.ch02方法引用.ch03特定类方法引用;

import ch01课堂代码.ch09函数式编程.ch02方法引用.ch02实例方法引用.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch09函数式编程.ch02方法引用.ch03特定类方法引用
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/19 - 16:28
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：特定类型的方法引用。
		//需求：有一个字符串数组，里面有一些人的名字，请按照名字的首字母升序排序。
		String[] names = {"lisi", "zhangsan", "wangwu", "zhaoliu", "tianqi", "sunwu","Andy", "angela"};
		//对数组进行排序
		Arrays.sort(names); //默认就是按照首字母的编号升序排序。
		//要求：忽略首字母的大小进行升序排序（java官方默认是搞不定的，需要我们自己指定比较规则）
		/*Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);//java已经为我们提供了字符串按照首字母忽略大小写比较的方法：compareToIgnoreCase
			}
		});*/
		//超级简化  compareToIgnoreCase特定类型方法 字符串特定类型
		//并且前面参数列表中的第一个参数是作为方法的主调 o1是第一个参数
		// 而且还是方法的主调(是他调用的方法)
		//后面的所有参数都是作为该实例方法的入参 o2作为方法的入参
		//Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
		//特定类型方法引用：类型名称::方法名
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString( names));
	}
}
