package ch01课堂代码.ch03_字符串成员方法.ch04替换;

import java.util.Scanner;

/**
 * ClassName: Replace
 * Package: ch01课堂代码.ch03字符串成员方法.ch04替换
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 08:15
 * @Version: v1.0
 *
 */
public class Replace {
	/*String replace(旧值，新值)
	替换
	注意点：只有返回值才是替换之后的结果
	需求：
	过滤玩游戏中骂人的脏话*/
	static void main(String[] args) {
		String sentence = "傻逼,大傻逼,超级大傻逼";
		//替换
		//替换
		//第一个参数：被替换的数据
		//第二个参数：用来替换的数据
		//只有返回值才会替换之后的结果
		sentence = sentence.replace("傻逼", "笨蛋");
		System.out.println( sentence);

		//定义敏感词库
		String[] words = {"傻逼", "傻B", "你妈的","他妈的"};
		//用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("用户请输入测试脏话");
		String stu = sc.next();
		//循环替换
		for (int i = 0; i < words.length; i++) {
			stu = stu.replace(words[i], "***");
		}
		//输出
		System.out.println(stu);
	}
}
