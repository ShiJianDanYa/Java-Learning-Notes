package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: TableTennisCoach
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 11:19
 * @Version: v1.0
 *
 */
public class TableTennisCoach extends Coach implements LanguageSkill{
	//构造方法
	public TableTennisCoach() {}

	public TableTennisCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teaching() {
		System.out.println("乒乓球教练在教乒乓球");
	}

	@Override
	public void English() {
		System.out.println("乒乓球教练在说英语");
	}
	//行为
	public void playTableTennis() {
		System.out.println("姓名"+getName()+"年龄"+getAge());
		teaching();
		English();
	}
}
