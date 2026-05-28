package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 11:21
 * @Version: v1.0
 *
 */
public class Test {
	/*
	我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
	为了出国交流，跟乒乓球相关的人员都需要学习英语。
	请用所有知识分析，在这个案例中，哪些是具体类，哪些是抽象类，哪些是接口？

	乒乓球运动员：姓名，年龄，学打兵乓球，说英语
	篮球运动员：姓名，年龄，学打篮球
	乒乓球教练：姓名，年龄，教打乒乓球，说英语
	篮球教练：姓名，年龄，教打篮球
	*/
	public static void main(String[] args) {
		//创建对象
		//乒乓球运动员
		PingPongPlayer pp = new PingPongPlayer("张三",18);
		pp.playPingPong();
		//篮球运动员
		Hoopster bb = new Hoopster("李四",19);
		bb.playHoop();
		//乒乓球教练
		TableTennisCoach pc = new TableTennisCoach("王五",20);
		pc.playTableTennis();
		//篮球教练
		BasketballCoach bc = new BasketballCoach("赵六",21);
		bc.playHoop();
	}
}
