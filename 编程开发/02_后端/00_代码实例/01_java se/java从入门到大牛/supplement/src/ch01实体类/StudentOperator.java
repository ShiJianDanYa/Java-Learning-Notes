package ch01实体类;

/**
 * ClassName: StudentService
 * Package: ch01实体类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/12 - 15:19
 * @Version: v1.0
 *
 */
public class StudentOperator {
	//必须拿到要处理的学生对象
	//提供方法：打印学生对象的总成绩
	//定义学生对象的变量
	private  Student s;  //记录将来要操作的学生对象

	//如何获取 通过有参构造方法
	public StudentOperator(Student s) {
		this.s = s;
	}
	public void printScore() {
		System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
	}

	//提供方法：打印学生的平均成绩
	public void printAvgScore() {
		System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese() + s.getMath()) / 2);
	}
}
