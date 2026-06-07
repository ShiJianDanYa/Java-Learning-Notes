package ch02课堂练习.ch05集合ArryList.ch02学生对象遍历;

/**
 * ClassName: Student
 * Package: ch02课堂练习.ch05集合ArryList.ch02学生对象遍历
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 16:58
 * @Version: v1.0
 *
 */
public class Student {
	/*学生类的属性为：id，姓名，年龄。*/
	private String id;
	private String name;
	private int age;

	public Student() {
	}

	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
