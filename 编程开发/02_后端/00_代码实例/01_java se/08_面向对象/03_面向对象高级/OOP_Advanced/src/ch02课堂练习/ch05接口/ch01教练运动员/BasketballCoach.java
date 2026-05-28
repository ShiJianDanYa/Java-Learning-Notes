package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: BasketballCoach
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 10:57
 * @Version: v1.0
 *
 */
public class BasketballCoach extends Coach{
	//构造方法
	public BasketballCoach() {}

	public BasketballCoach(String name, int age) {
		super(name, age);
	}

	//行为
    public void playHoop() {
		System.out.println("姓名"+getName()+"年龄"+getAge());
	    teaching();
	}

	@Override
	public void teaching() {
		System.out.println("篮球教练在教打篮球");
	}
}
