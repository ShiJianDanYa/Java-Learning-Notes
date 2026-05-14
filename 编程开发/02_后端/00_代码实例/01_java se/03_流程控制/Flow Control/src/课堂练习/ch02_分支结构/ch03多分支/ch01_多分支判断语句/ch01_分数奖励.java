package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;
import java.util.Scanner;
/**
 * ClassName: 分数奖励
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 14:34
 * @Version: v1.0
 *
 */
public class ch01_分数奖励 {
	/*根据不同的分数送不同的礼物。
	如果是95~100分，送自行车一辆。
	如果是90~94分，游乐场玩一天。
	如果是80~89分，送变形金刚一个。
	如果是80分，揍一顿。*/
	public static void main(String[] args){
		//接受小明的分数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数");
		int score = sc.nextInt();

		//开始根据分数判断
		//先开始异常判断
		if(score<0||score>100){
			System.out.println("输入的分数有误");
		}else if(score>=95){
			System.out.println("小明获得了自行车一辆");
		}else if(score>=90){
			System.out.println("小明获得了游乐场玩一天");
		}else if(score>=80){
			System.out.println("小明获得了变形金刚一个");
		}else{
			System.out.println("小明被揍一顿");
		}
		sc.close();
// ... existing code ...


		//结束进程
		sc.close();
	}
}
