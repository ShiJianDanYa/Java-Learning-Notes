package ch01实体类;

/**
 * ClassName: Student
 * Package: ch01实体类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/12 - 13:33
 * @Version: v1.0
 *
 */
public class Student {
	//私有成员变量
	private String name;
	private double chinese; //语文成绩
	private double math;     //数学成绩
	//提供一个无参(必须) 还有 一个有参(可选) 构造方法
	public Student() {
	}

	public Student(String name, double chinese, double math) {
		this.name = name;
		this.chinese = chinese;
		this.math = math;
	}
	//提供公开的get/set方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}
}
