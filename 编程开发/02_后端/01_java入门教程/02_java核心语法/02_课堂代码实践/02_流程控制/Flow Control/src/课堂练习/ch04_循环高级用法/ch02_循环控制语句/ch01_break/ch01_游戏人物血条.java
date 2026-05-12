package 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break;

import java.util.Scanner;

/**
 * ClassName: ch01_游戏人物血条
 * Package: 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 15:38
 * @Version: v1.0
 *
 */
public class ch01_游戏人物血条 {
	public static void main(String[] args){
		/*需求：初始最大生命200，受到×点伤害，技能恢复Y点血，x和Y由键盘录入而来
		假设，游戏人物不会死亡，最少1点血
		问：最终游戏人物血量是多少？
		要考虑的情况：键盘录入必须大于0，否则需要重新输入*/
		//定义血量
		int hp = 200;
		//接受用户输出
		Scanner sc = new Scanner(System.in);
		//定义变量存储数据
		int x,y;
		while(true) {
			//判定输出数据正确性
			do {
				System.out.println("请输入技能伤害：");
				x = sc.nextInt();
				System.out.println("请输入技能恢复：");
				y = sc.nextInt();
			} while (x < 0 || y < 0);
			//血量操作
			hp -= x;
			hp += y;
			//判断是否超过生命上限
			if (hp > 200) {
				hp = 200;
			}
			//显示当前生命
			System.out.println("当前生命：" + hp);
			if(hp<=0){
				System.out.println("游戏结束");
				//重置生命
				hp=1;
				System.out.println("名刀触发------恢复生命：" + hp);
				//跳出循环
				break;
			}
		}
	}
}
