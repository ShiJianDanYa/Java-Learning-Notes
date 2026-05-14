package 课堂代码.ch02_分支结构.ch03_多分支.ch02_多分支选择语句;

/**
 * ClassName: ch03_case穿透
 * Package: 课堂代码.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/22 - 16:00
 * @Version: v1.0
 *
 */
public class ch03_case穿透 {
	public static void main(String[] args){
		/*
		case穿透
		在我们写代码的时候，如果break没有写，此时就会触发case穿透现象
		执行流程：
		1，拿着小括号中表达式的值跟下面的case进行匹配
		2.如果匹配上了，就会执行case里面的语句体，遇到break结束整个的switch（正常情况）
		3.如果在执行语句体的时候没有看到break，那么程序会继续执行下一个case的语句体，
		直到遇到break或者运行完整个的switch为止

		应用场景：
		当多个case的语句体重复的时候，利用case穿透节省代码
		*/

		int number = 2;
		switch(number){
			case 1:
				System.out.println("一");

			case 2:
				System.out.println("二");

			case 3:
				System.out.println("三");

			default:
				System.out.println("没有这个星期");

		}
	}
}
