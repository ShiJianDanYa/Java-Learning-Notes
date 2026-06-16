package ch01实体类;

/**
 * ClassName: Test
 * Package: ch01实体类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/12 - 13:33
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：搞清楚实体类是啥？搞清楚其基本作用和应用场景。
		//实体类的基本作用：创建它的对象，存取数据（封装数据）
		Student s = new Student();
		s.setName("张三");
		s.setChinese(90);
		s.setMath(80);
		System.out.println(s.getName() + "的语文成绩是：" + s.getChinese());
		System.out.println(s.getName() + "的数学成绩是：" + s.getMath());
		System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
		System.out.println("----------------------------------------------------------------");
		Student s1 = new Student("李四", 95, 75);
		System.out.println(s1.getName() + "的语文成绩是：" + s1.getChinese());
		System.out.println(s1.getName() + "的数学成绩是：" + s1.getMath());
		System.out.println(s1.getName() + "的总成绩是：" + (s1.getChinese() + s1.getMath()));
		//实体类在开发中的应用场景。
		//实体类的对象只负责数据存取，
		// 而对数据的业务处理交给其他类的对象来完成，
		// 以实现数据和数据业务处理相分离。
		//创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
		StudentOperator so = new StudentOperator(s);
		so.printScore();
		so.printAvgScore();
	}
}
