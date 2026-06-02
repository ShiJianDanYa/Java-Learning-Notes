package ch01课堂代码.ch03_字符串成员方法.ch01比较;

import java.util.Scanner;

/**
 * ClassName: Compare
 * Package: ch01课堂代码.ch03字符串成员方法.ch01比较
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 10:52
 * @Version: v1.0
 *
 */
public class Compare {
	/*boolean equals方法(要比较的字符串）
	  完全一样结果才是true，否则为false
	  boolean equalsIgnoreCase(要比较的字符串）
	  忽略大小写的比较
		练习：
			已知正确的用户名和密码，请用程序实现模拟用户登录
			总共给三次机会，登录之后，给出相应的提示*/
	static void main(String[] args) {
		//用户名
		String name = "lisi";
		//密码
		String pwd = "123";
		//登录次数
		int count = 3;
		//接收用户输入
		Scanner sc = new Scanner(System.in);
		/*do{
			if(count == 0){
				System.out.println("登录失败！");
				break;
			}
			System.out.println("您还有" + count + "次机会！");
			System.out.println("请输入用户名：");
			String name2 = sc.next();
			System.out.println("请输入密码：");
			String pwd2 = sc.next();
			if(name2.equals( name)&& pwd2.equals(pwd) ){
				System.out.println("登录成功！");
				break;
			}else if(name2.equals( name) && !(pwd2.equals(pwd))){
				System.out.println("密码错误！");
			} else if (!(name2.equals( name)) && pwd2.equals(pwd)) {
				System.out.println("用户名错误！");
			}else {
				System.out.println("用户名密码都错误！");
			}
			count--;
		}while (true);*/
		//其实用do...while,并不合适
		//因为次数已经确定了3次,所以for显然更合适
		for(int i = 0; i < 3; i++){
			System.out.println("您还有" + (3-i) + "次机会！");
			//次数判断 直接和for结合
			//接收用户输入
			System.out.println("请输入用户名：");
			String name2 = sc.next();
			System.out.println("请输入密码：");
			String pwd2 = sc.next();
			//布尔 变量 接收
			boolean flag = name2.equals( name) && pwd2.equals(pwd);
			//如果对布尔类型的变量进行判断的时候，不建议写==
			//建议：如果对布尔类型的变量进行判断，建议直接把变量写在小括号当中
			//表示：判断变量里面记录的值是真还是假，如果是真执行if，如果是假执行else
			if(flag){
				System.out.println("登录成功！");
				break;
			}else {
				System.out.println("用户名密码都错误！");
			}
			//判断位置和do...while不一样
			if(i == 2){
				System.out.println("登录失败！账号"+name+"被锁定，请联系黑马程序员客服e1012345678");
			}
		}
	}
}
