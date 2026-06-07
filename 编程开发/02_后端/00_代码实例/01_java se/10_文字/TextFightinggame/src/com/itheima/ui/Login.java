package com.itheima.ui;

import com.itheima.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

/**
 * ClassName: Login
 * Package: com.itheima.ui
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/5 - 10:53
 * @Version: v1.0
 *
 */
public class Login {
	// 这个方法表示的就是登录注册的主页面（是以控制台的形式进行展示的）
	public void start() {
		//创建集合
		ArrayList<User> list = new ArrayList<>();
		System.out.println("欢迎来到游戏");
		Scanner sc = new Scanner(System.in);
		//ctrl+alt+T，选择对应语句包裹代码
		while (true) {
			System.out.println("╔════════════════════════════════╗");
			System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
			System.out.println("╚════════════════════════════════╝");
			System.out.println("请选择操作：1登录 2注册 3退出");
			//接收用户输入

			String choice = sc.next();
			//选择判断
			switch (choice) {
				//直接调用下面的登录方法
				case "1" -> login(list);
				//直接调用下面的注册方法
				case "2" -> register(list);
				case "3" -> {
					//退出游戏
					System.out.println("感谢您的使用，欢迎下次再来");
					//System类是和系统相关的
					//通过类名直接调用,是一个静态方法
					// 0 正常停止 非 0 异常终止
					System.exit(0);
				}
				default -> System.out.println("输入有误，请重新输入");
			}
		}


	}


	//登录操作
	public void login(ArrayList<User> list) {
		System.out.println("登录操作");


	}
	//作用：判断用户名在集合当中是否包含
	public boolean contains(ArrayList<User> List,String username){
		for (int i = 0; i < List.size(); i++) {
			User u = List.get(i);
			if(u.getUsername().equals(username)){
				return  true;
			}
		}
		return false;
	}

	//注册操作
	public void register(ArrayList<User> list) {
		System.out.println("注册操作");
		//创建用户对象
		User user = new User();
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);
		//校验数据合法性
		//开发细节：
		//1. 在验证数据的时候，先验证格式是否正确，再验证是否唯一
		//2. 先判断异常的数据，剩下来的都是正确的数据(好处；避免if的嵌套)

		//ctrl + alt + T 选择语句体包裹代码
		//检测用户名输入是否合法
		while (true) {
			//开始接收用户输入
			System.out.println("请输入用户名：");
			String username = sc.next();
			//题目要求
			//1.用户名唯一
			//2.长度必须在3~16位
			//3.只能由字母、数字组成，不能是纯数字

			//要求一
			// 先判断长度 长度必须在3~16位
			//注意 不满足的会返回false 取反 是true
			if (!checkLen(3, 16, username)) {
				System.out.println("用户名长度必须在3~16位");
				continue;
			}
			// 要求二
			// 内容 校验
			//2.只能由字母、数字组成，不能是纯数字
			if (!checkUsername(username)) {
				System.out.println("用户名只能由字母、数字组成，不能是纯数字");
				continue;
			}
			//要求三
			//用户名是否唯一
			//username到list当中判断是否包含
			// 包含：重复
			// 不包含：唯一
			if (contains(list,username)){
				System.out.println("当前用户已经存在,请重新输出用户名");
				continue;
			}
			//当代码执行到这里，表示用户名username长度，内容，符合要求，而且是唯一的
			user.setUsername(username);
			break;
		}

		//检测密码输入是否合法
		while (true) {
			//校验密码是否符合要求
			//u.setPassword();
			//注意此时密码需要你输入两次
			System.out.println("请输入密码?");
			String password1 = sc.next();
			System.out.println("请再次输入密码?");
			String password2 = sc.next();
			//长度3~8位
			//取反操作 符合要求不执行 不符合才执行
			if(!checkLen(3,8,password1))
			{
				System.out.println("密码长度不符合要求,必须是3~8位之间");
				continue;
			}
			//只能是字母加数字的组合，不能有其他字母
			if (!checkPassword(password1)){
				System.out.println("密码只能是字母加数字的组合，不能有其他字母");
				continue;
			}
			//检验两次密码是否输出一致
			if(!password1.equals(password2)){
				System.out.println("两次密码输入不一致，请重新输入~");
				continue;
			}

			//把密码设置到对象当中
			user.setPassword(password1);
			break;
		}
		//把User对象添加到集合当中
		list.add(user);
		//提示成功
		System.out.println("用户："+user.getUsername()+"注册成功！");
	}


	//作用：判断字符串的长度是否在指定的范围之内
	//需要参数 字符串 指定的范围（最小值 最大值）
	//返回值：true 表示长度合法，false 表示长度不合法
	public boolean checkLen(int minLen, int maxLen, String str){
		/*if (str.length() < minLen || str.length() > maxLen) {
			System.out.println("长度必须在" + minLen + "~" + maxLen + "位");
			System.out.println("请重新输入");
			return false;
		}
		return true;*/
		//直接返回结果
		return str.length() >= minLen && str.length() <= maxLen;
	}


	//统计字符串中，字母，数字，其他字符分别有多少个？
	public int[] getCount(String userInfo){
		//计数器思想 统计个数
		//字母计数器
		int charCount = 0;
		//数字计数器
		int numCount = 0;
		//其他字符计数器
		int otherCount = 0;
		//循环遍历字符串统计
		for (int i = 0; i < userInfo.length(); i++) {
			char c = userInfo.charAt(i);
			if(c >='a'&& c <='z'|| c >='A'&& c <='Z'){
				charCount++;
			}else if(c >= '0' && c <= '9'){
				numCount++;
			}else{
				otherCount++;
			}
		}
		return new int[]{charCount,numCount,otherCount};
	}

	//作用：校验密码是否符合要求
	//只能是字母加数字的组合，不能有其他字母字母至少有一个
	//数字至少有一个其他字符一定不能有
	public boolean checkPassword(String password){
		int[] arr = getCount(password);
		//0：字母的个数
		//1：数字的个数
		//2：其他字符的个数

		//对三个变量进行判断
		//字母至少有一个
		//数字至少有一个
		//其他字符一定不能有
		return arr[0] >0 && arr[1] >0 && arr[2] ==0;

	}

	//作用：校验用户名是否符合要求，
	//只能由字母、数字组成，不能是纯数字
	//字母至少有一个
	//数字可以有，也可以没有
	//其他字符一定不能有
	public boolean checkUsername (String username) {
		//对三变量进行判断
		//字母至少有一个
		//数字可以有，也可以没有
		//其他字符一定不能有
		int[] arr = getCount(username);
		//0：字母的个数
		//1：数字的个数
		//2：其他字符的个数
		return arr[0] > 0 && arr[1] >= 0 && arr[2] == 0;
	}

}
