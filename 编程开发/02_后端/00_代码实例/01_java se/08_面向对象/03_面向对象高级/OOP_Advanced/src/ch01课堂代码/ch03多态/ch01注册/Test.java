package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:34
 * @Version: v1.0
 *
 */
public class Test {
	/*学生类：
		属性：姓名，账号，密码
		行为：work：学生的工作是学习
	老师类:
		属性：姓名，账号，密码
		行为：work：老师的工作是教书
	管理员：
		属性：姓名，账号，密码
		行为：work：管理员的工作是管理网站
	学生管理系统：
		行为：注册register
		要求：能注册所有的角色
		输出：姓名为张三的同学注册成功，账号zhangsan，密码123456
	*/
	public static void main(String[] args) {
		//创建一个学生对象
		Student sd = new Student("张三","hangman",123456);
		//创建学生管理系统的对象
		StudentManger sm = new StudentManger();
		//调用注册方法
		sm.register(sd);
		//创建老师对象
		Teacher tc = new Teacher("李四","lisi",123);
		sm.register(tc);
	}
}
