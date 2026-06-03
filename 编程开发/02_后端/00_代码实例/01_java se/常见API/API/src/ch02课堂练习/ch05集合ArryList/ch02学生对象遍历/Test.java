package ch02课堂练习.ch05集合ArryList.ch02学生对象遍历;

import java.util.ArrayList;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch05集合ArryList.ch02学生对象遍历
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 16:57
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*需求：定义一个集合，添加一些学生对象
		学生类的属性为：id，姓名，年龄。
		要求:
		1.遍历集合，将所有学生的属性打印在控制台上，每个学生一行
		2.定义一个方法，根据id查找学生的信息。存在：返回索引
		不存在：返回-1*/

		//集合对象创建
		ArrayList<Student> list = new ArrayList<>();
		//ALT+鼠标左键竖着选中
		Student s1 = new Student("001","张三",18);
		Student s2 = new Student("002","李四",19);
		Student s3 = new Student("003","王五",20);
		Student s4 = new Student("004","赵六",21);
		//添加数据
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//打印数据
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
		}
		//调用方法
		int index = findStudentById(list,"002");
		System.out.println(index);
	}
	//定义一个方法，根据id查找学生的信息
	public static int findStudentById(ArrayList<Student> list,String id){
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			//判断id  判断equals--链式编程，多行代码写在一行（少定义几个变量）
			//链式编程核心点：利用前一个方法的结果，继续调用后面的方法
			if(s.getId().equals(id)){
				return i;
			}
		}
		//只有当循环结束了，才表示集合中所有的元素找完，如果还没有找到，表示要查找的id不存在的
		return -1;
	}
}
