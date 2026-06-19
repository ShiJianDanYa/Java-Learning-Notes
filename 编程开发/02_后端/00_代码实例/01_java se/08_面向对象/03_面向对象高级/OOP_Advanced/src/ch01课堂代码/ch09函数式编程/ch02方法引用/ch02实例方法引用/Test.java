package ch01课堂代码.ch09函数式编程.ch02方法引用.ch02实例方法引用;

import java.util.Arrays;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch09函数式编程.ch02方法引用.ch02实例方法引用
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/19 - 15:54
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：实例方法引用：演示一个场景。
		test();

	}
	public static void test() {
		Student[] students = new Student[6];
		students[0] = new Student("段素素", 35, 171.5, '女');
		students[1] = new Student("杨幂", 28, 168.5, '女');
		students[2] = new Student("张无忌", 25, 181.5, '男');
		students[3] = new Student("小昭", 19, 165.5, '女');
		students[4] = new Student("赵敏", 27, 167.5, '女');
		students[5] = new Student("刘亦菲", 36, 168, '女');

		//身高升序排序
		Student t = new Student();
		//Arrays.sort(students, (o1,o2)->t.compareByHeight (o1,o2);
		//实例方法引用：对象名：：实例方法
		//前提：->前后参数的形式一致，才可以使用实例法引
		Arrays.sort(students, t::compareByHeight);

		// 遍历数组中的学生对象并输出
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			System.out.println(s);
		}
	}
}
