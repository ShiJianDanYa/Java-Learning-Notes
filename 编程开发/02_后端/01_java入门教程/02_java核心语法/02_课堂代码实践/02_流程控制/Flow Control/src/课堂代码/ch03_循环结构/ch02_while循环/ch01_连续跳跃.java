package 课堂代码.ch03_循环结构.ch02_while循环;

/**
 * ClassName: ch01_连续跳跃
 * Package: 课堂代码.ch03_循环结构.ch02_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 21:01
 * @Version: v1.0
 *
 */
public class ch01_连续跳跃 {
	public static void main(String[] args){
		/*
			利用while循环，实现游戏中连续跳跃1o次，用输出语句模拟跳跃的逻辑

			格式：
			初始化语句:
			while(条件判断语句){
				循环体语句;
				条件控制语句;
			}
		*/
		int i=1;
		while(i<=10){
			System.out.println("第"+i+"次跳跃");
			++i;
		}
	}
}
