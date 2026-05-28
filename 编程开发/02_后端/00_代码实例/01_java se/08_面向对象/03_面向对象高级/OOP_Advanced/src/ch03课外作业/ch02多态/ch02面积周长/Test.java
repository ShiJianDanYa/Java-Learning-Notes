package ch03课外作业.ch02多态.ch02面积周长;

/**
 * ClassName: Test
 * Package: ch03课外作业.ch02多态.ch02面积周长
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:44
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建圆形对象
		diagram d1 = new round(6);
		//创建长长方形对象
		diagram d2 = new rectangle(6,8);
		//创建学生对象
		student s = new student("小明", 18);
		//调用方法
		s.useGraph(d1);
		s.useGraph(d2);
	}
}
