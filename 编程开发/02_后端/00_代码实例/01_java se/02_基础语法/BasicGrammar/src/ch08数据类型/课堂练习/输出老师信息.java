package ch08数据类型.课堂练习;

/**
 * ClassName: 输出老师信息
 * Package: ch08数据类型.课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/17 - 19:09
 * @Version: v1.0
 *
 */
public class 输出老师信息 {
	/*姓名：黑马谢广坤
	年龄：18
	性别：男
	身高：180.1
	是否单身：是*/
	static void main(String[] args) {
		String name = "黑马谢广坤";
		int age = 18;
		char sex = '男';
		double height = 180.1;
		boolean isSingle = true;
		System.out.println("----------------------------------------");
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+sex);
		System.out.println("身高："+height);
		System.out.println("是否单身："+isSingle);

	}
}
