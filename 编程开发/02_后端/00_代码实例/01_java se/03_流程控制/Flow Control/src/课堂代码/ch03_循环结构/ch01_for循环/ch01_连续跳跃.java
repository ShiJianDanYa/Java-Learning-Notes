package 课堂代码.ch03_循环结构.ch01_for循环;

/**
 * ClassName: ch01_连续跳跃
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 17:12
 * @Version: v1.0
 *
 */
public class ch01_连续跳跃 {
	public static void main(String[] args){
		/*
		实现游戏中连续跳跃10次，用输出语句横拟跳跃的逻辑

		格式：
			for（初始化语句；条件判断语句；条件控制语句）{
			循环体语句
			}
		三要素:
			初始化语句：开始条件1
			条件判断语句：结束条件100
			条件控制语句： +1 i++

			循环体：重复执行的代码
		*/
		for(int i=1;i<=10;i++){
			System.out.println("跳跃第"+i+"次");
		}
	}
}
