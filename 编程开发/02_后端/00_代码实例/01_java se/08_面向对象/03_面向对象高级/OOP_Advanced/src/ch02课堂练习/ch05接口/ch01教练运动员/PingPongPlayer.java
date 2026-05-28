package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: PingPongPlayer
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 11:03
 * @Version: v1.0
 *
 */
public class PingPongPlayer extends Athletes implements LanguageSkill {
	//构造方法
	public PingPongPlayer() {}

	public PingPongPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员在学习乒乓球");
	}

	@Override
	public void English() {
		System.out.println("乒乓球运动员在学习英语");
	}
	//行为
	public void playPingPong() {
		System.out.println("姓名"+getName()+"年龄"+getAge());
		study();
		English();
	}
}
