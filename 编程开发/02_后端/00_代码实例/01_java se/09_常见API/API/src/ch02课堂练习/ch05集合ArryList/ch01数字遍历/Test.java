package ch02课堂练习.ch05集合ArryList.ch01数字遍历;

import java.util.ArrayList;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch05集合ArryList.ch01数字遍历
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 16:48
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*需求：定义一个集合，添加数字，并进行遍历。
		遍历格式参照：[元素1，元素2，元素3]。*/

		//定义集合
		ArrayList<Integer> list = new ArrayList<>();
		//添加数据
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.print("[");
		for (int i = 0; i < list.size()-1; i++) {
				System.out.print(list.get(i) + ",");
		}
		System.out.print(list.get(list.size()-1));
		System.out.print("]");
	}
}
