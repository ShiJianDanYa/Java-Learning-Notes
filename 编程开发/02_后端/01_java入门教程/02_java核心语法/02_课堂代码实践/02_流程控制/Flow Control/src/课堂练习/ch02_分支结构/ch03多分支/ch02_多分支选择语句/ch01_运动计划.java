package 课堂练习.ch02_分支结构.ch03多分支.ch02_多分支选择语句;
//导包
import java.util.Scanner;

/**
 * ClassName: ch01运动计划
 * Package: 课堂练习.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 22:26
 * @Version: v1.0
 *
 */
public class ch01_运动计划 {
	public static void main(String[] args){
		/*需求：键盘录入星期数，显示今天的减肥活动。周一，跑步
		周二：游泳
		周三：慢走
		周四：动感单车
		周五：拳击
		周六：爬山
		周日：好好吃一顿*/
		//接受用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数");
		int week = sc.nextInt();
		//开始判断
		switch( week){
			case 1:
				System.out.println("跑步");
				break;

			case 2:
				System.out.println("游泳");
				break;

			case 3:
				System.out.println("慢走");
				break;

			case 4:
				System.out.println("动感单车");
				break;

			case 5:
				System.out.println("拳击");
				break;

			case 6:
				System.out.println("爬山");
				break;

			case 7:
				System.out.println("好好吃一顿");
				break;

			default:
				System.out.println("输入的星期数有误");
		}
	}
}
