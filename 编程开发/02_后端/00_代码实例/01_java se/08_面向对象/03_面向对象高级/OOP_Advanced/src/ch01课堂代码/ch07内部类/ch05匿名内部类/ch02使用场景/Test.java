package ch01课堂代码.ch07内部类.ch05匿名内部类.ch02使用场景;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch05匿名内部类.ch02使用场景
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/18 - 19:41
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：完成给数组排序，理解其中匿名内部类的用法。
		//准备一个学生类型的数组，存放6个学生对象。
		Student[] students = new Student[6];
		students[0] = new Student("小王", 18, 171.5, '女');
		students[1] = new Student("小张", 19, 173.5, '男');
		students[2] = new Student("小李", 17, 170.5, '女');
		students[3] = new Student("小赵", 18, 172.5, '男');
		students[4] = new Student("小孙", 19, 174.5, '女');
		students[5] = new Student("小周", 17, 171.5, '男');

		//需求：按钮年龄升序排序。可以调用sun公司写好的API直接对数组进行排序。
		//public static void sort(T[] a, Comparator<T> c)
		//T[] a                     参数一：需要排序的数组
		//Comparator<T> c  参数二：需要给sort声明一个Comparator比较器对象（指定排序的规则）
		//sort方法会调用匿名内部类对象的compare方法，对数组中的学生对象进行两两比较，从而实现排序。
		Arrays.sort(students, new Comparator<Student>() {
						@Override
						public int compare(Student o1, Student o2) {
							//指定排序规则
							//如果你认为左边对象大于右边对象 那么返回正整数。
							//如果你认为左边对象小于右边对象那么返回负整数。
							//如果认为两边对象相等那么返回0
							return o1.getAge() - o2.getAge();  //按照年龄升序！
						}
		});
		//遍历输出学生对象信息
		for (int i = 0; i < students.length; i++) {
			System.out.println("[姓名¦"+students[i].getName()+"][年龄¦"+students[i].getAge()+"][身高¦"+students[i].getHeight()+"][性别¦"+students[i].getSex()+"]");
		}
	}
}
